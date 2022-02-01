package pt.sharespot.iot.core.sensor.data;

public class HumidityDataDTO implements DataTypeDTO {

    public Double value;

    public static HumidityDataDTO of(Double humidity) {
        var dataDTO = new HumidityDataDTO();
        dataDTO.value = humidity;
        return dataDTO;
    }

    @Override
    public boolean exists() {
        return value != null && value.isNaN();
    }
}
