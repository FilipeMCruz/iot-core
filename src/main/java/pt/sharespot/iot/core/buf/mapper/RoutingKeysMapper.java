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
                .setHumidity(toBuf(dto.humidity.get()))
                .setMotion(toBuf(dto.motion.get()))
                .setVelocity(toBuf(dto.velocity.get()))
                .setPressure(toBuf(dto.pressure.get()))
                .setBattery(toBuf(dto.battery.get()))
                .setMoisture(toBuf(dto.moisture.get()))
                .setIlluminance(toBuf(dto.illuminance.get()))
                .setOwnership(toBuf(dto.ownership.get()))
                .setAlarm(toBuf(dto.alarm.get()));
    }

    private static InfoTypeOptionsBuf toBuf(InfoTypeOptions dto) {
        return switch (dto) {
            case DECODED -> InfoTypeOptionsBuf.DECODED;
            case ENCODED -> InfoTypeOptionsBuf.ENCODED;
            case PROCESSED -> InfoTypeOptionsBuf.PROCESSED;
        };
    }

    private static RecordsOptionsBuf toBuf(RecordsOptions dto) {
        return switch (dto) {
            case UNIDENTIFIED_RECORDS -> RecordsOptionsBuf.UNIDENTIFIED_RECORDS;
            case WITH_RECORDS -> RecordsOptionsBuf.WITH_RECORDS;
            case WITHOUT_RECORDS -> RecordsOptionsBuf.WITHOUT_RECORDS;
        };
    }

    private static GPSDataOptionsBuf toBuf(GPSDataOptions dto) {
        return switch (dto) {
            case UNIDENTIFIED_GPS_DATA -> GPSDataOptionsBuf.UNIDENTIFIED_GPS_DATA;
            case WITH_GPS_DATA -> GPSDataOptionsBuf.WITH_GPS_DATA;
            case WITHOUT_GPS_DATA -> GPSDataOptionsBuf.WITHOUT_GPS_DATA;
        };
    }

    private static TemperatureDataOptionsBuf toBuf(TemperatureDataOptions dto) {
        return switch (dto) {
            case UNIDENTIFIED_TEMPERATURE_DATA -> TemperatureDataOptionsBuf.UNIDENTIFIED_TEMPERATURE_DATA;
            case WITH_TEMPERATURE_DATA -> TemperatureDataOptionsBuf.WITH_TEMPERATURE_DATA;
            case WITHOUT_TEMPERATURE_DATA -> TemperatureDataOptionsBuf.WITHOUT_TEMPERATURE_DATA;
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

    private static AirQualityDataOptionsBuf toBuf(AirQualityDataOptions dto) {
        return switch (dto) {
            case UNIDENTIFIED_AQI_DATA -> AirQualityDataOptionsBuf.UNIDENTIFIED_AQI_DATA;
            case WITH_AQI_DATA -> AirQualityDataOptionsBuf.WITH_AQI_DATA;
            case WITHOUT_AQI_DATA -> AirQualityDataOptionsBuf.WITHOUT_AQI_DATA;
        };
    }

    private static HumidityDataOptionsBuf toBuf(HumidityDataOptions dto) {
        return switch (dto) {
            case UNIDENTIFIED_HUMIDITY_DATA -> HumidityDataOptionsBuf.UNIDENTIFIED_HUMIDITY_DATA;
            case WITH_HUMIDITY_DATA -> HumidityDataOptionsBuf.WITH_HUMIDITY_DATA;
            case WITHOUT_HUMIDITY_DATA -> HumidityDataOptionsBuf.WITHOUT_HUMIDITY_DATA;
        };
    }

    private static MotionDataOptionsBuf toBuf(MotionDataOptions dto) {
        return switch (dto) {
            case UNIDENTIFIED_MOTION_DATA -> MotionDataOptionsBuf.UNIDENTIFIED_MOTION_DATA;
            case WITH_MOTION_DATA -> MotionDataOptionsBuf.WITH_MOTION_DATA;
            case WITHOUT_MOTION_DATA -> MotionDataOptionsBuf.WITHOUT_MOTION_DATA;
        };
    }

    private static VelocityDataOptionsBuf toBuf(VelocityDataOptions dto) {
        return switch (dto) {
            case UNIDENTIFIED_VELOCITY_DATA -> VelocityDataOptionsBuf.UNIDENTIFIED_VELOCITY_DATA;
            case WITH_VELOCITY_DATA -> VelocityDataOptionsBuf.WITH_VELOCITY_DATA;
            case WITHOUT_VELOCITY_DATA -> VelocityDataOptionsBuf.WITHOUT_VELOCITY_DATA;
        };
    }

    private static PressureDataOptionsBuf toBuf(PressureDataOptions dto) {
        return switch (dto) {
            case UNIDENTIFIED_PRESSURE_DATA -> PressureDataOptionsBuf.UNIDENTIFIED_PRESSURE_DATA;
            case WITH_PRESSURE_DATA -> PressureDataOptionsBuf.WITH_PRESSURE_DATA;
            case WITHOUT_PRESSURE_DATA -> PressureDataOptionsBuf.WITHOUT_PRESSURE_DATA;
        };
    }

    private static BatteryDataOptionsBuf toBuf(BatteryDataOptions dto) {
        return switch (dto) {
            case UNIDENTIFIED_BATTERY_DATA -> BatteryDataOptionsBuf.UNIDENTIFIED_BATTERY_DATA;
            case WITH_BATTERY_DATA -> BatteryDataOptionsBuf.WITH_BATTERY_DATA;
            case WITHOUT_BATTERY_DATA -> BatteryDataOptionsBuf.WITHOUT_BATTERY_DATA;
        };
    }

    private static SoilMoistureDataOptionsBuf toBuf(SoilMoistureDataOptions dto) {
        return switch (dto) {
            case UNIDENTIFIED_SOIL_MOISTURE_DATA -> SoilMoistureDataOptionsBuf.UNIDENTIFIED_SOIL_MOISTURE_DATA;
            case WITH_SOIL_MOISTURE_DATA -> SoilMoistureDataOptionsBuf.WITH_SOIL_MOISTURE_DATA;
            case WITHOUT_SOIL_MOISTURE_DATA -> SoilMoistureDataOptionsBuf.WITHOUT_SOIL_MOISTURE_DATA;
        };
    }

    private static IlluminanceDataOptionsBuf toBuf(IlluminanceDataOptions dto) {
        return switch (dto) {
            case UNIDENTIFIED_ILLUMINANCE_DATA -> IlluminanceDataOptionsBuf.UNIDENTIFIED_ILLUMINANCE_DATA;
            case WITH_ILLUMINANCE_DATA -> IlluminanceDataOptionsBuf.WITH_ILLUMINANCE_DATA;
            case WITHOUT_ILLUMINANCE_DATA -> IlluminanceDataOptionsBuf.WITHOUT_ILLUMINANCE_DATA;
        };
    }

    private static DomainOwnershipOptionsBuf toBuf(DomainOwnershipOptions dto) {
        return switch (dto) {
            case UNIDENTIFIED_DOMAIN_OWNERSHIP -> DomainOwnershipOptionsBuf.UNIDENTIFIED_DOMAIN_OWNERSHIP;
            case WITH_DOMAIN_OWNERSHIP -> DomainOwnershipOptionsBuf.WITH_DOMAIN_OWNERSHIP;
            case WITHOUT_DOMAIN_OWNERSHIP -> DomainOwnershipOptionsBuf.WITHOUT_DOMAIN_OWNERSHIP;
        };
    }

    private static AlarmDataOptionsBuf toBuf(AlarmDataOptions dto) {
        return switch (dto) {
            case UNIDENTIFIED_ALARM_DATA -> AlarmDataOptionsBuf.UNIDENTIFIED_ALARM_DATA;
            case WITH_ALARM_DATA -> AlarmDataOptionsBuf.WITH_ALARM_DATA;
            case WITHOUT_ALARM_DATA -> AlarmDataOptionsBuf.WITHOUT_ALARM_DATA;
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
}
