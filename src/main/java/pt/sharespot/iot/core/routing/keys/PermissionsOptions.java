package pt.sharespot.iot.core.routing.keys;

public enum PermissionsOptions implements RoutingKey {
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

    public String details() {
        return this.toString().toLowerCase();
    }

    public static RoutingKeyOption<PermissionsOptions> extract(String value) {
        if (value.equalsIgnoreCase("u")) {
            return RoutingKeyOption.of(PermissionsOptions.UNIDENTIFIED_PERMISSIONS);
        } else if (value.equalsIgnoreCase("y")) {
            return RoutingKeyOption.of(PermissionsOptions.WITH_PERMISSIONS);
        } else if (value.equalsIgnoreCase("n")) {
            return RoutingKeyOption.of(PermissionsOptions.WITHOUT_PERMISSIONS);
        } else {
            return RoutingKeyOption.any();
        }
    }
}
