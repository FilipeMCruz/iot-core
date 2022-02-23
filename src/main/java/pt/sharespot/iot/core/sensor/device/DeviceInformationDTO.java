package pt.sharespot.iot.core.sensor.device;

import pt.sharespot.iot.core.sensor.device.domains.DeviceDomainPermissionsDTO;
import pt.sharespot.iot.core.sensor.device.records.DeviceRecordDTO;
import pt.sharespot.iot.core.sensor.properties.PropertyName;

import java.util.UUID;

public class DeviceInformationDTO {

    public UUID id;

    public String name;

    public DeviceRecordDTO records;

    public DeviceDomainPermissionsDTO domains;

    public DeviceInformationDTO() {
    }

    public boolean hasProperty(PropertyName property) {
        return switch (property) {
            case DEVICE_ID -> id != null;
            case DEVICE_NAME -> name != null;
            case DEVICE_RECORDS -> records != null;
            case READ_PERMISSIONS -> domains != null && domains.read != null;
            case READ_WRITE_PERMISSIONS -> domains != null && domains.readWrite != null;
            default -> false;
        };
    }
}
