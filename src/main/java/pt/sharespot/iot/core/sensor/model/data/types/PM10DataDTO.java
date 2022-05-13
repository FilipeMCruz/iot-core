package pt.sharespot.iot.core.sensor.model.data.types;

public class PM10DataDTO implements DataTypeDTO {

    public Float microGramsPerCubicMeter;

    public static PM10DataDTO of(Float microGramsPerCubicMeter) {
        var dataDTO = new PM10DataDTO();
        dataDTO.microGramsPerCubicMeter = microGramsPerCubicMeter;
        return dataDTO;
    }

    @Override
    public boolean exists() {
        return microGramsPerCubicMeter != null;
    }
}
