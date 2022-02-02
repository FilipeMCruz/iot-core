package pt.sharespot.iot.core.routing.keys.data;

public enum MotionDataOptions {
    UNIDENTIFIED_MOTION_DATA,
    WITH_MOTION_DATA,
    WITHOUT_MOTION_DATA;

    public String value() {
        if (this == UNIDENTIFIED_MOTION_DATA) {
            return "u";
        } else if (this == WITH_MOTION_DATA) {
            return "y";
        } else {
            return "n";
        }
    }

    public static String details(String value) {
        if (value.equalsIgnoreCase("u")) {
            return MotionDataOptions.UNIDENTIFIED_MOTION_DATA.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("y")) {
            return MotionDataOptions.WITH_MOTION_DATA.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("n")) {
            return MotionDataOptions.WITHOUT_MOTION_DATA.toString().toLowerCase();
        } else {
            return "*";
        }
    }
}
