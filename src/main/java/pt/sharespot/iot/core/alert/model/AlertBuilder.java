package pt.sharespot.iot.core.alert.model;

public class AlertBuilder {
    private String category;
    private String description;
    private AlertLevelDTO level = AlertLevelDTO.INFORMATION;
    private CorrelationDataDTO context = CorrelationDataDTO.empty();

    private final Long reportedAt = System.currentTimeMillis();

    public static AlertBuilder create() {
        return new AlertBuilder();
    }

    public AlertBuilder setCategory(String category) {
        this.category = category;
        return this;
    }

    public AlertBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public AlertBuilder setLevel(AlertLevelDTO level) {
        this.level = level;
        return this;
    }

    public AlertBuilder setContext(CorrelationDataDTO context) {
        this.context = context;
        return this;
    }

    public AlertDTO build() {
        return new AlertDTO(category, description, level, reportedAt, context);
    }
}
