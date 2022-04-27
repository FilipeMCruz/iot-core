package pt.sharespot.iot.core.sensor.device;

import pt.sharespot.iot.core.sensor.device.controls.DeviceCommandDTO;
import pt.sharespot.iot.core.sensor.device.domains.DeviceDomainPermissionsDTO;
import pt.sharespot.iot.core.sensor.device.records.DeviceRecordDTO;
import pt.sharespot.iot.core.sensor.properties.PropertyName;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class DeviceInformationDTO {

    public UUID id;

    public String name;

    public String downlink;

    public DeviceRecordDTO records;

    public DeviceDomainPermissionsDTO domains;
    public Map<Integer, List<DeviceCommandDTO>> commands = new HashMap<>();

    public DeviceInformationDTO() {
    }

    public DeviceInformationDTO(UUID id,
                                String name,
                                String downlink,
                                DeviceRecordDTO records,
                                DeviceDomainPermissionsDTO domains,
                                Map<Integer, List<DeviceCommandDTO>> commands) {
        this.id = id;
        this.name = name;
        this.downlink = downlink;
        this.records = records;
        this.domains = domains;
        this.commands = commands;
    }

    public boolean hasProperty(PropertyName property) {
        return switch (property) {
            case DEVICE_ID -> id != null;
            case DEVICE_NAME -> name != null;
            case DEVICE_RECORDS -> records != null;
            case READ_PERMISSIONS -> domains != null && domains.read != null;
            case READ_WRITE_PERMISSIONS -> domains != null && domains.readWrite != null;
            case DEVICE_DOWNLINK -> downlink != null;
            case DEVICE_COMMANDS ->
                    commands != null && !commands.isEmpty() && commands.get(0) != null && !commands.get(0).isEmpty();
            default -> false;
        };
    }
}
