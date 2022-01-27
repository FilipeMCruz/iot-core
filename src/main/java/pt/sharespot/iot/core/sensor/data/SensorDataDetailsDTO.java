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
        var details = new SensorDataDetailsDTO();
        details.gps = gps;
        details.temperature = temperature;
        details.status = status;
        return details;
    }

    public SensorDataDetailsDTO withTemperature(TempCDataDTO temperature) {
        var details = new SensorDataDetailsDTO();
        details.gps = gps;
        details.temperature = temperature;
        details.status = status;
        return details;
    }

    public SensorDataDetailsDTO withStatus(StatusDataDTO status) {
        var details = new SensorDataDetailsDTO();
        details.gps = gps;
        details.temperature = temperature;
        details.status = status;
        return details;
    }
}
