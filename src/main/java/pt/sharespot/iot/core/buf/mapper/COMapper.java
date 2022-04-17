package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.CO;
import pt.sharespot.iot.core.sensor.data.types.CODataDTO;

public class COMapper {

    public static CO.Builder toBuf(CODataDTO dto) {
        var builder = CO.newBuilder();
        if (dto.exists()) {
            builder.setPpm(dto.ppm);
        }
        return builder;
    }

    public static CODataDTO toModel(CO buf) {
        return CODataDTO.of(buf.getPpm());
    }
}
