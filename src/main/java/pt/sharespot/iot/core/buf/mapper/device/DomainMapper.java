package pt.sharespot.iot.core.buf.mapper.device;

import pt.sharespot.iot.core.buf.model.DeviceDomains;
import pt.sharespot.iot.core.sensor.device.domains.DeviceDomainPermissionsDTO;

import java.util.UUID;
import java.util.stream.Collectors;

public class DomainMapper {

    public static DeviceDomains.Builder toBuf(DeviceDomainPermissionsDTO dto) {
        var builder = DeviceDomains.newBuilder();
        if (dto.read != null)
            builder.addAllRead(dto.read.stream().map(UUID::toString).collect(Collectors.toList()));
        
        if (dto.readWrite != null)
            builder.addAllReadWrite(dto.readWrite.stream().map(UUID::toString).collect(Collectors.toList()));
        return builder;
    }

    public static DeviceDomainPermissionsDTO toModel(DeviceDomains buf) {
        var permissionsDTO = new DeviceDomainPermissionsDTO();
        permissionsDTO.readWrite = buf.getReadWriteList().stream().map(UUID::fromString).collect(Collectors.toSet());
        permissionsDTO.read = buf.getReadList().stream().map(UUID::fromString).collect(Collectors.toSet());
        return permissionsDTO;
    }
}
