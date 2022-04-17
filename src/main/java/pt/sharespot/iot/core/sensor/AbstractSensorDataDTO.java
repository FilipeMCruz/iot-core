package pt.sharespot.iot.core.sensor;

import pt.sharespot.iot.core.sensor.data.SensorDataDetailsDTO;
import pt.sharespot.iot.core.sensor.properties.PropertyName;

import java.util.Arrays;
import java.util.Map;
import java.util.UUID;

public abstract class AbstractSensorDataDTO implements SensorDataDTO {

    public UUID dataId;

    public Long reportedAt;

    public Map<Integer, SensorDataDetailsDTO> measures;

    public AbstractSensorDataDTO(UUID dataId,
                                 Long reportedAt,
                                 Map<Integer, SensorDataDetailsDTO> measures) {
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
}
