package pt.sharespot.iot.core.sensor.data;

public class PressureDataDTO implements DataTypeDTO {

    public Float hPa;

    public static PressureDataDTO of(Float pressure) {
        var dataDTO = new PressureDataDTO();
        dataDTO.hPa = pressure;
        return dataDTO;
    }

    @Override
    public boolean exists() {
        return hPa != null;
    }
}
