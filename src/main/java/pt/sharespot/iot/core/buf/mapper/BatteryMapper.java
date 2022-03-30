package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.Battery;
import pt.sharespot.iot.core.sensor.data.BatteryDataDTO;

public class BatteryMapper {

    public static Battery.Builder toBuf(BatteryDataDTO dto) {
        return Battery.newBuilder()
                .setPercentage(dto.percentage)
                .setVolts(dto.volts);
    }
}
