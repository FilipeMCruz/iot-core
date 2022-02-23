package pt.sharespot.iot.core.routing.keys;

public enum PermissionsOptions {
    UNIDENTIFIED_PERMISSIONS,
    WITH_PERMISSIONS,
    WITHOUT_PERMISSIONS;

    public String value() {
        if (this == UNIDENTIFIED_PERMISSIONS) {
            return "u";
        } else if (this == WITH_PERMISSIONS) {
            return "y";
        } else {
            return "n";
        }
    }

    public static String details(String value) {
        if (value.equalsIgnoreCase("u")) {
            return PermissionsOptions.UNIDENTIFIED_PERMISSIONS.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("y")) {
            return PermissionsOptions.WITH_PERMISSIONS.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("n")) {
            return PermissionsOptions.WITHOUT_PERMISSIONS.toString().toLowerCase();
        } else {
            return "*";
        }
    }
}
