package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.Device;
import pt.sharespot.iot.core.sensor.device.DeviceInformationDTO;

import java.util.UUID;

public class DeviceMapper {

    public static Device.Builder toModel(DeviceInformationDTO dto) {
        return Device.newBuilder()
                .setId(dto.id.toString())
                .setName(dto.name)
                .setRecords(RecordEntryMapper.toBuf(dto.records))
                .setDomains(DomainMapper.toBuf(dto.domains));
    }

    public static DeviceInformationDTO toModel(Device buf) {
        var device = new DeviceInformationDTO();
        device.name = buf.getName();
        device.id = UUID.fromString(buf.getId());
        device.records = RecordEntryMapper.toModel(buf.getRecords());
        device.domains = DomainMapper.toModel(buf.getDomains());
        return device;
    }
}
