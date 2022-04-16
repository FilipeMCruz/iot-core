package pt.sharespot.iot.core.sensor.data;

public class AirHumidityDataDTO implements DataTypeDTO {

    public Float gramsPerCubicMeter;

    public Float relativePercentage;

    public AirHumidityDataDTO andGramsPerCubicMeter(Float gramsPerCubicMeter) {
        this.gramsPerCubicMeter = gramsPerCubicMeter;
        return this;
    }

    public AirHumidityDataDTO andRelativePercentage(Float relativePercentage) {
        this.relativePercentage = relativePercentage;
        return this;
    }

    public static AirHumidityDataDTO ofGramsPerCubicMeter(Float gramsPerCubicMeter) {
        var dataDTO = new AirHumidityDataDTO();
        dataDTO.gramsPerCubicMeter = gramsPerCubicMeter;
        return dataDTO;
    }

    public static AirHumidityDataDTO ofRelativePercentage(Float relativePercentage) {
        var dataDTO = new AirHumidityDataDTO();
        dataDTO.relativePercentage = relativePercentage;
        return dataDTO;
    }

    @Override
    public boolean exists() {
        return gramsPerCubicMeter != null || relativePercentage != null;
    }

    public boolean existsRelativePercentage() {
        return relativePercentage != null;
    }

    public boolean existsGramsPerCubicMeter() {
        return gramsPerCubicMeter != null;
    }
}
