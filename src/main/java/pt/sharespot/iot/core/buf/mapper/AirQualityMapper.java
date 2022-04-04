package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.AirQuality;
import pt.sharespot.iot.core.sensor.data.AirQualityDataDTO;

public class AirQualityMapper {

    public static AirQuality.Builder toBuf(AirQualityDataDTO dto) {
        var builder = AirQuality.newBuilder();
        if (dto.exists()) {
            builder.setEaqi(dto.eaqi);
        }
        return builder;
    }

    public static AirQualityDataDTO toModel(AirQuality buf) {
        return AirQualityDataDTO.of(buf.getEaqi());
    }
}
