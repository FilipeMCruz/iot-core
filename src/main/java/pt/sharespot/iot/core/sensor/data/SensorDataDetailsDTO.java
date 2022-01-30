package pt.sharespot.iot.core.sensor.data;

import pt.sharespot.iot.core.sensor.properties.PropertyName;

public class SensorDataDetailsDTO {
    public GPSDataDTO gps;

    public TempCDataDTO temperature;

    public StatusDataDTO status;

    public boolean hasProperty(PropertyName property) {
        return switch (property) {
            case TEMPERATURE -> temperature != null && temperature.exists();
            case LATITUDE, LONGITUDE -> gps != null && gps.exists();
            case MOTION -> status != null && status.hasProperty(property);
            default -> false;
        };
    }

    public SensorDataDetailsDTO withGps(GPSDataDTO gps) {
        this.gps = gps;
        return this;
    }

    public SensorDataDetailsDTO withTemperature(TempCDataDTO temperature) {
        this.temperature = temperature;
        return this;
    }

    public SensorDataDetailsDTO withStatus(StatusDataDTO status) {
        this.status = status;
        return this;
    }
}
