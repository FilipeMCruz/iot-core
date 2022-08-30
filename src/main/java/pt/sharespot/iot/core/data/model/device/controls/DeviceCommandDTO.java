package pt.sharespot.iot.core.data.model.device.controls;

public class DeviceCommandDTO {

    public String id;

    public String name;

    public String payload;

    public Integer port;

    public DeviceCommandDTO() {
    }

    public DeviceCommandDTO(String id, String name, String payload, Integer port) {
        this.id = id;
        this.name = name;
        this.payload = payload;
        this.port = port;
    }
}
