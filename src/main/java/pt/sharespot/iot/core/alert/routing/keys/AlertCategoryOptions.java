package pt.sharespot.iot.core.alert.routing.keys;

import pt.sharespot.iot.core.keys.RoutingKey;

public class AlertCategoryOptions implements RoutingKey {

    private final String category;

    public AlertCategoryOptions(String category) {
        if (!category.matches("^[a-zA-Z0-9]+$")) {
            throw new RuntimeException("Can't create routing key Alert Category with key: " + category);
        }
        this.category = category;
    }

    @Override
    public String value() {
        return null;
    }

    @Override
    public String details() {
        return null;
    }
}
