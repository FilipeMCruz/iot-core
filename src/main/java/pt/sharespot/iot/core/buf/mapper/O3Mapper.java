package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.O3;
import pt.sharespot.iot.core.sensor.data.types.O3DataDTO;

public class O3Mapper {

    public static O3.Builder toBuf(O3DataDTO dto) {
        var builder = O3.newBuilder();
        if (dto.exists()) {
            builder.setPpm(dto.ppm);
        }
        return builder;
    }

    public static O3DataDTO toModel(O3 buf) {
        return O3DataDTO.of(buf.getPpm());
    }
}
