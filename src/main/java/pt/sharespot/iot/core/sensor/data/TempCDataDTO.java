package pt.sharespot.iot.core.sensor.data;

public class TempCDataDTO implements DataTypeDTO {

    public Double celsius;

    public TempCDataDTO(Double celsius) {
        this.celsius = celsius;
    }

    public TempCDataDTO() {
    }

    @Override
    public boolean exists() {
        return celsius != null && celsius.isNaN();
    }
}
