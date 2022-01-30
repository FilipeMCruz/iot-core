package pt.sharespot.iot.core.sensor.data;

public class TempCDataDTO implements DataTypeDTO {

    public Double celsius;

    public static TempCDataDTO fromCelcius(Double celsius) {
        var tempCDataDTO = new TempCDataDTO();
        tempCDataDTO.celsius = celsius;
        return tempCDataDTO;
    }

    @Override
    public boolean exists() {
        return celsius != null && celsius.isNaN();
    }
}
