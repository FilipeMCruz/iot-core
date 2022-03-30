package pt.sharespot.iot.core.routing.keys;

public enum DomainOwnershipOptions implements RoutingKey {
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

    public static RoutingKeyOption<DomainOwnershipOptions> extract(String value) {
        if (value.equalsIgnoreCase("u")) {
            return RoutingKeyOption.of(DomainOwnershipOptions.UNIDENTIFIED_DOMAIN_OWNERSHIP);
        } else if (value.equalsIgnoreCase("y")) {
            return RoutingKeyOption.of(DomainOwnershipOptions.WITH_DOMAIN_OWNERSHIP);
        } else if (value.equalsIgnoreCase("n")) {
            return RoutingKeyOption.of(DomainOwnershipOptions.WITHOUT_DOMAIN_OWNERSHIP);
        } else {
            return RoutingKeyOption.any();
        }
    }
}
