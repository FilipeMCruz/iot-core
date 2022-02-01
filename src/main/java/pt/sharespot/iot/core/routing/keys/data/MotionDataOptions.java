package pt.sharespot.iot.core.routing.keys.data;

public enum MotionDataOptions {
    UNIDENTIFIED_MOTION_DATA,
    WITH_MOTION_DATA,
    WITHOUT_MOTION_DATA;

    public String value() {
        return this.name().toLowerCase();
    }
}
