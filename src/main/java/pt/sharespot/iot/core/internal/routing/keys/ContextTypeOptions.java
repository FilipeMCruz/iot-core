package pt.sharespot.iot.core.internal.routing.keys;

import pt.sharespot.iot.core.keys.RoutingKey;
import pt.sharespot.iot.core.keys.RoutingKeyOption;

import java.util.Locale;

public enum ContextTypeOptions implements RoutingKey {

    DATA_PROCESSOR,

    DEVICE_MANAGEMENT,

    DATA_DECODER,

    DEVICE_IDENTITY,

    TENANT_IDENTITY,

    RULE_MANAGEMENT;

    public String value() {
        return details();
    }

    public String details() {
        return this.toString().toLowerCase();
    }

    public static RoutingKeyOption<ContextTypeOptions> extract(String value) {
        try {
            return RoutingKeyOption.of(ContextTypeOptions.valueOf(value.toUpperCase(Locale.ROOT)));
        } catch (IllegalArgumentException ex) {
            return RoutingKeyOption.any();
        }
    }
}
