package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.CO2;
import pt.sharespot.iot.core.buf.model.PM10;
import pt.sharespot.iot.core.sensor.data.CO2DataDTO;
import pt.sharespot.iot.core.sensor.data.PM10DataDTO;

public class PM10Mapper {

    public static PM10.Builder toBuf(PM10DataDTO dto) {
        var builder = PM10.newBuilder();
        if (dto.exists()) {
            builder.setMicroGramsPerCubicMeter(dto.microGramsPerCubicMeter);
        }
        return builder;
    }

    public static PM10DataDTO toModel(PM10 buf) {
        return PM10DataDTO.of(buf.getMicroGramsPerCubicMeter());
    }
}
