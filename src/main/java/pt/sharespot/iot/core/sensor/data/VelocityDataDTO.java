package pt.sharespot.iot.core.sensor.data;

public class VelocityDataDTO implements DataTypeDTO {

    public Double kmperh;

    public static VelocityDataDTO of(Double velocity) {
        var dataDTO = new VelocityDataDTO();
        dataDTO.kmperh = velocity;
        return dataDTO;
    }

    @Override
    public boolean exists() {
        return kmperh != null;
    }
}
