package pt.sharespot.iot.core.sensor.mapper.data;

import com.google.protobuf.FloatValue;
import pt.sharespot.iot.core.sensor.buf.Occupation;
import pt.sharespot.iot.core.sensor.model.data.types.OccupationDataDTO;

public class OccupationMapper {

    public static Occupation.Builder toBuf(OccupationDataDTO dto) {
        var builder = Occupation.newBuilder();
        if (dto.exists()) {
            builder.setPercentage(FloatValue.of(dto.percentage));
        }
        return builder;
    }

    public static OccupationDataDTO toModel(Occupation buf) {
        return OccupationDataDTO.of(buf.getPercentage().getValue());
    }
}
