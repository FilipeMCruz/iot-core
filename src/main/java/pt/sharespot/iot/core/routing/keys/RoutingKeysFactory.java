package pt.sharespot.iot.core.routing.keys;

public class RoutingKeysFactory {

    private final String version;

    public RoutingKeysFactory() {
        this.version = getClass().getPackage().getImplementationVersion();
    }

    public RoutingKeys.RoutingKeysBuilder getBuilder(ContainerTypeOptions containerType, RoutingKeysBuilderOptions options) {
        return RoutingKeys.builder(containerType, options, version);
    }
}
