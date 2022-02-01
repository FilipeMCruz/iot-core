package pt.sharespot.iot.core.sensor.data;

public class VelocityDataDTO implements DataTypeDTO {

    public Double value;

    public static VelocityDataDTO of(Double velocity) {
        var dataDTO = new VelocityDataDTO();
        dataDTO.value = velocity;
        return dataDTO;
    }

    @Override
    public boolean exists() {
        return value != null && value.isNaN();
    }
}
