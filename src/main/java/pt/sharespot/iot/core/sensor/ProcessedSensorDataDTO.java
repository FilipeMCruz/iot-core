package pt.sharespot.iot.core.sensor;

import pt.sharespot.iot.core.sensor.data.SensorDataDetailsDTO;
import pt.sharespot.iot.core.sensor.device.DeviceInformationDTO;
import pt.sharespot.iot.core.sensor.properties.PropertyName;

import java.util.Map;
import java.util.UUID;

public class ProcessedSensorDataDTO extends AbstractSensorDataDTO {

    public DeviceInformationDTO device;

    public ProcessedSensorDataDTO(UUID dataId,
                                  DeviceInformationDTO device,
                                  Long reportedAt,
                                  Map<Integer, SensorDataDetailsDTO> data) {
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
                    VELOCITY, AQI, AIR_HUMIDITY_RELATIVE_PERCENTAGE, DISTANCE,
                    MAX_DISTANCE, MIN_DISTANCE, AIR_HUMIDITY_GRAMS_PER_CUBIC_METER,
                    WATER_PRESSURE, PH, OCCUPATION, SOIL_CONDUCTIVITY, AIR_PRESSURE,
                    ILLUMINANCE, TRIGGER, BATTERY_MAX_VOLTS, BATTERY_MIN_VOLTS,
                    O3, CO2, CO, NH3, NO2, VOC, PM10, PM2_5,
                    BATTERY_PERCENTAGE, BATTERY_VOLTS, SOIL_MOISTURE ->
                    measures.get(0) != null && measures.get(0).hasProperty(property);
        };
    }
}
