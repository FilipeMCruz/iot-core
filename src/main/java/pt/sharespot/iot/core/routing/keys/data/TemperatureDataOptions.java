package pt.sharespot.iot.core.routing.keys.data;

public enum TemperatureDataOptions {
    UNIDENTIFIED_TEMPERATURE_DATA,
    WITH_TEMPERATURE_DATA,
    WITHOUT_TEMPERATURE_DATA;

    public String value() {
        return this.name().toLowerCase();
    }
}
