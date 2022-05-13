package pt.sharespot.iot.core.sensor.routing.keys.data;

import pt.sharespot.iot.core.keys.RoutingKey;
import pt.sharespot.iot.core.keys.RoutingKeyOption;

public enum GPSDataOptions implements RoutingKey {
    UNIDENTIFIED_GPS_DATA,
    WITH_GPS_DATA,
    WITHOUT_GPS_DATA;

    public String value() {
        if (this == UNIDENTIFIED_GPS_DATA) {
            return "u";
        } else if (this == WITH_GPS_DATA) {
            return "y";
        } else {
            return "n";
        }
    }

    public String details() {
        return this.toString().toLowerCase();
    }

    public static RoutingKeyOption<GPSDataOptions> extract(String value) {
        if (value.equalsIgnoreCase("u")) {
            return RoutingKeyOption.of(GPSDataOptions.UNIDENTIFIED_GPS_DATA);
        } else if (value.equalsIgnoreCase("y")) {
            return RoutingKeyOption.of(GPSDataOptions.WITH_GPS_DATA);
        } else if (value.equalsIgnoreCase("n")) {
            return RoutingKeyOption.of(GPSDataOptions.WITHOUT_GPS_DATA);
        } else {
            return RoutingKeyOption.any();
        }
    }
}
