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

    public boolean hasProperty(PropertyName property) {
        return switch (property) {
            case LATITUDE, LONGITUDE -> gps != null && gps.exists();
            case TEMPERATURE -> temperature != null && temperature.exists();
            case VELOCITY -> velocity != null && velocity.exists();
            case HUMIDITY -> humidity != null && humidity.exists();
            case PRESSURE -> pressure != null && pressure.exists();
            case MOTION -> motion != null && motion.exists();
            case AQI -> aqi != null && aqi.exists();
            default -> false;
        };
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
