package pt.sharespot.iot.core.routing.keys;

public enum TempCDataOptions {
    WITH_TEMPC_DATA,
    WITHOUT_TEMPC_DATA;

    public String value() {
        return this.name().toLowerCase();
    }
}
