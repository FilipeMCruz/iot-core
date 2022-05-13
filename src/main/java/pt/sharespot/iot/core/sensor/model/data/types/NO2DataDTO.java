package pt.sharespot.iot.core.sensor.model.data.types;

public class NO2DataDTO implements DataTypeDTO {

    public Float ppm;

    public static NO2DataDTO of(Float ppm) {
        var dataDTO = new NO2DataDTO();
        dataDTO.ppm = ppm;
        return dataDTO;
    }

    @Override
    public boolean exists() {
        return ppm != null;
    }
}
