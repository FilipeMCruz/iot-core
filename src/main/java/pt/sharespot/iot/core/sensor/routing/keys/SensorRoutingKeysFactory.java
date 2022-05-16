package pt.sharespot.iot.core.sensor.routing.keys;

import pt.sharespot.iot.core.keys.ContainerTypeOptions;
import pt.sharespot.iot.core.keys.RoutingKeysBuilderOptions;

public class SensorRoutingKeysFactory {

    private final String version;

    public SensorRoutingKeysFactory() {
        this.version = getClass().getPackage().getImplementationVersion();
    }

    public SensorRoutingKeys.Builder getBuilder(ContainerTypeOptions containerType, RoutingKeysBuilderOptions options) {
        return SensorRoutingKeys.builder(containerType, options, version);
    }
}
