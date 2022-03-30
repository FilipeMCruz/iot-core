package pt.sharespot.iot.core.sensor.data;

public class VelocityDataDTO implements DataTypeDTO {

    public Float kmperh;

    public static VelocityDataDTO of(Float velocity) {
        var dataDTO = new VelocityDataDTO();
        dataDTO.kmperh = velocity;
        return dataDTO;
    }

    @Override
    public boolean exists() {
        return kmperh != null;
    }
}
