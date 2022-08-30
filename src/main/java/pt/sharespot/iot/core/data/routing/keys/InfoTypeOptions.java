package pt.sharespot.iot.core.data.routing.keys;

import pt.sharespot.iot.core.keys.RoutingKey;
import pt.sharespot.iot.core.keys.RoutingKeyOption;

public enum InfoTypeOptions implements RoutingKey {
    ENCODED,
    DECODED,
    PROCESSED;

    public String value() {
        if (this == ENCODED) {
            return "e";
        } else if (this == DECODED) {
            return "d";
        } else {
            return "p";
        }
    }

    public String details() {
        return this.toString().toLowerCase();
    }

    public static RoutingKeyOption<InfoTypeOptions> extract(String value) {
        if (value.equalsIgnoreCase("e")) {
            return RoutingKeyOption.of(InfoTypeOptions.ENCODED);
        } else if (value.equalsIgnoreCase("d")) {
            return RoutingKeyOption.of(InfoTypeOptions.DECODED);
        } else if (value.equalsIgnoreCase("p")) {
            return RoutingKeyOption.of(InfoTypeOptions.PROCESSED);
        } else {
            return RoutingKeyOption.any();
        }
    }
}
