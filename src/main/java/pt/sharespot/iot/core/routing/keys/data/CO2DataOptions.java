package pt.sharespot.iot.core.routing.keys.data;

import pt.sharespot.iot.core.routing.keys.RoutingKey;
import pt.sharespot.iot.core.routing.keys.RoutingKeyOption;

public enum CO2DataOptions implements RoutingKey {
    UNIDENTIFIED_CO2_DATA,
    WITH_CO2_DATA,
    WITHOUT_CO2_DATA;

    public String value() {
        if (this == UNIDENTIFIED_CO2_DATA) {
            return "u";
        } else if (this == WITH_CO2_DATA) {
            return "y";
        } else {
            return "n";
        }
    }

    public String details() {
        return this.toString().toLowerCase();
    }

    public static RoutingKeyOption<CO2DataOptions> extract(String value) {
        if (value.equalsIgnoreCase("u")) {
            return RoutingKeyOption.of(CO2DataOptions.UNIDENTIFIED_CO2_DATA);
        } else if (value.equalsIgnoreCase("y")) {
            return RoutingKeyOption.of(CO2DataOptions.WITH_CO2_DATA);
        } else if (value.equalsIgnoreCase("n")) {
            return RoutingKeyOption.of(CO2DataOptions.WITHOUT_CO2_DATA);
        } else {
            return RoutingKeyOption.any();
        }
    }
}
