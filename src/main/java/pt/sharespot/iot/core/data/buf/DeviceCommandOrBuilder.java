// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/resources/sensor.proto

package pt.sharespot.iot.core.data.buf;

public interface DeviceCommandOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pt.sharespot.iot.core.DeviceCommand)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string payload = 3;</code>
   * @return The payload.
   */
  java.lang.String getPayload();
  /**
   * <code>string payload = 3;</code>
   * @return The bytes for payload.
   */
  com.google.protobuf.ByteString
      getPayloadBytes();

  /**
   * <code>int32 port = 4;</code>
   * @return The port.
   */
  int getPort();
}