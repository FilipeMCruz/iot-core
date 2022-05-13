package pt.sharespot.iot.core.sensor.model.data.types;

public class TemperatureDataDTO implements DataTypeDTO {

    public Float celsius;

    public static TemperatureDataDTO of(Float celsius) {
        var tempCDataDTO = new TemperatureDataDTO();
        tempCDataDTO.celsius = celsius;
        return tempCDataDTO;
    }

    @Override
    public boolean exists() {
        return celsius != null;
    }
}