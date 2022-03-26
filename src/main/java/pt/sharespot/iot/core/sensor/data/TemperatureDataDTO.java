package pt.sharespot.iot.core.sensor.data;

public class TemperatureDataDTO implements DataTypeDTO {

    public Double celsius;

    public static TemperatureDataDTO of(Double celsius) {
        var tempCDataDTO = new TemperatureDataDTO();
        tempCDataDTO.celsius = celsius;
        return tempCDataDTO;
    }

    @Override
    public boolean exists() {
        return celsius != null;
    }
}
