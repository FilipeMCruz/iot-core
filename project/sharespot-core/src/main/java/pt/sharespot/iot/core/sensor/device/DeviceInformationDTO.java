package pt.sharespot.iot.core.sensor.device;

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
}
