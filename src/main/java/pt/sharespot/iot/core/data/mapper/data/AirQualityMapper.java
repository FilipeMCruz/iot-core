package pt.sharespot.iot.core.data.mapper.data;

import com.google.protobuf.FloatValue;
import pt.sharespot.iot.core.data.buf.AirQuality;
import pt.sharespot.iot.core.data.model.data.types.AirQualityDataDTO;

public class AirQualityMapper {

    public static AirQuality.Builder toBuf(AirQualityDataDTO dto) {
        var builder = AirQuality.newBuilder();
        if (dto.exists()) {
            builder.setValue(FloatValue.of(dto.value));
        }
        return builder;
    }

    public static AirQualityDataDTO toModel(AirQuality buf) {
        return AirQualityDataDTO.of(buf.getValue().getValue());
    }
}
