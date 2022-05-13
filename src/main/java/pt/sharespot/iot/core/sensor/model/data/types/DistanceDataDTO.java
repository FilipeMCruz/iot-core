package pt.sharespot.iot.core.sensor.model.data.types;

public class DistanceDataDTO implements DataTypeDTO {
    public Float millimeters;

    public Float maxMillimeters;

    public Float minMillimeters;

    public DistanceDataDTO with(Float maxMillimeters, Float minMillimeters) {
        this.maxMillimeters = maxMillimeters;
        this.minMillimeters = minMillimeters;
        return this;
    }

    public static DistanceDataDTO of(Float millimeters) {
        var dataDTO = new DistanceDataDTO();
        dataDTO.millimeters = millimeters;
        return dataDTO;
    }

    @Override
    public boolean exists() {
        return millimeters != null;
    }

    public boolean existsMinDistance() {
        return maxMillimeters != null;

    }

    public boolean existsMaxDistance() {
        return minMillimeters != null;
    }
}
