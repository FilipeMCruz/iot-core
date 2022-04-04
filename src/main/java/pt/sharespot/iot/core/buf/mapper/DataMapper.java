package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.Data;
import pt.sharespot.iot.core.sensor.ProcessedSensorDataDTO;
import pt.sharespot.iot.core.sensor.properties.PropertyName;

import java.util.UUID;

public class DataMapper {

    public static Data.Builder toBuf(ProcessedSensorDataDTO dto) {
        var builder = Data.newBuilder();
        if (dto.hasProperty(PropertyName.DATA_ID))
            builder.setDataId(dto.dataId.toString());

        if (dto.hasProperty(PropertyName.REPORTED_AT))
            builder.setReportedAt(dto.reportedAt);

        return builder.setDevice(DeviceMapper.toModel(dto.device))
                .setSensorData(SensorDataMapper.toBuf(dto.data));
    }

    public static ProcessedSensorDataDTO toModel(Data buf) {
        return new ProcessedSensorDataDTO(UUID.fromString(buf.getDataId()),
                DeviceMapper.toModel(buf.getDevice()),
                buf.getReportedAt(),
                SensorDataMapper.toModel(buf.getSensorData()));
    }
}
