package pt.sharespot.iot.core.sensor.routing.keys;

import pt.sharespot.iot.core.keys.ContainerTypeOptions;
import pt.sharespot.iot.core.keys.RoutingKeyOption;
import pt.sharespot.iot.core.keys.RoutingKeysBuilderOptions;
import pt.sharespot.iot.core.sensor.model.ProcessedSensorDataDTO;
import pt.sharespot.iot.core.sensor.model.properties.PropertyName;
import pt.sharespot.iot.core.sensor.routing.keys.data.*;

import java.text.MessageFormat;
import java.util.Optional;

public class SensorRoutingKeys {

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

    public RoutingKeyOption<DistanceDataOptions> distance;

    public RoutingKeyOption<OccupationDataOptions> occupation;

    public RoutingKeyOption<SoilConductivityDataOptions> soilConductivity;

    public RoutingKeyOption<CO2DataOptions> co2;

    public RoutingKeyOption<CODataOptions> co;

    public RoutingKeyOption<NH3DataOptions> nh3;

    public RoutingKeyOption<NO2DataOptions> no2;

    public RoutingKeyOption<O3DataOptions> o3;

    public RoutingKeyOption<VOCDataOptions> voc;

    public RoutingKeyOption<PM2_5DataOptions> pm2_5;

    public RoutingKeyOption<PM10DataOptions> pm10;

    public SensorRoutingKeys(RoutingKeyOption<ContainerTypeOptions> containerType,
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
                             RoutingKeyOption<PHDataOptions> ph,
                             RoutingKeyOption<DistanceDataOptions> distance,
                             RoutingKeyOption<OccupationDataOptions> occupation,
                             RoutingKeyOption<SoilConductivityDataOptions> soilConductivity,
                             RoutingKeyOption<CO2DataOptions> co2,
                             RoutingKeyOption<CODataOptions> co,
                             RoutingKeyOption<NH3DataOptions> nh3,
                             RoutingKeyOption<NO2DataOptions> no2,
                             RoutingKeyOption<O3DataOptions> o3,
                             RoutingKeyOption<VOCDataOptions> voc,
                             RoutingKeyOption<PM2_5DataOptions> pm2_5,
                             RoutingKeyOption<PM10DataOptions> pm10) {
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
        this.distance = distance;
        this.occupation = occupation;
        this.soilConductivity = soilConductivity;
        this.co2 = co2;
        this.co = co;
        this.nh3 = nh3;
        this.no2 = no2;
        this.o3 = o3;
        this.voc = voc;
        this.pm2_5 = pm2_5;
        this.pm10 = pm10;
    }

    public SensorRoutingKeys() {
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}.{1}.data.{2}.{3}.{4}.{5}.{6}.{7}.{8}.{9}.{10}.{11}.{12}.{13}.{14}.{15}.{16}.{17}.{18}.{19}.{20}.{21}.{22}.{23}.{24}.{25}.{26}.{27}.{28}.{29}.{30}.{31}.#",
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
                ph.value(),
                distance.value(),
                occupation.value(),
                soilConductivity.value(),
                co2.value(),
                co.value(),
                nh3.value(),
                no2.value(),
                o3.value(),
                voc.value(),
                pm2_5.value(),
                pm10.value());
    }

    public String details() {
        return MessageFormat.format("{0}.{1}.data.{2}.{3}.{4}.{5}.{6}.{7}.{8}.{9}.{10}.{11}.{12}.{13}.{14}.{15}.{16}.{17}.{18}.{19}.{20}.{21}.{22}.{23}.{24}.{25}.{26}.{27}.{28}.{29}.{30}.{31}.#",
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
                ph.details(),
                distance.details(),
                occupation.details(),
                soilConductivity.details(),
                co2.details(),
                co.details(),
                nh3.details(),
                no2.details(),
                o3.details(),
                voc.details(),
                pm2_5.details(),
                pm10.details());
    }

    public static Builder builder(ContainerTypeOptions type, RoutingKeysBuilderOptions options, String version) {
        return new Builder(type, options, version);
    }

    public static class Builder {

        public static final String ANY = "*";

        private final RoutingKeyOption<ContainerTypeOptions> thisContainerType;

        private final String version;

        private final RoutingKeysBuilderOptions options;

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

        private RoutingKeyOption<DistanceDataOptions> distance;

        private RoutingKeyOption<OccupationDataOptions> occupation;

        private RoutingKeyOption<SoilConductivityDataOptions> soilConductivity;

        private RoutingKeyOption<CO2DataOptions> co2;

        private RoutingKeyOption<CODataOptions> co;

        private RoutingKeyOption<NH3DataOptions> nh3;

        private RoutingKeyOption<NO2DataOptions> no2;

        private RoutingKeyOption<O3DataOptions> o3;

        private RoutingKeyOption<VOCDataOptions> voc;

        private RoutingKeyOption<PM2_5DataOptions> pm2_5;

        private RoutingKeyOption<PM10DataOptions> pm10;


        private Builder(ContainerTypeOptions type, RoutingKeysBuilderOptions options, String version) {
            this.options = options;
            this.thisContainerType = RoutingKeyOption.of(type);
            this.version = version;
        }

        public Builder withContainerType(ContainerTypeOptions containerType) {
            this.containerType = RoutingKeyOption.of(containerType);
            return this;
        }

        public Builder withPm2_5(PM2_5DataOptions pm2_5) {
            this.pm2_5 = RoutingKeyOption.of(pm2_5);
            return this;
        }

        public Builder withPm10(PM10DataOptions pm10) {
            this.pm10 = RoutingKeyOption.of(pm10);
            return this;
        }

        public Builder withOccupation(OccupationDataOptions occupation) {
            this.occupation = RoutingKeyOption.of(occupation);
            return this;
        }

        public Builder withSoilConductivity(SoilConductivityDataOptions soilConductivity) {
            this.soilConductivity = RoutingKeyOption.of(soilConductivity);
            return this;
        }

        public Builder withWaterPressure(WaterPressureDataOptions waterPressure) {
            this.waterPressure = RoutingKeyOption.of(waterPressure);
            return this;
        }

        public Builder withDistance(DistanceDataOptions distance) {
            this.distance = RoutingKeyOption.of(distance);
            return this;
        }

        public Builder withPh(PHDataOptions ph) {
            this.ph = RoutingKeyOption.of(ph);
            return this;
        }

        public Builder withInfoType(InfoTypeOptions infoType) {
            this.infoType = RoutingKeyOption.of(infoType);
            return this;
        }

        public Builder withSensorTypeId(String sensorTypeId) {
            this.sensorTypeId = sensorTypeId;
            return this;
        }

        public Builder withChannel(String channel) {
            this.channel = channel;
            return this;
        }

        public Builder withRecords(RecordsOptions records) {
            this.records = RoutingKeyOption.of(records);
            return this;
        }

        public Builder withOwnership(DomainOwnershipOptions ownership) {
            this.ownership = RoutingKeyOption.of(ownership);
            return this;
        }

        public Builder withLegitimacyType(DataLegitimacyOptions legitimacyType) {
            this.legitimacy = RoutingKeyOption.of(legitimacyType);
            return this;
        }

        public Builder withGps(GPSDataOptions gps) {
            this.gps = RoutingKeyOption.of(gps);
            return this;
        }

        public Builder withAQI(AirQualityDataOptions aqi) {
            this.aqi = RoutingKeyOption.of(aqi);
            return this;
        }

        public Builder withAirHumidity(AirHumidityDataOptions humidity) {
            this.airHumidity = RoutingKeyOption.of(humidity);
            return this;
        }

        public Builder withTemperature(TemperatureDataOptions temperature) {
            this.temperature = RoutingKeyOption.of(temperature);
            return this;
        }

        public Builder withMotion(MotionDataOptions motion) {
            this.motion = RoutingKeyOption.of(motion);
            return this;
        }

        public Builder withVelocity(VelocityDataOptions velocity) {
            this.velocity = RoutingKeyOption.of(velocity);
            return this;
        }

        public Builder withAirPressure(AirPressureDataOptions pressure) {
            this.airPressure = RoutingKeyOption.of(pressure);
            return this;
        }

        public Builder withSoilMoisture(SoilMoistureDataOptions moisture) {
            this.soilMoisture = RoutingKeyOption.of(moisture);
            return this;
        }

        public Builder withIlluminance(IlluminanceDataOptions illuminance) {
            this.illuminance = RoutingKeyOption.of(illuminance);
            return this;
        }

        public Builder withTrigger(TriggerDataOptions alarm) {
            this.trigger = RoutingKeyOption.of(alarm);
            return this;
        }

        public Builder withBattery(BatteryDataOptions battery) {
            this.battery = RoutingKeyOption.of(battery);
            return this;
        }

        public Builder withCO(CODataOptions co) {
            this.co = RoutingKeyOption.of(co);
            return this;
        }

        public Builder withNH3(NH3DataOptions nh3) {
            this.nh3 = RoutingKeyOption.of(nh3);
            return this;
        }

        public Builder withNO2(NO2DataOptions no2) {
            this.no2 = RoutingKeyOption.of(no2);
            return this;
        }

        public Builder withO3(O3DataOptions o3) {
            this.o3 = RoutingKeyOption.of(o3);
            return this;
        }

        public Builder withVOC(VOCDataOptions voc) {
            this.voc = RoutingKeyOption.of(voc);
            return this;
        }

        public Builder withCO2(CO2DataOptions co2) {
            this.co2 = RoutingKeyOption.of(co2);
            return this;
        }

        public Builder withUnidentifiedData() {
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
            this.distance = RoutingKeyOption.of(DistanceDataOptions.UNIDENTIFIED_DISTANCE_DATA);
            this.occupation = RoutingKeyOption.of(OccupationDataOptions.UNIDENTIFIED_OCCUPATION_DATA);
            this.soilConductivity = RoutingKeyOption.of(SoilConductivityDataOptions.UNIDENTIFIED_SOIL_CONDUCTIVITY_DATA);
            this.co2 = RoutingKeyOption.of(CO2DataOptions.UNIDENTIFIED_CO2_DATA);
            this.co = RoutingKeyOption.of(CODataOptions.UNIDENTIFIED_CO_DATA);
            this.voc = RoutingKeyOption.of(VOCDataOptions.UNIDENTIFIED_VOC_DATA);
            this.o3 = RoutingKeyOption.of(O3DataOptions.UNIDENTIFIED_O3_DATA);
            this.nh3 = RoutingKeyOption.of(NH3DataOptions.UNIDENTIFIED_NH3_DATA);
            this.no2 = RoutingKeyOption.of(NO2DataOptions.UNIDENTIFIED_NO2_DATA);
            this.pm2_5 = RoutingKeyOption.of(PM2_5DataOptions.WITHOUT_PM2_5_DATA);
            this.pm10 = RoutingKeyOption.of(PM10DataOptions.UNIDENTIFIED_PM10_DATA);
            return this;
        }

        public Builder withUpdated(ProcessedSensorDataDTO data) {
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
            this.distance = RoutingKeyOption.of(data.hasAllProperties(PropertyName.DISTANCE) ?
                    DistanceDataOptions.WITH_DISTANCE_DATA : DistanceDataOptions.WITHOUT_DISTANCE_DATA);
            this.occupation = RoutingKeyOption.of(data.hasAllProperties(PropertyName.OCCUPATION) ?
                    OccupationDataOptions.WITH_OCCUPATION_DATA : OccupationDataOptions.WITHOUT_OCCUPATION_DATA);
            this.soilConductivity = RoutingKeyOption.of(data.hasAllProperties(PropertyName.SOIL_CONDUCTIVITY) ?
                    SoilConductivityDataOptions.WITH_SOIL_CONDUCTIVITY_DATA : SoilConductivityDataOptions.WITHOUT_SOIL_CONDUCTIVITY_DATA);
            this.co2 = RoutingKeyOption.of(data.hasAllProperties(PropertyName.CO2) ?
                    CO2DataOptions.WITH_CO2_DATA : CO2DataOptions.WITHOUT_CO2_DATA);
            this.co = RoutingKeyOption.of(data.hasAllProperties(PropertyName.CO) ?
                    CODataOptions.WITH_CO_DATA : CODataOptions.WITHOUT_CO_DATA);
            this.voc = RoutingKeyOption.of(data.hasAllProperties(PropertyName.VOC) ?
                    VOCDataOptions.WITH_VOC_DATA : VOCDataOptions.WITHOUT_VOC_DATA);
            this.o3 = RoutingKeyOption.of(data.hasAllProperties(PropertyName.O3) ?
                    O3DataOptions.WITH_O3_DATA : O3DataOptions.WITHOUT_O3_DATA);
            this.nh3 = RoutingKeyOption.of(data.hasAllProperties(PropertyName.NH3) ?
                    NH3DataOptions.WITH_NH3_DATA : NH3DataOptions.WITHOUT_NH3_DATA);
            this.no2 = RoutingKeyOption.of(data.hasAllProperties(PropertyName.NO2) ?
                    NO2DataOptions.WITH_NO2_DATA : NO2DataOptions.WITHOUT_NO2_DATA);
            this.pm2_5 = RoutingKeyOption.of(data.hasAllProperties(PropertyName.PM2_5) ?
                    PM2_5DataOptions.WITH_PM2_5_DATA : PM2_5DataOptions.WITHOUT_PM2_5_DATA);
            this.pm10 = RoutingKeyOption.of(data.hasAllProperties(PropertyName.PM10) ?
                    PM10DataOptions.WITH_PM10_DATA : PM10DataOptions.WITHOUT_PM10_DATA);
            return this;
        }

        public Optional<SensorRoutingKeys> missingAsAny() {
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
            this.distance = this.distance == null ? RoutingKeyOption.any() : this.distance;
            this.occupation = this.occupation == null ? RoutingKeyOption.any() : this.occupation;
            this.soilConductivity = this.soilConductivity == null ? RoutingKeyOption.any() : this.soilConductivity;
            this.co2 = this.co2 == null ? RoutingKeyOption.any() : this.co2;
            this.co = this.co == null ? RoutingKeyOption.any() : this.co;
            this.voc = this.voc == null ? RoutingKeyOption.any() : this.voc;
            this.o3 = this.o3 == null ? RoutingKeyOption.any() : this.o3;
            this.nh3 = this.nh3 == null ? RoutingKeyOption.any() : this.nh3;
            this.no2 = this.no2 == null ? RoutingKeyOption.any() : this.no2;
            this.pm10 = this.pm10 == null ? RoutingKeyOption.any() : this.pm10;
            this.pm2_5 = this.pm2_5 == null ? RoutingKeyOption.any() : this.pm2_5;
            return build();
        }

        public Optional<SensorRoutingKeys> from(SensorRoutingKeys consumer) {
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
            this.distance = this.distance == null ? consumer.distance : this.distance;
            this.occupation = this.occupation == null ? consumer.occupation : this.occupation;
            this.soilConductivity = this.soilConductivity == null ? consumer.soilConductivity : this.soilConductivity;
            this.co2 = this.co2 == null ? consumer.co2 : this.co2;
            this.co = this.co == null ? consumer.co : this.co;
            this.voc = this.voc == null ? consumer.voc : this.voc;
            this.o3 = this.o3 == null ? consumer.o3 : this.o3;
            this.nh3 = this.nh3 == null ? consumer.nh3 : this.nh3;
            this.no2 = this.no2 == null ? consumer.no2 : this.no2;
            this.pm10 = this.pm10 == null ? consumer.pm10 : this.pm10;
            this.pm2_5 = this.pm2_5 == null ? consumer.pm2_5 : this.pm2_5;
            return build();
        }

        public Optional<SensorRoutingKeys> from(String routingKeys) {
            var info = routingKeys.substring(routingKeys.lastIndexOf(".data.") + 1);
            var splinted = info.split("\\.");
            if (splinted.length < 28) {
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
            this.distance = DistanceDataOptions.extract(splinted[20]);
            this.occupation = OccupationDataOptions.extract(splinted[21]);
            this.soilConductivity = SoilConductivityDataOptions.extract(splinted[22]);
            this.co2 = CO2DataOptions.extract(splinted[23]);
            this.co = CODataOptions.extract(splinted[24]);
            this.nh3 = NH3DataOptions.extract(splinted[25]);
            this.no2 = NO2DataOptions.extract(splinted[26]);
            this.o3 = O3DataOptions.extract(splinted[27]);
            this.voc = VOCDataOptions.extract(splinted[28]);
            this.pm2_5 = PM2_5DataOptions.extract(splinted[29]);
            this.pm10 = PM10DataOptions.extract(splinted[30]);
            return build();
        }

        public Optional<SensorRoutingKeys> build() {
            if (RoutingKeysBuilderOptions.SUPPLIER.equals(options)) {
                this.containerType = thisContainerType;
            }

            var routingKeys = new SensorRoutingKeys(containerType,
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
                    ph,
                    distance,
                    occupation,
                    soilConductivity,
                    co2,
                    co,
                    nh3,
                    no2,
                    o3,
                    voc,
                    pm2_5,
                    pm10);
            return toOptional(routingKeys);
        }

        private Optional<SensorRoutingKeys> toOptional(SensorRoutingKeys routingKeys) {
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
                    routingKeys.distance == null ||
                    routingKeys.occupation == null ||
                    routingKeys.soilConductivity == null ||
                    routingKeys.co2 == null ||
                    routingKeys.co == null ||
                    routingKeys.nh3 == null ||
                    routingKeys.no2 == null ||
                    routingKeys.o3 == null ||
                    routingKeys.voc == null ||
                    routingKeys.pm2_5 == null ||
                    routingKeys.pm10 == null ||
                    !routingKeys.sensorTypeId.matches("[a-zA-Z\\d]+") && !ANY.equals(routingKeys.sensorTypeId) ||
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
                        routingKeys.distance.isAny() ||
                        routingKeys.occupation.isAny() ||
                        routingKeys.soilConductivity.isAny() ||
                        routingKeys.co2.isAny() ||
                        routingKeys.co.isAny() ||
                        routingKeys.nh3.isAny() ||
                        routingKeys.no2.isAny() ||
                        routingKeys.o3.isAny() ||
                        routingKeys.voc.isAny() ||
                        routingKeys.pm2_5.isAny() ||
                        routingKeys.pm10.isAny() ||
                        !routingKeys.sensorTypeId.matches("[a-zA-Z\\d]+")) {
                    return Optional.empty();
                }
            }
            return Optional.of(routingKeys);
        }
    }
}
