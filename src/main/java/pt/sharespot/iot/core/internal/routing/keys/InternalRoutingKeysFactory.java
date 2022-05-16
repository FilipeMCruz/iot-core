package pt.sharespot.iot.core.internal.routing.keys;

import pt.sharespot.iot.core.keys.ContainerTypeOptions;
import pt.sharespot.iot.core.keys.RoutingKeysBuilderOptions;

public class InternalRoutingKeysFactory {

    private final String version;

    public InternalRoutingKeysFactory() {
        this.version = getClass().getPackage().getImplementationVersion();
    }

    public InternalRoutingKeys.Builder getBuilder(ContainerTypeOptions containerType, RoutingKeysBuilderOptions options) {
        return InternalRoutingKeys.builder(containerType, options, version);
    }
}
