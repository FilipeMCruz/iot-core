package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.Motion;
import pt.sharespot.iot.core.buf.model.MotionType;
import pt.sharespot.iot.core.sensor.data.MotionDataDTO;

public class MotionMapper {

    public static Motion.Builder toBuf(MotionDataDTO dto) {
        var type = switch (dto.value) {
            case "ACTIVE" -> MotionType.ACTIVE;
            case "INACTIVE" -> MotionType.INACTIVE;
            default -> MotionType.UNKNOWN;
        };

        return Motion.newBuilder()
                .setValue(type);
    }
}
