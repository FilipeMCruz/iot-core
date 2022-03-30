package pt.sharespot.iot.core.sensor.data;

public class GPSDataDTO implements DataTypeDTO {

    public Float latitude;
    public Float longitude;
    public Float altitude;

    public static GPSDataDTO ofLatLong(Float latitude, Float longitude) {
        var gpsDataDTO = new GPSDataDTO();
        gpsDataDTO.latitude = latitude;
        gpsDataDTO.longitude = longitude;
        return gpsDataDTO;
    }

    public static GPSDataDTO ofLatLongAlt(Float latitude, Float longitude, Float altitude) {
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
