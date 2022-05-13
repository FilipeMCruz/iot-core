package pt.sharespot.iot.core.sensor.mapper.data;

import com.google.protobuf.FloatValue;
import pt.sharespot.iot.core.sensor.model.data.types.PM10DataDTO;
import pt.sharespot.iot.core.sensor.buf.PM10;

public class PM10Mapper {

    public static PM10.Builder toBuf(PM10DataDTO dto) {
        var builder = PM10.newBuilder();
        if (dto.exists()) {
            builder.setMicroGramsPerCubicMeter(FloatValue.of(dto.microGramsPerCubicMeter));
        }
        return builder;
    }

    public static PM10DataDTO toModel(PM10 buf) {
        return PM10DataDTO.of(buf.getMicroGramsPerCubicMeter().getValue());
    }
}
