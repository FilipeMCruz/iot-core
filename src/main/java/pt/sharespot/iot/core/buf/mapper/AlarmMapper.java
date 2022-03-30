package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.Alarm;
import pt.sharespot.iot.core.sensor.data.AlarmDataDTO;

public class AlarmMapper {

    public static Alarm.Builder toBuf(AlarmDataDTO dto) {
        return Alarm.newBuilder()
                .setValue(dto.value);
    }
}
