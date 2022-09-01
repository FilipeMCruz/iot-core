package pt.sharespot.iot.core.data.model.properties;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class PropertyTransformationTest {

    private static final ObjectMapper mapper = new ObjectMapper();

    @Test
    void ensureTransferWorksWithValidObjectPath() throws JsonProcessingException {
        var jsonNode = mapper.readTree("""
                {
                    "path": {
                        "to": {
                            "prop": "viva",
                            "not": "1"
                        },
                        "nope": "error"
                    }
                }
                """);
        var objectNode = mapper.createObjectNode();

        new KnownPropertyTransformation("path.to.prop", PropertyName.DEVICE_ID, 2)
                .transfer(jsonNode, objectNode);

        Assertions.assertEquals(objectNode.get("device").get("id").asText(), "viva");
    }

    @Test
    void ensureTransferWorksWithValidArrayPath() throws JsonProcessingException {
        var jsonNode = mapper.readTree("""
                {
                    "path": [
                        {
                            "prop": "viva"
                        }
                    ]
                }
                """);
        var objectNode = mapper.createObjectNode();

        new KnownPropertyTransformation("path[0].prop", PropertyName.DEVICE_ID, 2)
                .transfer(jsonNode, objectNode);

        Assertions.assertEquals(objectNode.get("device").get("id").asText(), "viva");
    }

    @Test
    void ensureTransferDoesNotThrowsWithInvalidArrayPath() throws JsonProcessingException {
        var jsonNode = mapper.readTree("""
                {
                    "path": [
                        {
                            "prop": "viva"
                        }
                    ]
                }
                """);
        var objectNode = mapper.createObjectNode();

        Assertions.assertDoesNotThrow(() -> PropertyTransformation.create("path[1].prop", PropertyName.DEVICE_ID, 2)
                .transfer(jsonNode, objectNode));
        Assertions.assertDoesNotThrow(() -> PropertyTransformation.create("path.prop", PropertyName.DEVICE_ID, 2)
                .transfer(jsonNode, objectNode));
        Assertions.assertDoesNotThrow(() -> PropertyTransformation.create("0.prop", PropertyName.DEVICE_ID, 2)
                .transfer(jsonNode, objectNode));
        Assertions.assertDoesNotThrow(() -> PropertyTransformation.create("0prop", PropertyName.DEVICE_ID, 2)
                .transfer(jsonNode, objectNode));
        Assertions.assertDoesNotThrow(() -> PropertyTransformation.create("", PropertyName.DEVICE_ID, 2)
                .transfer(jsonNode, objectNode));
    }

    @Test
    void ensureTransferWorksWithInvalidObjectPath() throws JsonProcessingException {
        var jsonNode = mapper.readTree("""
                {
                    "path": {
                        "to": {
                            "noprop": "viva",
                            "not": "1"
                        },
                        "nope": "error"
                    }
                }
                """);
        var objectNode = mapper.createObjectNode();

        new KnownPropertyTransformation("path.to.prop", PropertyName.DEVICE_ID, 2)
                .transfer(jsonNode, objectNode);

        Assertions.assertTrue(objectNode.get("device").get("id").isEmpty());
    }

    @Test
    void ensureTransferDoesntOverrideValueObjectPath() throws JsonProcessingException {
        var jsonNode = mapper.readTree("""
                {
                    "path": {
                        "to": {
                            "prop": "viva",
                            "not": "1"
                        },
                        "nope": "error"
                    }
                }
                """);
        var objectNode = mapper.createObjectNode();
        var measureProp = new KnownPropertyTransformation("path.to.prop", PropertyName.DEVICE_ID, 2);

        measureProp.transfer(jsonNode, objectNode);
        Assertions.assertEquals(objectNode.get("device").get("id").asText(), "viva");

        var jsonNode2 = mapper.readTree("""
                {
                    "path": {
                        "to": {
                            "prop": "adeus",
                            "not": "1"
                        },
                        "nope": "error"
                    }
                }
                """);

        measureProp.transfer(jsonNode2, objectNode);
        Assertions.assertEquals(objectNode.get("device").get("id").asText(), "viva");
    }
}
