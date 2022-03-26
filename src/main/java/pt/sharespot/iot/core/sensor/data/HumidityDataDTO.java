package pt.sharespot.iot.core.sensor.data;

public class HumidityDataDTO implements DataTypeDTO {

    public Double gramspercubicmeter;

    public static HumidityDataDTO of(Double humidity) {
        var dataDTO = new HumidityDataDTO();
        dataDTO.gramspercubicmeter = humidity;
        return dataDTO;
    }

    @Override
    public boolean exists() {
        return gramspercubicmeter != null && gramspercubicmeter.isNaN();
    }
}
