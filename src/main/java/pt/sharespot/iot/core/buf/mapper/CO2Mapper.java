package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.CO2;
import pt.sharespot.iot.core.sensor.data.CO2DataDTO;

public class CO2Mapper {

    public static CO2.Builder toBuf(CO2DataDTO dto) {
        var builder = CO2.newBuilder();
        if (dto.exists()) {
            builder.setPpm(dto.ppm);
        }
        return builder;
    }

    public static CO2DataDTO toModel(CO2 buf) {
        return CO2DataDTO.of(buf.getPpm());
    }
}
