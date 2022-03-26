package pt.sharespot.iot.core.routing.keys.data;

public enum AlarmDataOptions {
    UNIDENTIFIED_ALARM_DATA,
    WITH_ALARM_DATA,
    WITHOUT_ALARM_DATA;

    public String value() {
        if (this == UNIDENTIFIED_ALARM_DATA) {
            return "u";
        } else if (this == WITH_ALARM_DATA) {
            return "y";
        } else {
            return "n";
        }
    }

    public static String details(String value) {
        if (value.equalsIgnoreCase("u")) {
            return AlarmDataOptions.UNIDENTIFIED_ALARM_DATA.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("y")) {
            return AlarmDataOptions.WITH_ALARM_DATA.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("n")) {
            return AlarmDataOptions.WITHOUT_ALARM_DATA.toString().toLowerCase();
        } else {
            return "*";
        }
    }
}
