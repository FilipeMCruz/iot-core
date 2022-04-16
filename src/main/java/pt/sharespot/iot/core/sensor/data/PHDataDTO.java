package pt.sharespot.iot.core.sensor.data;

public class PHDataDTO implements DataTypeDTO {

    public Float value;

    public static PHDataDTO of(Float ph) {
        var dataDTO = new PHDataDTO();
        dataDTO.value = ph;
        return dataDTO;
    }

    @Override
    public boolean exists() {
        return value != null;
    }
}
