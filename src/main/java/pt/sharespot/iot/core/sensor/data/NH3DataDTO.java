package pt.sharespot.iot.core.sensor.data;

public class NH3DataDTO implements DataTypeDTO {

    public Float ppm;

    public static NH3DataDTO of(Float ppm) {
        var dataDTO = new NH3DataDTO();
        dataDTO.ppm = ppm;
        return dataDTO;
    }

    @Override
    public boolean exists() {
        return ppm != null;
    }
}
