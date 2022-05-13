package pt.sharespot.iot.core.sensor.mapper.device;

import pt.sharespot.iot.core.sensor.buf.Entry;
import pt.sharespot.iot.core.sensor.model.device.records.DeviceRecordBasicEntryDTO;

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
