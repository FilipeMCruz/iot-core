package pt.sharespot.iot.core.sensor.properties;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.stereotype.Service;
import pt.sharespot.iot.core.sensor.ProcessedSensorDataDTO;

import java.util.Optional;

@Service
public class ProcessedSensorDataMapper {

    private final ObjectMapper mapper;

    public ProcessedSensorDataMapper(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    public Optional<ProcessedSensorDataDTO> process(PropertyTransformations transformations, JsonNode in) {
        ObjectNode newNode = mapper.createObjectNode();
        transformations.getTransform().forEach(property -> property.transfer(in, newNode));
        try {
            return Optional.of(mapper.treeToValue(newNode, ProcessedSensorDataDTO.class));
        } catch (JsonProcessingException e) {
            return Optional.empty();
        }
    }
}
