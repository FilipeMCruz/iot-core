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
}
