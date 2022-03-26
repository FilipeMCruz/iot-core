package pt.sharespot.iot.core.sensor.data;

import pt.sharespot.iot.core.sensor.properties.PropertyName;

public class SensorDataDetailsDTO {

    public GPSDataDTO gps;

    public TemperatureDataDTO temperature;

    public MotionDataDTO motion;

    public AirQualityDataDTO aqi;

    public VelocityDataDTO velocity;

    public HumidityDataDTO humidity;

    public PressureDataDTO pressure;

    public BatteryDataDTO battery;

    public SoilMoistureDataDTO moisture;

    public IlluminanceDataDTO illuminance;

    public AlarmDataDTO alarm;

    public boolean hasProperty(PropertyName property) {
        return switch (property) {
            case ALTITUDE -> gps != null && gps.existsAltitude();
            case LATITUDE, LONGITUDE -> gps != null && gps.exists();
            case TEMPERATURE -> temperature != null && temperature.exists();
            case VELOCITY -> velocity != null && velocity.exists();
            case HUMIDITY -> humidity != null && humidity.exists();
            case PRESSURE -> pressure != null && pressure.exists();
            case MOTION -> motion != null && motion.exists();
            case AQI -> aqi != null && aqi.exists();
            case BATTERY_PERCENTAGE -> battery != null && battery.existsPercentage();
            case BATTERY_VOLTS -> battery != null && battery.existsVolts();
            case SOIL_MOISTURE -> moisture != null && moisture.exists();
            case ILLUMINANCE -> illuminance != null && illuminance.exists();
            default -> false;
        };
    }

    public SensorDataDetailsDTO withBattery(BatteryDataDTO battery) {
        this.battery = battery;
        return this;
    }

    public SensorDataDetailsDTO withAlarm(AlarmDataDTO alarm) {
        this.alarm = alarm;
        return this;
    }

    public SensorDataDetailsDTO withIlluminance(IlluminanceDataDTO illuminance) {
        this.illuminance = illuminance;
        return this;
    }

    public SensorDataDetailsDTO withSoilMoisture(SoilMoistureDataDTO moisture) {
        this.moisture = moisture;
        return this;
    }

    public SensorDataDetailsDTO withGps(GPSDataDTO gps) {
        this.gps = gps;
        return this;
    }

    public SensorDataDetailsDTO withTemperature(TemperatureDataDTO temperature) {
        this.temperature = temperature;
        return this;
    }

    public SensorDataDetailsDTO withMotion(MotionDataDTO motion) {
        this.motion = motion;
        return this;
    }

    public SensorDataDetailsDTO withAQI(AirQualityDataDTO aqi) {
        this.aqi = aqi;
        return this;
    }

    public SensorDataDetailsDTO withVelocity(VelocityDataDTO velocity) {
        this.velocity = velocity;
        return this;
    }

    public SensorDataDetailsDTO withHumidity(HumidityDataDTO humidity) {
        this.humidity = humidity;
        return this;
    }

    public SensorDataDetailsDTO withPressure(PressureDataDTO pressure) {
        this.pressure = pressure;
        return this;
    }
}
