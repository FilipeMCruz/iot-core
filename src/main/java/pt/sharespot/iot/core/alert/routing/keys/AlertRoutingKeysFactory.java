package pt.sharespot.iot.core.alert.routing.keys;

import pt.sharespot.iot.core.keys.ContainerTypeOptions;
import pt.sharespot.iot.core.keys.RoutingKeysBuilderOptions;

public class AlertRoutingKeysFactory {

    private final String version;

    public AlertRoutingKeysFactory() {
        this.version = getClass().getPackage().getImplementationVersion();
    }

    public AlertRoutingKeys.Builder getBuilder(ContainerTypeOptions containerType, RoutingKeysBuilderOptions options) {
        return AlertRoutingKeys.builder(containerType, options, version);
    }
}
