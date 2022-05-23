package pt.sharespot.iot.core.alert.routing.keys;

import pt.sharespot.iot.core.keys.RoutingKey;

public class AlertCategoryOptions implements RoutingKey {

    private final String category;

    public AlertCategoryOptions(String category) {
        this.category = category;
    }
    
    public static AlertCategoryOptions of(String category) {
        return new AlertCategoryOptions(category);
    }

    @Override
    public String value() {
        return category;
    }

    @Override
    public String details() {
        return category;
    }
}
