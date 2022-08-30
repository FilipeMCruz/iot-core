package pt.sharespot.iot.core.data.mapper.device;

import pt.sharespot.iot.core.data.model.device.records.DeviceRecordEntryDTO;
import pt.sharespot.iot.core.data.buf.Entry;
import pt.sharespot.iot.core.data.buf.RecordEntry;

import java.util.Set;
import java.util.stream.Collectors;

public class RecordEntryMapper {

    public static RecordEntry.Builder toBuf(Set<DeviceRecordEntryDTO> dto) {
        return RecordEntry.newBuilder()
                .addAllEntries(dto
                        .stream()
                        .map(EntryMapper::toBuf)
                        .map(Entry.Builder::build)
                        .collect(Collectors.toList()));
    }

    public static Set<DeviceRecordEntryDTO> toModel(RecordEntry buf) {
        return buf.getEntriesList().stream().map(EntryMapper::toModel).collect(Collectors.toSet());
    }
}
