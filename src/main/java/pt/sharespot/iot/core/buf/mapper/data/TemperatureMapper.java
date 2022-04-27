package pt.sharespot.iot.core.buf.mapper.data;

import com.google.protobuf.FloatValue;
import pt.sharespot.iot.core.buf.model.Temperature;
import pt.sharespot.iot.core.sensor.data.types.TemperatureDataDTO;

public class TemperatureMapper {

    public static Temperature.Builder toBuf(TemperatureDataDTO dto) {
        var builder = Temperature.newBuilder();
        if (dto.exists()) {
            builder.setCelsius(FloatValue.of(dto.celsius));
        }
        return builder;
    }

    public static TemperatureDataDTO toModel(Temperature buf) {
        return TemperatureDataDTO.of(buf.getCelsius().getValue());
    }
}
