package pt.sharespot.iot.core.alert.routing.keys;

import pt.sharespot.iot.core.internal.routing.keys.OperationTypeOptions;
import pt.sharespot.iot.core.keys.ContainerTypeOptions;
import pt.sharespot.iot.core.keys.RoutingKeyOption;
import pt.sharespot.iot.core.keys.RoutingKeysBuilderOptions;

import java.text.MessageFormat;
import java.util.Optional;

public class AlertRoutingKeys {

    public String version;

    public RoutingKeyOption<ContainerTypeOptions> containerType;

    public RoutingKeyOption<AlertSeverityOptions> severityType;

    public RoutingKeyOption<AlertCategoryOptions> categoryType;

    public AlertRoutingKeys(RoutingKeyOption<ContainerTypeOptions> containerType, String version, RoutingKeyOption<AlertSeverityOptions> severityType, RoutingKeyOption<AlertCategoryOptions> categoryType) {
        this.containerType = containerType;
        this.version = version;
        this.severityType = severityType;
        this.categoryType = categoryType;
    }

    public AlertRoutingKeys() {
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}.{1}.alert.{2}.{3}", containerType.value(), version, categoryType.value(), severityType.value());
    }

    public String details() {
        return MessageFormat.format("{0}.{1}.alert.{2}.{3}", containerType.details(), version, categoryType.details(), severityType.details());
    }

    public static Builder builder(ContainerTypeOptions type, RoutingKeysBuilderOptions options, String version) {
        return new Builder(type, options, version);
    }

    public static class Builder {

        private final RoutingKeyOption<ContainerTypeOptions> thisContainerType;

        private final String version;

        private final RoutingKeysBuilderOptions options;

        private RoutingKeyOption<ContainerTypeOptions> containerType;

        private RoutingKeyOption<AlertSeverityOptions> severityType;

        private RoutingKeyOption<AlertCategoryOptions> categoryType;

        private Builder(ContainerTypeOptions type, RoutingKeysBuilderOptions options, String version) {
            this.thisContainerType = RoutingKeyOption.of(type);
            this.version = version;
            this.options = options;
        }

        public Builder withContainerType(ContainerTypeOptions containerType) {
            this.containerType = RoutingKeyOption.of(containerType);
            return this;
        }

        public Builder withContextType(AlertSeverityOptions severityType) {
            this.severityType = RoutingKeyOption.of(severityType);
            return this;
        }

        public Builder withOperationType(AlertCategoryOptions categoryType) {
            this.categoryType = RoutingKeyOption.of(categoryType);
            return this;
        }

        public Optional<AlertRoutingKeys> missingAsAny() {
            this.containerType = this.containerType == null ? RoutingKeyOption.any() : this.containerType;
            this.categoryType = this.categoryType == null ? RoutingKeyOption.any() : this.categoryType;
            this.severityType = this.severityType == null ? RoutingKeyOption.any() : this.severityType;
            return build();
        }

        public Optional<AlertRoutingKeys> build() {
            if (RoutingKeysBuilderOptions.SUPPLIER.equals(options)) {
                this.containerType = thisContainerType;
            }

            var routingKeys = new AlertRoutingKeys(containerType, version, severityType, categoryType);
            return toOptional(routingKeys);
        }

        private Optional<AlertRoutingKeys> toOptional(AlertRoutingKeys routingKeys) {
            if (routingKeys.containerType == null || routingKeys.severityType == null || routingKeys.categoryType == null || routingKeys.version == null) {
                return Optional.empty();
            }
            if (RoutingKeysBuilderOptions.SUPPLIER.equals(options)) {
                if (routingKeys.containerType.isAny() || routingKeys.severityType.isAny() || routingKeys.categoryType.isAny()) {
                    return Optional.empty();
                }
            }
            return Optional.of(routingKeys);
        }
    }
}
