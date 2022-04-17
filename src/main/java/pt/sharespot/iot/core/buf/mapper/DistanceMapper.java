package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.Distance;
import pt.sharespot.iot.core.sensor.data.types.DistanceDataDTO;

public class DistanceMapper {

    public static Distance.Builder toBuf(DistanceDataDTO dto) {
        var builder = Distance.newBuilder();
        if (dto.exists()) {
            builder.setMillimeters(dto.millimeters)
                    .setMaxMillimeters(dto.maxMillimeters)
                    .setMinMillimeters(dto.minMillimeters);
        }
        return builder;
    }

    public static DistanceDataDTO toModel(Distance buf) {
        return DistanceDataDTO.of(buf.getMillimeters())
                .with(buf.getMaxMillimeters(), buf.getMinMillimeters());
    }
}
