package pt.sharespot.iot.core.data.routing.keys.data;

import pt.sharespot.iot.core.keys.RoutingKey;
import pt.sharespot.iot.core.keys.RoutingKeyOption;

public enum MotionDataOptions implements RoutingKey {
    UNIDENTIFIED_MOTION_DATA,
    WITH_MOTION_DATA,
    WITHOUT_MOTION_DATA;

    public String value() {
        if (this == UNIDENTIFIED_MOTION_DATA) {
            return "u";
        } else if (this == WITH_MOTION_DATA) {
            return "y";
        } else {
            return "n";
        }
    }

    public String details() {
        return this.toString().toLowerCase();
    }

    public static RoutingKeyOption<MotionDataOptions> extract(String value) {
        if (value.equalsIgnoreCase("u")) {
            return RoutingKeyOption.of(MotionDataOptions.UNIDENTIFIED_MOTION_DATA);
        } else if (value.equalsIgnoreCase("y")) {
            return RoutingKeyOption.of(MotionDataOptions.WITH_MOTION_DATA);
        } else if (value.equalsIgnoreCase("n")) {
            return RoutingKeyOption.of(MotionDataOptions.WITHOUT_MOTION_DATA);
        } else {
            return RoutingKeyOption.any();
        }
    }
}
