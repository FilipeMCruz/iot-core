package pt.sharespot.iot.core.sensor.data;

public class PressureDataDTO implements DataTypeDTO {

    public Double hPa;

    public static PressureDataDTO of(Double pressure) {
        var dataDTO = new PressureDataDTO();
        dataDTO.hPa = pressure;
        return dataDTO;
    }

    @Override
    public boolean exists() {
        return hPa != null && hPa.isNaN();
    }
}
