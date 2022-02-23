package pt.sharespot.iot.core.sensor.device.domains;

import java.util.Set;
import java.util.UUID;

public class DeviceDomainPermissionsDTO {

    public Set<UUID> read;

    public Set<UUID> readWrite;

    public DeviceDomainPermissionsDTO() {
    }
}
