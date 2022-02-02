package pt.sharespot.iot.core.routing.keys;

public enum InfoTypeOptions {
    ENCODED,
    DECODED,
    PROCESSED;

    public String value() {
        if (this == ENCODED) {
            return "e";
        } else if (this == DECODED) {
            return "d";
        } else {
            return "p";
        }
    }

    public static String details(String value) {
        if (value.equalsIgnoreCase("e")) {
            return InfoTypeOptions.ENCODED.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("d")) {
            return InfoTypeOptions.DECODED.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("p")) {
            return InfoTypeOptions.PROCESSED.toString().toLowerCase();
        } else {
            return "*";
        }
    }
}
