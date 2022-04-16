package pt.sharespot.iot.core.sensor.data;

public class AirHumidityDataDTO implements DataTypeDTO {

    public Float gramsPerCubicMeter;

    public static AirHumidityDataDTO of(Float humidity) {
        var dataDTO = new AirHumidityDataDTO();
        dataDTO.gramsPerCubicMeter = humidity;
        return dataDTO;
    }

    @Override
    public boolean exists() {
        return gramsPerCubicMeter != null;
    }
}
