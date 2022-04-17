package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.Velocity;
import pt.sharespot.iot.core.sensor.data.types.VelocityDataDTO;

public class VelocityMapper {

    public static Velocity.Builder toBuf(VelocityDataDTO dto) {
        var builder = Velocity.newBuilder();
        if (dto.exists()) {
            builder.setKilometersPerHour(dto.kilometerPerHour);
        }
        return builder;
    }

    public static VelocityDataDTO toModel(Velocity buf) {
        return VelocityDataDTO.of(buf.getKilometersPerHour());
    }
}
