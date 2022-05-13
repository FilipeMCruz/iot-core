package pt.sharespot.iot.core.sensor.routing.keys.data;

import pt.sharespot.iot.core.keys.RoutingKey;
import pt.sharespot.iot.core.keys.RoutingKeyOption;

public enum PM2_5DataOptions implements RoutingKey {
    UNIDENTIFIED_PM2_5_DATA,
    WITH_PM2_5_DATA,
    WITHOUT_PM2_5_DATA;

    public String value() {
        if (this == UNIDENTIFIED_PM2_5_DATA) {
            return "u";
        } else if (this == WITH_PM2_5_DATA) {
            return "y";
        } else {
            return "n";
        }
    }

    public String details() {
        return this.toString().toLowerCase();
    }

    public static RoutingKeyOption<PM2_5DataOptions> extract(String value) {
        if (value.equalsIgnoreCase("u")) {
            return RoutingKeyOption.of(PM2_5DataOptions.UNIDENTIFIED_PM2_5_DATA);
        } else if (value.equalsIgnoreCase("y")) {
            return RoutingKeyOption.of(PM2_5DataOptions.WITH_PM2_5_DATA);
        } else if (value.equalsIgnoreCase("n")) {
            return RoutingKeyOption.of(PM2_5DataOptions.WITHOUT_PM2_5_DATA);
        } else {
            return RoutingKeyOption.any();
        }
    }
}
