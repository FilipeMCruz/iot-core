package pt.sharespot.iot.core.routing.keys;

public enum RecordsOptions {
    UNIDENTIFIED_RECORDS,
    WITH_RECORDS,
    WITHOUT_RECORDS;

    public String value() {
        if (this == UNIDENTIFIED_RECORDS) {
            return "u";
        } else if (this == WITH_RECORDS) {
            return "y";
        } else {
            return "n";
        }
    }

    public static String details(String value) {
        if (value.equalsIgnoreCase("u")) {
            return RecordsOptions.UNIDENTIFIED_RECORDS.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("y")) {
            return RecordsOptions.WITH_RECORDS.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("n")) {
            return RecordsOptions.WITHOUT_RECORDS.toString().toLowerCase();
        } else {
            return "*";
        }
    }
}
