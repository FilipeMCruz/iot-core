package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.Humidity;
import pt.sharespot.iot.core.sensor.data.HumidityDataDTO;

public class HumidityMapper {

    public static Humidity.Builder toBuf(HumidityDataDTO dto) {
        var builder = Humidity.newBuilder();
        if (dto.exists()) {
            builder.setGramsPerCubicMeter(dto.gramspercubicmeter);
        }
        return builder;
    }

    public static HumidityDataDTO toModel(Humidity buf) {
        return HumidityDataDTO.of(buf.getGramsPerCubicMeter());
    }
}
