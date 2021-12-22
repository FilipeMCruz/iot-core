package pt.sharespot.iot.core.sensor.properties;

import java.util.Collections;
import java.util.List;

public class PropertyTransformations {

    private final List<PropertyTransformation> transform;

    private PropertyTransformations(List<PropertyTransformation> transform) {
        this.transform = transform;
    }

    public List<PropertyTransformation> getTransform() {
        return Collections.unmodifiableList(transform);
    }

    public static PropertyTransformations of(PropertyTransformation... propertyTransformations) {
        return new PropertyTransformations(List.of(propertyTransformations));
    }
}
