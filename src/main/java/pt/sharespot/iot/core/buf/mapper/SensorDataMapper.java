package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.Distance;
import pt.sharespot.iot.core.buf.model.SensorData;
import pt.sharespot.iot.core.sensor.data.SensorDataDetailsDTO;
import pt.sharespot.iot.core.sensor.properties.PropertyName;

public class SensorDataMapper {

    public static SensorData.Builder toBuf(SensorDataDetailsDTO dto) {
        var builder = SensorData.newBuilder();
        if (dto.hasProperty(PropertyName.AQI)) builder.setAqi(AirQualityMapper.toBuf(dto.aqi));

        if (dto.hasProperty(PropertyName.TRIGGER)) builder.setTrigger(TriggerMapper.toBuf(dto.trigger));

        if (dto.hasProperty(PropertyName.BATTERY_VOLTS) || dto.hasProperty(PropertyName.BATTERY_PERCENTAGE))
            builder.setBattery(BatteryMapper.toBuf(dto.battery));

        if (dto.hasProperty(PropertyName.LONGITUDE) || dto.hasProperty(PropertyName.LATITUDE) || dto.hasProperty(PropertyName.ALTITUDE))
            builder.setGps(GPSMapper.toBuf(dto.gps));

        if (dto.hasProperty(PropertyName.AIR_HUMIDITY_RELATIVE_PERCENTAGE) || dto.hasProperty(PropertyName.AIR_HUMIDITY_GRAMS_PER_CUBIC_METER))
            builder.setAirHumidity(AirHumidityMapper.toBuf(dto.airHumidity));

        if (dto.hasProperty(PropertyName.ILLUMINANCE))
            builder.setIlluminance(IlluminanceMapper.toBuf(dto.illuminance));

        if (dto.hasProperty(PropertyName.MOTION))
            builder.setMotion(MotionMapper.toBuf(dto.motion));

        if (dto.hasProperty(PropertyName.AIR_PRESSURE))
            builder.setAirPressure(AirPressureMapper.toBuf(dto.airPressure));

        if (dto.hasProperty(PropertyName.WATER_PRESSURE))
            builder.setWaterPressure(WaterPressureMapper.toBuf(dto.waterPressure));

        if (dto.hasProperty(PropertyName.SOIL_MOISTURE))
            builder.setSoilMoisture(SoilMoistureMapper.toBuf(dto.soilMoisture));

        if (dto.hasProperty(PropertyName.TEMPERATURE))
            builder.setTemperature(TemperatureMapper.toBuf(dto.temperature));

        if (dto.hasProperty(PropertyName.VELOCITY))
            builder.setVelocity(VelocityMapper.toBuf(dto.velocity));

        if (dto.hasProperty(PropertyName.PH))
            builder.setPh(PHMapper.toBuf(dto.ph));

        if (dto.hasProperty(PropertyName.DISTANCE))
            builder.setDistance(DistanceMapper.toBuf(dto.distance));

        return builder;
    }

    public static SensorDataDetailsDTO toModel(SensorData buf) {
        return new SensorDataDetailsDTO()
                .withAQI(AirQualityMapper.toModel(buf.getAqi()))
                .withAlarm(TriggerMapper.toModel(buf.getTrigger()))
                .withBattery(BatteryMapper.toModel(buf.getBattery()))
                .withGps(GPSMapper.toModel(buf.getGps()))
                .withHumidity(AirHumidityMapper.toModel(buf.getAirHumidity()))
                .withIlluminance(IlluminanceMapper.toModel(buf.getIlluminance()))
                .withMotion(MotionMapper.toModel(buf.getMotion()))
                .withPressure(AirPressureMapper.toModel(buf.getAirPressure()))
                .withSoilMoisture(SoilMoistureMapper.toModel(buf.getSoilMoisture()))
                .withTemperature(TemperatureMapper.toModel(buf.getTemperature()))
                .withVelocity(VelocityMapper.toModel(buf.getVelocity()))
                .withPh(PHMapper.toModel(buf.getPh()))
                .withDistance(DistanceMapper.toModel(buf.getDistance()))
                .withWaterPressure(WaterPressureMapper.toModel(buf.getWaterPressure()));
    }
}
