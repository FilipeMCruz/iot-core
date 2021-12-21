package pt.sharespot.iot.core.sensor.data;

public class GPSDataDTO implements DataTypeDTO {

    public Double latitude;
    public Double longitude;

    public GPSDataDTO(Double latitude, Double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public GPSDataDTO() {
    }

    @Override
    public boolean exists() {
        return latitude != null && longitude != null;
    }
}
