package pt.sharespot.iot.core.sensor.data;

public class CODataDTO implements DataTypeDTO {

    public Float ppm;

    public static CODataDTO of(Float ppm) {
        var dataDTO = new CODataDTO();
        dataDTO.ppm = ppm;
        return dataDTO;
    }

    @Override
    public boolean exists() {
        return ppm != null;
    }
}
