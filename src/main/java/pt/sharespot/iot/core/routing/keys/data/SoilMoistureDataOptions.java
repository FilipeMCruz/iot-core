package pt.sharespot.iot.core.routing.keys.data;

public enum SoilMoistureDataOptions {
    UNIDENTIFIED_SOIL_MOISTURE_DATA,
    WITH_SOIL_MOISTURE_DATA,
    WITHOUT_SOIL_MOISTURE_DATA;

    public String value() {
        if (this == UNIDENTIFIED_SOIL_MOISTURE_DATA) {
            return "u";
        } else if (this == WITH_SOIL_MOISTURE_DATA) {
            return "y";
        } else {
            return "n";
        }
    }

    public static String details(String value) {
        if (value.equalsIgnoreCase("u")) {
            return SoilMoistureDataOptions.UNIDENTIFIED_SOIL_MOISTURE_DATA.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("y")) {
            return SoilMoistureDataOptions.WITH_SOIL_MOISTURE_DATA.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("n")) {
            return SoilMoistureDataOptions.WITHOUT_SOIL_MOISTURE_DATA.toString().toLowerCase();
        } else {
            return "*";
        }
    }
}
