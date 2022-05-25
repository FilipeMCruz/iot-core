package pt.sharespot.iot.core.alert.model;

import java.util.UUID;

public class AlertDTO {

    public UUID id = UUID.randomUUID();

    public String category;

    public String description;

    public AlertLevelDTO level;

    public Long reportedAt;

    public CorrelationDataDTO context;

    public AlertDTO() {
    }

    public AlertDTO(String category, String description, AlertLevelDTO level, Long reportedAt, CorrelationDataDTO context) {
        this.id = UUID.randomUUID();
        this.category = category;
        this.description = description;
        this.level = level;
        this.reportedAt = reportedAt;
        this.context = context;
    }
}
