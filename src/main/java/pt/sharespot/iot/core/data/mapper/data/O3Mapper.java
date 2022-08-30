package pt.sharespot.iot.core.data.mapper.data;

import com.google.protobuf.FloatValue;
import pt.sharespot.iot.core.data.buf.O3;
import pt.sharespot.iot.core.data.model.data.types.O3DataDTO;

public class O3Mapper {

    public static O3.Builder toBuf(O3DataDTO dto) {
        var builder = O3.newBuilder();
        if (dto.exists()) {
            builder.setPpm(FloatValue.of(dto.ppm));
        }
        return builder;
    }

    public static O3DataDTO toModel(O3 buf) {
        return O3DataDTO.of(buf.getPpm().getValue());
    }
}
