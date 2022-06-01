package pt.sharespot.iot.core.keys;

public class ExchangeOptions implements RoutingKey {

    public String name;

    public static ExchangeOptions of(String type) {
        var alertCategoryOptions = new ExchangeOptions();
        alertCategoryOptions.name = type;
        return alertCategoryOptions;
    }

    public static RoutingKeyOption<ExchangeOptions> extract(String s) {
        return RoutingKeyOption.of(ExchangeOptions.of(s));
    }

    @Override
    public String value() {
        return name;
    }

    @Override
    public String details() {
        return name;
    }
}
