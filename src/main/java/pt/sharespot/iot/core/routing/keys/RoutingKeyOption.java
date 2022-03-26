package pt.sharespot.iot.core.routing.keys;

public class RoutingKeyOption<T extends RoutingKey> {

    public T key;

    public boolean isAny;

    public static <T extends RoutingKey> RoutingKeyOption<T> of(T key) {
        var option = new RoutingKeyOption<T>();
        option.key = key;
        option.isAny = false;
        return option;
    }

    public static <T extends RoutingKey> RoutingKeyOption<T> any() {
        var option = new RoutingKeyOption<T>();
        option.isAny = true;
        return option;
    }
    
    public String value() {
        if (isAny) return "*";
        return key.value();
    }

    public String details() {
        if (isAny) return "*";
        return key.details();
    }

    public boolean isAny() {
        return isAny;
    }

    public T get() {
        assert !isAny;
        return key;
    }
}
