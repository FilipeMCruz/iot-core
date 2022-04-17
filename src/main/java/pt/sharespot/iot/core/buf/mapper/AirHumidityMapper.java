package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.AirHumidity;
import pt.sharespot.iot.core.sensor.data.types.AirHumidityDataDTO;

public class AirHumidityMapper {

    public static AirHumidity.Builder toBuf(AirHumidityDataDTO dto) {
        var builder = AirHumidity.newBuilder();
        if (dto.exists()) {
            builder.setGramsPerCubicMeter(dto.gramsPerCubicMeter)
                    .setRelativePercentage(dto.relativePercentage);
        }
        return builder;
    }

    public static AirHumidityDataDTO toModel(AirHumidity buf) {
        return AirHumidityDataDTO.ofGramsPerCubicMeter(buf.getGramsPerCubicMeter())
                .andGramsPerCubicMeter(buf.getGramsPerCubicMeter());
    }
}
