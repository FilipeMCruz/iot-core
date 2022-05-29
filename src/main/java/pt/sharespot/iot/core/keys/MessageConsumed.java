package pt.sharespot.iot.core.keys;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiFunction;

public class MessageConsumed<T, R extends RoutingKeys> {

    public UUID oid;

    public R routingKeys;

    public T data;

    public int hops;

    public MessageConsumed() {
    }

    /**
     * High-Order Function that receives two function that will alter the data and routing keys of the message
     * First data is updated and then the routing keys are updated (so that we can use something like builder.withUpdated(data) from the outside)
     *
     * @param updateData        function that receives all needed info to run updates to data
     * @param updateRoutingKeys function that receives all needed info to run updated to routing keys
     * @param <A>               data type in message supplied
     * @return if everything goes well, new message supplied updated, else empty object
     */
    public <A> Optional<MessageSupplied<A, R>> toSupplied(BiFunction<T, R, Optional<A>> updateData, BiFunction<A, R, Optional<R>> updateRoutingKeys) {
        return updateData.apply(data, routingKeys)
                .flatMap(data -> updateRoutingKeys.apply(data, this.routingKeys)
                        .flatMap(keys -> MessageSupplied.from(this, data, keys)));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MessageConsumed<?, ?> that = (MessageConsumed<?, ?>) o;

        return Objects.equals(oid, that.oid);
    }

    @Override
    public int hashCode() {
        return oid != null ? oid.hashCode() : 0;
    }
}
