package pt.sharespot.iot.core.sensor.mapper.data;

import com.google.protobuf.FloatValue;
import pt.sharespot.iot.core.sensor.model.data.types.PHDataDTO;
import pt.sharespot.iot.core.sensor.buf.PH;

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
