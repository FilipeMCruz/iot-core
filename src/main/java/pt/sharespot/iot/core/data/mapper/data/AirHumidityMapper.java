package pt.sharespot.iot.core.data.mapper.data;

import com.google.protobuf.FloatValue;
import pt.sharespot.iot.core.data.model.data.types.AirHumidityDataDTO;
import pt.sharespot.iot.core.data.buf.AirHumidity;

public class AirHumidityMapper {

    public static AirHumidity.Builder toBuf(AirHumidityDataDTO dto) {
        var builder = AirHumidity.newBuilder();

        if (dto.existsGramsPerCubicMeter()) builder.setGramsPerCubicMeter(FloatValue.of(dto.gramsPerCubicMeter));

        if (dto.existsRelativePercentage()) builder.setRelativePercentage(FloatValue.of(dto.relativePercentage));

        return builder;
    }

    public static AirHumidityDataDTO toModel(AirHumidity buf) {
        var model = new AirHumidityDataDTO();

        if (buf.hasGramsPerCubicMeter())
            model.andGramsPerCubicMeter(buf.getGramsPerCubicMeter().getValue());

        if (buf.hasRelativePercentage())
            model.andRelativePercentage(buf.getRelativePercentage().getValue());

        return model;
    }
}
