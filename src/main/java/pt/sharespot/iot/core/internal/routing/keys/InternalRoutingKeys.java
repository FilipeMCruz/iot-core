package pt.sharespot.iot.core.internal.routing.keys;

import pt.sharespot.iot.core.keys.ContainerTypeOptions;
import pt.sharespot.iot.core.keys.RoutingKeyOption;
import pt.sharespot.iot.core.keys.RoutingKeysBuilderOptions;

import java.text.MessageFormat;
import java.util.Optional;

public class InternalRoutingKeys {

    public String version;

    public RoutingKeyOption<ContainerTypeOptions> containerType;

    public RoutingKeyOption<ContextTypeOptions> contextType;

    public RoutingKeyOption<OperationTypeOptions> operationType;

    public InternalRoutingKeys(RoutingKeyOption<ContainerTypeOptions> containerType, String version, RoutingKeyOption<ContextTypeOptions> contextType, RoutingKeyOption<OperationTypeOptions> operationType) {
        this.containerType = containerType;
        this.version = version;
        this.contextType = contextType;
        this.operationType = operationType;
    }

    public InternalRoutingKeys() {
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}.{1}.internal.{2}.{3}", containerType.value(), version, contextType.value(), operationType.value());
    }

    public String details() {
        return MessageFormat.format("{0}.{1}.internal.{2}.{3}", containerType.details(), version, contextType.details(), operationType.details());
    }

    public static InternalRoutingKeys.InternalRoutingKeysBuilder builder(ContainerTypeOptions type, RoutingKeysBuilderOptions options, String version) {
        return new InternalRoutingKeys.InternalRoutingKeysBuilder(type, options, version);
    }

    public static class InternalRoutingKeysBuilder {

        private final RoutingKeyOption<ContainerTypeOptions> thisContainerType;

        private final String version;

        private final RoutingKeysBuilderOptions options;

        private RoutingKeyOption<ContainerTypeOptions> containerType;

        private RoutingKeyOption<ContextTypeOptions> contextType;

        private RoutingKeyOption<OperationTypeOptions> operationType;

        private InternalRoutingKeysBuilder(ContainerTypeOptions type, RoutingKeysBuilderOptions options, String version) {
            this.thisContainerType = RoutingKeyOption.of(type);
            this.version = version;
            this.options = options;
        }

        public InternalRoutingKeys.InternalRoutingKeysBuilder withContainerType(ContainerTypeOptions containerType) {
            this.containerType = RoutingKeyOption.of(containerType);
            return this;
        }

        public InternalRoutingKeys.InternalRoutingKeysBuilder withContextType(ContextTypeOptions contextType) {
            this.contextType = RoutingKeyOption.of(contextType);
            return this;
        }

        public InternalRoutingKeys.InternalRoutingKeysBuilder withOperationType(OperationTypeOptions operationType) {
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
