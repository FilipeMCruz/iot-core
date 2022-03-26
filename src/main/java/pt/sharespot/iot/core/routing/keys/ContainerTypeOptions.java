package pt.sharespot.iot.core.routing.keys;

public enum ContainerTypeOptions {
    DATA_GATEWAY,
    DATA_PROCESSOR,
    DATA_DECODER,
    DATA_VALIDATOR,
    DATA_STORE,
    IDENTITY_MANAGEMENT,
    DEVICE_RECORDS,
    FLEET_MANAGEMENT,
    SMART_IRRIGATION,
    OTHER;

    public String value() {
        return switch (this) {
            case DATA_DECODER -> "decod";
            case DATA_GATEWAY -> "gatew";
            case DATA_PROCESSOR -> "proce";
            case DATA_VALIDATOR -> "valid";
            case DATA_STORE -> "store";
            case DEVICE_RECORDS -> "recor";
            case FLEET_MANAGEMENT -> "fleet";
            case IDENTITY_MANAGEMENT -> "idman";
            case SMART_IRRIGATION -> "irrig";
            case OTHER -> "other";
        };
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
        } else if (value.equalsIgnoreCase("recor")) {
            return ContainerTypeOptions.DEVICE_RECORDS.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("fleet")) {
            return ContainerTypeOptions.FLEET_MANAGEMENT.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("idman")) {
            return ContainerTypeOptions.IDENTITY_MANAGEMENT.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("irrig")) {
            return ContainerTypeOptions.SMART_IRRIGATION.toString().toLowerCase();
        } else if (value.equalsIgnoreCase("other")) {
            return ContainerTypeOptions.OTHER.toString().toLowerCase();
        } else {
            return "*";
        }
    }
}
