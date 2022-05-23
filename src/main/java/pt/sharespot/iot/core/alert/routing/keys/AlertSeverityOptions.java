package pt.sharespot.iot.core.alert.routing.keys;

import pt.sharespot.iot.core.keys.RoutingKey;
import pt.sharespot.iot.core.keys.RoutingKeyOption;

public enum AlertSeverityOptions implements RoutingKey {

    INFO,

    WARNING,

    CRITICAL;

    public String value() {
        return details();
    }

    public String details() {
        return this.toString().toLowerCase();
    }

    public static RoutingKeyOption<AlertSeverityOptions> extract(String value) {
        if (value.equalsIgnoreCase(INFO.value())) {
            return RoutingKeyOption.of(AlertSeverityOptions.INFO);
        } else if (value.equalsIgnoreCase(WARNING.value())) {
            return RoutingKeyOption.of(AlertSeverityOptions.WARNING);
        } else if (value.equalsIgnoreCase(CRITICAL.value())) {
            return RoutingKeyOption.of(AlertSeverityOptions.CRITICAL);
        } else {
            return RoutingKeyOption.any();
        }
    }
}
