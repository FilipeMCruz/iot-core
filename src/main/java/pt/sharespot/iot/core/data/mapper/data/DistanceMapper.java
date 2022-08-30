package pt.sharespot.iot.core.data.mapper.data;

import com.google.protobuf.FloatValue;
import pt.sharespot.iot.core.data.buf.Distance;
import pt.sharespot.iot.core.data.model.data.types.DistanceDataDTO;

public class DistanceMapper {

    public static Distance.Builder toBuf(DistanceDataDTO dto) {
        var builder = Distance.newBuilder();

        if (dto.exists()) builder.setMillimeters(FloatValue.of(dto.millimeters));

        if (dto.existsMaxDistance()) builder.setMaxMillimeters(FloatValue.of(dto.maxMillimeters));

        if (dto.existsMinDistance()) builder.setMinMillimeters(FloatValue.of(dto.minMillimeters));

        return builder;
    }

    public static DistanceDataDTO toModel(Distance buf) {
        var model = new DistanceDataDTO();

        if (buf.hasMillimeters())
            model.millimeters = buf.getMillimeters().getValue();

        if (buf.hasMaxMillimeters())
            model.maxMillimeters = buf.getMaxMillimeters().getValue();

        if (buf.hasMinMillimeters())
            model.minMillimeters = buf.getMinMillimeters().getValue();

        return model;
    }
}
