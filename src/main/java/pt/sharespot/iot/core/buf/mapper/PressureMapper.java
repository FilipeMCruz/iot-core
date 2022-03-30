package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.Pressure;
import pt.sharespot.iot.core.sensor.data.PressureDataDTO;

public class PressureMapper {

    public static Pressure.Builder toBuf(PressureDataDTO dto) {
        return Pressure.newBuilder()
                .setHPa(dto.hPa);
    }
}
