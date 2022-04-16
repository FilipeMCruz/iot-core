package pt.sharespot.iot.core.routing.keys;

import pt.sharespot.iot.core.routing.keys.data.*;
import pt.sharespot.iot.core.sensor.SensorDataDTO;
import pt.sharespot.iot.core.sensor.properties.PropertyName;

import java.text.MessageFormat;
import java.util.Optional;

public class RoutingKeys {

    public String version;

    public RoutingKeyOption<ContainerTypeOptions> containerType;

    public RoutingKeyOption<InfoTypeOptions> infoType;

    public String sensorTypeId;

    public String channel;

    public RoutingKeyOption<RecordsOptions> records;

    public RoutingKeyOption<GPSDataOptions> gps;

    public RoutingKeyOption<TemperatureDataOptions> temperature;

    public RoutingKeyOption<DataLegitimacyOptions> legitimacy;

    public RoutingKeyOption<AirQualityDataOptions> aqi;

    public RoutingKeyOption<AirHumidityDataOptions> airHumidity;

    public RoutingKeyOption<MotionDataOptions> motion;

    public RoutingKeyOption<VelocityDataOptions> velocity;

    public RoutingKeyOption<AirPressureDataOptions> airPressure;

    public RoutingKeyOption<BatteryDataOptions> battery;

    public RoutingKeyOption<SoilMoistureDataOptions> soilMoisture;

    public RoutingKeyOption<IlluminanceDataOptions> illuminance;

    public RoutingKeyOption<DomainOwnershipOptions> ownership;

    public RoutingKeyOption<TriggerDataOptions> trigger;

    public RoutingKeyOption<WaterPressureDataOptions> waterPressure;

    public RoutingKeyOption<PHDataOptions> ph;

    public RoutingKeys(RoutingKeyOption<ContainerTypeOptions> containerType,
                       String version,
                       RoutingKeyOption<InfoTypeOptions> infoType,
                       String sensorTypeId,
                       String channel,
                       RoutingKeyOption<DomainOwnershipOptions> ownership,
                       RoutingKeyOption<RecordsOptions> records,
                       RoutingKeyOption<GPSDataOptions> gps,
                       RoutingKeyOption<TemperatureDataOptions> temperature,
                       RoutingKeyOption<AirQualityDataOptions> aqi,
                       RoutingKeyOption<AirHumidityDataOptions> airHumidity,
                       RoutingKeyOption<MotionDataOptions> motion,
                       RoutingKeyOption<VelocityDataOptions> velocity,
                       RoutingKeyOption<AirPressureDataOptions> airPressure,
                       RoutingKeyOption<BatteryDataOptions> battery,
                       RoutingKeyOption<SoilMoistureDataOptions> soilMoisture,
                       RoutingKeyOption<IlluminanceDataOptions> illuminance,
                       RoutingKeyOption<TriggerDataOptions> trigger,
                       RoutingKeyOption<DataLegitimacyOptions> legitimacy,
                       RoutingKeyOption<WaterPressureDataOptions> waterPressure,
                       RoutingKeyOption<PHDataOptions> ph) {
        this.containerType = containerType;
        this.infoType = infoType;
        this.sensorTypeId = sensorTypeId;
        this.channel = channel;
        this.ownership = ownership;
        this.records = records;
        this.gps = gps;
        this.temperature = temperature;
        this.version = version;
        this.aqi = aqi;
        this.airHumidity = airHumidity;
        this.motion = motion;
        this.velocity = velocity;
        this.airPressure = airPressure;
        this.battery = battery;
        this.soilMoisture = soilMoisture;
        this.illuminance = illuminance;
        this.trigger = trigger;
        this.legitimacy = legitimacy;
        this.waterPressure = waterPressure;
        this.ph = ph;
    }

    public RoutingKeys() {
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}.{1}.data.{2}.{3}.{4}.{5}.{6}.{7}.{8}.{9}.{10}.{11}.{12}.{13}.{14}.{15}.{16}.{17}.{18}.{19}.{20}.#",
                containerType.value(),
                version,
                infoType.value(),
                sensorTypeId,
                channel,
                ownership.value(),
                records.value(),
                legitimacy.value(),
                gps.value(),
                temperature.value(),
                aqi.value(),
                airHumidity.value(),
                motion.value(),
                velocity.value(),
                airPressure.value(),
                soilMoisture.value(),
                illuminance.value(),
                trigger.value(),
                battery.value(),
                waterPressure.value(),
                ph.value());
    }

    public String details() {
        return MessageFormat.format("{0}.{1}.data.{2}.{3}.{4}.{5}.{6}.{7}.{8}.{9}.{10}.{11}.{12}.{13}.{14}.{15}.{16}.{17}.{18}.{19}.#",
                containerType.details(),
                version,
                infoType.details(),
                sensorTypeId,
                channel,
                ownership.details(),
                records.details(),
                legitimacy.details(),
                gps.details(),
                temperature.details(),
                aqi.details(),
                airHumidity.details(),
                motion.details(),
                velocity.details(),
                airPressure.details(),
                soilMoisture.details(),
                illuminance.details(),
                trigger.details(),
                battery.details(),
                waterPressure.details(),
                ph.details());
    }

    public static RoutingKeysBuilder builder(ContainerTypeOptions type, RoutingKeysBuilderOptions options, String version) {
        return new RoutingKeysBuilder(type, options, version);
    }

    public static class RoutingKeysBuilder {

        public static final String ANY = "*";

        private final RoutingKeyOption<ContainerTypeOptions> thisContainerType;

        private final String version;

        private RoutingKeyOption<ContainerTypeOptions> containerType;

        private RoutingKeyOption<InfoTypeOptions> infoType;

        private String sensorTypeId;

        private String channel;

        private RoutingKeyOption<DomainOwnershipOptions> ownership;

        private RoutingKeyOption<RecordsOptions> records;

        private RoutingKeyOption<GPSDataOptions> gps;

        private RoutingKeyOption<TemperatureDataOptions> temperature;

        private RoutingKeyOption<AirQualityDataOptions> aqi;

        private RoutingKeyOption<AirHumidityDataOptions> airHumidity;

        private RoutingKeyOption<MotionDataOptions> motion;

        private RoutingKeyOption<VelocityDataOptions> velocity;

        private RoutingKeyOption<AirPressureDataOptions> airPressure;


        private RoutingKeyOption<WaterPressureDataOptions> waterPressure;

        private RoutingKeyOption<SoilMoistureDataOptions> soilMoisture;

        private RoutingKeyOption<IlluminanceDataOptions> illuminance;

        private RoutingKeyOption<TriggerDataOptions> trigger;

        private RoutingKeyOption<BatteryDataOptions> battery;

        private RoutingKeyOption<DataLegitimacyOptions> legitimacy;

        private RoutingKeyOption<PHDataOptions> ph;

        private final RoutingKeysBuilderOptions options;

        private RoutingKeysBuilder(ContainerTypeOptions type, RoutingKeysBuilderOptions options, String version) {
            this.options = options;
            this.thisContainerType = RoutingKeyOption.of(type);
            this.version = version;
        }

        public RoutingKeysBuilder withContainerType(ContainerTypeOptions containerType) {
            this.containerType = RoutingKeyOption.of(containerType);
            return this;
        }

        public RoutingKeysBuilder withWaterPressure(WaterPressureDataOptions waterPressure) {
            this.waterPressure = RoutingKeyOption.of(waterPressure);
            return this;
        }

        public RoutingKeysBuilder withPh(PHDataOptions ph) {
            this.ph = RoutingKeyOption.of(ph);
            return this;
        }

        public RoutingKeysBuilder withInfoType(InfoTypeOptions infoType) {
            this.infoType = RoutingKeyOption.of(infoType);
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
            this.records = RoutingKeyOption.of(records);
            return this;
        }

        public RoutingKeysBuilder withOwnership(DomainOwnershipOptions ownership) {
            this.ownership = RoutingKeyOption.of(ownership);
            return this;
        }

        public RoutingKeysBuilder withLegitimacyType(DataLegitimacyOptions legitimacyType) {
            this.legitimacy = RoutingKeyOption.of(legitimacyType);
            return this;
        }

        public RoutingKeysBuilder withGps(GPSDataOptions gps) {
            this.gps = RoutingKeyOption.of(gps);
            return this;
        }

        public RoutingKeysBuilder withAQI(AirQualityDataOptions aqi) {
            this.aqi = RoutingKeyOption.of(aqi);
            return this;
        }

        public RoutingKeysBuilder withHumidity(AirHumidityDataOptions humidity) {
            this.airHumidity = RoutingKeyOption.of(humidity);
            return this;
        }

        public RoutingKeysBuilder withTemperature(TemperatureDataOptions temperature) {
            this.temperature = RoutingKeyOption.of(temperature);
            return this;
        }

        public RoutingKeysBuilder withMotion(MotionDataOptions motion) {
            this.motion = RoutingKeyOption.of(motion);
            return this;
        }

        public RoutingKeysBuilder withVelocity(VelocityDataOptions velocity) {
            this.velocity = RoutingKeyOption.of(velocity);
            return this;
        }

        public RoutingKeysBuilder withPressure(AirPressureDataOptions pressure) {
            this.airPressure = RoutingKeyOption.of(pressure);
            return this;
        }

        public RoutingKeysBuilder withSoilMoisture(SoilMoistureDataOptions moisture) {
            this.soilMoisture = RoutingKeyOption.of(moisture);
            return this;
        }

        public RoutingKeysBuilder withIlluminance(IlluminanceDataOptions illuminance) {
            this.illuminance = RoutingKeyOption.of(illuminance);
            return this;
        }

        public RoutingKeysBuilder withAlarm(TriggerDataOptions alarm) {
            this.trigger = RoutingKeyOption.of(alarm);
            return this;
        }

        public RoutingKeysBuilder withBattery(BatteryDataOptions battery) {
            this.battery = RoutingKeyOption.of(battery);
            return this;
        }

        public RoutingKeysBuilder withUnidentifiedData() {
            this.temperature = RoutingKeyOption.of(TemperatureDataOptions.UNIDENTIFIED_TEMPERATURE_DATA);
            this.gps = RoutingKeyOption.of(GPSDataOptions.UNIDENTIFIED_GPS_DATA);
            this.aqi = RoutingKeyOption.of(AirQualityDataOptions.UNIDENTIFIED_AQI_DATA);
            this.airHumidity = RoutingKeyOption.of(AirHumidityDataOptions.UNIDENTIFIED_AIR_HUMIDITY_DATA);
            this.motion = RoutingKeyOption.of(MotionDataOptions.UNIDENTIFIED_MOTION_DATA);
            this.velocity = RoutingKeyOption.of(VelocityDataOptions.UNIDENTIFIED_VELOCITY_DATA);
            this.battery = RoutingKeyOption.of(BatteryDataOptions.UNIDENTIFIED_BATTERY_DATA);
            this.airPressure = RoutingKeyOption.of(AirPressureDataOptions.UNIDENTIFIED_AIR_PRESSURE_DATA);
            this.soilMoisture = RoutingKeyOption.of(SoilMoistureDataOptions.UNIDENTIFIED_SOIL_MOISTURE_DATA);
            this.illuminance = RoutingKeyOption.of(IlluminanceDataOptions.UNIDENTIFIED_ILLUMINANCE_DATA);
            this.legitimacy = RoutingKeyOption.of(DataLegitimacyOptions.UNKNOWN);
            this.ownership = RoutingKeyOption.of(DomainOwnershipOptions.UNIDENTIFIED_DOMAIN_OWNERSHIP);
            this.trigger = RoutingKeyOption.of(TriggerDataOptions.UNIDENTIFIED_TRIGGER_DATA);
            this.waterPressure = RoutingKeyOption.of(WaterPressureDataOptions.UNIDENTIFIED_WATER_PRESSURE_DATA);
            this.ph = RoutingKeyOption.of(PHDataOptions.UNIDENTIFIED_PH_DATA);
            return this;
        }

        public RoutingKeysBuilder withUpdated(SensorDataDTO data) {
            this.infoType = RoutingKeyOption.of(InfoTypeOptions.PROCESSED);
            this.gps = RoutingKeyOption.of(data.hasAllProperties(PropertyName.LATITUDE, PropertyName.LONGITUDE) ?
                    GPSDataOptions.WITH_GPS_DATA : GPSDataOptions.WITHOUT_GPS_DATA);
            this.temperature = RoutingKeyOption.of(data.hasAllProperties(PropertyName.TEMPERATURE) ?
                    TemperatureDataOptions.WITH_TEMPERATURE_DATA : TemperatureDataOptions.WITHOUT_TEMPERATURE_DATA);
            this.aqi = RoutingKeyOption.of(data.hasAllProperties(PropertyName.AQI) ?
                    AirQualityDataOptions.WITH_AQI_DATA : AirQualityDataOptions.WITHOUT_AQI_DATA);
            this.airHumidity = RoutingKeyOption.of(data.hasAnyProperties(PropertyName.AIR_HUMIDITY_RELATIVE_PERCENTAGE, PropertyName.AIR_HUMIDITY_GRAMS_PER_CUBIC_METER) ?
                    AirHumidityDataOptions.WITH_AIR_HUMIDITY_DATA : AirHumidityDataOptions.WITHOUT_AIR_HUMIDITY_DATA);
            this.motion = RoutingKeyOption.of(data.hasAllProperties(PropertyName.MOTION) ?
                    MotionDataOptions.WITH_MOTION_DATA : MotionDataOptions.WITHOUT_MOTION_DATA);
            this.velocity = RoutingKeyOption.of(data.hasAllProperties(PropertyName.VELOCITY) ?
                    VelocityDataOptions.WITH_VELOCITY_DATA : VelocityDataOptions.WITHOUT_VELOCITY_DATA);
            this.airPressure = RoutingKeyOption.of(data.hasAllProperties(PropertyName.AIR_PRESSURE) ?
                    AirPressureDataOptions.WITH_AIR_PRESSURE_DATA : AirPressureDataOptions.WITHOUT_AIR_PRESSURE_DATA);
            this.soilMoisture = RoutingKeyOption.of(data.hasAllProperties(PropertyName.SOIL_MOISTURE) ?
                    SoilMoistureDataOptions.WITH_SOIL_MOISTURE_DATA : SoilMoistureDataOptions.WITHOUT_SOIL_MOISTURE_DATA);
            this.illuminance = RoutingKeyOption.of(data.hasAllProperties(PropertyName.ILLUMINANCE) ?
                    IlluminanceDataOptions.WITH_ILLUMINANCE_DATA : IlluminanceDataOptions.WITHOUT_ILLUMINANCE_DATA);
            this.battery = RoutingKeyOption.of(data.hasAnyProperties(PropertyName.BATTERY_VOLTS, PropertyName.BATTERY_PERCENTAGE) ?
                    BatteryDataOptions.WITH_BATTERY_DATA : BatteryDataOptions.WITHOUT_BATTERY_DATA);
            this.trigger = RoutingKeyOption.of(data.hasAllProperties(PropertyName.TRIGGER) ?
                    TriggerDataOptions.WITH_TRIGGER_DATA : TriggerDataOptions.WITHOUT_TRIGGER_DATA);
            this.waterPressure = RoutingKeyOption.of(data.hasAllProperties(PropertyName.WATER_PRESSURE) ?
                    WaterPressureDataOptions.WITH_WATER_PRESSURE_DATA : WaterPressureDataOptions.WITHOUT_WATER_PRESSURE_DATA);
            this.ph = RoutingKeyOption.of(data.hasAllProperties(PropertyName.PH) ?
                    PHDataOptions.WITH_PH_DATA : PHDataOptions.WITHOUT_PH_DATA);
            return this;
        }

        public Optional<RoutingKeys> missingAsAny() {
            this.containerType = this.containerType == null ? RoutingKeyOption.any() : this.containerType;
            this.infoType = this.infoType == null ? RoutingKeyOption.any() : this.infoType;
            this.sensorTypeId = (this.sensorTypeId == null || this.sensorTypeId.isBlank()) ? ANY : this.sensorTypeId;
            this.channel = (this.channel == null || this.channel.isBlank()) ? ANY : this.channel;
            this.records = this.records == null ? RoutingKeyOption.any() : this.records;
            this.ownership = this.ownership == null ? RoutingKeyOption.any() : this.ownership;
            this.gps = this.gps == null ? RoutingKeyOption.any() : this.gps;
            this.temperature = this.temperature == null ? RoutingKeyOption.any() : this.temperature;
            this.aqi = this.aqi == null ? RoutingKeyOption.any() : this.aqi;
            this.airHumidity = this.airHumidity == null ? RoutingKeyOption.any() : this.airHumidity;
            this.motion = this.motion == null ? RoutingKeyOption.any() : this.motion;
            this.velocity = this.velocity == null ? RoutingKeyOption.any() : this.velocity;
            this.airPressure = this.airPressure == null ? RoutingKeyOption.any() : this.airPressure;
            this.soilMoisture = this.soilMoisture == null ? RoutingKeyOption.any() : this.soilMoisture;
            this.illuminance = this.illuminance == null ? RoutingKeyOption.any() : this.illuminance;
            this.battery = this.battery == null ? RoutingKeyOption.any() : this.battery;
            this.trigger = this.trigger == null ? RoutingKeyOption.any() : this.trigger;
            this.legitimacy = this.legitimacy == null ? RoutingKeyOption.any() : this.legitimacy;
            this.waterPressure = this.waterPressure == null ? RoutingKeyOption.any() : this.waterPressure;
            this.ph = this.ph == null ? RoutingKeyOption.any() : this.ph;
            return build();
        }

        public Optional<RoutingKeys> from(RoutingKeys consumer) {
            this.infoType = this.infoType == null ? consumer.infoType : this.infoType;
            this.sensorTypeId = this.sensorTypeId == null ? consumer.sensorTypeId : this.sensorTypeId;
            this.channel = this.channel == null ? consumer.channel : this.channel;
            this.records = this.records == null ? consumer.records : this.records;
            this.ownership = this.ownership == null ? consumer.ownership : this.ownership;
            this.gps = this.gps == null ? consumer.gps : this.gps;
            this.temperature = this.temperature == null ? consumer.temperature : this.temperature;
            this.aqi = this.aqi == null ? consumer.aqi : this.aqi;
            this.airHumidity = this.airHumidity == null ? consumer.airHumidity : this.airHumidity;
            this.motion = this.motion == null ? consumer.motion : this.motion;
            this.velocity = this.velocity == null ? consumer.velocity : this.velocity;
            this.airPressure = this.airPressure == null ? consumer.airPressure : this.airPressure;
            this.soilMoisture = this.soilMoisture == null ? consumer.soilMoisture : this.soilMoisture;
            this.battery = this.battery == null ? consumer.battery : this.battery;
            this.illuminance = this.illuminance == null ? consumer.illuminance : this.illuminance;
            this.trigger = this.trigger == null ? consumer.trigger : this.trigger;
            this.legitimacy = this.legitimacy == null ? consumer.legitimacy : this.legitimacy;
            this.waterPressure = this.waterPressure == null ? consumer.waterPressure : this.waterPressure;
            this.ph = this.ph == null ? consumer.ph : this.ph;
            return build();
        }

        public Optional<RoutingKeys> from(String routingKeys) {
            var info = routingKeys.substring(routingKeys.lastIndexOf(".data.") + 1);
            var splinted = info.split("\\.");
            if (splinted.length < 17) {
                return Optional.empty();
            }
            this.infoType = InfoTypeOptions.extract(splinted[1]);
            this.sensorTypeId = splinted[2];
            this.channel = splinted[3];
            this.ownership = DomainOwnershipOptions.extract(splinted[4]);
            this.records = RecordsOptions.extract(splinted[5]);
            this.legitimacy = DataLegitimacyOptions.extract(splinted[6]);
            this.gps = GPSDataOptions.extract(splinted[7]);
            this.temperature = TemperatureDataOptions.extract(splinted[8]);
            this.aqi = AirQualityDataOptions.extract(splinted[9]);
            this.airHumidity = AirHumidityDataOptions.extract(splinted[10]);
            this.motion = MotionDataOptions.extract(splinted[11]);
            this.velocity = VelocityDataOptions.extract(splinted[12]);
            this.airPressure = AirPressureDataOptions.extract(splinted[13]);
            this.soilMoisture = SoilMoistureDataOptions.extract(splinted[14]);
            this.illuminance = IlluminanceDataOptions.extract(splinted[15]);
            this.trigger = TriggerDataOptions.extract(splinted[16]);
            this.battery = BatteryDataOptions.extract(splinted[17]);
            this.waterPressure = WaterPressureDataOptions.extract(splinted[18]);
            this.ph = PHDataOptions.extract(splinted[19]);
            return build();
        }

        public Optional<RoutingKeys> build() {
            if (RoutingKeysBuilderOptions.SUPPLIER.equals(options)) {
                this.containerType = thisContainerType;
            }

            var routingKeys = new RoutingKeys(containerType,
                    version,
                    infoType,
                    sensorTypeId,
                    channel,
                    ownership,
                    records,
                    gps,
                    temperature,
                    aqi,
                    airHumidity,
                    motion,
                    velocity,
                    airPressure,
                    battery,
                    soilMoisture,
                    illuminance,
                    trigger,
                    legitimacy,
                    waterPressure,
                    ph);
            return toOptional(routingKeys);
        }

        private Optional<RoutingKeys> toOptional(RoutingKeys routingKeys) {
            if (routingKeys.containerType == null ||
                    routingKeys.infoType == null ||
                    routingKeys.sensorTypeId == null || routingKeys.sensorTypeId.isBlank() ||
                    routingKeys.channel == null || routingKeys.channel.isBlank() ||
                    routingKeys.ownership == null ||
                    routingKeys.records == null ||
                    routingKeys.gps == null ||
                    routingKeys.temperature == null ||
                    routingKeys.aqi == null ||
                    routingKeys.airHumidity == null ||
                    routingKeys.motion == null ||
                    routingKeys.velocity == null ||
                    routingKeys.airPressure == null ||
                    routingKeys.soilMoisture == null ||
                    routingKeys.illuminance == null ||
                    routingKeys.battery == null ||
                    routingKeys.trigger == null ||
                    routingKeys.waterPressure == null ||
                    routingKeys.ph == null ||
                    !routingKeys.sensorTypeId.matches("[a-zA-Z0-9]+") && !ANY.equals(routingKeys.sensorTypeId) ||
                    routingKeys.legitimacy == null) {
                return Optional.empty();
            }
            if (RoutingKeysBuilderOptions.SUPPLIER.equals(options)) {
                if (routingKeys.containerType.isAny() ||
                        routingKeys.infoType.isAny() ||
                        ANY.equals(routingKeys.sensorTypeId) ||
                        ANY.equals(routingKeys.channel) ||
                        routingKeys.ownership.isAny() ||
                        routingKeys.records.isAny() ||
                        routingKeys.gps.isAny() ||
                        routingKeys.temperature.isAny() ||
                        routingKeys.aqi.isAny() ||
                        routingKeys.airHumidity.isAny() ||
                        routingKeys.motion.isAny() ||
                        routingKeys.velocity.isAny() ||
                        routingKeys.airPressure.isAny() ||
                        routingKeys.soilMoisture.isAny() ||
                        routingKeys.illuminance.isAny() ||
                        routingKeys.battery.isAny() ||
                        routingKeys.legitimacy.isAny() ||
                        routingKeys.trigger.isAny() ||
                        routingKeys.waterPressure.isAny() ||
                        routingKeys.ph.isAny() ||
                        !routingKeys.sensorTypeId.matches("[a-zA-Z0-9]+")) {
                    return Optional.empty();
                }
            }
            return Optional.of(routingKeys);
        }
    }
}
