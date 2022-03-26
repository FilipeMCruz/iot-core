package pt.sharespot.iot.core.routing.keys.data;

import pt.sharespot.iot.core.routing.keys.RoutingKey;
import pt.sharespot.iot.core.routing.keys.RoutingKeyOption;

public enum HumidityDataOptions implements RoutingKey {
    UNIDENTIFIED_HUMIDITY_DATA,
    WITH_HUMIDITY_DATA,
    WITHOUT_HUMIDITY_DATA;

    public String value() {
        if (this == UNIDENTIFIED_HUMIDITY_DATA) {
            return "u";
        } else if (this == WITH_HUMIDITY_DATA) {
            return "y";
        } else {
            return "n";
        }
    }

    public String details() {
        return this.toString().toLowerCase();
    }

    public static RoutingKeyOption<HumidityDataOptions> extract(String value) {
        if (value.equalsIgnoreCase("u")) {
            return RoutingKeyOption.of(HumidityDataOptions.UNIDENTIFIED_HUMIDITY_DATA);
        } else if (value.equalsIgnoreCase("y")) {
            return RoutingKeyOption.of(HumidityDataOptions.WITH_HUMIDITY_DATA);
        } else if (value.equalsIgnoreCase("n")) {
            return RoutingKeyOption.of(HumidityDataOptions.WITHOUT_HUMIDITY_DATA);
        } else {
            return RoutingKeyOption.any();
        }
    }
}
