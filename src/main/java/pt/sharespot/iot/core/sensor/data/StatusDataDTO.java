package pt.sharespot.iot.core.sensor.data;

import pt.sharespot.iot.core.sensor.properties.PropertyName;

public class StatusDataDTO {

    public String motion;

    public static StatusDataDTO withMotion(String motion) {
        var status = new StatusDataDTO();
        if ("ACTIVE".equalsIgnoreCase(motion)) {
            status.motion = "ACTIVE";
        } else if ("INACTIVE".equalsIgnoreCase(motion)) {
            status.motion = "INACTIVE";
        } else {
            status.motion = "UNKNOWN";
        }
        return status;
    }

    public boolean hasProperty(PropertyName property) {
        return switch (property) {
            case MOTION -> motion != null;
            default -> false;
        };
    }
}
