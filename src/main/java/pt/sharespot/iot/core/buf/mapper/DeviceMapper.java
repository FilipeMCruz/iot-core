package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.Device;
import pt.sharespot.iot.core.sensor.device.DeviceInformationDTO;

public class DeviceMapper {

    public static Device.Builder toBuf(DeviceInformationDTO dto) {
        return Device.newBuilder()
                .setId(dto.id.toString())
                .setName(dto.name)
                .setRecords(RecordEntryMapper.toBuf(dto.records))
                .setDomains(DomainMapper.toBuf(dto.domains));
    }
}
