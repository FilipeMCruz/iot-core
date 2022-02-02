package pt.sharespot.iot.core.routing.keys;

import pt.sharespot.iot.core.routing.keys.data.*;
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

    public String temperature;

    public String legitimacy;

    public String aqi;

    public String humidity;

    public String motion;

    public String velocity;

    public String pressure;

    public RoutingKeys(String containerType,
                       String containerName,
                       String version,
                       String infoType,
                       String sensorTypeId,
                       String channel,
                       String records,
                       String gps,
                       String tempC,
                       String aqi,
                       String humidity,
                       String motion,
                       String velocity,
                       String pressure,
                       String legitimacy) {
        this.containerType = containerType;
        this.containerName = containerName;
        this.infoType = infoType;
        this.sensorTypeId = sensorTypeId;
        this.channel = channel;
        this.records = records;
        this.gps = gps;
        this.temperature = tempC;
        this.version = version;
        this.aqi = aqi;
        this.humidity = humidity;
        this.motion = motion;
        this.velocity = velocity;
        this.pressure = pressure;
        this.legitimacy = legitimacy;
    }

    public RoutingKeys() {
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}.{1}.{2}.data.{3}.{4}.{5}.{6}.{7}.{8}.{9}.{10}.{11}.{12}.{13}.{14}.#",
                containerType,
                containerName,
                version,
                infoType,
                sensorTypeId,
                channel,
                records,
                legitimacy,
                gps,
                temperature,
                aqi,
                humidity,
                motion,
                velocity,
                pressure);
    }

    public String details() {
        return MessageFormat.format("{0}.{1}.{2}.data.{3}.{4}.{5}.{6}.{7}.{8}.{9}.{10}.{11}.{12}.{13}.{14}.#",
                containerType,
                containerName,
                version,
                InfoTypeOptions.details(infoType),
                sensorTypeId,
                channel,
                RecordsOptions.details(records),
                DataLegitimacyOptions.details(legitimacy),
                GPSDataOptions.details(gps),
                TemperatureDataOptions.details(temperature),
                AirQualityDataOptions.details(aqi),
                HumidityDataOptions.details(humidity),
                MotionDataOptions.details(motion),
                VelocityDataOptions.details(velocity),
                PressureDataOptions.details(pressure));
    }

    public static RoutingKeysBuilder builder(String name, String type, RoutingKeysBuilderOptions options, String version) {
        return new RoutingKeysBuilder(name, type, options, version);
    }

    public static class RoutingKeysBuilder {

        public static final String ANY = "*";

        private final String thisContainerType;

        private final String thisContainerName;

        private final String version;

        private String containerType;

        private String containerName;

        private String infoType;

        private String sensorTypeId;

        private String channel;

        private String records;

        private String gps;

        private String temperature;

        private String aqi;

        private String humidity;

        private String motion;

        private String velocity;

        private String pressure;

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

        public RoutingKeysBuilder withContainerName(String containerName) {
            this.containerName = containerName;
            return this;
        }

        public RoutingKeysBuilder withInfoType(InfoTypeOptions infoType) {
            this.infoType = infoType.value();
            return this;
        }

        public RoutingKeysBuilder withSensorTypeId(String sensorTypeId) {
            this.sensorTypeId = sensorTypeId;
            return this;
        }

        public RoutingKeysBuilder withChannel(String channel) {
            this.channel = channel;
            return this;
        }

        public RoutingKeysBuilder withRecords(RecordsOptions records) {
            this.records = records.value();
            return this;
        }

        public RoutingKeysBuilder withLegitimacyType(DataLegitimacyOptions legitimacyType) {
            this.legitimacy = legitimacyType.value();
            return this;
        }

        public RoutingKeysBuilder withGps(GPSDataOptions gps) {
            this.gps = gps.value();
            return this;
        }

        public RoutingKeysBuilder withAQI(AirQualityDataOptions aqi) {
            this.aqi = aqi.value();
            return this;
        }

        public RoutingKeysBuilder withHumidity(HumidityDataOptions humidity) {
            this.humidity = humidity.value();
            return this;
        }

        public RoutingKeysBuilder withTemperature(TemperatureDataOptions temperature) {
            this.temperature = temperature.value();
            return this;
        }

        public RoutingKeysBuilder withMotion(MotionDataOptions motion) {
            this.motion = motion.value();
            return this;
        }

        public RoutingKeysBuilder withVelocity(VelocityDataOptions velocity) {
            this.velocity = velocity.value();
            return this;
        }

        public RoutingKeysBuilder withPressure(PressureDataOptions pressure) {
            this.pressure = pressure.value();
            return this;
        }

        public RoutingKeysBuilder withUnidentifiedData() {
            this.temperature = TemperatureDataOptions.UNIDENTIFIED_TEMPERATURE_DATA.value();
            this.gps = GPSDataOptions.UNIDENTIFIED_GPS_DATA.value();
            this.aqi = AirQualityDataOptions.UNIDENTIFIED_AQI_DATA.value();
            this.humidity = HumidityDataOptions.UNIDENTIFIED_HUMIDITY_DATA.value();
            this.motion = HumidityDataOptions.UNIDENTIFIED_HUMIDITY_DATA.value();
            this.velocity = VelocityDataOptions.UNIDENTIFIED_VELOCITY_DATA.value();
            this.pressure = PressureDataOptions.UNIDENTIFIED_PRESSURE_DATA.value();
            this.legitimacy = DataLegitimacyOptions.UNKNOWN.value();
            return this;
        }

        public RoutingKeysBuilder withUpdated(SensorDataDTO data) {
            this.infoType = InfoTypeOptions.PROCESSED.value();
            this.gps = data.hasProperties(PropertyName.LATITUDE, PropertyName.LONGITUDE) ?
                    GPSDataOptions.WITH_GPS_DATA.value() : GPSDataOptions.WITHOUT_GPS_DATA.value();
            this.temperature = data.hasProperties(PropertyName.TEMPERATURE) ?
                    TemperatureDataOptions.WITH_TEMPERATURE_DATA.value() : TemperatureDataOptions.WITHOUT_TEMPERATURE_DATA.value();
            this.aqi = data.hasProperties(PropertyName.AQI) ?
                    AirQualityDataOptions.WITH_AQI_DATA.value() : AirQualityDataOptions.WITHOUT_AQI_DATA.value();
            this.humidity = data.hasProperties(PropertyName.HUMIDITY) ?
                    HumidityDataOptions.WITH_HUMIDITY_DATA.value() : HumidityDataOptions.WITHOUT_HUMIDITY_DATA.value();
            this.motion = data.hasProperties(PropertyName.MOTION) ?
                    MotionDataOptions.WITH_MOTION_DATA.value() : MotionDataOptions.WITHOUT_MOTION_DATA.value();
            this.velocity = data.hasProperties(PropertyName.VELOCITY) ?
                    VelocityDataOptions.WITH_VELOCITY_DATA.value() : VelocityDataOptions.WITHOUT_VELOCITY_DATA.value();
            this.pressure = data.hasProperties(PropertyName.PRESSURE) ?
                    PressureDataOptions.WITH_PRESSURE_DATA.value() : PressureDataOptions.WITHOUT_PRESSURE_DATA.value();
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
            this.temperature = (this.temperature == null || this.temperature.isBlank()) ? ANY : this.temperature;
            this.aqi = (this.aqi == null || this.aqi.isBlank()) ? ANY : this.aqi;
            this.humidity = (this.humidity == null || this.humidity.isBlank()) ? ANY : this.humidity;
            this.motion = (this.motion == null || this.motion.isBlank()) ? ANY : this.motion;
            this.velocity = (this.velocity == null || this.velocity.isBlank()) ? ANY : this.velocity;
            this.pressure = (this.pressure == null || this.pressure.isBlank()) ? ANY : this.pressure;
            this.legitimacy = (this.legitimacy == null || this.legitimacy.isBlank()) ? ANY : this.legitimacy;
            return build();
        }

        public Optional<RoutingKeys> from(RoutingKeys consumer) {
            this.infoType = this.infoType == null ? consumer.infoType : this.infoType;
            this.sensorTypeId = this.sensorTypeId == null ? consumer.sensorTypeId : this.sensorTypeId;
            this.channel = this.channel == null ? consumer.channel : this.channel;
            this.records = this.records == null ? consumer.records : this.records;
            this.gps = this.gps == null ? consumer.gps : this.gps;
            this.temperature = this.temperature == null ? consumer.temperature : this.temperature;
            this.aqi = this.aqi == null ? consumer.aqi : this.aqi;
            this.humidity = this.humidity == null ? consumer.humidity : this.humidity;
            this.motion = this.motion == null ? consumer.motion : this.motion;
            this.velocity = this.velocity == null ? consumer.velocity : this.velocity;
            this.pressure = this.pressure == null ? consumer.pressure : this.pressure;
            this.legitimacy = this.legitimacy == null ? consumer.legitimacy : this.legitimacy;
            return build();
        }

        public Optional<RoutingKeys> from(String routingKeys) {
            var info = routingKeys.substring(routingKeys.lastIndexOf(".data.") + 1);
            var splinted = info.split("\\.");
            if (splinted.length < 13) {
                return Optional.empty();
            }
            this.infoType = splinted[1];
            this.sensorTypeId = splinted[2];
            this.channel = splinted[3];
            this.records = splinted[4];
            this.legitimacy = splinted[5];
            this.gps = splinted[6];
            this.temperature = splinted[7];
            this.aqi = splinted[8];
            this.humidity = splinted[9];
            this.motion = splinted[10];
            this.velocity = splinted[11];
            this.pressure = splinted[12];
            return build();
        }

        public Optional<RoutingKeys> build() {
            if (RoutingKeysBuilderOptions.SUPPLIER.equals(options)) {
                this.containerName = thisContainerName;
                this.containerType = thisContainerType;
            }
            var routingKeys = new RoutingKeys(containerType,
                    containerName,
                    version,
                    infoType,
                    sensorTypeId,
                    channel,
                    records,
                    gps,
                    temperature,
                    aqi,
                    humidity,
                    motion,
                    velocity,
                    pressure,
                    legitimacy);
            return toOptional(routingKeys);
        }

        private Optional<RoutingKeys> toOptional(RoutingKeys routingKeys) {
            if (routingKeys.containerName == null || routingKeys.containerName.isBlank() ||
                    routingKeys.containerType == null || routingKeys.containerType.isBlank() ||
                    routingKeys.infoType == null || routingKeys.infoType.isBlank() ||
                    routingKeys.sensorTypeId == null || routingKeys.sensorTypeId.isBlank() ||
                    routingKeys.channel == null || routingKeys.channel.isBlank() ||
                    routingKeys.records == null || routingKeys.records.isBlank() ||
                    routingKeys.gps == null || routingKeys.gps.isBlank() ||
                    routingKeys.temperature == null || routingKeys.temperature.isBlank() ||
                    routingKeys.aqi == null || routingKeys.aqi.isBlank() ||
                    routingKeys.humidity == null || routingKeys.humidity.isBlank() ||
                    routingKeys.motion == null || routingKeys.motion.isBlank() ||
                    routingKeys.velocity == null || routingKeys.velocity.isBlank() ||
                    routingKeys.pressure == null || routingKeys.pressure.isBlank() ||
                    !routingKeys.sensorTypeId.matches("[a-zA-Z0-9]+") && !ANY.equals(routingKeys.sensorTypeId) ||
                    routingKeys.legitimacy == null || routingKeys.legitimacy.isBlank()) {
                return Optional.empty();
            }
            if (RoutingKeysBuilderOptions.SUPPLIER.equals(options)) {
                if (ANY.equals(routingKeys.infoType) ||
                        ANY.equals(routingKeys.sensorTypeId) ||
                        ANY.equals(routingKeys.channel) ||
                        ANY.equals(routingKeys.records) ||
                        ANY.equals(routingKeys.gps) ||
                        ANY.equals(routingKeys.temperature) ||
                        ANY.equals(routingKeys.aqi) ||
                        ANY.equals(routingKeys.humidity) ||
                        ANY.equals(routingKeys.motion) ||
                        ANY.equals(routingKeys.velocity) ||
                        ANY.equals(routingKeys.pressure) ||
                        ANY.equals(routingKeys.legitimacy) ||
                        !routingKeys.sensorTypeId.matches("[a-zA-Z0-9]+")) {
                    return Optional.empty();
                }
            }
            return Optional.of(routingKeys);
        }
    }
}
