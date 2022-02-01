package pt.sharespot.iot.core.sensor.data;

public class PressureDataDTO implements DataTypeDTO {

    public Double value;

    public static PressureDataDTO of(Double pressure) {
        var dataDTO = new PressureDataDTO();
        dataDTO.value = pressure;
        return dataDTO;
    }

    @Override
    public boolean exists() {
        return value != null && value.isNaN();
    }
}
