package pt.sharespot.iot.core.buf.mapper.data;

import com.google.protobuf.FloatValue;
import pt.sharespot.iot.core.buf.model.Illuminance;
import pt.sharespot.iot.core.sensor.data.types.IlluminanceDataDTO;

public class IlluminanceMapper {

    public static Illuminance.Builder toBuf(IlluminanceDataDTO dto) {
        var builder = Illuminance.newBuilder();
        if (dto.exists()) {
            builder.setLux(FloatValue.of(dto.lux));
        }
        return builder;
    }

    public static IlluminanceDataDTO toModel(Illuminance buf) {
        return IlluminanceDataDTO.of(buf.getLux().getValue());
    }
}
