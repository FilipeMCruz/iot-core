package pt.sharespot.iot.core.internal.routing.keys;

import pt.sharespot.iot.core.keys.RoutingKey;
import pt.sharespot.iot.core.keys.RoutingKeyOption;

import java.util.Locale;

public enum OperationTypeOptions implements RoutingKey {
    
    SYNC,
    
    INFO,

    UNKNOWN,
    
    INIT,
    
    PING;

    public String value() {
        return details();
    }

    public String details() {
        return this.toString().toLowerCase();
    }

    public static RoutingKeyOption<OperationTypeOptions> extract(String value) {
        try {
            return RoutingKeyOption.of(OperationTypeOptions.valueOf(value.toUpperCase(Locale.ROOT)));
        } catch (IllegalArgumentException ex) {
            return RoutingKeyOption.any();
        }
    }
}
