package pt.sharespot.iot.core.sensor;

import pt.sharespot.iot.core.sensor.data.SensorDataDetailsDTO;
import pt.sharespot.iot.core.sensor.device.DeviceInformationDTO;
import pt.sharespot.iot.core.sensor.properties.PropertyName;

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

    @Override
    public boolean hasProperty(PropertyName property) {
        return switch (property) {
            case DATA_ID, REPORTED_AT -> true;
            case DEVICE_ID, DEVICE_NAME, DEVICE_RECORDS,
                    READ_PERMISSIONS, READ_WRITE_PERMISSIONS -> device.hasProperty(property);
            case LATITUDE, LONGITUDE, TEMPERATURE, MOTION, ALTITUDE,
                    VELOCITY, AQI, HUMIDITY, PRESSURE, ILLUMINANCE, ALARM,
                    BATTERY_PERCENTAGE, BATTERY_VOLTS, SOIL_MOISTURE -> data.hasProperty(property);
        };
    }
}
