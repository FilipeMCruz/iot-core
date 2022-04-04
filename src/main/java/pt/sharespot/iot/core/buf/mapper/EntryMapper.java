package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.Entry;
import pt.sharespot.iot.core.sensor.device.records.DeviceRecordBasicEntryDTO;

public class EntryMapper {

    public static Entry.Builder toBuf(DeviceRecordBasicEntryDTO dto) {
        var builder = Entry.newBuilder();
        if (dto.label != null) builder.setLabel(dto.label);
        if (dto.content != null) builder.setContent(dto.content);
        return builder;
    }

    public static DeviceRecordBasicEntryDTO toModel(Entry buf) {
        return new DeviceRecordBasicEntryDTO(buf.getLabel(), buf.getContent());
    }
}
