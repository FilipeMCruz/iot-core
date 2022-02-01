package pt.sharespot.iot.core.routing.keys.data;

public enum HumidityDataOptions {
    UNIDENTIFIED_HUMIDITY_DATA,
    WITH_HUMIDITY_DATA,
    WITHOUT_HUMIDITY_DATA;

    public String value() {
        return this.name().toLowerCase();
    }
}
