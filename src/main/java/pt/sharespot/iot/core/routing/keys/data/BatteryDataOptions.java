package pt.sharespot.iot.core.routing.keys.data;

public enum BatteryDataOptions {
    UNIDENTIFIED_BATTERY_DATA,
    WITH_BATTERY_DATA,
    WITHOUT_BATTERY_DATA;

    public String value() {
        if (this == UNIDENTIFIED_BATTERY_DATA) {
            return "u";
        } else if (this == WITH_BATTERY_DATA) {
            return "y";
        } else {
            return "n";
        }
    }

    public static String details(String value) {
        if (value.equalsIgnoreCase("u")) {
            return BatteryDataOptions.UNIDENTIFIED_BATTERY_DATA.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("y")) {
            return BatteryDataOptions.WITH_BATTERY_DATA.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("n")) {
            return BatteryDataOptions.WITHOUT_BATTERY_DATA.toString().toLowerCase();
        } else {
            return "*";
        }
    }
}
