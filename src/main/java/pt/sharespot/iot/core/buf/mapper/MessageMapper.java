package pt.sharespot.iot.core.buf.mapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.protobuf.InvalidProtocolBufferException;
import pt.sharespot.iot.core.buf.mapper.data.DataMapper;
import pt.sharespot.iot.core.buf.model.Message;
import pt.sharespot.iot.core.buf.model.UnprocessedMessage;
import pt.sharespot.iot.core.routing.MessageConsumed;
import pt.sharespot.iot.core.routing.MessageSupplied;
import pt.sharespot.iot.core.sensor.ProcessedSensorDataDTO;

import java.util.UUID;

public class MessageMapper {

    public static Message toBuf(MessageSupplied<ProcessedSensorDataDTO> message) {
        return Message.newBuilder()
                .setOid(message.oid.toString())
                .setHops(message.hops)
                .setRoutingKeys(RoutingKeysMapper.toBuf(message.routingKeys))
                .setData(DataMapper.toBuf(message.data))
                .build();
    }

    public static UnprocessedMessage toUnprocessedBuf(MessageSupplied<ObjectNode> message) {
        return UnprocessedMessage.newBuilder()
                .setOid(message.oid.toString())
                .setHops(message.hops)
                .setRoutingKeys(RoutingKeysMapper.toBuf(message.routingKeys))
                .setUnprocessedData(message.data.toString())
                .build();
    }

    public static MessageConsumed<ObjectNode> toUnprocessedModel(byte[] message) throws InvalidProtocolBufferException, JsonProcessingException {
        return MessageMapper.toUnprocessedModel(UnprocessedMessage.parseFrom(message));
    }

    private static MessageConsumed<ObjectNode> toUnprocessedModel(UnprocessedMessage message) throws JsonProcessingException {
        var consumed = new MessageConsumed<ObjectNode>();
        consumed.hops = message.getHops();
        consumed.oid = UUID.fromString(message.getOid());
        consumed.routingKeys = RoutingKeysMapper.toModel(message.getRoutingKeys());
        consumed.data = new ObjectMapper().readValue(message.getUnprocessedData(), ObjectNode.class);
        return consumed;
    }

    public static MessageConsumed<ProcessedSensorDataDTO> toModel(byte[] message) throws InvalidProtocolBufferException {
        return MessageMapper.toModel(Message.parseFrom(message));
    }

    private static MessageConsumed<ProcessedSensorDataDTO> toModel(Message message) {
        var consumed = new MessageConsumed<ProcessedSensorDataDTO>();
        consumed.hops = message.getHops();
        consumed.oid = UUID.fromString(message.getOid());
        consumed.routingKeys = RoutingKeysMapper.toModel(message.getRoutingKeys());
        consumed.data = DataMapper.toModel(message.getData());
        return consumed;
    }
}
