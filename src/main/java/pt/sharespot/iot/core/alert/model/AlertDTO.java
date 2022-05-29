package pt.sharespot.iot.core.alert.model;

import java.util.UUID;

public class AlertDTO {

    public UUID id = UUID.randomUUID();

    public String category;

    public String subCategory;

    public String description;

    public AlertLevel level;

    public Long reportedAt = System.currentTimeMillis();

    public CorrelationDataDTO context;

    public AlertDTO() {
    }

    public AlertDTO(String category, String subCategory, String description, AlertLevel level, CorrelationDataDTO context) {
        this.category = category;
        this.subCategory = subCategory;
        this.description = description;
        this.level = level;
        this.context = context;
    }
}
