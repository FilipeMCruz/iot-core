package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.*;
import pt.sharespot.iot.core.routing.keys.*;
import pt.sharespot.iot.core.routing.keys.data.*;

public class RoutingKeysMapper {

    public static RoutingKeysBuf.Builder toBuf(RoutingKeys dto) {
        return RoutingKeysBuf.newBuilder()
                .setVersion(dto.version)
                .setContainerType(toBuf(dto.containerType.get()))
                .setInfoType(toBuf(dto.infoType.get()))
                .setSensorType(dto.sensorTypeId)
                .setChannel(dto.channel)
                .setRecords(toBuf(dto.records.get()))
                .setGps(toBuf(dto.gps.get()))
                .setTemperature(toBuf(dto.temperature.get()))
                .setLegitimacy(toBuf(dto.legitimacy.get()))
                .setAqi(toBuf(dto.aqi.get()))
                .setAirHumidity(toBuf(dto.airHumidity.get()))
                .setMotion(toBuf(dto.motion.get()))
                .setVelocity(toBuf(dto.velocity.get()))
                .setAirPressure(toBuf(dto.airPressure.get()))
                .setBattery(toBuf(dto.battery.get()))
                .setSoilMoisture(toBuf(dto.soilMoisture.get()))
                .setIlluminance(toBuf(dto.illuminance.get()))
                .setOwnership(toBuf(dto.ownership.get()))
                .setTrigger(toBuf(dto.trigger.get()))
                .setPh(toBuf(dto.ph.get()))
                .setDistance(toBuf(dto.distance.get()))
                .setOccupation(toBuf(dto.occupation.get()))
                .setSoilConductivity(toBuf(dto.soilConductivity.get()))
                .setWaterPressure(toBuf(dto.waterPressure.get()));
    }

    public static RoutingKeys toModel(RoutingKeysBuf buf) {
        return new RoutingKeysFactory().getBuilder(toModel(buf.getContainerType()), RoutingKeysBuilderOptions.CONSUMER)
                .withInfoType(toModel(buf.getInfoType()))
                .withContainerType(toModel(buf.getContainerType()))
                .withSensorTypeId(buf.getSensorType())
                .withChannel(buf.getChannel())
                .withRecords(toModel(buf.getRecords()))
                .withGps(toModel(buf.getGps()))
                .withTemperature(toModel(buf.getTemperature()))
                .withLegitimacyType(toModel(buf.getLegitimacy()))
                .withAQI(toModel(buf.getAqi()))
                .withHumidity(toModel(buf.getAirHumidity()))
                .withMotion(toModel(buf.getMotion()))
                .withVelocity(toModel(buf.getVelocity()))
                .withPressure(toModel(buf.getAirPressure()))
                .withBattery(toModel(buf.getBattery()))
                .withSoilMoisture(toModel(buf.getSoilMoisture()))
                .withIlluminance(toModel(buf.getIlluminance()))
                .withOwnership(toModel(buf.getOwnership()))
                .withAlarm(toModel(buf.getTrigger()))
                .withWaterPressure(toModel(buf.getWaterPressure()))
                .withPh(toModel(buf.getPh()))
                .withDistance(toModel(buf.getDistance()))
                .withOccupation(toModel(buf.getOccupation()))
                .withSoilConductivity(toModel(buf.getSoilConductivity()))
                .build()
                .orElseThrow(() -> new RuntimeException("Wrong Routing Keys"));
    }

    private static InfoTypeOptionsBuf toBuf(InfoTypeOptions dto) {
        return switch (dto) {
            case DECODED -> InfoTypeOptionsBuf.DECODED;
            case ENCODED -> InfoTypeOptionsBuf.ENCODED;
            case PROCESSED -> InfoTypeOptionsBuf.PROCESSED;
        };
    }

    private static InfoTypeOptions toModel(InfoTypeOptionsBuf buf) {
        return switch (buf) {
            default -> InfoTypeOptions.DECODED;
            case ENCODED -> InfoTypeOptions.ENCODED;
            case PROCESSED -> InfoTypeOptions.PROCESSED;
        };
    }

    private static RecordsOptionsBuf toBuf(RecordsOptions dto) {
        return switch (dto) {
            case UNIDENTIFIED_RECORDS -> RecordsOptionsBuf.UNIDENTIFIED_RECORDS;
            case WITH_RECORDS -> RecordsOptionsBuf.WITH_RECORDS;
            case WITHOUT_RECORDS -> RecordsOptionsBuf.WITHOUT_RECORDS;
        };
    }

    private static RecordsOptions toModel(RecordsOptionsBuf buf) {
        return switch (buf) {
            default -> RecordsOptions.UNIDENTIFIED_RECORDS;
            case WITH_RECORDS -> RecordsOptions.WITH_RECORDS;
            case WITHOUT_RECORDS -> RecordsOptions.WITHOUT_RECORDS;
        };
    }

    private static GPSDataOptionsBuf toBuf(GPSDataOptions dto) {
        return switch (dto) {
            case UNIDENTIFIED_GPS_DATA -> GPSDataOptionsBuf.UNIDENTIFIED_GPS_DATA;
            case WITH_GPS_DATA -> GPSDataOptionsBuf.WITH_GPS_DATA;
            case WITHOUT_GPS_DATA -> GPSDataOptionsBuf.WITHOUT_GPS_DATA;
        };
    }

    private static GPSDataOptions toModel(GPSDataOptionsBuf buf) {
        return switch (buf) {
            default -> GPSDataOptions.UNIDENTIFIED_GPS_DATA;
            case WITH_GPS_DATA -> GPSDataOptions.WITH_GPS_DATA;
            case WITHOUT_GPS_DATA -> GPSDataOptions.WITHOUT_GPS_DATA;
        };
    }

    private static PHDataOptionsBuf toBuf(PHDataOptions dto) {
        return switch (dto) {
            case UNIDENTIFIED_PH_DATA -> PHDataOptionsBuf.UNIDENTIFIED_PH_DATA;
            case WITH_PH_DATA -> PHDataOptionsBuf.WITH_PH_DATA;
            case WITHOUT_PH_DATA -> PHDataOptionsBuf.WITHOUT_PH_DATA;
        };
    }

    private static PHDataOptions toModel(PHDataOptionsBuf buf) {
        return switch (buf) {
            default -> PHDataOptions.UNIDENTIFIED_PH_DATA;
            case WITH_PH_DATA -> PHDataOptions.WITH_PH_DATA;
            case WITHOUT_PH_DATA -> PHDataOptions.WITHOUT_PH_DATA;
        };
    }

    private static TemperatureDataOptionsBuf toBuf(TemperatureDataOptions dto) {
        return switch (dto) {
            case UNIDENTIFIED_TEMPERATURE_DATA -> TemperatureDataOptionsBuf.UNIDENTIFIED_TEMPERATURE_DATA;
            case WITH_TEMPERATURE_DATA -> TemperatureDataOptionsBuf.WITH_TEMPERATURE_DATA;
            case WITHOUT_TEMPERATURE_DATA -> TemperatureDataOptionsBuf.WITHOUT_TEMPERATURE_DATA;
        };
    }

    private static TemperatureDataOptions toModel(TemperatureDataOptionsBuf buf) {
        return switch (buf) {
            default -> TemperatureDataOptions.UNIDENTIFIED_TEMPERATURE_DATA;
            case WITH_TEMPERATURE_DATA -> TemperatureDataOptions.WITH_TEMPERATURE_DATA;
            case WITHOUT_TEMPERATURE_DATA -> TemperatureDataOptions.WITHOUT_TEMPERATURE_DATA;
        };
    }

    private static DataLegitimacyOptionsBuf toBuf(DataLegitimacyOptions dto) {
        return switch (dto) {
            case CORRECT -> DataLegitimacyOptionsBuf.CORRECT_LEGITIMACY;
            case INCORRECT -> DataLegitimacyOptionsBuf.INCORRECT_LEGITIMACY;
            case UNDETERMINED -> DataLegitimacyOptionsBuf.UNDETERMINED_LEGITIMACY;
            case UNKNOWN -> DataLegitimacyOptionsBuf.UNKNOWN_LEGITIMACY;
        };
    }

    private static DataLegitimacyOptions toModel(DataLegitimacyOptionsBuf buf) {
        return switch (buf) {
            case CORRECT_LEGITIMACY -> DataLegitimacyOptions.CORRECT;
            case INCORRECT_LEGITIMACY -> DataLegitimacyOptions.INCORRECT;
            case UNDETERMINED_LEGITIMACY -> DataLegitimacyOptions.UNDETERMINED;
            default -> DataLegitimacyOptions.UNKNOWN;
        };
    }

    private static AirQualityDataOptionsBuf toBuf(AirQualityDataOptions dto) {
        return switch (dto) {
            case UNIDENTIFIED_AQI_DATA -> AirQualityDataOptionsBuf.UNIDENTIFIED_AQI_DATA;
            case WITH_AQI_DATA -> AirQualityDataOptionsBuf.WITH_AQI_DATA;
            case WITHOUT_AQI_DATA -> AirQualityDataOptionsBuf.WITHOUT_AQI_DATA;
        };
    }

    private static AirQualityDataOptions toModel(AirQualityDataOptionsBuf buf) {
        return switch (buf) {
            default -> AirQualityDataOptions.UNIDENTIFIED_AQI_DATA;
            case WITH_AQI_DATA -> AirQualityDataOptions.WITH_AQI_DATA;
            case WITHOUT_AQI_DATA -> AirQualityDataOptions.WITHOUT_AQI_DATA;
        };
    }

    private static WaterPressureDataOptions toModel(WaterPressureDataOptionsBuf buf) {
        return switch (buf) {
            default -> WaterPressureDataOptions.UNIDENTIFIED_WATER_PRESSURE_DATA;
            case WITH_WATER_PRESSURE_DATA -> WaterPressureDataOptions.WITH_WATER_PRESSURE_DATA;
            case WITHOUT_WATER_PRESSURE_DATA -> WaterPressureDataOptions.WITHOUT_WATER_PRESSURE_DATA;
        };
    }

    private static WaterPressureDataOptionsBuf toBuf(WaterPressureDataOptions dto) {
        return switch (dto) {
            case UNIDENTIFIED_WATER_PRESSURE_DATA -> WaterPressureDataOptionsBuf.UNIDENTIFIED_WATER_PRESSURE_DATA;
            case WITH_WATER_PRESSURE_DATA -> WaterPressureDataOptionsBuf.WITH_WATER_PRESSURE_DATA;
            case WITHOUT_WATER_PRESSURE_DATA -> WaterPressureDataOptionsBuf.WITHOUT_WATER_PRESSURE_DATA;
        };
    }

    private static AirHumidityDataOptionsBuf toBuf(AirHumidityDataOptions dto) {
        return switch (dto) {
            case UNIDENTIFIED_AIR_HUMIDITY_DATA -> AirHumidityDataOptionsBuf.UNIDENTIFIED_AIR_HUMIDITY_DATA;
            case WITH_AIR_HUMIDITY_DATA -> AirHumidityDataOptionsBuf.WITH_AIR_HUMIDITY_DATA;
            case WITHOUT_AIR_HUMIDITY_DATA -> AirHumidityDataOptionsBuf.WITHOUT_AIR_HUMIDITY_DATA;
        };
    }

    private static AirHumidityDataOptions toModel(AirHumidityDataOptionsBuf buf) {
        return switch (buf) {
            default -> AirHumidityDataOptions.UNIDENTIFIED_AIR_HUMIDITY_DATA;
            case WITH_AIR_HUMIDITY_DATA -> AirHumidityDataOptions.WITH_AIR_HUMIDITY_DATA;
            case WITHOUT_AIR_HUMIDITY_DATA -> AirHumidityDataOptions.WITHOUT_AIR_HUMIDITY_DATA;
        };
    }

    private static MotionDataOptionsBuf toBuf(MotionDataOptions dto) {
        return switch (dto) {
            case UNIDENTIFIED_MOTION_DATA -> MotionDataOptionsBuf.UNIDENTIFIED_MOTION_DATA;
            case WITH_MOTION_DATA -> MotionDataOptionsBuf.WITH_MOTION_DATA;
            case WITHOUT_MOTION_DATA -> MotionDataOptionsBuf.WITHOUT_MOTION_DATA;
        };
    }

    private static MotionDataOptions toModel(MotionDataOptionsBuf dto) {
        return switch (dto) {
            default -> MotionDataOptions.UNIDENTIFIED_MOTION_DATA;
            case WITH_MOTION_DATA -> MotionDataOptions.WITH_MOTION_DATA;
            case WITHOUT_MOTION_DATA -> MotionDataOptions.WITHOUT_MOTION_DATA;
        };
    }

    private static VelocityDataOptionsBuf toBuf(VelocityDataOptions dto) {
        return switch (dto) {
            case UNIDENTIFIED_VELOCITY_DATA -> VelocityDataOptionsBuf.UNIDENTIFIED_VELOCITY_DATA;
            case WITH_VELOCITY_DATA -> VelocityDataOptionsBuf.WITH_VELOCITY_DATA;
            case WITHOUT_VELOCITY_DATA -> VelocityDataOptionsBuf.WITHOUT_VELOCITY_DATA;
        };
    }

    private static VelocityDataOptions toModel(VelocityDataOptionsBuf buf) {
        return switch (buf) {
            default -> VelocityDataOptions.UNIDENTIFIED_VELOCITY_DATA;
            case WITH_VELOCITY_DATA -> VelocityDataOptions.WITH_VELOCITY_DATA;
            case WITHOUT_VELOCITY_DATA -> VelocityDataOptions.WITHOUT_VELOCITY_DATA;
        };
    }

    private static AirPressureDataOptionsBuf toBuf(AirPressureDataOptions dto) {
        return switch (dto) {
            case UNIDENTIFIED_AIR_PRESSURE_DATA -> AirPressureDataOptionsBuf.UNIDENTIFIED_AIR_PRESSURE_DATA;
            case WITH_AIR_PRESSURE_DATA -> AirPressureDataOptionsBuf.WITH_AIR_PRESSURE_DATA;
            case WITHOUT_AIR_PRESSURE_DATA -> AirPressureDataOptionsBuf.WITHOUT_AIR_PRESSURE_DATA;
        };
    }

    private static AirPressureDataOptions toModel(AirPressureDataOptionsBuf buf) {
        return switch (buf) {
            default -> AirPressureDataOptions.UNIDENTIFIED_AIR_PRESSURE_DATA;
            case WITH_AIR_PRESSURE_DATA -> AirPressureDataOptions.WITH_AIR_PRESSURE_DATA;
            case WITHOUT_AIR_PRESSURE_DATA -> AirPressureDataOptions.WITHOUT_AIR_PRESSURE_DATA;
        };
    }

    private static BatteryDataOptionsBuf toBuf(BatteryDataOptions dto) {
        return switch (dto) {
            case UNIDENTIFIED_BATTERY_DATA -> BatteryDataOptionsBuf.UNIDENTIFIED_BATTERY_DATA;
            case WITH_BATTERY_DATA -> BatteryDataOptionsBuf.WITH_BATTERY_DATA;
            case WITHOUT_BATTERY_DATA -> BatteryDataOptionsBuf.WITHOUT_BATTERY_DATA;
        };
    }

    private static BatteryDataOptions toModel(BatteryDataOptionsBuf buf) {
        return switch (buf) {
            default -> BatteryDataOptions.UNIDENTIFIED_BATTERY_DATA;
            case WITH_BATTERY_DATA -> BatteryDataOptions.WITH_BATTERY_DATA;
            case WITHOUT_BATTERY_DATA -> BatteryDataOptions.WITHOUT_BATTERY_DATA;
        };
    }

    private static SoilMoistureDataOptionsBuf toBuf(SoilMoistureDataOptions dto) {
        return switch (dto) {
            case UNIDENTIFIED_SOIL_MOISTURE_DATA -> SoilMoistureDataOptionsBuf.UNIDENTIFIED_SOIL_MOISTURE_DATA;
            case WITH_SOIL_MOISTURE_DATA -> SoilMoistureDataOptionsBuf.WITH_SOIL_MOISTURE_DATA;
            case WITHOUT_SOIL_MOISTURE_DATA -> SoilMoistureDataOptionsBuf.WITHOUT_SOIL_MOISTURE_DATA;
        };
    }

    private static SoilMoistureDataOptions toModel(SoilMoistureDataOptionsBuf buf) {
        return switch (buf) {
            default -> SoilMoistureDataOptions.UNIDENTIFIED_SOIL_MOISTURE_DATA;
            case WITH_SOIL_MOISTURE_DATA -> SoilMoistureDataOptions.WITH_SOIL_MOISTURE_DATA;
            case WITHOUT_SOIL_MOISTURE_DATA -> SoilMoistureDataOptions.WITHOUT_SOIL_MOISTURE_DATA;
        };
    }

    private static IlluminanceDataOptionsBuf toBuf(IlluminanceDataOptions dto) {
        return switch (dto) {
            case UNIDENTIFIED_ILLUMINANCE_DATA -> IlluminanceDataOptionsBuf.UNIDENTIFIED_ILLUMINANCE_DATA;
            case WITH_ILLUMINANCE_DATA -> IlluminanceDataOptionsBuf.WITH_ILLUMINANCE_DATA;
            case WITHOUT_ILLUMINANCE_DATA -> IlluminanceDataOptionsBuf.WITHOUT_ILLUMINANCE_DATA;
        };
    }

    private static IlluminanceDataOptions toModel(IlluminanceDataOptionsBuf buf) {
        return switch (buf) {
            default -> IlluminanceDataOptions.UNIDENTIFIED_ILLUMINANCE_DATA;
            case WITH_ILLUMINANCE_DATA -> IlluminanceDataOptions.WITH_ILLUMINANCE_DATA;
            case WITHOUT_ILLUMINANCE_DATA -> IlluminanceDataOptions.WITHOUT_ILLUMINANCE_DATA;
        };
    }

    private static DomainOwnershipOptionsBuf toBuf(DomainOwnershipOptions dto) {
        return switch (dto) {
            case UNIDENTIFIED_DOMAIN_OWNERSHIP -> DomainOwnershipOptionsBuf.UNIDENTIFIED_DOMAIN_OWNERSHIP;
            case WITH_DOMAIN_OWNERSHIP -> DomainOwnershipOptionsBuf.WITH_DOMAIN_OWNERSHIP;
            case WITHOUT_DOMAIN_OWNERSHIP -> DomainOwnershipOptionsBuf.WITHOUT_DOMAIN_OWNERSHIP;
        };
    }

    private static DomainOwnershipOptions toModel(DomainOwnershipOptionsBuf buf) {
        return switch (buf) {
            default -> DomainOwnershipOptions.UNIDENTIFIED_DOMAIN_OWNERSHIP;
            case WITH_DOMAIN_OWNERSHIP -> DomainOwnershipOptions.WITH_DOMAIN_OWNERSHIP;
            case WITHOUT_DOMAIN_OWNERSHIP -> DomainOwnershipOptions.WITHOUT_DOMAIN_OWNERSHIP;
        };
    }

    private static TriggerDataOptionsBuf toBuf(TriggerDataOptions dto) {
        return switch (dto) {
            case UNIDENTIFIED_TRIGGER_DATA -> TriggerDataOptionsBuf.UNIDENTIFIED_TRIGGER_DATA;
            case WITH_TRIGGER_DATA -> TriggerDataOptionsBuf.WITH_TRIGGER_DATA;
            case WITHOUT_TRIGGER_DATA -> TriggerDataOptionsBuf.WITHOUT_TRIGGER_DATA;
        };
    }

    private static TriggerDataOptions toModel(TriggerDataOptionsBuf buf) {
        return switch (buf) {
            default -> TriggerDataOptions.UNIDENTIFIED_TRIGGER_DATA;
            case WITH_TRIGGER_DATA -> TriggerDataOptions.WITH_TRIGGER_DATA;
            case WITHOUT_TRIGGER_DATA -> TriggerDataOptions.WITHOUT_TRIGGER_DATA;
        };
    }

    private static DistanceDataOptionsBuf toBuf(DistanceDataOptions dto) {
        return switch (dto) {
            case UNIDENTIFIED_DISTANCE_DATA -> DistanceDataOptionsBuf.UNIDENTIFIED_DISTANCE_DATA;
            case WITH_DISTANCE_DATA -> DistanceDataOptionsBuf.WITH_DISTANCE_DATA;
            case WITHOUT_DISTANCE_DATA -> DistanceDataOptionsBuf.WITHOUT_DISTANCE_DATA;
        };
    }

    private static DistanceDataOptions toModel(DistanceDataOptionsBuf buf) {
        return switch (buf) {
            default -> DistanceDataOptions.UNIDENTIFIED_DISTANCE_DATA;
            case WITH_DISTANCE_DATA -> DistanceDataOptions.WITH_DISTANCE_DATA;
            case WITHOUT_DISTANCE_DATA -> DistanceDataOptions.WITHOUT_DISTANCE_DATA;
        };
    }

    private static OccupationDataOptionsBuf toBuf(OccupationDataOptions dto) {
        return switch (dto) {
            case UNIDENTIFIED_OCCUPATION_DATA -> OccupationDataOptionsBuf.UNIDENTIFIED_OCCUPATION_DATA;
            case WITH_OCCUPATION_DATA -> OccupationDataOptionsBuf.WITH_OCCUPATION_DATA;
            case WITHOUT_OCCUPATION_DATA -> OccupationDataOptionsBuf.WITHOUT_OCCUPATION_DATA;
        };
    }

    private static OccupationDataOptions toModel(OccupationDataOptionsBuf buf) {
        return switch (buf) {
            default -> OccupationDataOptions.UNIDENTIFIED_OCCUPATION_DATA;
            case WITH_OCCUPATION_DATA -> OccupationDataOptions.WITH_OCCUPATION_DATA;
            case WITHOUT_OCCUPATION_DATA -> OccupationDataOptions.WITHOUT_OCCUPATION_DATA;
        };
    }

    private static SoilConductivityDataOptionsBuf toBuf(SoilConductivityDataOptions dto) {
        return switch (dto) {
            case UNIDENTIFIED_SOIL_CONDUCTIVITY_DATA ->
                    SoilConductivityDataOptionsBuf.UNIDENTIFIED_SOIL_CONDUCTIVITY_DATA;
            case WITH_SOIL_CONDUCTIVITY_DATA -> SoilConductivityDataOptionsBuf.WITH_SOIL_CONDUCTIVITY_DATA;
            case WITHOUT_SOIL_CONDUCTIVITY_DATA -> SoilConductivityDataOptionsBuf.WITHOUT_SOIL_CONDUCTIVITY_DATA;
        };
    }

    private static SoilConductivityDataOptions toModel(SoilConductivityDataOptionsBuf buf) {
        return switch (buf) {
            default -> SoilConductivityDataOptions.UNIDENTIFIED_SOIL_CONDUCTIVITY_DATA;
            case WITH_SOIL_CONDUCTIVITY_DATA -> SoilConductivityDataOptions.WITH_SOIL_CONDUCTIVITY_DATA;
            case WITHOUT_SOIL_CONDUCTIVITY_DATA -> SoilConductivityDataOptions.WITHOUT_SOIL_CONDUCTIVITY_DATA;
        };
    }

    private static ContainerTypeOptionsBuf toBuf(ContainerTypeOptions dto) {
        return switch (dto) {
            case OTHER -> ContainerTypeOptionsBuf.OTHER;
            case DATA_DECODER -> ContainerTypeOptionsBuf.DATA_DECODER;
            case DATA_GATEWAY -> ContainerTypeOptionsBuf.DATA_GATEWAY;
            case DATA_PROCESSOR -> ContainerTypeOptionsBuf.DATA_PROCESSOR;
            case DATA_STORE -> ContainerTypeOptionsBuf.DATA_STORE;
            case DATA_VALIDATOR -> ContainerTypeOptionsBuf.DATA_VALIDATOR;
            case DEVICE_RECORDS -> ContainerTypeOptionsBuf.DEVICE_RECORDS;
            case FLEET_MANAGEMENT -> ContainerTypeOptionsBuf.FLEET_MANAGEMENT;
            case IDENTITY_MANAGEMENT -> ContainerTypeOptionsBuf.IDENTITY_MANAGEMENT;
            case SMART_IRRIGATION -> ContainerTypeOptionsBuf.SMART_IRRIGATION;
        };
    }

    private static ContainerTypeOptions toModel(ContainerTypeOptionsBuf buf) {
        return switch (buf) {
            default -> ContainerTypeOptions.OTHER;
            case DATA_DECODER -> ContainerTypeOptions.DATA_DECODER;
            case DATA_GATEWAY -> ContainerTypeOptions.DATA_GATEWAY;
            case DATA_PROCESSOR -> ContainerTypeOptions.DATA_PROCESSOR;
            case DATA_STORE -> ContainerTypeOptions.DATA_STORE;
            case DATA_VALIDATOR -> ContainerTypeOptions.DATA_VALIDATOR;
            case DEVICE_RECORDS -> ContainerTypeOptions.DEVICE_RECORDS;
            case FLEET_MANAGEMENT -> ContainerTypeOptions.FLEET_MANAGEMENT;
            case IDENTITY_MANAGEMENT -> ContainerTypeOptions.IDENTITY_MANAGEMENT;
            case SMART_IRRIGATION -> ContainerTypeOptions.SMART_IRRIGATION;
        };
    }
}
