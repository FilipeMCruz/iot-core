package pt.sharespot.iot.core.alert.routing.keys;

import pt.sharespot.iot.core.keys.RoutingKey;
import pt.sharespot.iot.core.keys.RoutingKeyOption;

public class AlertSubCategoryOptions implements RoutingKey {

    public String subCategory;

    public static AlertSubCategoryOptions of(String subCategory) {
        var alertCategoryOptions = new AlertSubCategoryOptions();
        alertCategoryOptions.subCategory = subCategory;
        return alertCategoryOptions;
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
