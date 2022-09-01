package pt.sharespot.iot.core.data.model.properties;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KnownPropertyTransformationTest {

    private static final KnownPropertyTransformation measureProp =
            new KnownPropertyTransformation("path.to.prop", PropertyName.CO, 0);

    private static final KnownPropertyTransformation mainPropWithSubSensorId =
            new KnownPropertyTransformation("path.to.prop", PropertyName.DEVICE_ID, 2);

    @Test
    void ensureSubSensorIdIsReturnsAsExpected() {
        var integer = measureProp.subSensorId();
        Assertions.assertEquals(integer, 0);
    }

    @Test
    void ensureNewPathLiteralIsReturnedAsExpected() {
        var prop = measureProp.newPathLiteral();
        Assertions.assertEquals(prop, PropertyName.CO);
    }

    @Test
    void ensureNewPathIsReturnedAsExpectedWithMeasureProp() {
        var path = measureProp.newPath();
        Assertions.assertEquals(path, "measures.0.co.ppm");
    }

    @Test
    void ensureNewPathIsReturnedAsExpectedWithMainProp() {
        var path = mainPropWithSubSensorId.newPath();
        Assertions.assertEquals(path, "device.id");
    }

    @Test
    void ensureOldPathIsReturnedAsExpected() {
        var path = mainPropWithSubSensorId.oldPath();
        Assertions.assertEquals(path, "path.to.prop");
    }
}
