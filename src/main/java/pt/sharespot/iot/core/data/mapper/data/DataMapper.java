package pt.sharespot.iot.core.data.mapper.data;

import pt.sharespot.iot.core.data.buf.DataUnit;
import pt.sharespot.iot.core.data.model.DataUnitDTO;
import pt.sharespot.iot.core.data.model.data.DataUnitDetailsDTO;
import pt.sharespot.iot.core.data.model.properties.PropertyName;
import pt.sharespot.iot.core.data.mapper.device.DeviceMapper;

import java.util.HashMap;
import java.util.UUID;

public class DataMapper {

    public static DataUnit.Builder toBuf(DataUnitDTO dto) {
        var builder = DataUnit.newBuilder();
        if (dto.hasProperty(PropertyName.DATA_ID)) builder.setDataId(dto.dataId.toString());

        if (dto.hasProperty(PropertyName.REPORTED_AT)) builder.setReportedAt(dto.reportedAt);

        builder.setDevice(DeviceMapper.toModel(dto.device));

        if (dto.measures != null)
            dto.measures.forEach((key, value) -> builder.putMeasures(key, SensorDataMapper.toBuf(value).build()));

        return builder;
    }

    public static DataUnitDTO toModel(DataUnit buf) {

        var measures = new HashMap<Integer, DataUnitDetailsDTO>();
        buf.getMeasuresMap().forEach((key, value) -> measures.put(key, SensorDataMapper.toModel(value)));

        return new DataUnitDTO(UUID.fromString(buf.getDataId()), DeviceMapper.toModel(buf.getDevice()), buf.getReportedAt(), measures);
    }
}
