package pt.sharespot.iot.core.sensor.device.records;

import java.util.Set;

public class DeviceRecordDTO {
    public Set<DeviceRecordBasicEntryDTO> entry;

    public DeviceRecordDTO(Set<DeviceRecordBasicEntryDTO> entry) {
        this.entry = entry;
    }

    public DeviceRecordDTO() {

    }
}
