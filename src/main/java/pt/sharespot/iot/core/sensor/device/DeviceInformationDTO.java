package pt.sharespot.iot.core.sensor.device;

import pt.sharespot.iot.core.sensor.properties.PropertyName;

import java.util.UUID;

public class DeviceInformationDTO {

    public UUID id;

    public String name;

    public DeviceInformationDTO(UUID id, String name) {
        this.name = name;
        this.id = id;
    }

    public DeviceInformationDTO() {
    }

    public boolean hasProperty(PropertyName property) {
        return switch (property) {
            case DEVICE_ID, DEVICE_NAME -> true;
            default -> false;
        };
    }
}
