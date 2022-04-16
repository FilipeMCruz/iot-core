package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.AirPressure;
import pt.sharespot.iot.core.sensor.data.AirPressureDataDTO;

public class PressureMapper {

    public static AirPressure.Builder toBuf(AirPressureDataDTO dto) {
        var builder = AirPressure.newBuilder();
        if (dto.exists()) {
            builder.setHectoPascal(dto.hPa);
        }
        return builder;
    }

    public static AirPressureDataDTO toModel(AirPressure buf) {
        return AirPressureDataDTO.of(buf.getHectoPascal());
    }
}
