// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/resources/message.proto

package pt.sharespot.iot.core.buf.model;

/**
 * Protobuf enum {@code pt.sharespot.iot.core.InfoTypeOptionsBuf}
 */
public enum InfoTypeOptionsBuf
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ENCODED = 0;</code>
   */
  ENCODED(0),
  /**
   * <code>DECODED = 1;</code>
   */
  DECODED(1),
  /**
   * <code>PROCESSED = 2;</code>
   */
  PROCESSED(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ENCODED = 0;</code>
   */
  public static final int ENCODED_VALUE = 0;
  /**
   * <code>DECODED = 1;</code>
   */
  public static final int DECODED_VALUE = 1;
  /**
   * <code>PROCESSED = 2;</code>
   */
  public static final int PROCESSED_VALUE = 2;


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
  public static InfoTypeOptionsBuf valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static InfoTypeOptionsBuf forNumber(int value) {
    switch (value) {
      case 0: return ENCODED;
      case 1: return DECODED;
      case 2: return PROCESSED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<InfoTypeOptionsBuf>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      InfoTypeOptionsBuf> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<InfoTypeOptionsBuf>() {
          public InfoTypeOptionsBuf findValueByNumber(int number) {
            return InfoTypeOptionsBuf.forNumber(number);
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
    return pt.sharespot.iot.core.buf.model.MessageOuterClass.getDescriptor().getEnumTypes().get(26);
  }

  private static final InfoTypeOptionsBuf[] VALUES = values();

  public static InfoTypeOptionsBuf valueOf(
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

  private InfoTypeOptionsBuf(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pt.sharespot.iot.core.InfoTypeOptionsBuf)
}

