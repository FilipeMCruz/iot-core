package pt.sharespot.iot.core.routing.keys.data;

public enum IlluminanceDataOptions {
    UNIDENTIFIED_ILLUMINANCE_DATA,
    WITH_ILLUMINANCE_DATA,
    WITHOUT_ILLUMINANCE_DATA;

    public String value() {
        if (this == UNIDENTIFIED_ILLUMINANCE_DATA) {
            return "u";
        } else if (this == WITH_ILLUMINANCE_DATA) {
            return "y";
        } else {
            return "n";
        }
    }

    public static String details(String value) {
        if (value.equalsIgnoreCase("u")) {
            return IlluminanceDataOptions.UNIDENTIFIED_ILLUMINANCE_DATA.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("y")) {
            return IlluminanceDataOptions.WITH_ILLUMINANCE_DATA.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("n")) {
            return IlluminanceDataOptions.WITHOUT_ILLUMINANCE_DATA.toString().toLowerCase();
        } else {
            return "*";
        }
    }
}
