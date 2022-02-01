package pt.sharespot.iot.core.routing.keys.data;

public enum PressureDataOptions {
    UNIDENTIFIED_PRESSURE_DATA,
    WITH_PRESSURE_DATA,
    WITHOUT_PRESSURE_DATA;

    public String value() {
        return this.name().toLowerCase();
    }
}
