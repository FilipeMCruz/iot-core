package pt.sharespot.iot.core.routing.keys.data;

import pt.sharespot.iot.core.routing.keys.RoutingKey;
import pt.sharespot.iot.core.routing.keys.RoutingKeyOption;

public enum OccupationDataOptions implements RoutingKey {
    UNIDENTIFIED_OCCUPATION_DATA,
    WITH_OCCUPATION_DATA,
    WITHOUT_OCCUPATION_DATA;

    public String value() {
        if (this == UNIDENTIFIED_OCCUPATION_DATA) {
            return "u";
        } else if (this == WITH_OCCUPATION_DATA) {
            return "y";
        } else {
            return "n";
        }
    }

    public String details() {
        return this.toString().toLowerCase();
    }

    public static RoutingKeyOption<OccupationDataOptions> extract(String value) {
        if (value.equalsIgnoreCase("u")) {
            return RoutingKeyOption.of(OccupationDataOptions.UNIDENTIFIED_OCCUPATION_DATA);
        } else if (value.equalsIgnoreCase("y")) {
            return RoutingKeyOption.of(OccupationDataOptions.WITH_OCCUPATION_DATA);
        } else if (value.equalsIgnoreCase("n")) {
            return RoutingKeyOption.of(OccupationDataOptions.WITHOUT_OCCUPATION_DATA);
        } else {
            return RoutingKeyOption.any();
        }
    }
}
