package pt.sharespot.iot.core.sensor.routing;

import pt.sharespot.iot.core.sensor.routing.keys.SensorRoutingKeys;

import java.util.Optional;
import java.util.UUID;
import java.util.function.BiFunction;

public class MessageConsumed<T> {

    public UUID oid;

    public SensorRoutingKeys routingKeys;

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
    public <A> Optional<MessageSupplied<A>> toSupplied(BiFunction<T, SensorRoutingKeys, Optional<A>> updateData, BiFunction<A, SensorRoutingKeys, Optional<SensorRoutingKeys>> updateRoutingKeys) {
        return updateData.apply(data, routingKeys)
                .flatMap(data -> updateRoutingKeys.apply(data, this.routingKeys)
                        .flatMap(keys -> MessageSupplied.from(this, data, keys)));
    }
}
