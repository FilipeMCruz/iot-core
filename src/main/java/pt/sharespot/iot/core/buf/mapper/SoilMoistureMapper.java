package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.SoilMoisture;
import pt.sharespot.iot.core.sensor.data.SoilMoistureDataDTO;

public class SoilMoistureMapper {

    public static SoilMoisture.Builder toBuf(SoilMoistureDataDTO dto) {
        var builder = SoilMoisture.newBuilder();
        if (dto.exists()) {
            builder.setRelativePercentage(dto.relativePercentage);
        }
        return builder;
    }

    public static SoilMoistureDataDTO toModel(SoilMoisture buf) {
        return SoilMoistureDataDTO.of(buf.getRelativePercentage());
    }
}
