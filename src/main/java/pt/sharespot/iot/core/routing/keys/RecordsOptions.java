package pt.sharespot.iot.core.routing.keys;

public enum RecordsOptions {
    UNIDENTIFIED_RECORDS,
    WITH_RECORDS,
    WITHOUT_RECORDS;

    public String value() {
        return this.name().toLowerCase();
    }
}
