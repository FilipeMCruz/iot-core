package pt.sharespot.iot.core.keys;

public class ProtocolVersionOptions implements RoutingKey {

    public String version;

    public static ProtocolVersionOptions of(String type) {
        var alertCategoryOptions = new ProtocolVersionOptions();
        alertCategoryOptions.version = type;
        return alertCategoryOptions;
    }

    public static RoutingKeyOption<ProtocolVersionOptions> extract(String s) {
        return RoutingKeyOption.of(ProtocolVersionOptions.of(s));
    }

    @Override
    public String value() {
        return version;
    }

    @Override
    public String details() {
        return version;
    }
}
