package pt.sharespot.iot.core.data.model.data.types;

public class O3DataDTO implements DataTypeDTO {

    public Float ppm;

    public static O3DataDTO of(Float ppm) {
        var dataDTO = new O3DataDTO();
        dataDTO.ppm = ppm;
        return dataDTO;
    }

    @Override
    public boolean exists() {
        return ppm != null;
    }
}
