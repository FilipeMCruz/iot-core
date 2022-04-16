package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.AirPressure;
import pt.sharespot.iot.core.sensor.data.AirPressureDataDTO;

public class AirPressureMapper {

    public static AirPressure.Builder toBuf(AirPressureDataDTO dto) {
        var builder = AirPressure.newBuilder();
        if (dto.exists()) {
            builder.setHectoPascal(dto.hectoPascal);
        }
        return builder;
    }

    public static AirPressureDataDTO toModel(AirPressure buf) {
        return AirPressureDataDTO.of(buf.getHectoPascal());
    }
}
