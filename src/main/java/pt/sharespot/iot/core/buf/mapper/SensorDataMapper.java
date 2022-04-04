package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.SensorData;
import pt.sharespot.iot.core.sensor.data.SensorDataDetailsDTO;
import pt.sharespot.iot.core.sensor.properties.PropertyName;

public class SensorDataMapper {

    public static SensorData.Builder toBuf(SensorDataDetailsDTO dto) {
        var builder = SensorData.newBuilder();
        if (dto.hasProperty(PropertyName.AQI)) builder.setAqi(AirQualityMapper.toBuf(dto.aqi));

        if (dto.hasProperty(PropertyName.ALARM)) builder.setAlarm(AlarmMapper.toBuf(dto.alarm));

        if (dto.hasProperty(PropertyName.BATTERY_VOLTS) || dto.hasProperty(PropertyName.BATTERY_PERCENTAGE))
            builder.setBattery(BatteryMapper.toBuf(dto.battery));

        if (dto.hasProperty(PropertyName.LONGITUDE) || dto.hasProperty(PropertyName.LATITUDE) || dto.hasProperty(PropertyName.ALTITUDE))
            builder.setGps(GPSMapper.toBuf(dto.gps));

        if (dto.hasProperty(PropertyName.HUMIDITY))
            builder.setHumidity(HumidityMapper.toBuf(dto.humidity));

        if (dto.hasProperty(PropertyName.ILLUMINANCE))
            builder.setIlluminance(IlluminanceMapper.toBuf(dto.illuminance));

        if (dto.hasProperty(PropertyName.MOTION))
            builder.setMotion(MotionMapper.toBuf(dto.motion));

        if (dto.hasProperty(PropertyName.PRESSURE))
            builder.setPressure(PressureMapper.toBuf(dto.pressure));

        if (dto.hasProperty(PropertyName.SOIL_MOISTURE))
            builder.setMoisture(SoilMoistureMapper.toBuf(dto.moisture));

        if (dto.hasProperty(PropertyName.TEMPERATURE))
            builder.setTemperature(TemperatureMapper.toBuf(dto.temperature));

        if (dto.hasProperty(PropertyName.VELOCITY))
            builder.setVelocity(VelocityMapper.toBuf(dto.velocity));

        return builder;
    }

    public static SensorDataDetailsDTO toModel(SensorData buf) {
        return new SensorDataDetailsDTO()
                .withAQI(AirQualityMapper.toModel(buf.getAqi()))
                .withAlarm(AlarmMapper.toModel(buf.getAlarm()))
                .withBattery(BatteryMapper.toModel(buf.getBattery()))
                .withGps(GPSMapper.toModel(buf.getGps()))
                .withHumidity(HumidityMapper.toModel(buf.getHumidity()))
                .withIlluminance(IlluminanceMapper.toModel(buf.getIlluminance()))
                .withMotion(MotionMapper.toModel(buf.getMotion()))
                .withPressure(PressureMapper.toModel(buf.getPressure()))
                .withSoilMoisture(SoilMoistureMapper.toModel(buf.getMoisture()))
                .withTemperature(TemperatureMapper.toModel(buf.getTemperature()))
                .withVelocity(VelocityMapper.toModel(buf.getVelocity()));
    }
}
