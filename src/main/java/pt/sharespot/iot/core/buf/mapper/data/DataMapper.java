package pt.sharespot.iot.core.buf.mapper.data;

import pt.sharespot.iot.core.buf.mapper.device.DeviceMapper;
import pt.sharespot.iot.core.buf.model.Data;
import pt.sharespot.iot.core.sensor.ProcessedSensorDataDTO;
import pt.sharespot.iot.core.sensor.data.SensorDataDetailsDTO;
import pt.sharespot.iot.core.sensor.properties.PropertyName;

import java.util.HashMap;
import java.util.UUID;

public class DataMapper {

    public static Data.Builder toBuf(ProcessedSensorDataDTO dto) {
        var builder = Data.newBuilder();
        if (dto.hasProperty(PropertyName.DATA_ID)) builder.setDataId(dto.dataId.toString());

        if (dto.hasProperty(PropertyName.REPORTED_AT)) builder.setReportedAt(dto.reportedAt);

        builder.setDevice(DeviceMapper.toModel(dto.device));

        if (dto.measures != null)
            dto.measures.forEach((key, value) -> builder.putMeasures(key, SensorDataMapper.toBuf(value).build()));

        return builder;
    }

    public static ProcessedSensorDataDTO toModel(Data buf) {

        var measures = new HashMap<Integer, SensorDataDetailsDTO>();
        buf.getMeasuresMap().forEach((key, value) -> measures.put(key, SensorDataMapper.toModel(value)));

        return new ProcessedSensorDataDTO(UUID.fromString(buf.getDataId()), DeviceMapper.toModel(buf.getDevice()), buf.getReportedAt(), measures);
    }
}
