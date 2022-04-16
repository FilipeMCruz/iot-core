package pt.sharespot.iot.core.routing.keys.data;

import pt.sharespot.iot.core.routing.keys.RoutingKey;
import pt.sharespot.iot.core.routing.keys.RoutingKeyOption;

public enum PHDataOptions implements RoutingKey {
    UNIDENTIFIED_PH_DATA,
    WITH_PH_DATA,
    WITHOUT_PH_DATA;

    public String value() {
        if (this == UNIDENTIFIED_PH_DATA) {
            return "u";
        } else if (this == WITH_PH_DATA) {
            return "y";
        } else {
            return "n";
        }
    }

    public String details() {
        return this.toString().toLowerCase();
    }

    public static RoutingKeyOption<PHDataOptions> extract(String value) {
        if (value.equalsIgnoreCase("u")) {
            return RoutingKeyOption.of(PHDataOptions.UNIDENTIFIED_PH_DATA);
        } else if (value.equalsIgnoreCase("y")) {
            return RoutingKeyOption.of(PHDataOptions.WITH_PH_DATA);
        } else if (value.equalsIgnoreCase("n")) {
            return RoutingKeyOption.of(PHDataOptions.WITHOUT_PH_DATA);
        } else {
            return RoutingKeyOption.any();
        }
    }
}
