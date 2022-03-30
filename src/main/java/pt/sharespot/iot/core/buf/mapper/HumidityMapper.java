package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.Humidity;
import pt.sharespot.iot.core.sensor.data.HumidityDataDTO;

public class HumidityMapper {

    public static Humidity.Builder toBuf(HumidityDataDTO dto) {
        return Humidity.newBuilder()
                .setGramsPerCubicMeter(dto.gramspercubicmeter);
    }
}
