package pt.sharespot.iot.core.routing.keys.data;

public enum VelocityDataOptions {
    UNIDENTIFIED_VELOCITY_DATA,
    WITH_VELOCITY_DATA,
    WITHOUT_VELOCITY_DATA;

    public String value() {
        return this.name().toLowerCase();
    }
}
