package pt.sharespot.iot.core.sensor.mapper.data;

import com.google.protobuf.FloatValue;
import pt.sharespot.iot.core.sensor.model.data.types.SoilMoistureDataDTO;
import pt.sharespot.iot.core.sensor.buf.SoilMoisture;

public class SoilMoistureMapper {

    public static SoilMoisture.Builder toBuf(SoilMoistureDataDTO dto) {
        var builder = SoilMoisture.newBuilder();
        if (dto.exists()) {
            builder.setRelativePercentage(FloatValue.of(dto.relativePercentage));
        }
        return builder;
    }

    public static SoilMoistureDataDTO toModel(SoilMoisture buf) {
        return SoilMoistureDataDTO.of(buf.getRelativePercentage().getValue());
    }
}
