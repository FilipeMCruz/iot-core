package pt.sharespot.iot.core.data.model.data.types;

public class AirPressureDataDTO implements DataTypeDTO {

    public Float hectoPascal;

    public static AirPressureDataDTO of(Float pressure) {
        var dataDTO = new AirPressureDataDTO();
        dataDTO.hectoPascal = pressure;
        return dataDTO;
    }

    @Override
    public boolean exists() {
        return hectoPascal != null;
    }
}
