package pt.sharespot.iot.core.sensor.model.data.types;

public class TriggerDataDTO implements DataTypeDTO {

    public Boolean value;

    public static TriggerDataDTO of(Boolean value) {
        var dataDTO = new TriggerDataDTO();
        dataDTO.value = value;
        return dataDTO;
    }

    @Override
    public boolean exists() {
        return value != null;
    }
}
