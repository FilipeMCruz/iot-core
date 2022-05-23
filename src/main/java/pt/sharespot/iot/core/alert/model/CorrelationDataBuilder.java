package pt.sharespot.iot.core.alert.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CorrelationDataBuilder {
    private List<UUID> dataIds = new ArrayList<>();
    private List<UUID> deviceIds = new ArrayList<>();

    public List<UUID> domainIds = new ArrayList<>();
    private String other = "none";

    public static CorrelationDataBuilder create() {
        return new CorrelationDataBuilder();
    }

    public CorrelationDataBuilder setDataIds(UUID... dataIds) {
        this.dataIds = List.of(dataIds);
        return this;
    }

    public CorrelationDataBuilder setDeviceIds(UUID... deviceIds) {
        this.deviceIds = List.of(deviceIds);
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
