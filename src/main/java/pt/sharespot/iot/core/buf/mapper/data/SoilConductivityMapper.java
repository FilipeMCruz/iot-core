package pt.sharespot.iot.core.buf.mapper.data;

import com.google.protobuf.FloatValue;
import pt.sharespot.iot.core.buf.model.SoilConductivity;
import pt.sharespot.iot.core.sensor.data.types.SoilConductivityDataDTO;

public class SoilConductivityMapper {

    public static SoilConductivity.Builder toBuf(SoilConductivityDataDTO dto) {
        var builder = SoilConductivity.newBuilder();
        if (dto.exists()) {
            builder.setMicroSiemensPerCentimeter(FloatValue.of(dto.microSiemensPerCentimeter));
        }
        return builder;
    }

    public static SoilConductivityDataDTO toModel(SoilConductivity buf) {
        return SoilConductivityDataDTO.of(buf.getMicroSiemensPerCentimeter().getValue());
    }
}
