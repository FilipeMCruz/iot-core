package pt.sharespot.iot.core.alert.routing.keys;

import pt.sharespot.iot.core.alert.model.AlertLevelDTO;
import pt.sharespot.iot.core.keys.RoutingKey;
import pt.sharespot.iot.core.keys.RoutingKeyOption;

public enum AlertSeverityOptions implements RoutingKey {

    INFORMATION,

    WARNING,

    CRITICAL;

    public String value() {
        return details();
    }

    public String details() {
        return this.toString().toLowerCase();
    }

    public static RoutingKeyOption<AlertSeverityOptions> extract(String value) {
        if (value.equalsIgnoreCase(INFORMATION.value())) {
            return RoutingKeyOption.of(AlertSeverityOptions.INFORMATION);
        } else if (value.equalsIgnoreCase(WARNING.value())) {
            return RoutingKeyOption.of(AlertSeverityOptions.WARNING);
        } else if (value.equalsIgnoreCase(CRITICAL.value())) {
            return RoutingKeyOption.of(AlertSeverityOptions.CRITICAL);
        } else {
            return RoutingKeyOption.any();
        }
    }

    public static AlertSeverityOptions extract(AlertLevelDTO dto) {
        if (dto.equals(AlertLevelDTO.INFORMATION)) {
            return INFORMATION;
        } else if (dto.equals(AlertLevelDTO.WARNING)) {
            return WARNING;
        } else if (dto.equals(AlertLevelDTO.CRITICAL)) {
            return CRITICAL;
        }
        return INFORMATION;
    }
}
