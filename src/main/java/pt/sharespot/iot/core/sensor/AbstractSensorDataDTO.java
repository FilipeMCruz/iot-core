package pt.sharespot.iot.core.sensor;

import pt.sharespot.iot.core.sensor.data.SensorDataDetailsDTO;
import pt.sharespot.iot.core.sensor.properties.PropertyName;

import java.util.Arrays;
import java.util.UUID;

public abstract class AbstractSensorDataDTO implements SensorDataDTO {

    public UUID dataId;

    public Long reportedAt;

    public SensorDataDetailsDTO data;

    public AbstractSensorDataDTO(UUID dataId,
                                 Long reportedAt,
                                 SensorDataDetailsDTO data) {
        this.dataId = dataId;
        this.reportedAt = reportedAt;
        this.data = data;
    }

    public AbstractSensorDataDTO() {
    }

    @Override
    public UUID dataId() {
        return dataId;
    }

    @Override
    public boolean hasProperties(PropertyName... properties) {
        return Arrays.stream(properties).allMatch(this::hasProperty);
    }
}
