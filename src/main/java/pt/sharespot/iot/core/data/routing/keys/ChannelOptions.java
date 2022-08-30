package pt.sharespot.iot.core.data.routing.keys;

import pt.sharespot.iot.core.keys.RoutingKey;
import pt.sharespot.iot.core.keys.RoutingKeyOption;

public class ChannelOptions implements RoutingKey {

    public String channel;

    public static ChannelOptions of(String channel) {
        var alertCategoryOptions = new ChannelOptions();
        alertCategoryOptions.channel = channel;
        return alertCategoryOptions;
    }

    public static RoutingKeyOption<ChannelOptions> extract(String s) {
        return RoutingKeyOption.of(ChannelOptions.of(s));
    }

    @Override
    public String value() {
        return channel;
    }

    @Override
    public String details() {
        return channel;
    }
}
