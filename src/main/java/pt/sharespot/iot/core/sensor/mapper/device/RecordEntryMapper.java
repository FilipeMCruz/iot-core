package pt.sharespot.iot.core.sensor.mapper.device;

import pt.sharespot.iot.core.sensor.model.device.records.DeviceRecordDTO;
import pt.sharespot.iot.core.sensor.buf.Entry;
import pt.sharespot.iot.core.sensor.buf.RecordEntry;

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
