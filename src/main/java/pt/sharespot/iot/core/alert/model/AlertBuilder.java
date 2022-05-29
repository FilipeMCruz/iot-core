package pt.sharespot.iot.core.alert.model;

public class AlertBuilder {
    private String category;

    private String subCategory;
    private String description = "";
    private AlertLevel level = AlertLevel.INFORMATION;
    private CorrelationDataDTO context = CorrelationDataDTO.empty();

    public static AlertBuilder create() {
        return new AlertBuilder();
    }

    public AlertBuilder setCategory(String category) {
        this.category = category;
        return this;
    }

    public AlertBuilder setSubCategory(String subCategory) {
        this.subCategory = subCategory;
        return this;
    }

    public AlertBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public AlertBuilder setLevel(AlertLevel level) {
        this.level = level;
        return this;
    }

    public AlertBuilder setContext(CorrelationDataDTO context) {
        this.context = context;
        return this;
    }

    public AlertDTO build() {
        return new AlertDTO(category, subCategory, description, level, context);
    }
}
