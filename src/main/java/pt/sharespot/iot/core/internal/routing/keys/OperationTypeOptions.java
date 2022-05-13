package pt.sharespot.iot.core.internal.routing.keys;

import pt.sharespot.iot.core.keys.RoutingKey;
import pt.sharespot.iot.core.keys.RoutingKeyOption;

public enum OperationTypeOptions implements RoutingKey {
    REQUEST,
    INFO,
    PING;

    public String value() {
        return details();
    }

    public String details() {
        return this.toString().toLowerCase();
    }

    public static RoutingKeyOption<OperationTypeOptions> extract(String value) {

        if (value.equalsIgnoreCase(OperationTypeOptions.REQUEST.value())) {
            return RoutingKeyOption.of(OperationTypeOptions.REQUEST);
        }
        if (value.equalsIgnoreCase(OperationTypeOptions.INFO.value())) {
            return RoutingKeyOption.of(OperationTypeOptions.INFO);
        }
        if (value.equalsIgnoreCase(OperationTypeOptions.PING.value())) {
            return RoutingKeyOption.of(OperationTypeOptions.PING);
        }

        return RoutingKeyOption.any();
    }
}
