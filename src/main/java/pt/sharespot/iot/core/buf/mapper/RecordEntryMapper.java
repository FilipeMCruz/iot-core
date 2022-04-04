package pt.sharespot.iot.core.buf.mapper;

import pt.sharespot.iot.core.buf.model.Entry;
import pt.sharespot.iot.core.buf.model.RecordEntry;
import pt.sharespot.iot.core.sensor.device.records.DeviceRecordDTO;

import java.util.stream.Collectors;

public class RecordEntryMapper {

    public static RecordEntry.Builder toBuf(DeviceRecordDTO dto) {
        return RecordEntry.newBuilder()
                .addAllEntries(dto.entry
                        .stream()
                        .map(EntryMapper::toBuf)
                        .map(Entry.Builder::build)
                        .collect(Collectors.toList()));
    }

    public static DeviceRecordDTO toModel(RecordEntry buf) {
        return new DeviceRecordDTO(buf.getEntriesList().stream().map(EntryMapper::toModel).collect(Collectors.toSet()));
    }
}
