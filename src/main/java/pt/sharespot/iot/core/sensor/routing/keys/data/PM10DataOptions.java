package pt.sharespot.iot.core.sensor.routing.keys.data;

import pt.sharespot.iot.core.keys.RoutingKey;
import pt.sharespot.iot.core.keys.RoutingKeyOption;

public enum PM10DataOptions implements RoutingKey {
    UNIDENTIFIED_PM10_DATA,
    WITH_PM10_DATA,
    WITHOUT_PM10_DATA;

    public String value() {
        if (this == UNIDENTIFIED_PM10_DATA) {
            return "u";
        } else if (this == WITH_PM10_DATA) {
            return "y";
        } else {
            return "n";
        }
    }

    public String details() {
        return this.toString().toLowerCase();
    }

    public static RoutingKeyOption<PM10DataOptions> extract(String value) {
        if (value.equalsIgnoreCase("u")) {
            return RoutingKeyOption.of(PM10DataOptions.UNIDENTIFIED_PM10_DATA);
        } else if (value.equalsIgnoreCase("y")) {
            return RoutingKeyOption.of(PM10DataOptions.WITH_PM10_DATA);
        } else if (value.equalsIgnoreCase("n")) {
            return RoutingKeyOption.of(PM10DataOptions.WITHOUT_PM10_DATA);
        } else {
            return RoutingKeyOption.any();
        }
    }
}
