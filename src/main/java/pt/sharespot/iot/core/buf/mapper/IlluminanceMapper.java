package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.Illuminance;
import pt.sharespot.iot.core.sensor.data.IlluminanceDataDTO;

public class IlluminanceMapper {

    public static Illuminance.Builder toBuf(IlluminanceDataDTO dto) {
        return Illuminance.newBuilder()
                .setLux(dto.lux);
    }
}
