package pt.sharespot.iot.core.sensor.routing.keys;

import pt.sharespot.iot.core.keys.RoutingKey;
import pt.sharespot.iot.core.keys.RoutingKeyOption;

public class SensorTypeOptions implements RoutingKey {

    public String type;

    public static SensorTypeOptions of(String type) {
        var alertCategoryOptions = new SensorTypeOptions();
        alertCategoryOptions.type = type;
        return alertCategoryOptions;
    }

    public static RoutingKeyOption<SensorTypeOptions> extract(String s) {
        return RoutingKeyOption.of(SensorTypeOptions.of(s));
    }

    @Override
    public String value() {
        return type;
    }

    @Override
    public String details() {
        return type;
    }
}
