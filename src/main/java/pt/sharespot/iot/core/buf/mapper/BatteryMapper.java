package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.Battery;
import pt.sharespot.iot.core.sensor.data.BatteryDataDTO;

public class BatteryMapper {

    public static Battery.Builder toBuf(BatteryDataDTO dto) {
        var builder = Battery.newBuilder();
        if (dto.exists()) {
            builder.setPercentage(dto.percentage)
                    .setVolts(dto.volts);
        }
        return builder;
    }

    public static BatteryDataDTO toModel(Battery buf) {
        return BatteryDataDTO.ofPercentage(buf.getPercentage())
                .andVolts(buf.getVolts());
    }
}
