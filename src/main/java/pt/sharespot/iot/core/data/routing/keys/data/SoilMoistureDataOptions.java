package pt.sharespot.iot.core.data.routing.keys.data;

import pt.sharespot.iot.core.keys.RoutingKey;
import pt.sharespot.iot.core.keys.RoutingKeyOption;

public enum SoilMoistureDataOptions implements RoutingKey {
    UNIDENTIFIED_SOIL_MOISTURE_DATA,
    WITH_SOIL_MOISTURE_DATA,
    WITHOUT_SOIL_MOISTURE_DATA;

    public String value() {
        if (this == UNIDENTIFIED_SOIL_MOISTURE_DATA) {
            return "u";
        } else if (this == WITH_SOIL_MOISTURE_DATA) {
            return "y";
        } else {
            return "n";
        }
    }

    public String details() {
        return this.toString().toLowerCase();
    }

    public static RoutingKeyOption<SoilMoistureDataOptions> extract(String value) {
        if (value.equalsIgnoreCase("u")) {
            return RoutingKeyOption.of(SoilMoistureDataOptions.UNIDENTIFIED_SOIL_MOISTURE_DATA);
        } else if (value.equalsIgnoreCase("y")) {
            return RoutingKeyOption.of(SoilMoistureDataOptions.WITH_SOIL_MOISTURE_DATA);
        } else if (value.equalsIgnoreCase("n")) {
            return RoutingKeyOption.of(SoilMoistureDataOptions.WITHOUT_SOIL_MOISTURE_DATA);
        } else {
            return RoutingKeyOption.any();
        }
    }
}
