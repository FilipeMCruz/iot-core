package pt.sharespot.iot.core.routing.keys;

import pt.sharespot.iot.core.sensor.ProcessedSensorDataDTO;
import pt.sharespot.iot.core.sensor.ProcessedSensorDataWithRecordsDTO;
import pt.sharespot.iot.core.sensor.SensorDataDTO;
import pt.sharespot.iot.core.sensor.properties.PropertyName;

import java.text.MessageFormat;
import java.util.Optional;

public class RoutingKeys {

    public String version;

    public String containerType;

    public String containerName;

    public String infoType;

    public String sensorTypeId;

    public String channel;

    public String records;

    public String gps;

    public String tempC;

    public String legitimacy;

    public RoutingKeys(String containerType, String containerName, String version, String infoType, String sensorTypeId, String channel, String records, String gps, String tempC, String legitimacy) {
        this.containerType = containerType;
        this.containerName = containerName;
        this.infoType = infoType;
        this.sensorTypeId = sensorTypeId;
        this.channel = channel;
        this.records = records;
        this.gps = gps;
        this.tempC = tempC;
        this.version = version;
        this.legitimacy = legitimacy;
    }

    public RoutingKeys() {
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}.{1}.{2}.data.{3}.{4}.{5}.{6}.{7}.{8}.{9}.#",
                containerType,
                containerName,
                version,
                infoType,
                sensorTypeId,
                channel,
                records,
                gps,
                tempC,
                legitimacy);
    }

    public static RoutingKeysBuilder builder(String name, String type, RoutingKeysBuilderOptions options, String version) {
        return new RoutingKeysBuilder(name, type, options, version);
    }

    public static class RoutingKeysBuilder {

        public static final String KEEP = "<keep>";

        public static final String ANY = "*";

        private final String thisContainerType;

        private final String thisContainerName;

        private String containerType;

        private String containerName;

        private String infoType;

        private String sensorTypeId;

        private String channel;

        private String records;

        private String gps;

        private String tempC;

        private final String version;

        private String legitimacy;

        private final RoutingKeysBuilderOptions options;

        private RoutingKeysBuilder(String name, String type, RoutingKeysBuilderOptions options, String version) {
            this.options = options;
            this.thisContainerType = type;
            this.thisContainerName = name;
            this.version = version;
        }

        public RoutingKeysBuilder withContainerType(String containerType) {
            this.containerType = containerType;
            return this;
        }

        public RoutingKeysBuilder withAnyContainerType() {
            this.containerType = ANY;
            return this;
        }

        public RoutingKeysBuilder withContainerName(String containerName) {
            this.containerName = containerName;
            return this;
        }

        public RoutingKeysBuilder withAnyContainerName() {
            this.containerName = ANY;
            return this;
        }

        public RoutingKeysBuilder withInfoType(InfoTypeOptions infoType) {
            this.infoType = infoType.value();
            return this;
        }

        public RoutingKeysBuilder withAnyInfoType() {
            this.infoType = ANY;
            return this;
        }

        public RoutingKeysBuilder keepInfoType() {
            this.infoType = KEEP;
            return this;
        }

        public RoutingKeysBuilder withSensorTypeId(String sensorTypeId) {
            this.sensorTypeId = sensorTypeId;
            return this;
        }

        public RoutingKeysBuilder withAnySensorTypeId() {
            this.sensorTypeId = ANY;
            return this;
        }

        public RoutingKeysBuilder keepSensorTypeId() {
            this.sensorTypeId = KEEP;
            return this;
        }

        public RoutingKeysBuilder withChannel(String channel) {
            this.channel = channel;
            return this;
        }

        public RoutingKeysBuilder withAnyChannel() {
            this.channel = ANY;
            return this;
        }

        public RoutingKeysBuilder keepChannel() {
            this.channel = KEEP;
            return this;
        }

        public RoutingKeysBuilder withDefaultChannel() {
            return withChannel("default");
        }

        public RoutingKeysBuilder withRecords(RecordsOptions records) {
            this.records = records.value();
            return this;
        }

        public RoutingKeysBuilder withAnyRecords() {
            this.records = ANY;
            return this;
        }

        public RoutingKeysBuilder keepRecords() {
            this.records = KEEP;
            return this;
        }

        public RoutingKeysBuilder withGps(GPSDataOptions gps) {
            this.gps = gps.value();
            return this;
        }

        public RoutingKeysBuilder withAnyGps() {
            this.gps = ANY;
            return this;
        }

        public RoutingKeysBuilder keepGps() {
            this.gps = KEEP;
            return this;
        }

        public RoutingKeysBuilder withTempC(TempCDataOptions tempC) {
            this.tempC = tempC.value();
            return this;
        }

        public RoutingKeysBuilder withAnyTempC() {
            this.tempC = ANY;
            return this;
        }

        public RoutingKeysBuilder keepTempC() {
            this.tempC = KEEP;
            return this;
        }

        public RoutingKeysBuilder withLegitimacyType(DataLegitimacyOptions legitimacyType) {
            this.legitimacy = legitimacyType.value();
            return this;
        }

        public RoutingKeysBuilder withAnyLegitimacyType() {
            this.legitimacy = ANY;
            return this;
        }

        public RoutingKeysBuilder keepLegitimacyType() {
            this.legitimacy = KEEP;
            return this;
        }

        public RoutingKeysBuilder withUpdated(SensorDataDTO data) {
            this.infoType = (data instanceof ProcessedSensorDataDTO || data instanceof ProcessedSensorDataWithRecordsDTO) ?
                    InfoTypeOptions.PROCESSED.value() : InfoTypeOptions.ENCODED.value();
            this.gps = data.hasProperties(PropertyName.LATITUDE, PropertyName.LONGITUDE) ?
                    GPSDataOptions.WITH_GPS_DATA.value() : GPSDataOptions.WITHOUT_GPS_DATA.value();
            this.records = data.hasProperty(PropertyName.DEVICE_RECORDS) ?
                    RecordsOptions.WITH_RECORDS.value() : RecordsOptions.WITHOUT_RECORDS.value();
            this.tempC = data.hasProperties(PropertyName.TEMPERATURE) ?
                    TempCDataOptions.WITH_TEMPC_DATA.value() : TempCDataOptions.WITHOUT_TEMPC_DATA.value();
            return this;
        }

        public Optional<RoutingKeys> missingAsAny() {
            this.containerType = (this.containerType == null || this.containerType.isBlank()) ? ANY : this.containerType;
            this.containerName = (this.containerName == null || this.containerName.isBlank()) ? ANY : this.containerName;
            this.infoType = (this.infoType == null || this.infoType.isBlank()) ? ANY : this.infoType;
            this.sensorTypeId = (this.sensorTypeId == null || this.sensorTypeId.isBlank()) ? ANY : this.sensorTypeId;
            this.channel = (this.channel == null || this.channel.isBlank()) ? ANY : this.channel;
            this.records = (this.records == null || this.records.isBlank()) ? ANY : this.records;
            this.gps = (this.gps == null || this.gps.isBlank()) ? ANY : this.gps;
            this.tempC = (this.tempC == null || this.tempC.isBlank()) ? ANY : this.tempC;
            this.legitimacy = (this.legitimacy == null || this.legitimacy.isBlank()) ? ANY : this.legitimacy;
            return build();
        }

        public Optional<RoutingKeys> from(RoutingKeys consumer) {
            this.infoType = this.infoType.equals(KEEP) ? consumer.infoType : this.infoType;
            this.sensorTypeId = this.sensorTypeId.equals(KEEP) ? consumer.sensorTypeId : this.sensorTypeId;
            this.channel = this.channel.equals(KEEP) ? consumer.channel : this.channel;
            this.records = this.records.equals(KEEP) ? consumer.records : this.records;
            this.gps = this.gps.equals(KEEP) ? consumer.gps : this.gps;
            this.tempC = this.tempC.equals(KEEP) ? consumer.tempC : this.tempC;
            this.legitimacy = this.legitimacy.equals(KEEP) ? consumer.legitimacy : this.legitimacy;
            return build();
        }

        public Optional<RoutingKeys> from(String routingKeys) {
            var splinted = routingKeys.split("\\.");
            this.infoType = splinted[3];
            this.sensorTypeId = splinted[4];
            this.channel = splinted[5];
            this.records = splinted[6];
            this.gps = splinted[7];
            this.tempC = splinted[8];
            this.legitimacy = splinted[9];
            return build();
        }

        public Optional<RoutingKeys> build() {
            if (RoutingKeysBuilderOptions.SUPPLIER.equals(options)) {
                this.containerName = thisContainerName;
                this.containerType = thisContainerType;
            }
            var routingKeys = new RoutingKeys(containerType, containerName, version, infoType, sensorTypeId, channel, records, gps, tempC, legitimacy);
            return toOptional(routingKeys);
        }

        private Optional<RoutingKeys> toOptional(RoutingKeys routingKeys) {
            if (routingKeys.containerName == null || routingKeys.containerName.isBlank()) {
                return Optional.empty();
            }
            if (routingKeys.containerType == null || routingKeys.containerType.isBlank()) {
                return Optional.empty();
            }
            if (routingKeys.infoType == null || routingKeys.infoType.isBlank()) {
                return Optional.empty();
            }
            if (routingKeys.sensorTypeId == null || routingKeys.sensorTypeId.isBlank()) {
                return Optional.empty();
            }
            if (routingKeys.channel == null || routingKeys.channel.isBlank()) {
                return Optional.empty();
            }
            if (routingKeys.records == null || routingKeys.records.isBlank()) {
                return Optional.empty();
            }
            if (routingKeys.gps == null || routingKeys.gps.isBlank()) {
                return Optional.empty();
            }
            if (routingKeys.tempC == null || routingKeys.tempC.isBlank()) {
                return Optional.empty();
            }
            if (!routingKeys.sensorTypeId.matches("[a-zA-Z0-9]+") && !ANY.equals(routingKeys.sensorTypeId)) {
                return Optional.empty();
            }
            if (routingKeys.legitimacy == null || routingKeys.legitimacy.isBlank()) {
                return Optional.empty();
            }
            if (RoutingKeysBuilderOptions.SUPPLIER.equals(options)) {
                if (ANY.equals(routingKeys.infoType)) {
                    return Optional.empty();
                }
                if (ANY.equals(routingKeys.sensorTypeId)) {
                    return Optional.empty();
                }
                if (ANY.equals(routingKeys.channel)) {
                    return Optional.empty();
                }
                if (ANY.equals(routingKeys.records)) {
                    return Optional.empty();
                }
                if (ANY.equals(routingKeys.gps)) {
                    return Optional.empty();
                }
                if (ANY.equals(routingKeys.tempC)) {
                    return Optional.empty();
                }
                if (ANY.equals(routingKeys.legitimacy)) {
                    return Optional.empty();
                }
                if (!routingKeys.sensorTypeId.matches("[a-zA-Z0-9]+")) {
                    return Optional.empty();
                }
            }
            return Optional.of(routingKeys);
        }
    }
}
