package pt.sharespot.iot.core.sensor.data;

public class PM2_5DataDTO implements DataTypeDTO {

    public Float microGramsPerCubicMeter;

    public static PM2_5DataDTO of(Float microGramsPerCubicMeter) {
        var dataDTO = new PM2_5DataDTO();
        dataDTO.microGramsPerCubicMeter = microGramsPerCubicMeter;
        return dataDTO;
    }

    @Override
    public boolean exists() {
        return microGramsPerCubicMeter != null;
    }
}
