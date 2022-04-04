package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.GPS;
import pt.sharespot.iot.core.sensor.data.GPSDataDTO;

public class GPSMapper {

    public static GPS.Builder toBuf(GPSDataDTO dto) {
        return GPS.newBuilder()
                .setAltitude(dto.altitude)
                .setLatitude(dto.latitude)
                .setLongitude(dto.longitude);
    }

    public static GPSDataDTO toModel(GPS buf) {
        return GPSDataDTO.ofLatLongAlt(buf.getLatitude(), buf.getLongitude(), buf.getAltitude());
    }
}
