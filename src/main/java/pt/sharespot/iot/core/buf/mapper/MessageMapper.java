package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.Message;
import pt.sharespot.iot.core.routing.MessageSupplied;
import pt.sharespot.iot.core.sensor.ProcessedSensorDataDTO;

public class MessageMapper {

    public static Message toBuf(MessageSupplied<ProcessedSensorDataDTO> message) {
        return Message.newBuilder()
                .setOid(message.oid.toString())
                .setHops(message.hops)
                .setRoutingKeys(RoutingKeysMapper.toBuf(message.routingKeys))
                .setData(DataMapper.toBuf(message.data))
                .build();
    }
}