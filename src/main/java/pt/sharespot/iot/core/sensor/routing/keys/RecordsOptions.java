package pt.sharespot.iot.core.sensor.routing.keys;

import pt.sharespot.iot.core.keys.RoutingKey;
import pt.sharespot.iot.core.keys.RoutingKeyOption;

public enum RecordsOptions implements RoutingKey {
    UNIDENTIFIED_RECORDS,
    WITH_RECORDS,
    WITHOUT_RECORDS;

    public String value() {
        if (this == UNIDENTIFIED_RECORDS) {
            return "u";
        } else if (this == WITH_RECORDS) {
            return "y";
        } else {
            return "n";
        }
    }

    public String details() {
        return this.toString().toLowerCase();
    }

    public static RoutingKeyOption<RecordsOptions> extract(String value) {
        if (value.equalsIgnoreCase("u")) {
            return RoutingKeyOption.of(RecordsOptions.UNIDENTIFIED_RECORDS);
        } else if (value.equalsIgnoreCase("y")) {
            return RoutingKeyOption.of(RecordsOptions.WITH_RECORDS);
        } else if (value.equalsIgnoreCase("n")) {
            return RoutingKeyOption.of(RecordsOptions.WITHOUT_RECORDS);
        } else {
            return RoutingKeyOption.any();
        }
    }
}
