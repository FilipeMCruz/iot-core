package pt.sharespot.iot.core.alert.routing.keys;

import pt.sharespot.iot.core.keys.RoutingKey;
import pt.sharespot.iot.core.keys.RoutingKeyOption;

public class AlertCategoryOptions implements RoutingKey {

    public String category;

    public static AlertCategoryOptions of(String category) {
        var alertCategoryOptions = new AlertCategoryOptions();
        alertCategoryOptions.category = category;
        return alertCategoryOptions;
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
