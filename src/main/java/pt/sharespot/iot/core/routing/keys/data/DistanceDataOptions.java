package pt.sharespot.iot.core.routing.keys.data;

import pt.sharespot.iot.core.routing.keys.RoutingKey;
import pt.sharespot.iot.core.routing.keys.RoutingKeyOption;

public enum DistanceDataOptions implements RoutingKey {
    UNIDENTIFIED_DISTANCE_DATA,
    WITH_DISTANCE_DATA,
    WITHOUT_DISTANCE_DATA;

    public String value() {
        if (this == UNIDENTIFIED_DISTANCE_DATA) {
            return "u";
        } else if (this == WITH_DISTANCE_DATA) {
            return "y";
        } else {
            return "n";
        }
    }

    public String details() {
        return this.toString().toLowerCase();
    }

    public static RoutingKeyOption<DistanceDataOptions> extract(String value) {
        if (value.equalsIgnoreCase("u")) {
            return RoutingKeyOption.of(DistanceDataOptions.UNIDENTIFIED_DISTANCE_DATA);
        } else if (value.equalsIgnoreCase("y")) {
            return RoutingKeyOption.of(DistanceDataOptions.WITH_DISTANCE_DATA);
        } else if (value.equalsIgnoreCase("n")) {
            return RoutingKeyOption.of(DistanceDataOptions.WITHOUT_DISTANCE_DATA);
        } else {
            return RoutingKeyOption.any();
        }
    }
}
