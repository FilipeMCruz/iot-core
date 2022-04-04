package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.SensorData;
import pt.sharespot.iot.core.sensor.data.SensorDataDetailsDTO;

public class SensorDataMapper {

    public static SensorData.Builder toBuf(SensorDataDetailsDTO dto) {
        return SensorData.newBuilder()
                .setAqi(AirQualityMapper.toBuf(dto.aqi))
                .setAlarm(AlarmMapper.toBuf(dto.alarm))
                .setBattery(BatteryMapper.toBuf(dto.battery))
                .setGps(GPSMapper.toBuf(dto.gps))
                .setHumidity(HumidityMapper.toBuf(dto.humidity))
                .setIlluminance(IlluminanceMapper.toBuf(dto.illuminance))
                .setMotion(MotionMapper.toBuf(dto.motion))
                .setPressure(PressureMapper.toBuf(dto.pressure))
                .setMoisture(SoilMoistureMapper.toBuf(dto.moisture))
                .setTemperature(TemperatureMapper.toBuf(dto.temperature))
                .setVelocity(VelocityMapper.toBuf(dto.velocity));
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
