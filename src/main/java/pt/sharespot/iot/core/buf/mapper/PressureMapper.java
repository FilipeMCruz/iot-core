package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.Pressure;
import pt.sharespot.iot.core.sensor.data.PressureDataDTO;

public class PressureMapper {

    public static Pressure.Builder toBuf(PressureDataDTO dto) {
        var builder = Pressure.newBuilder();
        if (dto.exists()) {
            builder.setHPa(dto.hPa);
        }
        return builder;
    }

    public static PressureDataDTO toModel(Pressure buf) {
        return PressureDataDTO.of(buf.getHPa());
    }
}
