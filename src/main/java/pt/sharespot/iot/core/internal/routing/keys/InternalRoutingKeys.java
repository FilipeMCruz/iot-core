package pt.sharespot.iot.core.internal.routing.keys;

import pt.sharespot.iot.core.keys.*;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InternalRoutingKeys implements RoutingKeys {

    public RoutingKeyOption<ProtocolVersionOptions> version;

    public RoutingKeyOption<ContainerTypeOptions> containerType;

    public RoutingKeyOption<ContextTypeOptions> contextType;

    public RoutingKeyOption<OperationTypeOptions> operationType;

    public InternalRoutingKeys(RoutingKeyOption<ContainerTypeOptions> containerType, RoutingKeyOption<ProtocolVersionOptions> version, RoutingKeyOption<ContextTypeOptions> contextType, RoutingKeyOption<OperationTypeOptions> operationType) {
        this.containerType = containerType;
        this.version = version;
        this.contextType = contextType;
        this.operationType = operationType;
    }

    public InternalRoutingKeys() {
    }

    private Stream<RoutingKeyOption<? extends RoutingKey>> orderedKeys() {
        return Stream.of(containerType, version, RoutingKeyOption.of(ExchangeOptions.of("internal")), contextType, operationType);
    }

    @Override
    public String toString() {
        return orderedKeys()
                .map(RoutingKeyOption::value)
                .collect(Collectors.joining("."));
    }

    @Override
    public String keys() {
        return toString();
    }

    public String details() {
        return orderedKeys()
                .map(RoutingKeyOption::details)
                .collect(Collectors.joining("."));
    }

    public static Builder builder(ContainerTypeOptions type, RoutingKeysBuilderOptions options, String version) {
        return new Builder(type, options, version);
    }

    public static class Builder {

        private final RoutingKeyOption<ContainerTypeOptions> thisContainerType;

        private final RoutingKeyOption<ProtocolVersionOptions> version;

        private final RoutingKeysBuilderOptions options;

        private RoutingKeyOption<ContainerTypeOptions> containerType;

        private RoutingKeyOption<ContextTypeOptions> contextType;

        private RoutingKeyOption<OperationTypeOptions> operationType;

        private Builder(ContainerTypeOptions type, RoutingKeysBuilderOptions options, String version) {
            this.thisContainerType = RoutingKeyOption.of(type);
            this.version = RoutingKeyOption.of(ProtocolVersionOptions.of(version));
            this.options = options;
        }

        public Builder withContainerType(ContainerTypeOptions containerType) {
            this.containerType = RoutingKeyOption.of(containerType);
            return this;
        }

        public Builder withContextType(ContextTypeOptions contextType) {
            this.contextType = RoutingKeyOption.of(contextType);
            return this;
        }

        public Builder withOperationType(OperationTypeOptions operationType) {
            this.operationType = RoutingKeyOption.of(operationType);
            return this;
        }

        public Optional<InternalRoutingKeys> missingAsAny() {
            this.containerType = this.containerType == null ? RoutingKeyOption.any() : this.containerType;
            this.operationType = this.operationType == null ? RoutingKeyOption.any() : this.operationType;
            this.contextType = this.contextType == null ? RoutingKeyOption.any() : this.contextType;
            return build();
        }

        public Optional<InternalRoutingKeys> build() {
            if (RoutingKeysBuilderOptions.SUPPLIER.equals(options)) {
                this.containerType = thisContainerType;
            }

            var routingKeys = new InternalRoutingKeys(containerType, version, contextType, operationType);
            return toOptional(routingKeys);
        }

        private Optional<InternalRoutingKeys> toOptional(InternalRoutingKeys routingKeys) {
            if (routingKeys.containerType == null || routingKeys.contextType == null || routingKeys.operationType == null || routingKeys.version == null) {
                return Optional.empty();
            }
            if (RoutingKeysBuilderOptions.SUPPLIER.equals(options)) {
                if (routingKeys.containerType.isAny() || routingKeys.contextType.isAny() || routingKeys.operationType.isAny()) {
                    return Optional.empty();
                }
            }
            return Optional.of(routingKeys);
        }
    }
}
