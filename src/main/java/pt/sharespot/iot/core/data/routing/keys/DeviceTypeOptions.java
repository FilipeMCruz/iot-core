package pt.sharespot.iot.core.data.routing.keys;

import pt.sharespot.iot.core.keys.RoutingKey;
import pt.sharespot.iot.core.keys.RoutingKeyOption;

public class DeviceTypeOptions implements RoutingKey {

    public String type;

    public static DeviceTypeOptions of(String type) {
        var alertCategoryOptions = new DeviceTypeOptions();
        alertCategoryOptions.type = type;
        return alertCategoryOptions;
    }

    public static RoutingKeyOption<DeviceTypeOptions> extract(String s) {
        return RoutingKeyOption.of(DeviceTypeOptions.of(s));
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
