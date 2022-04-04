package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.Velocity;
import pt.sharespot.iot.core.sensor.data.VelocityDataDTO;

public class VelocityMapper {

    public static Velocity.Builder toBuf(VelocityDataDTO dto) {
        var builder = Velocity.newBuilder();
        if (dto.exists()) {
            builder.setKmPerHour(dto.kmperh);
        }
        return builder;
    }

    public static VelocityDataDTO toModel(Velocity buf) {
        return VelocityDataDTO.of(buf.getKmPerHour());
    }
}
