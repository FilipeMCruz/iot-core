package pt.sharespot.iot.core.sensor.model;

import pt.sharespot.iot.core.sensor.model.data.SensorDataDetailsDTO;
import pt.sharespot.iot.core.sensor.model.properties.PropertyName;

import java.util.Arrays;
import java.util.Map;
import java.util.UUID;

public abstract class AbstractSensorDataDTO implements SensorDataDTO {

    public UUID dataId;

    public Long reportedAt;

    public Map<Integer, SensorDataDetailsDTO> measures;

    public AbstractSensorDataDTO(UUID dataId, Long reportedAt, Map<Integer, SensorDataDetailsDTO> measures) {
        this.dataId = dataId;
        this.reportedAt = reportedAt;
        this.measures = measures;
    }

    public AbstractSensorDataDTO() {
    }

    @Override
    public UUID dataId() {
        return dataId;
    }

    @Override
    public boolean hasAllProperties(PropertyName... properties) {
        return Arrays.stream(properties).allMatch(this::hasProperty);
    }

    @Override
    public boolean hasAnyProperties(PropertyName... properties) {
        return Arrays.stream(properties).anyMatch(this::hasProperty);
    }

    @Override
    public boolean hasAllProperties(Integer subSensorId, PropertyName... properties) {
        return Arrays.stream(properties).anyMatch(p -> this.hasProperty(subSensorId, p));
    }

    @Override
    public boolean hasAnyProperties(Integer subSensorId, PropertyName... properties) {
        return Arrays.stream(properties).anyMatch(p -> this.hasProperty(subSensorId, p));
    }

    @Override
    public SensorDataDetailsDTO getSensorData() {
        if (measures.get(0) == null) {
            measures.put(0, new SensorDataDetailsDTO());
        }
        return measures.get(0);
    }
}
