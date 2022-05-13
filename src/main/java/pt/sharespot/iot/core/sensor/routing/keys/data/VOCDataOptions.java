package pt.sharespot.iot.core.sensor.routing.keys.data;

import pt.sharespot.iot.core.keys.RoutingKey;
import pt.sharespot.iot.core.keys.RoutingKeyOption;

public enum VOCDataOptions implements RoutingKey {
    UNIDENTIFIED_VOC_DATA,
    WITH_VOC_DATA,
    WITHOUT_VOC_DATA;

    public String value() {
        if (this == UNIDENTIFIED_VOC_DATA) {
            return "u";
        } else if (this == WITH_VOC_DATA) {
            return "y";
        } else {
            return "n";
        }
    }

    public String details() {
        return this.toString().toLowerCase();
    }

    public static RoutingKeyOption<VOCDataOptions> extract(String value) {
        if (value.equalsIgnoreCase("u")) {
            return RoutingKeyOption.of(VOCDataOptions.UNIDENTIFIED_VOC_DATA);
        } else if (value.equalsIgnoreCase("y")) {
            return RoutingKeyOption.of(VOCDataOptions.WITH_VOC_DATA);
        } else if (value.equalsIgnoreCase("n")) {
            return RoutingKeyOption.of(VOCDataOptions.WITHOUT_VOC_DATA);
        } else {
            return RoutingKeyOption.any();
        }
    }
}
