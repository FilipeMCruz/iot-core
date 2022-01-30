package pt.sharespot.iot.core.sensor.data;

public class GPSDataDTO implements DataTypeDTO {

    public Double latitude;
    public Double longitude;

    public static GPSDataDTO fromLatLong(Double latitude, Double longitude) {
        var gpsDataDTO = new GPSDataDTO();
        gpsDataDTO.latitude = latitude;
        gpsDataDTO.longitude = longitude;
        return gpsDataDTO;
    }

    @Override
    public boolean exists() {
        return latitude != null && longitude != null;
    }
}
