package pt.sharespot.iot.core.keys;

public enum OwnershipOptions implements RoutingKey {
    UNIDENTIFIED_DOMAIN_OWNERSHIP,
    WITH_DOMAIN_OWNERSHIP,
    WITHOUT_DOMAIN_OWNERSHIP;

    public String value() {
        if (this == UNIDENTIFIED_DOMAIN_OWNERSHIP) {
            return "u";
        } else if (this == WITH_DOMAIN_OWNERSHIP) {
            return "y";
        } else {
            return "n";
        }
    }

    public String details() {
        return this.toString().toLowerCase();
    }

    public static RoutingKeyOption<OwnershipOptions> extract(String value) {
        if (value.equalsIgnoreCase("u")) {
            return RoutingKeyOption.of(OwnershipOptions.UNIDENTIFIED_DOMAIN_OWNERSHIP);
        } else if (value.equalsIgnoreCase("y")) {
            return RoutingKeyOption.of(OwnershipOptions.WITH_DOMAIN_OWNERSHIP);
        } else if (value.equalsIgnoreCase("n")) {
            return RoutingKeyOption.of(OwnershipOptions.WITHOUT_DOMAIN_OWNERSHIP);
        } else {
            return RoutingKeyOption.any();
        }
    }
}
