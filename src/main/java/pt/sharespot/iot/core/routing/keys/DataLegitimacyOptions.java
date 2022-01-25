package pt.sharespot.iot.core.routing.keys;

public enum DataLegitimacyOptions {

    UNKNOWN,
    CORRECT,
    INCORRECT,
    UNDETERMINED;

    public String value() {
        return this.name().toLowerCase();
    }
}
