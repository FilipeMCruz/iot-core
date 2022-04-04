package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.Entry;
import pt.sharespot.iot.core.sensor.device.records.DeviceRecordBasicEntryDTO;

public class EntryMapper {

    public static Entry.Builder toBuf(DeviceRecordBasicEntryDTO dto) {
        return Entry.newBuilder()
                .setLabel(dto.label)
                .setContent(dto.content);
    }

    public static DeviceRecordBasicEntryDTO toModel(Entry buf) {
        return new DeviceRecordBasicEntryDTO(buf.getLabel(), buf.getContent());
    }
}
