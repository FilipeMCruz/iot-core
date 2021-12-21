package pt.sharespot.iot.core.sensor;

import pt.sharespot.iot.core.sensor.properties.PropertyName;

import java.util.UUID;

public interface SensorDataDTO {
    UUID dataId();

    boolean hasProperty(PropertyName property);

    boolean hasProperties(PropertyName... properties);
}
