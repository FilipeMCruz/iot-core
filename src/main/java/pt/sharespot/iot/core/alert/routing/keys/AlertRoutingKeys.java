package pt.sharespot.iot.core.alert.routing.keys;

import pt.sharespot.iot.core.alert.model.AlertDTO;
import pt.sharespot.iot.core.keys.*;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AlertRoutingKeys implements RoutingKeys {

    public RoutingKeyOption<ProtocolVersionOptions> version;

    public RoutingKeyOption<ContainerTypeOptions> containerType;

    public RoutingKeyOption<AlertSeverityOptions> severityType;

    public RoutingKeyOption<AlertCategoryOptions> categoryType;

    public RoutingKeyOption<AlertSubCategoryOptions> subCategoryType;

    public RoutingKeyOption<OwnershipOptions> ownershipType;

    public AlertRoutingKeys(RoutingKeyOption<ContainerTypeOptions> containerType,
                            RoutingKeyOption<ProtocolVersionOptions> version,
                            RoutingKeyOption<AlertSeverityOptions> severityType,
                            RoutingKeyOption<AlertCategoryOptions> categoryType,
                            RoutingKeyOption<AlertSubCategoryOptions> subCategoryType,
                            RoutingKeyOption<OwnershipOptions> ownershipType) {
        this.containerType = containerType;
        this.version = version;
        this.ownershipType = ownershipType;
        this.severityType = severityType;
        this.categoryType = categoryType;
        this.subCategoryType = subCategoryType;
    }

    public AlertRoutingKeys() {
    }

    private Stream<RoutingKeyOption<? extends RoutingKey>> orderedKeys() {
        return Stream.of(containerType, version, RoutingKeyOption.of(TopicTypeOptions.of("alert")), ownershipType, categoryType, subCategoryType, severityType);
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

    @Override
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

        private RoutingKeyOption<AlertSeverityOptions> severityType;

        private RoutingKeyOption<AlertCategoryOptions> categoryType;

        private RoutingKeyOption<AlertSubCategoryOptions> subCategoryType;

        private RoutingKeyOption<OwnershipOptions> ownershipType;

        private Builder(ContainerTypeOptions type, RoutingKeysBuilderOptions options, String version) {
            this.thisContainerType = RoutingKeyOption.of(type);
            this.version = RoutingKeyOption.of(ProtocolVersionOptions.of(version));
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

        public Builder withSubCategoryType(AlertSubCategoryOptions subCategoryType) {
            this.subCategoryType = RoutingKeyOption.of(subCategoryType);
            return this;
        }

        public Builder withOwnershipType(OwnershipOptions legitimacyType) {
            this.ownershipType = RoutingKeyOption.of(legitimacyType);
            return this;
        }

        public Builder withAlert(AlertDTO alert) {
            this.categoryType = RoutingKeyOption.of(AlertCategoryOptions.of(alert.category));
            this.subCategoryType = RoutingKeyOption.of(AlertSubCategoryOptions.of(alert.subCategory));
            this.severityType = RoutingKeyOption.of(AlertSeverityOptions.extract(alert.level));
            return this;
        }

        public Optional<AlertRoutingKeys> missingAsAny() {
            this.containerType = this.containerType == null ? RoutingKeyOption.any() : this.containerType;
            this.categoryType = this.categoryType == null ? RoutingKeyOption.any() : this.categoryType;
            this.subCategoryType = this.subCategoryType == null ? RoutingKeyOption.any() : this.subCategoryType;
            this.severityType = this.severityType == null ? RoutingKeyOption.any() : this.severityType;
            this.ownershipType = this.ownershipType == null ? RoutingKeyOption.any() : this.ownershipType;
            return build();
        }

        public Optional<AlertRoutingKeys> from(AlertRoutingKeys consumer) {
            this.severityType = this.severityType == null ? consumer.severityType : this.severityType;
            this.categoryType = this.categoryType == null ? consumer.categoryType : this.categoryType;
            this.subCategoryType = this.subCategoryType == null ? consumer.subCategoryType : this.subCategoryType;
            this.ownershipType = this.ownershipType == null ? consumer.ownershipType : this.ownershipType;
            this.containerType = this.containerType == null ? consumer.containerType : this.containerType;
            return build();
        }

        public Optional<AlertRoutingKeys> build() {
            if (RoutingKeysBuilderOptions.SUPPLIER.equals(options)) {
                this.containerType = thisContainerType;
            }

            var routingKeys = new AlertRoutingKeys(containerType, version, severityType, categoryType, subCategoryType, ownershipType);
            return toOptional(routingKeys);
        }

        private Optional<AlertRoutingKeys> toOptional(AlertRoutingKeys routingKeys) {
            if (routingKeys.containerType == null || routingKeys.severityType == null || routingKeys.categoryType == null || routingKeys.subCategoryType == null || routingKeys.version == null || routingKeys.ownershipType == null) {
                return Optional.empty();
            }
            if (RoutingKeysBuilderOptions.SUPPLIER.equals(options)) {
                if (routingKeys.containerType.isAny() || routingKeys.severityType.isAny() || routingKeys.categoryType.isAny() || routingKeys.subCategoryType.isAny() || routingKeys.ownershipType.isAny()) {
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
