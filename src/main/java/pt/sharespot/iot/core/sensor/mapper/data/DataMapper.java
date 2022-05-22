package pt.sharespot.iot.core.sensor.mapper.data;

import pt.sharespot.iot.core.sensor.buf.Data;
import pt.sharespot.iot.core.sensor.model.SensorDataDTO;
import pt.sharespot.iot.core.sensor.model.data.SensorDataDetailsDTO;
import pt.sharespot.iot.core.sensor.model.properties.PropertyName;
import pt.sharespot.iot.core.sensor.mapper.device.DeviceMapper;

import java.util.HashMap;
import java.util.UUID;

public class DataMapper {

    public static Data.Builder toBuf(SensorDataDTO dto) {
        var builder = Data.newBuilder();
        if (dto.hasProperty(PropertyName.DATA_ID)) builder.setDataId(dto.dataId.toString());

        if (dto.hasProperty(PropertyName.REPORTED_AT)) builder.setReportedAt(dto.reportedAt);

        builder.setDevice(DeviceMapper.toModel(dto.device));

        if (dto.measures != null)
            dto.measures.forEach((key, value) -> builder.putMeasures(key, SensorDataMapper.toBuf(value).build()));

        return builder;
    }

    public static SensorDataDTO toModel(Data buf) {

        var measures = new HashMap<Integer, SensorDataDetailsDTO>();
        buf.getMeasuresMap().forEach((key, value) -> measures.put(key, SensorDataMapper.toModel(value)));

        return new SensorDataDTO(UUID.fromString(buf.getDataId()), DeviceMapper.toModel(buf.getDevice()), buf.getReportedAt(), measures);
    }
}
