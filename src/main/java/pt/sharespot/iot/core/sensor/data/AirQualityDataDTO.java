package pt.sharespot.iot.core.sensor.data;

public class AirQualityDataDTO implements DataTypeDTO {

    public Float value;

    public static AirQualityDataDTO of(Float aqi) {
        var dataDTO = new AirQualityDataDTO();
        dataDTO.value = aqi;
        return dataDTO;
    }

    @Override
    public boolean exists() {
        return value != null;
    }
}
