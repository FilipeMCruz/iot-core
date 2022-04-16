// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/resources/message.proto

package pt.sharespot.iot.core.buf.model;

/**
 * Protobuf type {@code pt.sharespot.iot.core.Occupation}
 */
public final class Occupation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pt.sharespot.iot.core.Occupation)
    OccupationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Occupation.newBuilder() to construct.
  private Occupation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Occupation() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Occupation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Occupation(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 13: {

            percentage_ = input.readFloat();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return pt.sharespot.iot.core.buf.model.MessageOuterClass.internal_static_pt_sharespot_iot_core_Occupation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return pt.sharespot.iot.core.buf.model.MessageOuterClass.internal_static_pt_sharespot_iot_core_Occupation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            pt.sharespot.iot.core.buf.model.Occupation.class, pt.sharespot.iot.core.buf.model.Occupation.Builder.class);
  }

  public static final int PERCENTAGE_FIELD_NUMBER = 1;
  private float percentage_;
  /**
   * <code>float percentage = 1;</code>
   * @return The percentage.
   */
  @java.lang.Override
  public float getPercentage() {
    return percentage_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (java.lang.Float.floatToRawIntBits(percentage_) != 0) {
      output.writeFloat(1, percentage_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Float.floatToRawIntBits(percentage_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, percentage_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof pt.sharespot.iot.core.buf.model.Occupation)) {
      return super.equals(obj);
    }
    pt.sharespot.iot.core.buf.model.Occupation other = (pt.sharespot.iot.core.buf.model.Occupation) obj;

    if (java.lang.Float.floatToIntBits(getPercentage())
        != java.lang.Float.floatToIntBits(
            other.getPercentage())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PERCENTAGE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getPercentage());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static pt.sharespot.iot.core.buf.model.Occupation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static pt.sharespot.iot.core.buf.model.Occupation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static pt.sharespot.iot.core.buf.model.Occupation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static pt.sharespot.iot.core.buf.model.Occupation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static pt.sharespot.iot.core.buf.model.Occupation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static pt.sharespot.iot.core.buf.model.Occupation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static pt.sharespot.iot.core.buf.model.Occupation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static pt.sharespot.iot.core.buf.model.Occupation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static pt.sharespot.iot.core.buf.model.Occupation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static pt.sharespot.iot.core.buf.model.Occupation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static pt.sharespot.iot.core.buf.model.Occupation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static pt.sharespot.iot.core.buf.model.Occupation parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(pt.sharespot.iot.core.buf.model.Occupation prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code pt.sharespot.iot.core.Occupation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pt.sharespot.iot.core.Occupation)
      pt.sharespot.iot.core.buf.model.OccupationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return pt.sharespot.iot.core.buf.model.MessageOuterClass.internal_static_pt_sharespot_iot_core_Occupation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return pt.sharespot.iot.core.buf.model.MessageOuterClass.internal_static_pt_sharespot_iot_core_Occupation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              pt.sharespot.iot.core.buf.model.Occupation.class, pt.sharespot.iot.core.buf.model.Occupation.Builder.class);
    }

    // Construct using pt.sharespot.iot.core.buf.model.Occupation.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      percentage_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return pt.sharespot.iot.core.buf.model.MessageOuterClass.internal_static_pt_sharespot_iot_core_Occupation_descriptor;
    }

    @java.lang.Override
    public pt.sharespot.iot.core.buf.model.Occupation getDefaultInstanceForType() {
      return pt.sharespot.iot.core.buf.model.Occupation.getDefaultInstance();
    }

    @java.lang.Override
    public pt.sharespot.iot.core.buf.model.Occupation build() {
      pt.sharespot.iot.core.buf.model.Occupation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public pt.sharespot.iot.core.buf.model.Occupation buildPartial() {
      pt.sharespot.iot.core.buf.model.Occupation result = new pt.sharespot.iot.core.buf.model.Occupation(this);
      result.percentage_ = percentage_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof pt.sharespot.iot.core.buf.model.Occupation) {
        return mergeFrom((pt.sharespot.iot.core.buf.model.Occupation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(pt.sharespot.iot.core.buf.model.Occupation other) {
      if (other == pt.sharespot.iot.core.buf.model.Occupation.getDefaultInstance()) return this;
      if (other.getPercentage() != 0F) {
        setPercentage(other.getPercentage());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      pt.sharespot.iot.core.buf.model.Occupation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (pt.sharespot.iot.core.buf.model.Occupation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float percentage_ ;
    /**
     * <code>float percentage = 1;</code>
     * @return The percentage.
     */
    @java.lang.Override
    public float getPercentage() {
      return percentage_;
    }
    /**
     * <code>float percentage = 1;</code>
     * @param value The percentage to set.
     * @return This builder for chaining.
     */
    public Builder setPercentage(float value) {
      
      percentage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float percentage = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPercentage() {
      
      percentage_ = 0F;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:pt.sharespot.iot.core.Occupation)
  }

  // @@protoc_insertion_point(class_scope:pt.sharespot.iot.core.Occupation)
  private static final pt.sharespot.iot.core.buf.model.Occupation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new pt.sharespot.iot.core.buf.model.Occupation();
  }

  public static pt.sharespot.iot.core.buf.model.Occupation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Occupation>
      PARSER = new com.google.protobuf.AbstractParser<Occupation>() {
    @java.lang.Override
    public Occupation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Occupation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Occupation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Occupation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public pt.sharespot.iot.core.buf.model.Occupation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

