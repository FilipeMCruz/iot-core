package pt.sharespot.iot.core.routing.keys.data;

public enum AirQualityDataOptions {
    UNIDENTIFIED_AQI_DATA,
    WITH_AQI_DATA,
    WITHOUT_AQI_DATA;

    public String value() {
        if (this == UNIDENTIFIED_AQI_DATA) {
            return "u";
        } else if (this == WITH_AQI_DATA) {
            return "y";
        } else {
            return "n";
        }
    }

    public static String details(String value) {
        if (value.equalsIgnoreCase("u")) {
            return AirQualityDataOptions.UNIDENTIFIED_AQI_DATA.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("y")) {
            return AirQualityDataOptions.WITH_AQI_DATA.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("n")) {
            return AirQualityDataOptions.WITHOUT_AQI_DATA.toString().toLowerCase();
        } else {
            return "*";
        }
    }
}
