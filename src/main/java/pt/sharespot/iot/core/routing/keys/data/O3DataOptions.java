package pt.sharespot.iot.core.routing.keys.data;

import pt.sharespot.iot.core.routing.keys.RoutingKey;
import pt.sharespot.iot.core.routing.keys.RoutingKeyOption;

public enum O3DataOptions implements RoutingKey {
    UNIDENTIFIED_O3_DATA,
    WITH_O3_DATA,
    WITHOUT_O3_DATA;

    public String value() {
        if (this == UNIDENTIFIED_O3_DATA) {
            return "u";
        } else if (this == WITH_O3_DATA) {
            return "y";
        } else {
            return "n";
        }
    }

    public String details() {
        return this.toString().toLowerCase();
    }

    public static RoutingKeyOption<O3DataOptions> extract(String value) {
        if (value.equalsIgnoreCase("u")) {
            return RoutingKeyOption.of(O3DataOptions.UNIDENTIFIED_O3_DATA);
        } else if (value.equalsIgnoreCase("y")) {
            return RoutingKeyOption.of(O3DataOptions.WITH_O3_DATA);
        } else if (value.equalsIgnoreCase("n")) {
            return RoutingKeyOption.of(O3DataOptions.WITHOUT_O3_DATA);
        } else {
            return RoutingKeyOption.any();
        }
    }
}
