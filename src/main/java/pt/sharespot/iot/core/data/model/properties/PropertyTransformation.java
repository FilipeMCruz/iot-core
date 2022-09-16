package pt.sharespot.iot.core.data.model.properties;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.node.MissingNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class PropertyTransformation {
    public abstract String newPath();

    public abstract String oldPath();

    public abstract Integer subSensorId();

    public static Pattern r = Pattern.compile("^(.*)\\[(.*)]$");

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

        if (poll.matches("^\\w+\\[\\d]$")) {
            var matcher = r.matcher(poll);
            if (!matcher.find())
                return MissingNode.getInstance();

            var index = Integer.parseInt(matcher.group(2));
            var objectNode = node.path(matcher.group(1));

            if (!objectNode.has(index))
                return MissingNode.getInstance();

            return getInternalPath(objectNode.get(index), path);
        }

        var newNode = node.path(poll);
        return getInternalPath(newNode, path);
    }

    public static PropertyTransformation create(String oldPath, String newPath) {
        return new UnknownPropertyTransformation(oldPath, newPath);
    }

    public static PropertyTransformation create(String oldPath, PropertyName newPath, Integer sensorID) {
        return new KnownPropertyTransformation(oldPath, newPath, sensorID);
    }
}
