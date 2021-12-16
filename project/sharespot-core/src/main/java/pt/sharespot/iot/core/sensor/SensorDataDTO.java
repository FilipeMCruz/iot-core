package pt.sharespot.iot.core.sensor;

import java.util.UUID;

public interface SensorDataDTO {
    UUID dataId();
    
    boolean hasGpsData();
    
    boolean hasTempCData();
}
