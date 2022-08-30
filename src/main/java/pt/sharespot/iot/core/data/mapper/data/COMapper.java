package pt.sharespot.iot.core.data.mapper.data;

import com.google.protobuf.FloatValue;
import pt.sharespot.iot.core.data.buf.CO;
import pt.sharespot.iot.core.data.model.data.types.CODataDTO;

public class COMapper {

    public static CO.Builder toBuf(CODataDTO dto) {
        var builder = CO.newBuilder();
        if (dto.exists()) {
            builder.setPpm(FloatValue.of(dto.ppm));
        }
        return builder;
    }

    public static CODataDTO toModel(CO buf) {
        return CODataDTO.of(buf.getPpm().getValue());
    }
}
