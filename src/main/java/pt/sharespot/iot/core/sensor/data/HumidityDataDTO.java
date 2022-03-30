package pt.sharespot.iot.core.sensor.data;

public class HumidityDataDTO implements DataTypeDTO {

    public Float gramspercubicmeter;

    public static HumidityDataDTO of(Float humidity) {
        var dataDTO = new HumidityDataDTO();
        dataDTO.gramspercubicmeter = humidity;
        return dataDTO;
    }

    @Override
    public boolean exists() {
        return gramspercubicmeter != null;
    }
}
