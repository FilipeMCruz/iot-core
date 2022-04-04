package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.Alarm;
import pt.sharespot.iot.core.sensor.data.AlarmDataDTO;

public class AlarmMapper {

    public static Alarm.Builder toBuf(AlarmDataDTO dto) {
        var builder = Alarm.newBuilder();
        if (dto.exists()) {
            builder.setValue(dto.value);
        }
        return builder;
    }

    public static AlarmDataDTO toModel(Alarm buf) {
        return AlarmDataDTO.of(buf.getValue());
    }
}
