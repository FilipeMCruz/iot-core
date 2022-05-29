package pt.sharespot.iot.core.keys;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public class MessageSupplied<A, R extends RoutingKeys> {

    public static int TIME_TO_LIVE = 10;

    public UUID oid;

    public R routingKeys;

    public A data;

    public int hops;

    private MessageSupplied(UUID id, int hops, A updateData, R updateRoutingKeys) {
        this.oid = id;
        this.hops = hops;
        this.routingKeys = updateRoutingKeys;
        this.data = updateData;
    }

    public static <T, A, R extends RoutingKeys> Optional<MessageSupplied<A, R>> from(MessageConsumed<T, R> message, A updateData, R updateRoutingKeys) {
        int hops = message.hops + 1;
        if (hops >= TIME_TO_LIVE) {
            return Optional.empty();
        }
        return Optional.of(new MessageSupplied<>(message.oid, hops, updateData, updateRoutingKeys));
    }

    public static <A, R extends RoutingKeys> MessageSupplied<A, R> create(A data, R routingKeys) {
        return new MessageSupplied<>(UUID.randomUUID(), 0, data, routingKeys);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MessageSupplied<?, ?> that = (MessageSupplied<?, ?>) o;

        return Objects.equals(oid, that.oid);
    }

    @Override
    public int hashCode() {
        return oid != null ? oid.hashCode() : 0;
    }
}
