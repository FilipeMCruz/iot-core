package pt.sharespot.iot.core.data.mapper.device;

import pt.sharespot.iot.core.data.buf.Entry;
import pt.sharespot.iot.core.data.model.device.records.DeviceRecordEntryDTO;

public class EntryMapper {

    public static Entry.Builder toBuf(DeviceRecordEntryDTO dto) {
        var builder = Entry.newBuilder();
        if (dto.label != null) builder.setLabel(dto.label);
        if (dto.content != null) builder.setContent(dto.content);
        return builder;
    }

    public static DeviceRecordEntryDTO toModel(Entry buf) {
        return new DeviceRecordEntryDTO(buf.getLabel(), buf.getContent());
    }
}
