package pt.sharespot.iot.core.buf.mapper.data;

import com.google.protobuf.DoubleValue;
import com.google.protobuf.FloatValue;
import pt.sharespot.iot.core.buf.model.GPS;
import pt.sharespot.iot.core.sensor.data.types.GPSDataDTO;

public class GPSMapper {

    public static GPS.Builder toBuf(GPSDataDTO dto) {
        var builder = GPS.newBuilder();
        if (dto.exists()) {
            builder.setLatitude(DoubleValue.of(dto.latitude))
                    .setLongitude(DoubleValue.of(dto.longitude));
        }
        if (dto.existsAltitude()) {
            builder.setAltitude(FloatValue.of(dto.altitude));
        }
        return builder;
    }

    public static GPSDataDTO toModel(GPS buf) {
        var model = new GPSDataDTO();

        if (buf.hasLatitude())
            model.latitude = buf.getLatitude().getValue();

        if (buf.hasLongitude())
            model.longitude = buf.getLongitude().getValue();

        if (buf.hasAltitude())
            model.altitude = buf.getAltitude().getValue();


        return model;
    }
}
