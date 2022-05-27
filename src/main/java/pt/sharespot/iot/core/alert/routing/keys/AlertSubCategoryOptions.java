package pt.sharespot.iot.core.alert.routing.keys;

import pt.sharespot.iot.core.keys.RoutingKey;
import pt.sharespot.iot.core.keys.RoutingKeyOption;

public class AlertSubCategoryOptions implements RoutingKey {

    private final String subCategory;

    public AlertSubCategoryOptions(String subCategory) {
        this.subCategory = subCategory;
    }

    public static AlertSubCategoryOptions of(String category) {
        return new AlertSubCategoryOptions(category);
    }

    public static RoutingKeyOption<AlertSubCategoryOptions> extract(String s) {
        return RoutingKeyOption.of(AlertSubCategoryOptions.of(s));
    }

    @Override
    public String value() {
        return subCategory;
    }

    @Override
    public String details() {
        return subCategory;
    }
}
