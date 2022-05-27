package pt.sharespot.iot.core.alert.routing.keys;

import pt.sharespot.iot.core.alert.model.AlertLevel;
import pt.sharespot.iot.core.keys.RoutingKey;
import pt.sharespot.iot.core.keys.RoutingKeyOption;

import java.util.Locale;

public enum AlertSeverityOptions implements RoutingKey {

    INFORMATION,

    WATCH,

    ADVISORY,

    WARNING,

    CRITICAL;

    public String value() {
        return details();
    }

    public String details() {
        return this.toString().toLowerCase();
    }

    public static RoutingKeyOption<AlertSeverityOptions> extract(String value) {
        try {
            return RoutingKeyOption.of(AlertSeverityOptions.valueOf(value.toUpperCase(Locale.ROOT)));
        } catch (IllegalArgumentException ex) {
            return RoutingKeyOption.any();
        }
    }

    public static AlertSeverityOptions extract(AlertLevel dto) {
        return switch (dto) {
            case INFORMATION -> INFORMATION;
            case WATCH -> WATCH;
            case ADVISORY -> ADVISORY;
            case WARNING -> WARNING;
            case CRITICAL -> CRITICAL;
        };
    }
}
