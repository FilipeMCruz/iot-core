package pt.sharespot.iot.core.sensor.model.data.types;

public class CO2DataDTO implements DataTypeDTO {

    public Float ppm;

    public static CO2DataDTO of(Float ppm) {
        var dataDTO = new CO2DataDTO();
        dataDTO.ppm = ppm;
        return dataDTO;
    }

    @Override
    public boolean exists() {
        return ppm != null;
    }
}
