package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.Trigger;
import pt.sharespot.iot.core.sensor.data.TriggerDataDTO;

public class AlarmMapper {

    public static Trigger.Builder toBuf(TriggerDataDTO dto) {
        var builder = Trigger.newBuilder();
        if (dto.exists()) {
            builder.setValue(dto.value);
        }
        return builder;
    }

    public static TriggerDataDTO toModel(Trigger buf) {
        return TriggerDataDTO.of(buf.getValue());
    }
}
