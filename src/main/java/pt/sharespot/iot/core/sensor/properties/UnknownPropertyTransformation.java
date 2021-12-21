package pt.sharespot.iot.core.sensor.properties;

public class UnknownPropertyTransformation extends PropertyTransformation {

    private final String oldPath;
    private final String newPath;

    UnknownPropertyTransformation(String oldPath, String newPath) {
        this.oldPath = oldPath;
        this.newPath = newPath;
    }

    @Override
    String newPath() {
        return newPath;
    }

    @Override
    String oldPath() {
        return oldPath;
    }
}
