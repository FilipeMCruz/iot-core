package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.SensorData;
import pt.sharespot.iot.core.sensor.data.SensorDataDetailsDTO;
import pt.sharespot.iot.core.sensor.properties.PropertyName;

public class SensorDataMapper {

    public static SensorData.Builder toBuf(SensorDataDetailsDTO dto) {
        var builder = SensorData.newBuilder();
        if (dto.hasProperty(PropertyName.AQI)) builder.setAqi(AirQualityMapper.toBuf(dto.aqi));

        if (dto.hasProperty(PropertyName.TRIGGER)) builder.setTrigger(AlarmMapper.toBuf(dto.trigger));

        if (dto.hasProperty(PropertyName.BATTERY_VOLTS) || dto.hasProperty(PropertyName.BATTERY_PERCENTAGE))
            builder.setBattery(BatteryMapper.toBuf(dto.battery));

        if (dto.hasProperty(PropertyName.LONGITUDE) || dto.hasProperty(PropertyName.LATITUDE) || dto.hasProperty(PropertyName.ALTITUDE))
            builder.setGps(GPSMapper.toBuf(dto.gps));

        if (dto.hasProperty(PropertyName.AIR_HUMIDITY))
            builder.setAirHumidity(HumidityMapper.toBuf(dto.airHumidity));

        if (dto.hasProperty(PropertyName.ILLUMINANCE))
            builder.setIlluminance(IlluminanceMapper.toBuf(dto.illuminance));

        if (dto.hasProperty(PropertyName.MOTION))
            builder.setMotion(MotionMapper.toBuf(dto.motion));

        if (dto.hasProperty(PropertyName.AIR_PRESSURE))
            builder.setAirPressure(PressureMapper.toBuf(dto.airPressure));

        if (dto.hasProperty(PropertyName.SOIL_MOISTURE))
            builder.setSoilMoisture(SoilMoistureMapper.toBuf(dto.soilMoisture));

        if (dto.hasProperty(PropertyName.TEMPERATURE))
            builder.setTemperature(TemperatureMapper.toBuf(dto.temperature));

        if (dto.hasProperty(PropertyName.VELOCITY))
            builder.setVelocity(VelocityMapper.toBuf(dto.velocity));

        return builder;
    }

    public static SensorDataDetailsDTO toModel(SensorData buf) {
        return new SensorDataDetailsDTO()
                .withAQI(AirQualityMapper.toModel(buf.getAqi()))
                .withAlarm(AlarmMapper.toModel(buf.getTrigger()))
                .withBattery(BatteryMapper.toModel(buf.getBattery()))
                .withGps(GPSMapper.toModel(buf.getGps()))
                .withHumidity(HumidityMapper.toModel(buf.getAirHumidity()))
                .withIlluminance(IlluminanceMapper.toModel(buf.getIlluminance()))
                .withMotion(MotionMapper.toModel(buf.getMotion()))
                .withPressure(PressureMapper.toModel(buf.getAirPressure()))
                .withSoilMoisture(SoilMoistureMapper.toModel(buf.getSoilMoisture()))
                .withTemperature(TemperatureMapper.toModel(buf.getTemperature()))
                .withVelocity(VelocityMapper.toModel(buf.getVelocity()));
    }
}
