package pt.sharespot.iot.core.buf.mapper.data;

import com.google.protobuf.FloatValue;
import pt.sharespot.iot.core.buf.model.NO2;
import pt.sharespot.iot.core.sensor.data.types.NO2DataDTO;

public class NO2Mapper {

    public static NO2.Builder toBuf(NO2DataDTO dto) {
        var builder = NO2.newBuilder();
        if (dto.exists()) {
            builder.setPpm(FloatValue.of(dto.ppm));
        }
        return builder;
    }

    public static NO2DataDTO toModel(NO2 buf) {
        return NO2DataDTO.of(buf.getPpm().getValue());
    }
}
