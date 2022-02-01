package pt.sharespot.iot.core.routing.keys.data;

public enum GPSDataOptions {
    UNIDENTIFIED_GPS_DATA,
    WITH_GPS_DATA,
    WITHOUT_GPS_DATA;

    public String value() {
        return this.name().toLowerCase();
    }
}
