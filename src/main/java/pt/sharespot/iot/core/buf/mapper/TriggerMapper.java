package pt.sharespot.iot.core.buf.mapper;

import com.google.protobuf.BoolValue;
import pt.sharespot.iot.core.buf.model.Trigger;
import pt.sharespot.iot.core.sensor.data.types.TriggerDataDTO;

public class TriggerMapper {

    public static Trigger.Builder toBuf(TriggerDataDTO dto) {
        var builder = Trigger.newBuilder();
        if (dto.exists()) {
            builder.setValue(BoolValue.of(dto.value));
        }
        return builder;
    }

    public static TriggerDataDTO toModel(Trigger buf) {
        return TriggerDataDTO.of(buf.getValue().getValue());
    }
}
