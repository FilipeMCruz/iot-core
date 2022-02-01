package pt.sharespot.iot.core.sensor.data;

public class AirQualityDataDTO implements DataTypeDTO {

    public Double value;

    public static AirQualityDataDTO of(Double aqi) {
        var dataDTO = new AirQualityDataDTO();
        dataDTO.value = aqi;
        return dataDTO;
    }

    @Override
    public boolean exists() {
        return value != null && value.isNaN();
    }
}
