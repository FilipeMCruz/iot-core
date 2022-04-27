package pt.sharespot.iot.core.buf.mapper.data;

import com.google.protobuf.FloatValue;
import pt.sharespot.iot.core.buf.model.AirPressure;
import pt.sharespot.iot.core.sensor.data.types.AirPressureDataDTO;

public class AirPressureMapper {

    public static AirPressure.Builder toBuf(AirPressureDataDTO dto) {
        var builder = AirPressure.newBuilder();
        if (dto.exists()) {
            builder.setHectoPascal(FloatValue.of(dto.hectoPascal));
        }
        return builder;
    }

    public static AirPressureDataDTO toModel(AirPressure buf) {
        return AirPressureDataDTO.of(buf.getHectoPascal().getValue());
    }
}
