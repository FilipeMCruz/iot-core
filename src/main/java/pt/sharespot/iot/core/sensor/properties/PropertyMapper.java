package pt.sharespot.iot.core.sensor.properties;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.List;

public class PropertyMapper {
    
    public static ObjectNode transform(JsonNode oldNode, List<PropertyTransformation> transform) {
        ObjectNode newNode = JsonNodeFactory.instance.objectNode();
        transform.forEach(property -> property.transfer(oldNode, newNode));
        return newNode;
    }
}
