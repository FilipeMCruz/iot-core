package pt.sharespot.iot.core.buf.mapper;

import com.google.protobuf.FloatValue;
import pt.sharespot.iot.core.buf.model.NH3;
import pt.sharespot.iot.core.sensor.data.types.NH3DataDTO;

public class NH3Mapper {

    public static NH3.Builder toBuf(NH3DataDTO dto) {
        var builder = NH3.newBuilder();
        if (dto.exists()) {
            builder.setPpm(FloatValue.of(dto.ppm));
        }
        return builder;
    }

    public static NH3DataDTO toModel(NH3 buf) {
        return NH3DataDTO.of(buf.getPpm().getValue());
    }
}
