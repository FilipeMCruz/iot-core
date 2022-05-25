package pt.sharespot.iot.core.alert.model;

import java.util.*;

public class CorrelationDataDTO {

    public Set<UUID> dataIds = new HashSet<>();

    public Set<UUID> deviceIds = new HashSet<>();

    public Set<UUID> domainIds = new HashSet<>();

    public String other;

    public CorrelationDataDTO() {
    }

    public CorrelationDataDTO(Set<UUID> dataIds, Set<UUID> deviceIds, Set<UUID> domainIds, String other) {
        this.domainIds = domainIds;
        this.dataIds = dataIds;
        this.deviceIds = deviceIds;
        this.other = other;
    }

    public static CorrelationDataDTO empty() {
        return new CorrelationDataDTO();
    }
}
