package pt.sharespot.iot.core.data.model.data.types;

public class VelocityDataDTO implements DataTypeDTO {

    public Float kilometersPerHour;

    public static VelocityDataDTO of(Float velocity) {
        var dataDTO = new VelocityDataDTO();
        dataDTO.kilometersPerHour = velocity;
        return dataDTO;
    }

    @Override
    public boolean exists() {
        return kilometersPerHour != null;
    }
}
