package pt.sharespot.iot.core.sensor.data.types;

public class MotionDataDTO implements DataTypeDTO {

    public String value;

    public static MotionDataDTO of(String motion) {
        var status = new MotionDataDTO();
        if ("ACTIVE".equalsIgnoreCase(motion)) {
            status.value = "ACTIVE";
        } else if ("INACTIVE".equalsIgnoreCase(motion)) {
            status.value = "INACTIVE";
        } else {
            status.value = "UNKNOWN";
        }
        return status;
    }


    @Override
    public boolean exists() {
        return value != null && (value.equalsIgnoreCase("INACTIVE") || value.equalsIgnoreCase("ACTIVE"));
    }
}
