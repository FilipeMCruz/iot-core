package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.AirHumidity;
import pt.sharespot.iot.core.sensor.data.AirHumidityDataDTO;

public class HumidityMapper {

    public static AirHumidity.Builder toBuf(AirHumidityDataDTO dto) {
        var builder = AirHumidity.newBuilder();
        if (dto.exists()) {
            builder.setGramsPerCubicMeter(dto.gramsPerCubicMeter);
        }
        return builder;
    }

    public static AirHumidityDataDTO toModel(AirHumidity buf) {
        return AirHumidityDataDTO.of(buf.getGramsPerCubicMeter());
    }
}
