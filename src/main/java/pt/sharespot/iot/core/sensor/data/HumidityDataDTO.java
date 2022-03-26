package pt.sharespot.iot.core.sensor.data;

public class HumidityDataDTO implements DataTypeDTO {

    public Double percentage;

    public static HumidityDataDTO of(Double humidity) {
        var dataDTO = new HumidityDataDTO();
        dataDTO.percentage = humidity;
        return dataDTO;
    }

    @Override
    public boolean exists() {
        return percentage != null && percentage.isNaN();
    }
}
