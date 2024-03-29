package pt.sharespot.iot.core.data.model.properties;

public class UnknownPropertyTransformation extends PropertyTransformation {

    private final String oldPath;
    private final String newPath;

    UnknownPropertyTransformation(String oldPath, String newPath) {
        this.oldPath = oldPath;
        this.newPath = newPath;
    }

    @Override
    public String newPath() {
        return newPath;
    }

    @Override
    public String oldPath() {
        return oldPath;
    }

    @Override
    public Integer subSensorId() {
        return 0;
    }
}
