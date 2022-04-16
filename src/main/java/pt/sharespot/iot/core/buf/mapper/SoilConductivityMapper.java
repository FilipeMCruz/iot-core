package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.SoilConductivity;
import pt.sharespot.iot.core.buf.model.SoilMoisture;
import pt.sharespot.iot.core.sensor.data.SoilConductivityDataDTO;
import pt.sharespot.iot.core.sensor.data.SoilMoistureDataDTO;

public class SoilConductivityMapper {

    public static SoilConductivity.Builder toBuf(SoilConductivityDataDTO dto) {
        var builder = SoilConductivity.newBuilder();
        if (dto.exists()) {
            builder.setMicroSiemensPerCentimeter(dto.microSiemensPerCentimeter);
        }
        return builder;
    }

    public static SoilConductivityDataDTO toModel(SoilConductivity buf) {
        return SoilConductivityDataDTO.of(buf.getMicroSiemensPerCentimeter());
    }
}
