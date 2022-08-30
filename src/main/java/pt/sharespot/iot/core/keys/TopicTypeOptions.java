package pt.sharespot.iot.core.keys;

public class TopicTypeOptions implements RoutingKey {

    public String name;

    public static TopicTypeOptions of(String type) {
        var alertCategoryOptions = new TopicTypeOptions();
        alertCategoryOptions.name = type;
        return alertCategoryOptions;
    }

    public static RoutingKeyOption<TopicTypeOptions> extract(String s) {
        return RoutingKeyOption.of(TopicTypeOptions.of(s));
    }

    @Override
    public String value() {
        return name;
    }

    @Override
    public String details() {
        return name;
    }
}
