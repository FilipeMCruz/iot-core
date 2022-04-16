package pt.sharespot.iot.core.sensor.data;

import pt.sharespot.iot.core.sensor.properties.PropertyName;

public class SensorDataDetailsDTO {

    public GPSDataDTO gps;

    public TemperatureDataDTO temperature;

    public MotionDataDTO motion;

    public AirQualityDataDTO aqi;

    public VelocityDataDTO velocity;

    public AirHumidityDataDTO airHumidity;

    public AirPressureDataDTO airPressure;

    public BatteryDataDTO battery;

    public SoilMoistureDataDTO soilMoisture;

    public IlluminanceDataDTO illuminance;

    public TriggerDataDTO trigger;

    public boolean hasProperty(PropertyName property) {
        return switch (property) {
            case ALTITUDE -> gps != null && gps.existsAltitude();
            case LATITUDE, LONGITUDE -> gps != null && gps.exists();
            case TEMPERATURE -> temperature != null && temperature.exists();
            case VELOCITY -> velocity != null && velocity.exists();
            case AIR_HUMIDITY_RELATIVE_PERCENTAGE -> airHumidity != null && airHumidity.existsRelativePercentage();
            case AIR_HUMIDITY_GRAMS_PER_CUBIC_METER -> airHumidity != null && airHumidity.existsGramsPerCubicMeter();
            case AIR_PRESSURE -> airPressure != null && airPressure.exists();
            case MOTION -> motion != null && motion.exists();
            case AQI -> aqi != null && aqi.exists();
            case BATTERY_PERCENTAGE -> battery != null && battery.existsPercentage();
            case BATTERY_VOLTS -> battery != null && battery.existsVolts();
            case SOIL_MOISTURE -> soilMoisture != null && soilMoisture.exists();
            case ILLUMINANCE -> illuminance != null && illuminance.exists();
            default -> false;
        };
    }

    public SensorDataDetailsDTO withBattery(BatteryDataDTO battery) {
        this.battery = battery;
        return this;
    }

    public SensorDataDetailsDTO withAlarm(TriggerDataDTO alarm) {
        this.trigger = alarm;
        return this;
    }

    public SensorDataDetailsDTO withIlluminance(IlluminanceDataDTO illuminance) {
        this.illuminance = illuminance;
        return this;
    }

    public SensorDataDetailsDTO withSoilMoisture(SoilMoistureDataDTO moisture) {
        this.soilMoisture = moisture;
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

    public SensorDataDetailsDTO withHumidity(AirHumidityDataDTO humidity) {
        this.airHumidity = humidity;
        return this;
    }

    public SensorDataDetailsDTO withPressure(AirPressureDataDTO pressure) {
        this.airPressure = pressure;
        return this;
    }
}
