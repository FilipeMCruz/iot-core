package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.VOC;
import pt.sharespot.iot.core.sensor.data.VOCDataDTO;

public class VOCMapper {

    public static VOC.Builder toBuf(VOCDataDTO dto) {
        var builder = VOC.newBuilder();
        if (dto.exists()) {
            builder.setPpm(dto.ppm);
        }
        return builder;
    }

    public static VOCDataDTO toModel(VOC buf) {
        return VOCDataDTO.of(buf.getPpm());
    }
}
