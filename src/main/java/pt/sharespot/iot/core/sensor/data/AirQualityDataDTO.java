package pt.sharespot.iot.core.sensor.data;

public class AirQualityDataDTO implements DataTypeDTO {

    public Float eaqi;

    public static AirQualityDataDTO of(Float aqi) {
        var dataDTO = new AirQualityDataDTO();
        dataDTO.eaqi = aqi;
        return dataDTO;
    }

    @Override
    public boolean exists() {
        return eaqi != null;
    }
}
