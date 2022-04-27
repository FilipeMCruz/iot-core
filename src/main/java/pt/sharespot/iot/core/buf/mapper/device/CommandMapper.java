package pt.sharespot.iot.core.buf.mapper.device;

import pt.sharespot.iot.core.buf.model.DeviceCommand;
import pt.sharespot.iot.core.buf.model.DeviceCommands;
import pt.sharespot.iot.core.sensor.device.controls.DeviceCommandDTO;

import java.util.List;
import java.util.stream.Collectors;

public class CommandMapper {

    public static DeviceCommands.Builder toBuf(List<DeviceCommandDTO> dto) {
        var builder = DeviceCommands.newBuilder();
        builder.addAllCommand(dto.stream().map(d -> toBuf(d).build()).collect(Collectors.toSet()));
        return builder;
    }

    public static List<DeviceCommandDTO> toModel(DeviceCommands buf) {
        return buf.getCommandList().stream().map(CommandMapper::toModel).collect(Collectors.toList());
    }


    public static DeviceCommand.Builder toBuf(DeviceCommandDTO dto) {
        var builder = DeviceCommand.newBuilder();

        builder.setId(dto.id)
                .setName(dto.name)
                .setPayload(dto.payload)
                .setPort(dto.port);

        return builder;
    }

    public static DeviceCommandDTO toModel(DeviceCommand buf) {
        var command = new DeviceCommandDTO();
        command.id = buf.getId();
        command.name = buf.getName();
        command.payload = buf.getPayload();
        command.port = buf.getPort();
        return command;
    }
}
