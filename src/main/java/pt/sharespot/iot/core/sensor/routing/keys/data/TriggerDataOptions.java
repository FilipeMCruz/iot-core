package pt.sharespot.iot.core.sensor.routing.keys.data;

import pt.sharespot.iot.core.keys.RoutingKey;
import pt.sharespot.iot.core.keys.RoutingKeyOption;

public enum TriggerDataOptions implements RoutingKey {
    UNIDENTIFIED_TRIGGER_DATA,
    WITH_TRIGGER_DATA,
    WITHOUT_TRIGGER_DATA;

    public String value() {
        if (this == UNIDENTIFIED_TRIGGER_DATA) {
            return "u";
        } else if (this == WITH_TRIGGER_DATA) {
            return "y";
        } else {
            return "n";
        }
    }

    public String details() {
        return this.toString().toLowerCase();
    }

    public static RoutingKeyOption<TriggerDataOptions> extract(String value) {
        if (value.equalsIgnoreCase("u")) {
            return RoutingKeyOption.of(TriggerDataOptions.UNIDENTIFIED_TRIGGER_DATA);
        } else if (value.equalsIgnoreCase("y")) {
            return RoutingKeyOption.of(TriggerDataOptions.WITH_TRIGGER_DATA);
        } else if (value.equalsIgnoreCase("n")) {
            return RoutingKeyOption.of(TriggerDataOptions.WITHOUT_TRIGGER_DATA);
        } else {
            return RoutingKeyOption.any();
        }
    }
}
