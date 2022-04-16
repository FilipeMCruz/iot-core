// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/resources/message.proto

package pt.sharespot.iot.core.buf.model;

/**
 * Protobuf enum {@code pt.sharespot.iot.core.TriggerDataOptionsBuf}
 */
public enum TriggerDataOptionsBuf
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNIDENTIFIED_TRIGGER_DATA = 0;</code>
   */
  UNIDENTIFIED_TRIGGER_DATA(0),
  /**
   * <code>WITH_TRIGGER_DATA = 1;</code>
   */
  WITH_TRIGGER_DATA(1),
  /**
   * <code>WITHOUT_TRIGGER_DATA = 2;</code>
   */
  WITHOUT_TRIGGER_DATA(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNIDENTIFIED_TRIGGER_DATA = 0;</code>
   */
  public static final int UNIDENTIFIED_TRIGGER_DATA_VALUE = 0;
  /**
   * <code>WITH_TRIGGER_DATA = 1;</code>
   */
  public static final int WITH_TRIGGER_DATA_VALUE = 1;
  /**
   * <code>WITHOUT_TRIGGER_DATA = 2;</code>
   */
  public static final int WITHOUT_TRIGGER_DATA_VALUE = 2;


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
  public static TriggerDataOptionsBuf valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TriggerDataOptionsBuf forNumber(int value) {
    switch (value) {
      case 0: return UNIDENTIFIED_TRIGGER_DATA;
      case 1: return WITH_TRIGGER_DATA;
      case 2: return WITHOUT_TRIGGER_DATA;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TriggerDataOptionsBuf>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TriggerDataOptionsBuf> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TriggerDataOptionsBuf>() {
          public TriggerDataOptionsBuf findValueByNumber(int number) {
            return TriggerDataOptionsBuf.forNumber(number);
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
    return pt.sharespot.iot.core.buf.model.MessageOuterClass.getDescriptor().getEnumTypes().get(2);
  }

  private static final TriggerDataOptionsBuf[] VALUES = values();

  public static TriggerDataOptionsBuf valueOf(
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

  private TriggerDataOptionsBuf(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pt.sharespot.iot.core.TriggerDataOptionsBuf)
}

