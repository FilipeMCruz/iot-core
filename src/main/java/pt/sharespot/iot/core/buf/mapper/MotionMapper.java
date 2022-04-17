package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.Motion;
import pt.sharespot.iot.core.buf.model.MotionType;
import pt.sharespot.iot.core.sensor.data.types.MotionDataDTO;

public class MotionMapper {

    public static Motion.Builder toBuf(MotionDataDTO dto) {
        var builder = Motion.newBuilder();
        if (dto.exists()) {
            var type = switch (dto.value) {
                case "ACTIVE" -> MotionType.ACTIVE;
                case "INACTIVE" -> MotionType.INACTIVE;
                default -> MotionType.UNKNOWN;
            };
            builder.setValue(type);
        }
        return builder;
    }

    public static MotionDataDTO toModel(Motion dto) {
        var type = switch (dto.getValue()) {
            case ACTIVE -> "ACTIVE";
            case INACTIVE -> "INACTIVE";
            default -> "UNKNOWN";
        };

        return MotionDataDTO.of(type);
    }
}
