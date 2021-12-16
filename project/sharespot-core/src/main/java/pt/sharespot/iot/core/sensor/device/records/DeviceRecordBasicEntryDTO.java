package pt.sharespot.iot.core.sensor.device.records;

public class DeviceRecordBasicEntryDTO {
    public String label;
    public String content;

    public DeviceRecordBasicEntryDTO(String label, String content) {
        this.label = label;
        this.content = content;
    }

    public DeviceRecordBasicEntryDTO() {

    }
}
