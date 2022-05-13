package pt.sharespot.iot.core.sensor.mapper.data;

import com.google.protobuf.BoolValue;
import pt.sharespot.iot.core.sensor.buf.Trigger;
import pt.sharespot.iot.core.sensor.model.data.types.TriggerDataDTO;

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
