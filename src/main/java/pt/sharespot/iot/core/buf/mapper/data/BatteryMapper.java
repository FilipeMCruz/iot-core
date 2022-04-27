package pt.sharespot.iot.core.buf.mapper.data;

import com.google.protobuf.FloatValue;
import pt.sharespot.iot.core.buf.model.Battery;
import pt.sharespot.iot.core.sensor.data.types.BatteryDataDTO;

public class BatteryMapper {

    public static Battery.Builder toBuf(BatteryDataDTO dto) {
        var builder = Battery.newBuilder();

        if (dto.existsPercentage()) builder.setPercentage(FloatValue.of(dto.percentage));

        if (dto.existsVolts()) builder.setVolts(FloatValue.of(dto.volts));

        if (dto.existsMaxVolts()) builder.setMaxVolts(FloatValue.of(dto.maxVolts));

        if (dto.existsMinVolts()) builder.setMinVolts(FloatValue.of(dto.minVolts));

        return builder;
    }

    public static BatteryDataDTO toModel(Battery buf) {
        var model = new BatteryDataDTO();
        if (buf.hasPercentage())
            model.andPercentage(buf.getPercentage().getValue());

        if (buf.hasVolts())
            model.andVolts(buf.getVolts().getValue());

        if (buf.hasMaxVolts())
            model.maxVolts = buf.getMaxVolts().getValue();

        if (buf.hasMinVolts())
            model.minVolts = buf.getMinVolts().getValue();

        return model;
    }
}
