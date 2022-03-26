package pt.sharespot.iot.core.routing.keys.data;

import pt.sharespot.iot.core.routing.keys.RoutingKey;
import pt.sharespot.iot.core.routing.keys.RoutingKeyOption;

public enum IlluminanceDataOptions implements RoutingKey {
    UNIDENTIFIED_ILLUMINANCE_DATA,
    WITH_ILLUMINANCE_DATA,
    WITHOUT_ILLUMINANCE_DATA;

    public String value() {
        if (this == UNIDENTIFIED_ILLUMINANCE_DATA) {
            return "u";
        } else if (this == WITH_ILLUMINANCE_DATA) {
            return "y";
        } else {
            return "n";
        }
    }

    public String details() {
        return this.toString().toLowerCase();
    }

    public static RoutingKeyOption<IlluminanceDataOptions> extract(String value) {
        if (value.equalsIgnoreCase("u")) {
            return RoutingKeyOption.of(IlluminanceDataOptions.UNIDENTIFIED_ILLUMINANCE_DATA);
        } else if (value.equalsIgnoreCase("y")) {
            return RoutingKeyOption.of(IlluminanceDataOptions.WITH_ILLUMINANCE_DATA);
        } else if (value.equalsIgnoreCase("n")) {
            return RoutingKeyOption.of(IlluminanceDataOptions.WITHOUT_ILLUMINANCE_DATA);
        } else {
            return RoutingKeyOption.any();
        }
    }
}
