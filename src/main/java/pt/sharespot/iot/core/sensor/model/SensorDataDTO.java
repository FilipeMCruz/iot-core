package pt.sharespot.iot.core.sensor.model;

import pt.sharespot.iot.core.sensor.model.data.SensorDataDetailsDTO;
import pt.sharespot.iot.core.sensor.model.device.DeviceInformationDTO;
import pt.sharespot.iot.core.sensor.model.device.controls.DeviceCommandDTO;
import pt.sharespot.iot.core.sensor.model.properties.PropertyName;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class SensorDataDTO {

    public UUID dataId;

    public Long reportedAt;

    public Map<Integer, SensorDataDetailsDTO> measures;

    public DeviceInformationDTO device;

    public SensorDataDTO(UUID dataId,
                         DeviceInformationDTO device,
                         Long reportedAt,
                         Map<Integer, SensorDataDetailsDTO> measures) {
        this.dataId = dataId;
        this.reportedAt = reportedAt;
        this.measures = measures;
        this.device = device;
    }

    public SensorDataDTO() {
    }

    public boolean hasProperty(PropertyName property) {
        return hasPropertyInSubDevice(0, property);
    }

    public boolean hasPropertyInSubDevice(Integer subSensorId, PropertyName property) {
        return switch (property) {
            case DATA_ID, REPORTED_AT -> true;
            case DEVICE_ID, DEVICE_NAME, DEVICE_RECORDS, DEVICE_DOWNLINK, DEVICE_COMMANDS,
                    DOMAIN_OWNERSHIP -> device.hasProperty(property);
            case LATITUDE, LONGITUDE, TEMPERATURE, MOTION, ALTITUDE,
                    VELOCITY, AQI, AIR_HUMIDITY_RELATIVE_PERCENTAGE, DISTANCE,
                    MAX_DISTANCE, MIN_DISTANCE, AIR_HUMIDITY_GRAMS_PER_CUBIC_METER,
                    WATER_PRESSURE, PH, OCCUPATION, SOIL_CONDUCTIVITY, AIR_PRESSURE,
                    ILLUMINANCE, TRIGGER, BATTERY_MAX_VOLTS, BATTERY_MIN_VOLTS,
                    O3, CO2, CO, NH3, NO2, VOC, PM10, PM2_5,
                    BATTERY_PERCENTAGE, BATTERY_VOLTS, SOIL_MOISTURE ->
                    measures.get(subSensorId) != null && measures.get(subSensorId).hasProperty(property);
        };
    }

    public boolean hasAllProperties(PropertyName... properties) {
        return Arrays.stream(properties).allMatch(this::hasProperty);
    }

    public boolean hasAllPropertiesInSubDevice(Integer subSensorId, PropertyName... properties) {
        return Arrays.stream(properties).anyMatch(p -> this.hasPropertyInSubDevice(subSensorId, p));
    }

    public boolean hasAnyProperties(PropertyName... properties) {
        return Arrays.stream(properties).anyMatch(this::hasProperty);
    }

    public boolean hasAnyPropertiesInSubDevice(Integer subSensorId, PropertyName... properties) {
        return Arrays.stream(properties).anyMatch(p -> this.hasPropertyInSubDevice(subSensorId, p));
    }

    public List<DeviceCommandDTO> getSensorCommands() {
        if (device.commands.get(0) == null) {
            device.commands.put(0, List.of(new DeviceCommandDTO()));
        }
        return device.commands.get(0);
    }

    public SensorDataDetailsDTO getSensorData() {
        if (measures.get(0) == null) {
            measures.put(0, new SensorDataDetailsDTO());
        }
        return measures.get(0);
    }
}
