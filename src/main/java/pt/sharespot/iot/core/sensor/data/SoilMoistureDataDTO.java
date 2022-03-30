package pt.sharespot.iot.core.sensor.data;

public class SoilMoistureDataDTO implements DataTypeDTO {

    public Float percentage;

    public static SoilMoistureDataDTO of(Float percentage) {
        var dataDTO = new SoilMoistureDataDTO();
        dataDTO.percentage = percentage;
        return dataDTO;
    }

    @Override
    public boolean exists() {
        return percentage != null;
    }
}
