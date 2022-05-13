package pt.sharespot.iot.core.sensor.model;

import pt.sharespot.iot.core.sensor.model.data.SensorDataDetailsDTO;
import pt.sharespot.iot.core.sensor.model.device.controls.DeviceCommandDTO;
import pt.sharespot.iot.core.sensor.model.properties.PropertyName;

import java.util.List;
import java.util.UUID;

public interface SensorDataDTO {
    UUID dataId();

    SensorDataDetailsDTO getSensorData();

    boolean hasProperty(PropertyName property);

    boolean hasProperty(Integer subSensorId, PropertyName property);

    boolean hasAllProperties(PropertyName... properties);

    boolean hasAnyProperties(PropertyName... properties);

    boolean hasAllProperties(Integer subSensorId, PropertyName... properties);

    boolean hasAnyProperties(Integer subSensorId, PropertyName... properties);

    List<DeviceCommandDTO> getSensorCommands();
}
