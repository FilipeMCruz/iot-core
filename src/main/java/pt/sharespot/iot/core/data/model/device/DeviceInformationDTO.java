package pt.sharespot.iot.core.data.model.device;

import pt.sharespot.iot.core.data.model.device.controls.DeviceCommandDTO;
import pt.sharespot.iot.core.data.model.device.records.DeviceRecordEntryDTO;
import pt.sharespot.iot.core.data.model.properties.PropertyName;

import java.util.*;

public class DeviceInformationDTO {

    public UUID id;

    public String name;

    public String downlink;

    public Set<DeviceRecordEntryDTO> records;

    public Set<UUID> domains;
    public Map<Integer, List<DeviceCommandDTO>> commands = new HashMap<>();

    public DeviceInformationDTO() {
    }

    public DeviceInformationDTO(UUID id,
                                String name,
                                String downlink,
                                Set<DeviceRecordEntryDTO> records,
                                Set<UUID> domains,
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
            case DOMAIN_OWNERSHIP -> domains != null;
            case DEVICE_DOWNLINK -> downlink != null;
            case DEVICE_COMMANDS ->
                    commands != null && !commands.isEmpty() && commands.get(0) != null && !commands.get(0).isEmpty();
            default -> false;
        };
    }
}
