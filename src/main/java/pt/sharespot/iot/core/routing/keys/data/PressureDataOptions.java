package pt.sharespot.iot.core.routing.keys.data;

public enum PressureDataOptions {
    UNIDENTIFIED_PRESSURE_DATA,
    WITH_PRESSURE_DATA,
    WITHOUT_PRESSURE_DATA;

    public String value() {
        if (this == UNIDENTIFIED_PRESSURE_DATA) {
            return "u";
        } else if (this == WITH_PRESSURE_DATA) {
            return "y";
        } else {
            return "n";
        }
    }

    public static String details(String value) {
        if (value.equalsIgnoreCase("u")) {
            return PressureDataOptions.UNIDENTIFIED_PRESSURE_DATA.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("y")) {
            return PressureDataOptions.WITH_PRESSURE_DATA.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("n")) {
            return PressureDataOptions.WITHOUT_PRESSURE_DATA.toString().toLowerCase();
        } else {
            return "*";
        }
    }
}
