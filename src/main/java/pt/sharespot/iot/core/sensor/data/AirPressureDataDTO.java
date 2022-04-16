package pt.sharespot.iot.core.sensor.data;

public class AirPressureDataDTO implements DataTypeDTO {

    public Float hPa;

    public static AirPressureDataDTO of(Float pressure) {
        var dataDTO = new AirPressureDataDTO();
        dataDTO.hPa = pressure;
        return dataDTO;
    }

    @Override
    public boolean exists() {
        return hPa != null;
    }
}
