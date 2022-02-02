package pt.sharespot.iot.core.routing.keys.data;

public enum GPSDataOptions {
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

    public static String details(String value) {
        if (value.equalsIgnoreCase("u")) {
            return GPSDataOptions.UNIDENTIFIED_GPS_DATA.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("y")) {
            return GPSDataOptions.WITH_GPS_DATA.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("n")) {
            return GPSDataOptions.WITHOUT_GPS_DATA.toString().toLowerCase();
        } else {
            return "*";
        }
    }
}
