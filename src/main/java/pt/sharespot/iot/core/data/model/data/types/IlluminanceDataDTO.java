package pt.sharespot.iot.core.data.model.data.types;

public class IlluminanceDataDTO implements DataTypeDTO {

    public Float lux;

    public static IlluminanceDataDTO of(Float lux) {
        var dataDTO = new IlluminanceDataDTO();
        dataDTO.lux = lux;
        return dataDTO;
    }

    @Override
    public boolean exists() {
        return lux != null;
    }
}
