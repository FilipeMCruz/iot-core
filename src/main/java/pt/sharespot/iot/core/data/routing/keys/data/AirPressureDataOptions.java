package pt.sharespot.iot.core.data.routing.keys.data;

import pt.sharespot.iot.core.keys.RoutingKey;
import pt.sharespot.iot.core.keys.RoutingKeyOption;

public enum AirPressureDataOptions implements RoutingKey {
    UNIDENTIFIED_AIR_PRESSURE_DATA,
    WITH_AIR_PRESSURE_DATA,
    WITHOUT_AIR_PRESSURE_DATA;

    public String value() {
        if (this == UNIDENTIFIED_AIR_PRESSURE_DATA) {
            return "u";
        } else if (this == WITH_AIR_PRESSURE_DATA) {
            return "y";
        } else {
            return "n";
        }
    }

    public String details() {
        return this.toString().toLowerCase();
    }

    public static RoutingKeyOption<AirPressureDataOptions> extract(String value) {
        if (value.equalsIgnoreCase("u")) {
            return RoutingKeyOption.of(AirPressureDataOptions.UNIDENTIFIED_AIR_PRESSURE_DATA);
        } else if (value.equalsIgnoreCase("y")) {
            return RoutingKeyOption.of(AirPressureDataOptions.WITH_AIR_PRESSURE_DATA);
        } else if (value.equalsIgnoreCase("n")) {
            return RoutingKeyOption.of(AirPressureDataOptions.WITHOUT_AIR_PRESSURE_DATA);
        } else {
            return RoutingKeyOption.any();
        }
    }
}
