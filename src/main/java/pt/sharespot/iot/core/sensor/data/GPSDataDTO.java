package pt.sharespot.iot.core.sensor.data;

public class GPSDataDTO implements DataTypeDTO {

    public Double latitude;
    public Double longitude;
    public Float altitude;

    public static GPSDataDTO ofLatLong(Double latitude, Double longitude) {
        var gpsDataDTO = new GPSDataDTO();
        gpsDataDTO.latitude = latitude;
        gpsDataDTO.longitude = longitude;
        return gpsDataDTO;
    }

    public static GPSDataDTO ofLatLongAlt(Double latitude, Double longitude, Float altitude) {
        var gpsDataDTO = new GPSDataDTO();
        gpsDataDTO.latitude = latitude;
        gpsDataDTO.longitude = longitude;
        gpsDataDTO.altitude = altitude;
        return gpsDataDTO;
    }

    @Override
    public boolean exists() {
        return latitude != null && longitude != null;
    }

    public boolean existsAltitude() {
        return altitude != null;
    }
}
