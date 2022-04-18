package pt.sharespot.iot.core.buf.mapper;

import com.google.protobuf.FloatValue;
import pt.sharespot.iot.core.buf.model.PH;
import pt.sharespot.iot.core.sensor.data.types.PHDataDTO;

public class PHMapper {

    public static PH.Builder toBuf(PHDataDTO dto) {
        var builder = PH.newBuilder();
        if (dto.exists()) {
            builder.setValue(FloatValue.of(dto.value));
        }
        return builder;
    }

    public static PHDataDTO toModel(PH buf) {
        return PHDataDTO.of(buf.getValue().getValue());
    }
}
