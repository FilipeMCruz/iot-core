package pt.sharespot.iot.core.sensor.device;

import pt.sharespot.iot.core.sensor.device.records.DeviceRecordDTO;
import pt.sharespot.iot.core.sensor.properties.PropertyName;

import java.util.UUID;

public class DeviceInformationWithRecordsDTO extends DeviceInformationDTO {

    public DeviceRecordDTO records;

    public DeviceInformationWithRecordsDTO(UUID id, String name, DeviceRecordDTO records) {
        super(id, name);
    }

    public DeviceInformationWithRecordsDTO() {
    }

    public boolean hasProperty(PropertyName property) {
        return switch (property) {
            case DEVICE_ID, DEVICE_NAME, DEVICE_RECORDS -> true;
            default -> false;
        };
    }
}
