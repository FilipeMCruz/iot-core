package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.Temperature;
import pt.sharespot.iot.core.sensor.data.TemperatureDataDTO;

public class TemperatureMapper {

    public static Temperature.Builder toBuf(TemperatureDataDTO dto) {
        return Temperature.newBuilder()
                .setCelsius(dto.celsius);
    }

    public static TemperatureDataDTO toModel(Temperature buf) {
        return TemperatureDataDTO.of(buf.getCelsius());
    }
}
