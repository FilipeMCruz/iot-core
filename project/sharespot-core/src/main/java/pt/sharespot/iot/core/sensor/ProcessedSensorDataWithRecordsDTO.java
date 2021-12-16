package pt.sharespot.iot.core.sensor;

import pt.sharespot.iot.core.sensor.data.SensorDataDetailsDTO;
import pt.sharespot.iot.core.sensor.device.DeviceInformationWithRecordsDTO;

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
}
