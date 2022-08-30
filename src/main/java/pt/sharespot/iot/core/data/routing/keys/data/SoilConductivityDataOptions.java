package pt.sharespot.iot.core.data.routing.keys.data;

import pt.sharespot.iot.core.keys.RoutingKey;
import pt.sharespot.iot.core.keys.RoutingKeyOption;

public enum SoilConductivityDataOptions implements RoutingKey {
    UNIDENTIFIED_SOIL_CONDUCTIVITY_DATA,
    WITH_SOIL_CONDUCTIVITY_DATA,
    WITHOUT_SOIL_CONDUCTIVITY_DATA;

    public String value() {
        if (this == UNIDENTIFIED_SOIL_CONDUCTIVITY_DATA) {
            return "u";
        } else if (this == WITH_SOIL_CONDUCTIVITY_DATA) {
            return "y";
        } else {
            return "n";
        }
    }

    public String details() {
        return this.toString().toLowerCase();
    }

    public static RoutingKeyOption<SoilConductivityDataOptions> extract(String value) {
        if (value.equalsIgnoreCase("u")) {
            return RoutingKeyOption.of(SoilConductivityDataOptions.UNIDENTIFIED_SOIL_CONDUCTIVITY_DATA);
        } else if (value.equalsIgnoreCase("y")) {
            return RoutingKeyOption.of(SoilConductivityDataOptions.WITH_SOIL_CONDUCTIVITY_DATA);
        } else if (value.equalsIgnoreCase("n")) {
            return RoutingKeyOption.of(SoilConductivityDataOptions.WITHOUT_SOIL_CONDUCTIVITY_DATA);
        } else {
            return RoutingKeyOption.any();
        }
    }
}
