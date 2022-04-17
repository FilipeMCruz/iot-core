package pt.sharespot.iot.core.sensor.data.types;

public class WaterPressureDataDTO implements DataTypeDTO {

    public Float bar;

    public static WaterPressureDataDTO of(Float bar) {
        var dataDTO = new WaterPressureDataDTO();
        dataDTO.bar = bar;
        return dataDTO;
    }

    @Override
    public boolean exists() {
        return bar != null;
    }
}
