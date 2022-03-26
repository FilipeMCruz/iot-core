package pt.sharespot.iot.core.routing.keys.data;

import pt.sharespot.iot.core.routing.keys.RoutingKey;
import pt.sharespot.iot.core.routing.keys.RoutingKeyOption;

public enum AlarmDataOptions implements RoutingKey {
    UNIDENTIFIED_ALARM_DATA,
    WITH_ALARM_DATA,
    WITHOUT_ALARM_DATA;

    public String value() {
        if (this == UNIDENTIFIED_ALARM_DATA) {
            return "u";
        } else if (this == WITH_ALARM_DATA) {
            return "y";
        } else {
            return "n";
        }
    }

    public String details() {
        return this.toString().toLowerCase();
    }

    public static RoutingKeyOption<AlarmDataOptions> extract(String value) {
        if (value.equalsIgnoreCase("u")) {
            return RoutingKeyOption.of(AlarmDataOptions.UNIDENTIFIED_ALARM_DATA);
        } else if (value.equalsIgnoreCase("y")) {
            return RoutingKeyOption.of(AlarmDataOptions.WITH_ALARM_DATA);
        } else if (value.equalsIgnoreCase("n")) {
            return RoutingKeyOption.of(AlarmDataOptions.WITHOUT_ALARM_DATA);
        } else {
            return RoutingKeyOption.any();
        }
    }
}
