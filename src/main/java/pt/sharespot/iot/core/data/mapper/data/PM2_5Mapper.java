package pt.sharespot.iot.core.data.mapper.data;

import com.google.protobuf.FloatValue;
import pt.sharespot.iot.core.data.model.data.types.PM2_5DataDTO;
import pt.sharespot.iot.core.data.buf.PM2_5;

public class PM2_5Mapper {

    public static PM2_5.Builder toBuf(PM2_5DataDTO dto) {
        var builder = PM2_5.newBuilder();
        if (dto.exists()) {
            builder.setMicroGramsPerCubicMeter(FloatValue.of(dto.microGramsPerCubicMeter));
        }
        return builder;
    }

    public static PM2_5DataDTO toModel(PM2_5 buf) {
        return PM2_5DataDTO.of(buf.getMicroGramsPerCubicMeter().getValue());
    }
}
