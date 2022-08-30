package pt.sharespot.iot.core.data.routing.keys.data;

import pt.sharespot.iot.core.keys.RoutingKey;
import pt.sharespot.iot.core.keys.RoutingKeyOption;

public enum NO2DataOptions implements RoutingKey {
    UNIDENTIFIED_NO2_DATA,
    WITH_NO2_DATA,
    WITHOUT_NO2_DATA;

    public String value() {
        if (this == UNIDENTIFIED_NO2_DATA) {
            return "u";
        } else if (this == WITH_NO2_DATA) {
            return "y";
        } else {
            return "n";
        }
    }

    public String details() {
        return this.toString().toLowerCase();
    }

    public static RoutingKeyOption<NO2DataOptions> extract(String value) {
        if (value.equalsIgnoreCase("u")) {
            return RoutingKeyOption.of(NO2DataOptions.UNIDENTIFIED_NO2_DATA);
        } else if (value.equalsIgnoreCase("y")) {
            return RoutingKeyOption.of(NO2DataOptions.WITH_NO2_DATA);
        } else if (value.equalsIgnoreCase("n")) {
            return RoutingKeyOption.of(NO2DataOptions.WITHOUT_NO2_DATA);
        } else {
            return RoutingKeyOption.any();
        }
    }
}
