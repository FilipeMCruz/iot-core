package pt.sharespot.iot.core.routing.keys.data;

import pt.sharespot.iot.core.routing.keys.RoutingKey;
import pt.sharespot.iot.core.routing.keys.RoutingKeyOption;

public enum PressureDataOptions implements RoutingKey {
    UNIDENTIFIED_PRESSURE_DATA,
    WITH_PRESSURE_DATA,
    WITHOUT_PRESSURE_DATA;

    public String value() {
        if (this == UNIDENTIFIED_PRESSURE_DATA) {
            return "u";
        } else if (this == WITH_PRESSURE_DATA) {
            return "y";
        } else {
            return "n";
        }
    }

    public String details() {
        return this.toString().toLowerCase();
    }

    public static RoutingKeyOption<PressureDataOptions> extract(String value) {
        if (value.equalsIgnoreCase("u")) {
            return RoutingKeyOption.of(PressureDataOptions.UNIDENTIFIED_PRESSURE_DATA);
        } else if (value.equalsIgnoreCase("y")) {
            return RoutingKeyOption.of(PressureDataOptions.WITH_PRESSURE_DATA);
        } else if (value.equalsIgnoreCase("n")) {
            return RoutingKeyOption.of(PressureDataOptions.WITHOUT_PRESSURE_DATA);
        } else {
            return RoutingKeyOption.any();
        }
    }
}
