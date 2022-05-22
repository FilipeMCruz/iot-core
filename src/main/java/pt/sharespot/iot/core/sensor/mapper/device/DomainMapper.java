package pt.sharespot.iot.core.sensor.mapper.device;

import pt.sharespot.iot.core.sensor.buf.DomainOwnership;

import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

public class DomainMapper {

    public static DomainOwnership.Builder toBuf(Set<UUID> dto) {
        var builder = DomainOwnership.newBuilder();
        builder.addAllOwnership(dto.stream().map(UUID::toString).collect(Collectors.toList()));
        return builder;
    }

    public static Set<UUID> toModel(DomainOwnership buf) {
        return buf.getOwnershipList().stream().map(UUID::fromString).collect(Collectors.toSet());
    }
}
