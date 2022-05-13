package pt.sharespot.iot.core.sensor.model.data.types;

public class SoilMoistureDataDTO implements DataTypeDTO {

    public Float relativePercentage;

    public static SoilMoistureDataDTO of(Float percentage) {
        var dataDTO = new SoilMoistureDataDTO();
        dataDTO.relativePercentage = percentage;
        return dataDTO;
    }

    @Override
    public boolean exists() {
        return relativePercentage != null;
    }
}
