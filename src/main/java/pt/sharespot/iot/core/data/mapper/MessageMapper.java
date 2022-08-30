package pt.sharespot.iot.core.data.mapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.protobuf.InvalidProtocolBufferException;
import pt.sharespot.iot.core.data.mapper.data.DataMapper;
import pt.sharespot.iot.core.keys.MessageConsumed;
import pt.sharespot.iot.core.keys.MessageSupplied;
import pt.sharespot.iot.core.data.buf.Message;
import pt.sharespot.iot.core.data.buf.UnprocessedMessage;
import pt.sharespot.iot.core.data.model.DataUnitDTO;
import pt.sharespot.iot.core.data.routing.keys.DataRoutingKeys;

import java.util.UUID;

public class MessageMapper {

    public static Message toBuf(MessageSupplied<DataUnitDTO, DataRoutingKeys> message) {
        return Message.newBuilder()
                .setOid(message.oid.toString())
                .setHops(message.hops)
                .setRoutingKeys(RoutingKeysMapper.toBuf(message.routingKeys))
                .setData(DataMapper.toBuf(message.data))
                .build();
    }

    public static UnprocessedMessage toUnprocessedBuf(MessageSupplied<ObjectNode, DataRoutingKeys> message) {
        return UnprocessedMessage.newBuilder()
                .setOid(message.oid.toString())
                .setHops(message.hops)
                .setRoutingKeys(RoutingKeysMapper.toBuf(message.routingKeys))
                .setUnprocessedData(message.data.toString())
                .build();
    }

    public static MessageConsumed<ObjectNode, DataRoutingKeys> toUnprocessedModel(byte[] message) throws InvalidProtocolBufferException, JsonProcessingException {
        return MessageMapper.toUnprocessedModel(UnprocessedMessage.parseFrom(message));
    }

    private static MessageConsumed<ObjectNode, DataRoutingKeys> toUnprocessedModel(UnprocessedMessage message) throws JsonProcessingException {
        var consumed = new MessageConsumed<ObjectNode, DataRoutingKeys>();
        consumed.hops = message.getHops();
        consumed.oid = UUID.fromString(message.getOid());
        consumed.routingKeys = RoutingKeysMapper.toModel(message.getRoutingKeys());
        consumed.data = new ObjectMapper().readValue(message.getUnprocessedData(), ObjectNode.class);
        return consumed;
    }

    public static MessageConsumed<DataUnitDTO, DataRoutingKeys> toModel(byte[] message) throws InvalidProtocolBufferException {
        return MessageMapper.toModel(Message.parseFrom(message));
    }

    private static MessageConsumed<DataUnitDTO, DataRoutingKeys> toModel(Message message) {
        var consumed = new MessageConsumed<DataUnitDTO, DataRoutingKeys>();
        consumed.hops = message.getHops();
        consumed.oid = UUID.fromString(message.getOid());
        consumed.routingKeys = RoutingKeysMapper.toModel(message.getRoutingKeys());
        consumed.data = DataMapper.toModel(message.getData());
        return consumed;
    }
}
