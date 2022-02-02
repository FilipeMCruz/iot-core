package pt.sharespot.iot.core.routing.keys;

public enum DataLegitimacyOptions {
    UNKNOWN,
    CORRECT,
    INCORRECT,
    UNDETERMINED;

    public String value() {
        if (this == UNKNOWN) {
            return "u";
        } else if (this == CORRECT) {
            return "c";
        } else if (this == INCORRECT) {
            return "i";
        } else {
            return "n";
        }
    }

    public static String details(String value) {
        if (value.equalsIgnoreCase("u")) {
            return DataLegitimacyOptions.UNKNOWN.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("c")) {
            return DataLegitimacyOptions.CORRECT.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("i")) {
            return DataLegitimacyOptions.INCORRECT.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("n")) {
            return DataLegitimacyOptions.UNDETERMINED.toString().toLowerCase();
        } else {
            return "*";
        }
    }
}
