package pt.sharespot.iot.core.data.mapper.data;

import com.google.protobuf.FloatValue;
import pt.sharespot.iot.core.data.buf.Occupation;
import pt.sharespot.iot.core.data.model.data.types.OccupationDataDTO;

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
