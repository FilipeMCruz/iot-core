package pt.sharespot.iot.core.internal.routing.keys;

import pt.sharespot.iot.core.keys.RoutingKey;
import pt.sharespot.iot.core.keys.RoutingKeyOption;

public enum ContextTypeOptions implements RoutingKey {
    DATA_PROCESSOR,
    DEVICE_MANAGEMENT,
    DATA_DECODER,
    DEVICE_IDENTITY,
    
    RULE_MANAGEMENT;

    public String value() {
        return details();
    }

    public String details() {
        return this.toString().toLowerCase();
    }

    public static RoutingKeyOption<ContextTypeOptions> extract(String value) {

        if (value.equalsIgnoreCase(ContextTypeOptions.DATA_PROCESSOR.value())) {
            return RoutingKeyOption.of(ContextTypeOptions.DATA_PROCESSOR);
        }
        if (value.equalsIgnoreCase(ContextTypeOptions.DEVICE_MANAGEMENT.value())) {
            return RoutingKeyOption.of(ContextTypeOptions.DEVICE_MANAGEMENT);
        }
        if (value.equalsIgnoreCase(ContextTypeOptions.DATA_DECODER.value())) {
            return RoutingKeyOption.of(ContextTypeOptions.DATA_DECODER);
        }
        if (value.equalsIgnoreCase(ContextTypeOptions.RULE_MANAGEMENT.value())) {
            return RoutingKeyOption.of(ContextTypeOptions.RULE_MANAGEMENT);
        }
        if (value.equalsIgnoreCase(ContextTypeOptions.DEVICE_IDENTITY.value())) {
            return RoutingKeyOption.of(ContextTypeOptions.DEVICE_IDENTITY);
        }

        return RoutingKeyOption.any();
    }
}
