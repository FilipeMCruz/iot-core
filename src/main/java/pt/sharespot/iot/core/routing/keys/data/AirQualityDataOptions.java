package pt.sharespot.iot.core.routing.keys.data;

public enum AirQualityDataOptions {
    UNIDENTIFIED_AQI_DATA,
    WITH_AQI_DATA,
    WITHOUT_AQI_DATA;

    public String value() {
        return this.name().toLowerCase();
    }
}
