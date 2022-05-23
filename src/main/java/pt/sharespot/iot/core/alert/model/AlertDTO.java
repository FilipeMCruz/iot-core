package pt.sharespot.iot.core.alert.model;

public class AlertDTO {

    public String category;

    public String description;

    public AlertLevelDTO level;

    public Long reportedAt;

    public CorrelationDataDTO context;

    public AlertDTO(String category, String description, AlertLevelDTO level, Long reportedAt, CorrelationDataDTO context) {
        this.category = category;
        this.description = description;
        this.level = level;
        this.reportedAt = reportedAt;
        this.context = context;
    }
}
