package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.Data;
import pt.sharespot.iot.core.sensor.ProcessedSensorDataDTO;

public class DataMapper {

    public static Data.Builder toBuf(ProcessedSensorDataDTO dto) {
        return Data.newBuilder()
                .setDataId(dto.dataId.toString())
                .setReportedAt(dto.reportedAt)
                .setDevice(DeviceMapper.toBuf(dto.device))
                .setSensorData(SensorDataMapper.toBuf(dto.data));
    }
}
