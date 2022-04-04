package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.Data;
import pt.sharespot.iot.core.sensor.ProcessedSensorDataDTO;

import java.util.UUID;

public class DataMapper {

    public static Data.Builder toBuf(ProcessedSensorDataDTO dto) {
        return Data.newBuilder()
                .setDataId(dto.dataId.toString())
                .setReportedAt(dto.reportedAt)
                .setDevice(DeviceMapper.toModel(dto.device))
                .setSensorData(SensorDataMapper.toBuf(dto.data));
    }

    public static ProcessedSensorDataDTO toModel(Data buf) {
        return new ProcessedSensorDataDTO(UUID.fromString(buf.getDataId()),
                DeviceMapper.toModel(buf.getDevice()),
                buf.getReportedAt(),
                SensorDataMapper.toModel(buf.getSensorData()));
    }
}
