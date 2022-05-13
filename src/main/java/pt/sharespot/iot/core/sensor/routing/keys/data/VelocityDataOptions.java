package pt.sharespot.iot.core.sensor.routing.keys.data;

import pt.sharespot.iot.core.keys.RoutingKey;
import pt.sharespot.iot.core.keys.RoutingKeyOption;

public enum VelocityDataOptions implements RoutingKey {
    UNIDENTIFIED_VELOCITY_DATA,
    WITH_VELOCITY_DATA,
    WITHOUT_VELOCITY_DATA;

    public String value() {
        if (this == UNIDENTIFIED_VELOCITY_DATA) {
            return "u";
        } else if (this == WITH_VELOCITY_DATA) {
            return "y";
        } else {
            return "n";
        }
    }

    public String details() {
        return this.toString().toLowerCase();
    }

    public static RoutingKeyOption<VelocityDataOptions> extract(String value) {
        if (value.equalsIgnoreCase("u")) {
            return RoutingKeyOption.of(VelocityDataOptions.UNIDENTIFIED_VELOCITY_DATA);
        } else if (value.equalsIgnoreCase("y")) {
            return RoutingKeyOption.of(VelocityDataOptions.WITH_VELOCITY_DATA);
        } else if (value.equalsIgnoreCase("n")) {
            return RoutingKeyOption.of(VelocityDataOptions.WITHOUT_VELOCITY_DATA);
        } else {
            return RoutingKeyOption.any();
        }
    }
}
