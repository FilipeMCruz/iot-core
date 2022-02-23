package pt.sharespot.iot.core.routing;

import pt.sharespot.iot.core.routing.keys.RoutingKeys;

import java.util.UUID;

public class MessageSupplied<A> {

    public static int TIME_TO_LIVE = 10;

    public UUID oid;

    public RoutingKeys routingKeys;

    public A data;

    public int hops;

    public MessageSupplied(RoutingKeys routingKeys, A data) {
        this.oid = UUID.randomUUID();
        this.hops = 0;
        this.routingKeys = routingKeys;
        this.data = data;
    }

    public <T> MessageSupplied(MessageConsumed<T> message, A updateData, RoutingKeys updateRoutingKeys) {
        this.oid = message.oid;
        this.hops = message.hops + 1;
        this.routingKeys = updateRoutingKeys;
        this.data = updateData;
        if (this.hops >= TIME_TO_LIVE) {
            throw new RuntimeException("Message has exceeded max time to live");
        }
    }
}
