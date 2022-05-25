package pt.sharespot.iot.core.alert.routing.keys;

import pt.sharespot.iot.core.keys.RoutingKey;
import pt.sharespot.iot.core.keys.RoutingKeyOption;

public class AlertCategoryOptions implements RoutingKey {

    private final String category;

    public AlertCategoryOptions(String category) {
        this.category = category;
    }

    public static AlertCategoryOptions of(String category) {
        return new AlertCategoryOptions(category);
    }

    public static RoutingKeyOption<AlertCategoryOptions> extract(String s) {
        return RoutingKeyOption.of(AlertCategoryOptions.of(s));
    }

    @Override
    public String value() {
        return category;
    }

    @Override
    public String details() {
        return category;
    }
}
