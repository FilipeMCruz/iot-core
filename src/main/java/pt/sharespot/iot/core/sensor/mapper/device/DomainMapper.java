package pt.sharespot.iot.core.sensor.mapper.device;

import pt.sharespot.iot.core.sensor.buf.DomainOwnership;
import pt.sharespot.iot.core.sensor.model.device.domains.DeviceDomainPermissionsDTO;

import java.util.UUID;
import java.util.stream.Collectors;

public class DomainMapper {

    public static DomainOwnership.Builder toBuf(DeviceDomainPermissionsDTO dto) {
        var builder = DomainOwnership.newBuilder();
        if (dto.ownership != null)
            builder.addAllOwnership(dto.ownership.stream().map(UUID::toString).collect(Collectors.toList()));
        return builder;
    }

    public static DeviceDomainPermissionsDTO toModel(DomainOwnership buf) {
        var permissionsDTO = new DeviceDomainPermissionsDTO();
        permissionsDTO.ownership = buf.getOwnershipList().stream().map(UUID::fromString).collect(Collectors.toSet());
        return permissionsDTO;
    }
}
