package pt.sharespot.iot.core.sensor;

import pt.sharespot.iot.core.sensor.data.SensorDataDetailsDTO;
import pt.sharespot.iot.core.sensor.device.DeviceInformationWithRecordsDTO;
import pt.sharespot.iot.core.sensor.properties.PropertyName;

import java.util.UUID;

public class ProcessedSensorDataWithRecordsDTO extends AbstractSensorDataDTO {

    public DeviceInformationWithRecordsDTO device;

    public ProcessedSensorDataWithRecordsDTO(UUID dataId,
                                             DeviceInformationWithRecordsDTO device,
                                             Long reportedAt,
                                             SensorDataDetailsDTO data) {
        super(dataId, reportedAt, data);
        this.device = device;
    }

    public ProcessedSensorDataWithRecordsDTO() {
    }

    @Override
    public boolean hasProperty(PropertyName property) {
        return switch (property) {
            case DATA_ID, REPORTED_AT -> true;
            case DEVICE_ID, DEVICE_NAME, DEVICE_RECORDS -> device.hasProperty(property);
            case LATITUDE, LONGITUDE, TEMPERATURE, MOTION -> data.hasProperty(property);
        };
    }
}
