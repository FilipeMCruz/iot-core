package pt.sharespot.iot.core.routing.keys.data;

import pt.sharespot.iot.core.routing.keys.RoutingKey;
import pt.sharespot.iot.core.routing.keys.RoutingKeyOption;

public enum WaterPressureDataOptions implements RoutingKey {
    UNIDENTIFIED_WATER_PRESSURE_DATA,
    WITH_WATER_PRESSURE_DATA,
    WITHOUT_WATER_PRESSURE_DATA;

    public String value() {
        if (this == UNIDENTIFIED_WATER_PRESSURE_DATA) {
            return "u";
        } else if (this == WITH_WATER_PRESSURE_DATA) {
            return "y";
        } else {
            return "n";
        }
    }

    public String details() {
        return this.toString().toLowerCase();
    }

    public static RoutingKeyOption<WaterPressureDataOptions> extract(String value) {
        if (value.equalsIgnoreCase("u")) {
            return RoutingKeyOption.of(WaterPressureDataOptions.UNIDENTIFIED_WATER_PRESSURE_DATA);
        } else if (value.equalsIgnoreCase("y")) {
            return RoutingKeyOption.of(WaterPressureDataOptions.WITH_WATER_PRESSURE_DATA);
        } else if (value.equalsIgnoreCase("n")) {
            return RoutingKeyOption.of(WaterPressureDataOptions.WITHOUT_WATER_PRESSURE_DATA);
        } else {
            return RoutingKeyOption.any();
        }
    }
}
