package pt.sharespot.iot.core.sensor.data;

public class DistanceDataDTO implements DataTypeDTO {
    public Float millimeters;

    public Float maxMillimeters;

    public Float minMillimeters;

    public static DistanceDataDTO of(Float millimeters) {
        var dataDTO = new DistanceDataDTO();
        dataDTO.millimeters = millimeters;
        return dataDTO;
    }

    public DistanceDataDTO with(Float maxMillimeters, Float minMillimeters) {
        var dataDTO = new DistanceDataDTO();
        dataDTO.maxMillimeters = maxMillimeters;
        dataDTO.minMillimeters = minMillimeters;
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
