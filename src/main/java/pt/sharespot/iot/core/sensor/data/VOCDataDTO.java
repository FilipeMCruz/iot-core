package pt.sharespot.iot.core.sensor.data;

public class VOCDataDTO implements DataTypeDTO {

    public Float ppm;

    public static VOCDataDTO of(Float ppm) {
        var dataDTO = new VOCDataDTO();
        dataDTO.ppm = ppm;
        return dataDTO;
    }

    @Override
    public boolean exists() {
        return ppm != null;
    }
}
