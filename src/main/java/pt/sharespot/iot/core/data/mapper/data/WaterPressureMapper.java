package pt.sharespot.iot.core.data.mapper.data;

import com.google.protobuf.FloatValue;
import pt.sharespot.iot.core.data.model.data.types.WaterPressureDataDTO;
import pt.sharespot.iot.core.data.buf.WaterPressure;

public class WaterPressureMapper {

    public static WaterPressure.Builder toBuf(WaterPressureDataDTO dto) {
        var builder = WaterPressure.newBuilder();
        if (dto.exists()) {
            builder.setBar(FloatValue.of(dto.bar));
        }
        return builder;
    }

    public static WaterPressureDataDTO toModel(WaterPressure buf) {
        return WaterPressureDataDTO.of(buf.getBar().getValue());
    }
}
