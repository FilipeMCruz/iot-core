package pt.sharespot.iot.core.sensor.routing.keys;

import pt.sharespot.iot.core.keys.RoutingKey;
import pt.sharespot.iot.core.keys.RoutingKeyOption;

public enum DataLegitimacyOptions implements RoutingKey {
    UNKNOWN,
    CORRECT,
    INCORRECT,
    UNDETERMINED;

    public String value() {
        if (this == UNKNOWN) {
            return "u";
        } else if (this == CORRECT) {
            return "c";
        } else if (this == INCORRECT) {
            return "i";
        } else {
            return "n";
        }
    }

    public String details() {
        return this.toString().toLowerCase();
    }

    public static RoutingKeyOption<DataLegitimacyOptions> extract(String value) {
        if (value.equalsIgnoreCase("u")) {
            return RoutingKeyOption.of(DataLegitimacyOptions.UNKNOWN);
        } else if (value.equalsIgnoreCase("c")) {
            return RoutingKeyOption.of(DataLegitimacyOptions.CORRECT);
        } else if (value.equalsIgnoreCase("i")) {
            return RoutingKeyOption.of(DataLegitimacyOptions.INCORRECT);
        } else if (value.equalsIgnoreCase("n")) {
            return RoutingKeyOption.of(DataLegitimacyOptions.UNDETERMINED);
        } else {
            return RoutingKeyOption.any();
        }
    }
}
