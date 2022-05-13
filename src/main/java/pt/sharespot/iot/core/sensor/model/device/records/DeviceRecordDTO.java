package pt.sharespot.iot.core.sensor.model.device.records;

import java.util.Set;

public class DeviceRecordDTO {
    public Set<DeviceRecordBasicEntryDTO> entry;

    public DeviceRecordDTO(Set<DeviceRecordBasicEntryDTO> entry) {
        this.entry = entry;
    }

    public DeviceRecordDTO() {

    }
}
