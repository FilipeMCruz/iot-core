package pt.sharespot.iot.core.sensor.model.properties;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public abstract class PropertyTransformation {
    public abstract String newPath();

    public abstract String oldPath();

    public abstract Integer subSensorId();

    public void transfer(JsonNode old, ObjectNode processed) {
        var newPathQueue = new LinkedList<>(List.of(newPath().split("\\.")));
        var lastFromNew = newPathQueue.pollLast();

        var oldPathQueue = new LinkedList<>(List.of(oldPath().split("\\.")));
        var lastFromOld = oldPathQueue.pollLast();

        var node = getInternalPath(old, oldPathQueue);

        createInternalPath(processed, newPathQueue).putIfAbsent(lastFromNew, node.get(lastFromOld));
    }

    static ObjectNode createInternalPath(ObjectNode node, Queue<String> path) {
        if (path.size() == 0) return node;

        var poll = path.poll();
        if (!node.has(poll))
            node.putObject(poll);
        var newNode = (ObjectNode) node.path(poll);
        return createInternalPath(newNode, path);
    }

    static JsonNode getInternalPath(JsonNode node, Queue<String> path) {
        if (path.size() == 0) return node;

        var poll = path.poll();
        JsonNode newNode = poll.matches("^d+$") ? node.path(Integer.parseInt(poll)) : node.path(poll);
        return getInternalPath(newNode, path);
    }


    public static PropertyTransformation create(String oldPath, String newPath) {
        return new UnknownPropertyTransformation(oldPath, newPath);
    }

    public static PropertyTransformation create(String oldPath, PropertyName newPath, Integer sensorID) {
        return new KnownPropertyTransformation(oldPath, newPath, sensorID);
    }
}
