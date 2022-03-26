package pt.sharespot.iot.core.sensor.data;

public class AirQualityDataDTO implements DataTypeDTO {

    public Double eaqi;

    public static AirQualityDataDTO of(Double aqi) {
        var dataDTO = new AirQualityDataDTO();
        dataDTO.eaqi = aqi;
        return dataDTO;
    }

    @Override
    public boolean exists() {
        return eaqi != null && eaqi.isNaN();
    }
}
