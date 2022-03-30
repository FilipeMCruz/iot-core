package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.DeviceDomains;
import pt.sharespot.iot.core.sensor.device.domains.DeviceDomainPermissionsDTO;

import java.util.UUID;
import java.util.stream.Collectors;

public class DomainMapper {

    public static DeviceDomains.Builder toBuf(DeviceDomainPermissionsDTO dto) {
        return DeviceDomains.newBuilder()
                .addAllRead(dto.read.stream().map(UUID::toString).collect(Collectors.toList()))
                .addAllReadWrite(dto.readWrite.stream().map(UUID::toString).collect(Collectors.toList()));
    }
}
