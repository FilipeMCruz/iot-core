package pt.sharespot.iot.core.sensor.model.device.records;

public class DeviceRecordEntryDTO {
    public String label;
    public String content;

    public DeviceRecordEntryDTO(String label, String content) {
        this.label = label;
        this.content = content;
    }

    public DeviceRecordEntryDTO() {

    }
}
