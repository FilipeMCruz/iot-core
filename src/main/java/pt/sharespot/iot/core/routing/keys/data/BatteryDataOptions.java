package pt.sharespot.iot.core.routing.keys.data;

import pt.sharespot.iot.core.routing.keys.RoutingKey;
import pt.sharespot.iot.core.routing.keys.RoutingKeyOption;

public enum BatteryDataOptions implements RoutingKey {
    UNIDENTIFIED_BATTERY_DATA,
    WITH_BATTERY_DATA,
    WITHOUT_BATTERY_DATA;

    public String value() {
        if (this == UNIDENTIFIED_BATTERY_DATA) {
            return "u";
        } else if (this == WITH_BATTERY_DATA) {
            return "y";
        } else {
            return "n";
        }
    }

    public String details() {
        return this.toString().toLowerCase();
    }

    public static RoutingKeyOption<BatteryDataOptions> extract(String value) {
        if (value.equalsIgnoreCase("u")) {
            return RoutingKeyOption.of(BatteryDataOptions.UNIDENTIFIED_BATTERY_DATA);
        } else if (value.equalsIgnoreCase("y")) {
            return RoutingKeyOption.of(BatteryDataOptions.WITH_BATTERY_DATA);
        } else if (value.equalsIgnoreCase("n")) {
            return RoutingKeyOption.of(BatteryDataOptions.WITHOUT_BATTERY_DATA);
        } else {
            return RoutingKeyOption.any();
        }
    }
}
