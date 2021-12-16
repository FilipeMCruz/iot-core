package pt.sharespot.iot.core.sensor;

import pt.sharespot.iot.core.sensor.data.SensorDataDetailsDTO;
import pt.sharespot.iot.core.sensor.device.DeviceInformationDTO;

import java.util.UUID;

public class ProcessedSensorDataDTO extends AbstractSensorDataDTO {

    public DeviceInformationDTO device;

    public ProcessedSensorDataDTO(UUID dataId,
                                  DeviceInformationDTO device,
                                  Long reportedAt,
                                  SensorDataDetailsDTO data) {
        super(dataId, reportedAt, data);
        this.device = device;
    }

    public ProcessedSensorDataDTO() {
    }
}
