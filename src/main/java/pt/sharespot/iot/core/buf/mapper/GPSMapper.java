package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.GPS;
import pt.sharespot.iot.core.sensor.data.types.GPSDataDTO;

public class GPSMapper {

    public static GPS.Builder toBuf(GPSDataDTO dto) {
        var builder = GPS.newBuilder();
        if (dto.exists()) {
            builder.setLatitude(dto.latitude)
                    .setLongitude(dto.longitude);
        }
        if (dto.existsAltitude()) {
            builder.setAltitude(dto.altitude);
        }
        return builder;
    }

    public static GPSDataDTO toModel(GPS buf) {
        return GPSDataDTO.ofLatLongAlt(buf.getLatitude(), buf.getLongitude(), buf.getAltitude());
    }
}
