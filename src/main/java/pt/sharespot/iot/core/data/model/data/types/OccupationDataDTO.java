package pt.sharespot.iot.core.data.model.data.types;

public class OccupationDataDTO implements DataTypeDTO {

    public Float percentage;

    public static OccupationDataDTO of(Float percentage) {
        var dataDTO = new OccupationDataDTO();
        dataDTO.percentage = percentage;
        return dataDTO;
    }

    @Override
    public boolean exists() {
        return percentage != null;
    }
}
