package pt.sharespot.iot.core.sensor.mapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.protobuf.InvalidProtocolBufferException;
import pt.sharespot.iot.core.sensor.mapper.data.DataMapper;
import pt.sharespot.iot.core.keys.MessageConsumed;
import pt.sharespot.iot.core.keys.MessageSupplied;
import pt.sharespot.iot.core.sensor.buf.Message;
import pt.sharespot.iot.core.sensor.buf.UnprocessedMessage;
import pt.sharespot.iot.core.sensor.model.SensorDataDTO;
import pt.sharespot.iot.core.sensor.routing.keys.SensorRoutingKeys;

import java.util.UUID;

public class MessageMapper {

    public static Message toBuf(MessageSupplied<SensorDataDTO, SensorRoutingKeys> message) {
        return Message.newBuilder()
                .setOid(message.oid.toString())
                .setHops(message.hops)
                .setRoutingKeys(RoutingKeysMapper.toBuf(message.routingKeys))
                .setData(DataMapper.toBuf(message.data))
                .build();
    }

    public static UnprocessedMessage toUnprocessedBuf(MessageSupplied<ObjectNode, SensorRoutingKeys> message) {
        return UnprocessedMessage.newBuilder()
                .setOid(message.oid.toString())
                .setHops(message.hops)
                .setRoutingKeys(RoutingKeysMapper.toBuf(message.routingKeys))
                .setUnprocessedData(message.data.toString())
                .build();
    }

    public static MessageConsumed<ObjectNode, SensorRoutingKeys> toUnprocessedModel(byte[] message) throws InvalidProtocolBufferException, JsonProcessingException {
        return MessageMapper.toUnprocessedModel(UnprocessedMessage.parseFrom(message));
    }

    private static MessageConsumed<ObjectNode,SensorRoutingKeys> toUnprocessedModel(UnprocessedMessage message) throws JsonProcessingException {
        var consumed = new MessageConsumed<ObjectNode,SensorRoutingKeys>();
        consumed.hops = message.getHops();
        consumed.oid = UUID.fromString(message.getOid());
        consumed.routingKeys = RoutingKeysMapper.toModel(message.getRoutingKeys());
        consumed.data = new ObjectMapper().readValue(message.getUnprocessedData(), ObjectNode.class);
        return consumed;
    }

    public static MessageConsumed<SensorDataDTO,SensorRoutingKeys> toModel(byte[] message) throws InvalidProtocolBufferException {
        return MessageMapper.toModel(Message.parseFrom(message));
    }

    private static MessageConsumed<SensorDataDTO, SensorRoutingKeys> toModel(Message message) {
        var consumed = new MessageConsumed<SensorDataDTO, SensorRoutingKeys>();
        consumed.hops = message.getHops();
        consumed.oid = UUID.fromString(message.getOid());
        consumed.routingKeys = RoutingKeysMapper.toModel(message.getRoutingKeys());
        consumed.data = DataMapper.toModel(message.getData());
        return consumed;
    }
}
