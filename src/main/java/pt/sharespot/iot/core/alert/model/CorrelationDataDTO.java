package pt.sharespot.iot.core.alert.model;

import java.util.List;
import java.util.UUID;

public class CorrelationDataDTO {

    public List<UUID> dataIds;

    public List<UUID> deviceIds;

    public List<UUID> domainIds;

    public String other;

    public CorrelationDataDTO(List<UUID> dataIds, List<UUID> deviceIds, List<UUID> domainIds, String other) {
        this.domainIds = domainIds;
        this.dataIds = dataIds;
        this.deviceIds = deviceIds;
        this.other = other;
    }
}
