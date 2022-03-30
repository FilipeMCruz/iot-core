package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.Velocity;
import pt.sharespot.iot.core.sensor.data.VelocityDataDTO;

public class VelocityMapper {

    public static Velocity.Builder toBuf(VelocityDataDTO dto) {
        return Velocity.newBuilder()
                .setKmPerHour(dto.kmperh);
    }
}
