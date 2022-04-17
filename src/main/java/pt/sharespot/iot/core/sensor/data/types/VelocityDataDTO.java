package pt.sharespot.iot.core.sensor.data.types;

public class VelocityDataDTO implements DataTypeDTO {

    public Float kilometerPerHour;

    public static VelocityDataDTO of(Float velocity) {
        var dataDTO = new VelocityDataDTO();
        dataDTO.kilometerPerHour = velocity;
        return dataDTO;
    }

    @Override
    public boolean exists() {
        return kilometerPerHour != null;
    }
}
