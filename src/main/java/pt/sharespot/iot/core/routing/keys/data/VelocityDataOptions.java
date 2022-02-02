package pt.sharespot.iot.core.routing.keys.data;

public enum VelocityDataOptions {
    UNIDENTIFIED_VELOCITY_DATA,
    WITH_VELOCITY_DATA,
    WITHOUT_VELOCITY_DATA;

    public String value() {
        if (this == UNIDENTIFIED_VELOCITY_DATA) {
            return "u";
        } else if (this == WITH_VELOCITY_DATA) {
            return "y";
        } else {
            return "n";
        }
    }

    public static String details(String value) {
        if (value.equalsIgnoreCase("u")) {
            return VelocityDataOptions.UNIDENTIFIED_VELOCITY_DATA.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("y")) {
            return VelocityDataOptions.WITH_VELOCITY_DATA.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("n")) {
            return VelocityDataOptions.WITHOUT_VELOCITY_DATA.toString().toLowerCase();
        } else {
            return "*";
        }
    }
}
