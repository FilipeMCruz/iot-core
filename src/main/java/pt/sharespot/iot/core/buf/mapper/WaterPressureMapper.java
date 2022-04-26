package pt.sharespot.iot.core.buf.mapper;

import com.google.protobuf.FloatValue;
import pt.sharespot.iot.core.buf.model.WaterPressure;
import pt.sharespot.iot.core.sensor.data.types.WaterPressureDataDTO;

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