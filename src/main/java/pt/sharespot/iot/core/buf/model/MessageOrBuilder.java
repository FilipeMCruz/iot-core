// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/resources/message.proto

package pt.sharespot.iot.core.buf.model;

public interface MessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pt.sharespot.iot.core.Message)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string oid = 1;</code>
   * @return The oid.
   */
  java.lang.String getOid();
  /**
   * <code>string oid = 1;</code>
   * @return The bytes for oid.
   */
  com.google.protobuf.ByteString
      getOidBytes();

  /**
   * <code>.pt.sharespot.iot.core.RoutingKeysBuf routing_keys = 2;</code>
   * @return Whether the routingKeys field is set.
   */
  boolean hasRoutingKeys();
  /**
   * <code>.pt.sharespot.iot.core.RoutingKeysBuf routing_keys = 2;</code>
   * @return The routingKeys.
   */
  pt.sharespot.iot.core.buf.model.RoutingKeysBuf getRoutingKeys();
  /**
   * <code>.pt.sharespot.iot.core.RoutingKeysBuf routing_keys = 2;</code>
   */
  pt.sharespot.iot.core.buf.model.RoutingKeysBufOrBuilder getRoutingKeysOrBuilder();

  /**
   * <code>int32 hops = 3;</code>
   * @return The hops.
   */
  int getHops();

  /**
   * <code>.pt.sharespot.iot.core.Data data = 4;</code>
   * @return Whether the data field is set.
   */
  boolean hasData();
  /**
   * <code>.pt.sharespot.iot.core.Data data = 4;</code>
   * @return The data.
   */
  pt.sharespot.iot.core.buf.model.Data getData();
  /**
   * <code>.pt.sharespot.iot.core.Data data = 4;</code>
   */
  pt.sharespot.iot.core.buf.model.DataOrBuilder getDataOrBuilder();
}
