// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/resources/sensor.proto

package pt.sharespot.iot.core.sensor.buf;

/**
 * Protobuf enum {@code pt.sharespot.iot.core.ContainerTypeOptionsBuf}
 */
public enum ContainerTypeOptionsBuf
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>OTHER = 0;</code>
   */
  OTHER(0),
  /**
   * <code>DATA_GATEWAY = 1;</code>
   */
  DATA_GATEWAY(1),
  /**
   * <code>DATA_PROCESSOR = 2;</code>
   */
  DATA_PROCESSOR(2),
  /**
   * <code>DATA_DECODER = 3;</code>
   */
  DATA_DECODER(3),
  /**
   * <code>DATA_VALIDATOR = 4;</code>
   */
  DATA_VALIDATOR(4),
  /**
   * <code>DATA_STORE = 5;</code>
   */
  DATA_STORE(5),
  /**
   * <code>IDENTITY_MANAGEMENT = 6;</code>
   */
  IDENTITY_MANAGEMENT(6),
  /**
   * <code>DEVICE_MANAGEMENT = 7;</code>
   */
  DEVICE_MANAGEMENT(7),
  /**
   * <code>FLEET_MANAGEMENT = 8;</code>
   */
  FLEET_MANAGEMENT(8),
  /**
   * <code>SMART_IRRIGATION = 9;</code>
   */
  SMART_IRRIGATION(9),
  /**
   * <code>DEVICE_COMMANDER = 10;</code>
   */
  DEVICE_COMMANDER(10),
  /**
   * <code>ALERT_DISPATCHER = 11;</code>
   */
  ALERT_DISPATCHER(11),
  /**
   * <code>RULE_MANAGEMENT = 12;</code>
   */
  RULE_MANAGEMENT(12),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>OTHER = 0;</code>
   */
  public static final int OTHER_VALUE = 0;
  /**
   * <code>DATA_GATEWAY = 1;</code>
   */
  public static final int DATA_GATEWAY_VALUE = 1;
  /**
   * <code>DATA_PROCESSOR = 2;</code>
   */
  public static final int DATA_PROCESSOR_VALUE = 2;
  /**
   * <code>DATA_DECODER = 3;</code>
   */
  public static final int DATA_DECODER_VALUE = 3;
  /**
   * <code>DATA_VALIDATOR = 4;</code>
   */
  public static final int DATA_VALIDATOR_VALUE = 4;
  /**
   * <code>DATA_STORE = 5;</code>
   */
  public static final int DATA_STORE_VALUE = 5;
  /**
   * <code>IDENTITY_MANAGEMENT = 6;</code>
   */
  public static final int IDENTITY_MANAGEMENT_VALUE = 6;
  /**
   * <code>DEVICE_MANAGEMENT = 7;</code>
   */
  public static final int DEVICE_MANAGEMENT_VALUE = 7;
  /**
   * <code>FLEET_MANAGEMENT = 8;</code>
   */
  public static final int FLEET_MANAGEMENT_VALUE = 8;
  /**
   * <code>SMART_IRRIGATION = 9;</code>
   */
  public static final int SMART_IRRIGATION_VALUE = 9;
  /**
   * <code>DEVICE_COMMANDER = 10;</code>
   */
  public static final int DEVICE_COMMANDER_VALUE = 10;
  /**
   * <code>ALERT_DISPATCHER = 11;</code>
   */
  public static final int ALERT_DISPATCHER_VALUE = 11;
  /**
   * <code>RULE_MANAGEMENT = 12;</code>
   */
  public static final int RULE_MANAGEMENT_VALUE = 12;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ContainerTypeOptionsBuf valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ContainerTypeOptionsBuf forNumber(int value) {
    switch (value) {
      case 0: return OTHER;
      case 1: return DATA_GATEWAY;
      case 2: return DATA_PROCESSOR;
      case 3: return DATA_DECODER;
      case 4: return DATA_VALIDATOR;
      case 5: return DATA_STORE;
      case 6: return IDENTITY_MANAGEMENT;
      case 7: return DEVICE_MANAGEMENT;
      case 8: return FLEET_MANAGEMENT;
      case 9: return SMART_IRRIGATION;
      case 10: return DEVICE_COMMANDER;
      case 11: return ALERT_DISPATCHER;
      case 12: return RULE_MANAGEMENT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ContainerTypeOptionsBuf>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ContainerTypeOptionsBuf> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ContainerTypeOptionsBuf>() {
          public ContainerTypeOptionsBuf findValueByNumber(int number) {
            return ContainerTypeOptionsBuf.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return pt.sharespot.iot.core.sensor.buf.Sensor.getDescriptor().getEnumTypes().get(29);
  }

  private static final ContainerTypeOptionsBuf[] VALUES = values();

  public static ContainerTypeOptionsBuf valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ContainerTypeOptionsBuf(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pt.sharespot.iot.core.ContainerTypeOptionsBuf)
}

