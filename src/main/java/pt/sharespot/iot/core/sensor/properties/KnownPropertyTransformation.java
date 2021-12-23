package pt.sharespot.iot.core.sensor.properties;

public class KnownPropertyTransformation extends PropertyTransformation {

    private final String oldPath;
    private final PropertyName newPath;

    KnownPropertyTransformation(String oldPath, PropertyName newPath) {
        this.oldPath = oldPath;
        this.newPath = newPath;
    }

    public PropertyName newPathLiteral() {
        return newPath;
    }

    @Override
    public String newPath() {
        return newPath.path();
    }

    @Override
    public String oldPath() {
        return oldPath;
    }
}
