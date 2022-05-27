package pt.sharespot.iot.core.alert.model;

import java.util.*;

public class CorrelationDataBuilder {
    private Set<UUID> dataIds = new HashSet<>();
    private Set<UUID> deviceIds = new HashSet<>();

    public Set<UUID> domainIds = new HashSet<>();
    private String other = "";

    public static CorrelationDataBuilder create() {
        return new CorrelationDataBuilder();
    }

    public CorrelationDataBuilder setDataIds(UUID... dataIds) {
        this.dataIds = Set.of(dataIds);
        return this;
    }

    public CorrelationDataBuilder setDeviceIds(UUID... deviceIds) {
        this.deviceIds = Set.of(deviceIds);
        return this;
    }

    public CorrelationDataBuilder setOther(String other) {
        this.other = other;
        return this;
    }

    public CorrelationDataDTO build() {
        return new CorrelationDataDTO(dataIds, deviceIds, domainIds, other);
    }
}
