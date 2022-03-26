package pt.sharespot.iot.core.sensor.data;

public class IlluminanceDataDTO implements DataTypeDTO {

    public Double lux;

    public static IlluminanceDataDTO of(Double lux) {
        var dataDTO = new IlluminanceDataDTO();
        dataDTO.lux = lux;
        return dataDTO;
    }

    @Override
    public boolean exists() {
        return lux != null && lux.isNaN();
    }
}
