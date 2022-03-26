package pt.sharespot.iot.core.sensor.data;

public class AlarmDataDTO implements DataTypeDTO {

    public Boolean value;

    public static AlarmDataDTO of(Boolean value) {
        var dataDTO = new AlarmDataDTO();
        dataDTO.value = value;
        return dataDTO;
    }

    @Override
    public boolean exists() {
        return value != null;
    }
}
