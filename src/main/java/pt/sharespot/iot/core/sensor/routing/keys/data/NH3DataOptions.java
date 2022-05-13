package pt.sharespot.iot.core.sensor.routing.keys.data;

import pt.sharespot.iot.core.keys.RoutingKey;
import pt.sharespot.iot.core.keys.RoutingKeyOption;

public enum NH3DataOptions implements RoutingKey {
    UNIDENTIFIED_NH3_DATA,
    WITH_NH3_DATA,
    WITHOUT_NH3_DATA;

    public String value() {
        if (this == UNIDENTIFIED_NH3_DATA) {
            return "u";
        } else if (this == WITH_NH3_DATA) {
            return "y";
        } else {
            return "n";
        }
    }

    public String details() {
        return this.toString().toLowerCase();
    }

    public static RoutingKeyOption<NH3DataOptions> extract(String value) {
        if (value.equalsIgnoreCase("u")) {
            return RoutingKeyOption.of(NH3DataOptions.UNIDENTIFIED_NH3_DATA);
        } else if (value.equalsIgnoreCase("y")) {
            return RoutingKeyOption.of(NH3DataOptions.WITH_NH3_DATA);
        } else if (value.equalsIgnoreCase("n")) {
            return RoutingKeyOption.of(NH3DataOptions.WITHOUT_NH3_DATA);
        } else {
            return RoutingKeyOption.any();
        }
    }
}
