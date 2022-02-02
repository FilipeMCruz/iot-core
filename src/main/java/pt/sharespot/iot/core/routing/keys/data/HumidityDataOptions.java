package pt.sharespot.iot.core.routing.keys.data;

public enum HumidityDataOptions {
    UNIDENTIFIED_HUMIDITY_DATA,
    WITH_HUMIDITY_DATA,
    WITHOUT_HUMIDITY_DATA;

    public String value() {
        if (this == UNIDENTIFIED_HUMIDITY_DATA) {
            return "u";
        } else if (this == WITH_HUMIDITY_DATA) {
            return "y";
        } else {
            return "n";
        }
    }

    public static String details(String value) {
        if (value.equalsIgnoreCase("u")) {
            return HumidityDataOptions.UNIDENTIFIED_HUMIDITY_DATA.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("y")) {
            return HumidityDataOptions.WITH_HUMIDITY_DATA.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("n")) {
            return HumidityDataOptions.WITHOUT_HUMIDITY_DATA.toString().toLowerCase();
        } else {
            return "*";
        }
    }
}
