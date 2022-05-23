package pt.sharespot.iot.core.alert.routing.keys;

import pt.sharespot.iot.core.keys.ContainerTypeOptions;
import pt.sharespot.iot.core.keys.RoutingKeyOption;
import pt.sharespot.iot.core.keys.RoutingKeysBuilderOptions;
import pt.sharespot.iot.core.keys.DataLegitimacyOptions;

import java.text.MessageFormat;
import java.util.Optional;

public class AlertRoutingKeys {

    public String version;

    public RoutingKeyOption<ContainerTypeOptions> containerType;

    public RoutingKeyOption<AlertSeverityOptions> severityType;

    public RoutingKeyOption<AlertCategoryOptions> categoryType;

    public RoutingKeyOption<DataLegitimacyOptions> legitimacyType;

    public AlertRoutingKeys(RoutingKeyOption<ContainerTypeOptions> containerType, String version, RoutingKeyOption<AlertSeverityOptions> severityType, RoutingKeyOption<AlertCategoryOptions> categoryType, RoutingKeyOption<DataLegitimacyOptions> legitimacyType) {
        this.containerType = containerType;
        this.version = version;
        this.legitimacyType = legitimacyType;
        this.severityType = severityType;
        this.categoryType = categoryType;
    }

    public AlertRoutingKeys() {
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}.{1}.alert.{2}.{3}.{4}", containerType.value(), version, legitimacyType.value(), categoryType.value(), severityType.value());
    }

    public String details() {
        return MessageFormat.format("{0}.{1}.alert.{2}.{3}.{4}", containerType.details(), version, legitimacyType.details(), categoryType.details(), severityType.details());
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

        private RoutingKeyOption<DataLegitimacyOptions> legitimacyType;

        private Builder(ContainerTypeOptions type, RoutingKeysBuilderOptions options, String version) {
            this.thisContainerType = RoutingKeyOption.of(type);
            this.version = version;
            this.options = options;
        }

        public Builder withContainerType(ContainerTypeOptions containerType) {
            this.containerType = RoutingKeyOption.of(containerType);
            return this;
        }

        public Builder withSeverityType(AlertSeverityOptions severityType) {
            this.severityType = RoutingKeyOption.of(severityType);
            return this;
        }

        public Builder withCategoryType(AlertCategoryOptions categoryType) {
            this.categoryType = RoutingKeyOption.of(categoryType);
            return this;
        }

        public Builder withLegitimacyType(DataLegitimacyOptions legitimacyType) {
            this.legitimacyType = RoutingKeyOption.of(legitimacyType);
            return this;
        }

        public Optional<AlertRoutingKeys> missingAsAny() {
            this.containerType = this.containerType == null ? RoutingKeyOption.any() : this.containerType;
            this.categoryType = this.categoryType == null ? RoutingKeyOption.any() : this.categoryType;
            this.severityType = this.severityType == null ? RoutingKeyOption.any() : this.severityType;
            this.legitimacyType = this.legitimacyType == null ? RoutingKeyOption.any() : this.legitimacyType;
            return build();
        }

        public Optional<AlertRoutingKeys> build() {
            if (RoutingKeysBuilderOptions.SUPPLIER.equals(options)) {
                this.containerType = thisContainerType;
            }

            var routingKeys = new AlertRoutingKeys(containerType, version, severityType, categoryType, legitimacyType);
            return toOptional(routingKeys);
        }

        private Optional<AlertRoutingKeys> toOptional(AlertRoutingKeys routingKeys) {
            if (routingKeys.containerType == null || routingKeys.severityType == null || routingKeys.categoryType == null || routingKeys.version == null || routingKeys.legitimacyType == null) {
                return Optional.empty();
            }
            if (RoutingKeysBuilderOptions.SUPPLIER.equals(options)) {
                if (routingKeys.containerType.isAny() || routingKeys.severityType.isAny() || routingKeys.categoryType.isAny() || routingKeys.legitimacyType.isAny()) {
                    return Optional.empty();
                }
                if (!routingKeys.categoryType.value().matches("^[a-zA-Z0-9]+$")) {
                    return Optional.empty();
                }
            }
            return Optional.of(routingKeys);
        }
    }
}
