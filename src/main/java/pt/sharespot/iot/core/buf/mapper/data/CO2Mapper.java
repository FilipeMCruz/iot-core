package pt.sharespot.iot.core.buf.mapper.data;

import com.google.protobuf.FloatValue;
import pt.sharespot.iot.core.buf.model.CO2;
import pt.sharespot.iot.core.sensor.data.types.CO2DataDTO;

public class CO2Mapper {

    public static CO2.Builder toBuf(CO2DataDTO dto) {
        var builder = CO2.newBuilder();
        if (dto.exists()) {
            builder.setPpm(FloatValue.of(dto.ppm));
        }
        return builder;
    }

    public static CO2DataDTO toModel(CO2 buf) {
        return CO2DataDTO.of(buf.getPpm().getValue());
    }
}
