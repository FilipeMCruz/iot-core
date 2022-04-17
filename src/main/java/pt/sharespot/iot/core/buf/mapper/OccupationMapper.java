package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.Occupation;
import pt.sharespot.iot.core.sensor.data.types.OccupationDataDTO;

public class OccupationMapper {

    public static Occupation.Builder toBuf(OccupationDataDTO dto) {
        var builder = Occupation.newBuilder();
        if (dto.exists()) {
            builder.setPercentage(dto.percentage);
        }
        return builder;
    }

    public static OccupationDataDTO toModel(Occupation buf) {
        return OccupationDataDTO.of(buf.getPercentage());
    }
}
