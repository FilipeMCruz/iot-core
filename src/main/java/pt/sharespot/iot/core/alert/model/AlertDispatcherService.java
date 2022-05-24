package pt.sharespot.iot.core.alert.model;

public interface AlertDispatcherService {
    void publish(AlertDTO alert);
}
