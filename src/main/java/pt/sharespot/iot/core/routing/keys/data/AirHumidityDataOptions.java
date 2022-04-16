package pt.sharespot.iot.core.routing.keys.data;

import pt.sharespot.iot.core.routing.keys.RoutingKey;
import pt.sharespot.iot.core.routing.keys.RoutingKeyOption;

public enum AirHumidityDataOptions implements RoutingKey {
    UNIDENTIFIED_AIR_HUMIDITY_DATA,
    WITH_AIR_HUMIDITY_DATA,
    WITHOUT_AIR_HUMIDITY_DATA;

    public String value() {
        if (this == UNIDENTIFIED_AIR_HUMIDITY_DATA) {
            return "u";
        } else if (this == WITH_AIR_HUMIDITY_DATA) {
            return "y";
        } else {
            return "n";
        }
    }

    public String details() {
        return this.toString().toLowerCase();
    }

    public static RoutingKeyOption<AirHumidityDataOptions> extract(String value) {
        if (value.equalsIgnoreCase("u")) {
            return RoutingKeyOption.of(AirHumidityDataOptions.UNIDENTIFIED_AIR_HUMIDITY_DATA);
        } else if (value.equalsIgnoreCase("y")) {
            return RoutingKeyOption.of(AirHumidityDataOptions.WITH_AIR_HUMIDITY_DATA);
        } else if (value.equalsIgnoreCase("n")) {
            return RoutingKeyOption.of(AirHumidityDataOptions.WITHOUT_AIR_HUMIDITY_DATA);
        } else {
            return RoutingKeyOption.any();
        }
    }
}
