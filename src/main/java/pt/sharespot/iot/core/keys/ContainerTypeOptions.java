package pt.sharespot.iot.core.keys;

public enum ContainerTypeOptions implements RoutingKey {
    DATA_GATEWAY,
    DATA_PROCESSOR,
    DATA_DECODER,
    DATA_VALIDATOR,
    DATA_STORE,
    IDENTITY_MANAGEMENT,
    DEVICE_MANAGEMENT,
    FLEET_MANAGEMENT,
    SMART_IRRIGATION,
    DEVICE_COMMANDER,

    ALERT_DISPATCHER,

    RULE_MANAGEMENT,

    NOTIFICATION_MANAGEMENT,

    OTHER;

    public String value() {
        return switch (this) {
            case DATA_DECODER -> "decod";
            case DATA_GATEWAY -> "gatew";
            case DATA_PROCESSOR -> "proce";
            case DATA_VALIDATOR -> "valid";
            case DATA_STORE -> "store";
            case DEVICE_MANAGEMENT -> "devic";
            case DEVICE_COMMANDER -> "comma";
            case FLEET_MANAGEMENT -> "fleet";
            case IDENTITY_MANAGEMENT -> "idman";
            case SMART_IRRIGATION -> "irrig";
            case ALERT_DISPATCHER -> "alert";
            case RULE_MANAGEMENT -> "rules";
            case NOTIFICATION_MANAGEMENT -> "notif";
            case OTHER -> "other";
        };
    }

    public String details() {
        return this.toString().toLowerCase();
    }

    public static String details(String value) {
        if (value.equalsIgnoreCase("decod")) {
            return ContainerTypeOptions.DATA_DECODER.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("gatew")) {
            return ContainerTypeOptions.DATA_GATEWAY.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("proce")) {
            return ContainerTypeOptions.DATA_PROCESSOR.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("valid")) {
            return ContainerTypeOptions.DATA_VALIDATOR.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("store")) {
            return ContainerTypeOptions.DATA_STORE.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("devic")) {
            return ContainerTypeOptions.DEVICE_MANAGEMENT.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("comma")) {
            return ContainerTypeOptions.DEVICE_COMMANDER.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("fleet")) {
            return ContainerTypeOptions.FLEET_MANAGEMENT.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("idman")) {
            return ContainerTypeOptions.IDENTITY_MANAGEMENT.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("irrig")) {
            return ContainerTypeOptions.SMART_IRRIGATION.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("alert")) {
            return ContainerTypeOptions.ALERT_DISPATCHER.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("rules")) {
            return ContainerTypeOptions.RULE_MANAGEMENT.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("notif")) {
            return ContainerTypeOptions.NOTIFICATION_MANAGEMENT.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("other")) {
            return ContainerTypeOptions.OTHER.toString().toLowerCase();
        } else {
            return "*";
        }
    }
}
