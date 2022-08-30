package pt.sharespot.iot.core.data.routing.keys;

import pt.sharespot.iot.core.keys.ContainerTypeOptions;
import pt.sharespot.iot.core.keys.RoutingKeysBuilderOptions;

public class DataRoutingKeysFactory {

    private final String version;

    public DataRoutingKeysFactory() {
        this.version = getClass().getPackage().getImplementationVersion();
    }

    public DataRoutingKeys.Builder getBuilder(ContainerTypeOptions containerType, RoutingKeysBuilderOptions options) {
        return DataRoutingKeys.builder(containerType, options, version);
    }
}
