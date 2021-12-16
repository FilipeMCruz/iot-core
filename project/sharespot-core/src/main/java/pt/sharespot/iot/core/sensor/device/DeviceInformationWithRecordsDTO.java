package pt.sharespot.iot.core.sensor.device;

import pt.sharespot.iot.core.sensor.device.records.DeviceRecordDTO;

import java.util.UUID;

public class DeviceInformationWithRecordsDTO extends DeviceInformationDTO {

    public DeviceRecordDTO records;

    public DeviceInformationWithRecordsDTO(UUID id, String name, DeviceRecordDTO records) {
        super(id, name);
    }

    public DeviceInformationWithRecordsDTO() {
    }
}
