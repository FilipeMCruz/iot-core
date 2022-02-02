package pt.sharespot.iot.core.routing.keys.data;

public enum TemperatureDataOptions {
    UNIDENTIFIED_TEMPERATURE_DATA,
    WITH_TEMPERATURE_DATA,
    WITHOUT_TEMPERATURE_DATA;

    public String value() {
        if (this == UNIDENTIFIED_TEMPERATURE_DATA) {
            return "u";
        } else if (this == WITH_TEMPERATURE_DATA) {
            return "y";
        } else {
            return "n";
        }
    }

    public static String details(String value) {
        if (value.equalsIgnoreCase("u")) {
            return TemperatureDataOptions.UNIDENTIFIED_TEMPERATURE_DATA.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("y")) {
            return TemperatureDataOptions.WITH_TEMPERATURE_DATA.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("n")) {
            return TemperatureDataOptions.WITHOUT_TEMPERATURE_DATA.toString().toLowerCase();
        } else {
            return "*";
        }
    }
}
