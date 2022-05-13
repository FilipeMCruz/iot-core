package pt.sharespot.iot.core.sensor.mapper.data;

import com.google.protobuf.FloatValue;
import pt.sharespot.iot.core.sensor.model.data.types.VelocityDataDTO;
import pt.sharespot.iot.core.sensor.buf.Velocity;

public class VelocityMapper {

    public static Velocity.Builder toBuf(VelocityDataDTO dto) {
        var builder = Velocity.newBuilder();
        if (dto.exists()) {
            builder.setKilometersPerHour(FloatValue.of(dto.kilometersPerHour));
        }
        return builder;
    }

    public static VelocityDataDTO toModel(Velocity buf) {
        return VelocityDataDTO.of(buf.getKilometersPerHour().getValue());
    }
}
