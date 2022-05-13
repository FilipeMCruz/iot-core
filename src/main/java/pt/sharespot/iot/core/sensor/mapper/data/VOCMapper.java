package pt.sharespot.iot.core.sensor.mapper.data;

import com.google.protobuf.FloatValue;
import pt.sharespot.iot.core.sensor.buf.VOC;
import pt.sharespot.iot.core.sensor.model.data.types.VOCDataDTO;

public class VOCMapper {

    public static VOC.Builder toBuf(VOCDataDTO dto) {
        var builder = VOC.newBuilder();
        if (dto.exists()) {
            builder.setPpm(FloatValue.of(dto.ppm));
        }
        return builder;
    }

    public static VOCDataDTO toModel(VOC buf) {
        return VOCDataDTO.of(buf.getPpm().getValue());
    }
}
