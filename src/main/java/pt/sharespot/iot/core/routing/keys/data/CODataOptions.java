package pt.sharespot.iot.core.routing.keys.data;

import pt.sharespot.iot.core.routing.keys.RoutingKey;
import pt.sharespot.iot.core.routing.keys.RoutingKeyOption;

public enum CODataOptions implements RoutingKey {
    UNIDENTIFIED_CO_DATA,
    WITH_CO_DATA,
    WITHOUT_CO_DATA;

    public String value() {
        if (this == UNIDENTIFIED_CO_DATA) {
            return "u";
        } else if (this == WITH_CO_DATA) {
            return "y";
        } else {
            return "n";
        }
    }

    public String details() {
        return this.toString().toLowerCase();
    }

    public static RoutingKeyOption<CODataOptions> extract(String value) {
        if (value.equalsIgnoreCase("u")) {
            return RoutingKeyOption.of(CODataOptions.UNIDENTIFIED_CO_DATA);
        } else if (value.equalsIgnoreCase("y")) {
            return RoutingKeyOption.of(CODataOptions.WITH_CO_DATA);
        } else if (value.equalsIgnoreCase("n")) {
            return RoutingKeyOption.of(CODataOptions.WITHOUT_CO_DATA);
        } else {
            return RoutingKeyOption.any();
        }
    }
}
