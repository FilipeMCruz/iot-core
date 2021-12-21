package pt.sharespot.iot.core.routing.keys;

public enum InfoTypeOptions {
    ENCODED,
    DECODED,
    PROCESSED;

    public String value() {
        return this.name().toLowerCase();
    }
}
