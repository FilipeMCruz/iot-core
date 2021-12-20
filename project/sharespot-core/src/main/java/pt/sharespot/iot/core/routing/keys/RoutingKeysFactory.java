package pt.sharespot.iot.core.routing.keys;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RoutingKeysFactory {

    private final String version;

    @Value("${sharespot.container.name}")
    private String containerName;

    @Value("${sharespot.container.type}")
    private String containerType;

    public RoutingKeysFactory() {
        this.version = getClass().getPackage().getImplementationVersion();
    }

    public RoutingKeys.RoutingKeysBuilder getBuilder(RoutingKeysBuilderOptions options) {
        return RoutingKeys.builder(containerName, containerType, options, version);
    }
}
