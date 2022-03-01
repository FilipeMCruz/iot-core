package pt.sharespot.iot.core.routing;

import pt.sharespot.iot.core.routing.keys.RoutingKeys;

import java.util.Optional;
import java.util.UUID;

public class MessageSupplied<A> {

    public static int TIME_TO_LIVE = 10;

    public UUID oid;

    public RoutingKeys routingKeys;

    public A data;

    public int hops;

    private MessageSupplied(UUID id, int hops, A updateData, RoutingKeys updateRoutingKeys) {
        this.oid = id;
        this.hops = hops + 1;
        this.routingKeys = updateRoutingKeys;
        this.data = updateData;
    }

    public static <T, A> Optional<MessageSupplied<A>> from(MessageConsumed<T> message, A updateData, RoutingKeys updateRoutingKeys) {
        int hops = message.hops + 1;
        if (hops >= TIME_TO_LIVE) {
            return Optional.empty();
        }
        return Optional.of(new MessageSupplied<>(message.oid, hops, updateData, updateRoutingKeys));
    }

    public static <A> MessageSupplied<A> create(A data, RoutingKeys routingKeys) {
        return new MessageSupplied<>(UUID.randomUUID(), 0, data, routingKeys);
    }
}
