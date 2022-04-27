package pt.sharespot.iot.core.buf.mapper.device;

import pt.sharespot.iot.core.buf.mapper.data.SensorDataMapper;
import pt.sharespot.iot.core.buf.model.Device;
import pt.sharespot.iot.core.buf.model.DeviceCommands;
import pt.sharespot.iot.core.sensor.device.DeviceInformationDTO;
import pt.sharespot.iot.core.sensor.properties.PropertyName;

import java.util.HashMap;
import java.util.UUID;

public class DeviceMapper {

    public static Device.Builder toModel(DeviceInformationDTO dto) {
        var builder = Device.newBuilder();

        if (dto.hasProperty(PropertyName.DEVICE_ID))
            builder.setId(dto.id.toString());

        if (dto.hasProperty(PropertyName.DEVICE_NAME))
            builder.setName(dto.name);

        if (dto.hasProperty(PropertyName.DEVICE_RECORDS))
            builder.setRecords(RecordEntryMapper.toBuf(dto.records));

        if (dto.hasProperty(PropertyName.READ_WRITE_PERMISSIONS) || dto.hasProperty(PropertyName.READ_PERMISSIONS))
            builder.setDomains(DomainMapper.toBuf(dto.domains));

        if (dto.commands != null) {
            dto.commands.forEach((key, value) -> builder.putCommands(key, CommandMapper.toBuf(value).build()));
        }

        return builder;
    }

    public static DeviceInformationDTO toModel(Device buf) {
        var device = new DeviceInformationDTO();
        device.name = buf.getName();
        device.id = UUID.fromString(buf.getId());
        device.records = RecordEntryMapper.toModel(buf.getRecords());
        device.domains = DomainMapper.toModel(buf.getDomains());
        device.commands = new HashMap<>();
        buf.getCommandsMap().forEach((key, value) -> device.commands.put(key, CommandMapper.toModel(value)));
        return device;
    }
}
