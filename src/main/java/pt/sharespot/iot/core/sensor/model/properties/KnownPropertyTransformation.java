package pt.sharespot.iot.core.sensor.model.properties;

public class KnownPropertyTransformation extends PropertyTransformation {

    private final String oldPath;
    private final PropertyName newPath;

    private final Integer subSensorId;

    KnownPropertyTransformation(String oldPath, PropertyName newPath, Integer subSensorId) {
        this.oldPath = oldPath;
        this.newPath = newPath;
        this.subSensorId = subSensorId;
    }

    public Integer subSensorId() {
        return subSensorId;
    }

    public PropertyName newPathLiteral() {
        return newPath;
    }

    @Override
    public String newPath() {
        return newPath.path(subSensorId);
    }

    @Override
    public String oldPath() {
        return oldPath;
    }
}
