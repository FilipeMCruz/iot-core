package pt.sharespot.iot.core.routing.keys.data;

import pt.sharespot.iot.core.routing.keys.RoutingKey;
import pt.sharespot.iot.core.routing.keys.RoutingKeyOption;

public enum TemperatureDataOptions implements RoutingKey {
    UNIDENTIFIED_TEMPERATURE_DATA,
    WITH_TEMPERATURE_DATA,
    WITHOUT_TEMPERATURE_DATA;

    public String value() {
        if (this == UNIDENTIFIED_TEMPERATURE_DATA) {
            return "u";
        } else if (this == WITH_TEMPERATURE_DATA) {
            return "y";
        } else {
            return "n";
        }
    }

    public String details() {
        return this.toString().toLowerCase();
    }

    public static RoutingKeyOption<TemperatureDataOptions> extract(String value) {
        if (value.equalsIgnoreCase("u")) {
            return RoutingKeyOption.of(TemperatureDataOptions.UNIDENTIFIED_TEMPERATURE_DATA);
        } else if (value.equalsIgnoreCase("y")) {
            return RoutingKeyOption.of(TemperatureDataOptions.WITH_TEMPERATURE_DATA);
        } else if (value.equalsIgnoreCase("n")) {
            return RoutingKeyOption.of(TemperatureDataOptions.WITHOUT_TEMPERATURE_DATA);
        } else {
            return RoutingKeyOption.any();
        }
    }
}
