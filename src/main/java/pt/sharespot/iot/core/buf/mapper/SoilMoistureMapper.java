package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.SoilMoisture;
import pt.sharespot.iot.core.sensor.data.SoilMoistureDataDTO;

public class SoilMoistureMapper {

    public static SoilMoisture.Builder toBuf(SoilMoistureDataDTO dto) {
        return SoilMoisture.newBuilder()
                .setPercentage(dto.percentage);
    }
}
