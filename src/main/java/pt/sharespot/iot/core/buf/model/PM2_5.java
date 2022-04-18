// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/resources/message.proto

package pt.sharespot.iot.core.buf.model;

/**
 * Protobuf type {@code pt.sharespot.iot.core.PM2_5}
 */
public final class PM2_5 extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pt.sharespot.iot.core.PM2_5)
    PM2_5OrBuilder {
private static final long serialVersionUID = 0L;
  // Use PM2_5.newBuilder() to construct.
  private PM2_5(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PM2_5() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PM2_5();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PM2_5(
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
          case 10: {
            com.google.protobuf.FloatValue.Builder subBuilder = null;
            if (microGramsPerCubicMeter_ != null) {
              subBuilder = microGramsPerCubicMeter_.toBuilder();
            }
            microGramsPerCubicMeter_ = input.readMessage(com.google.protobuf.FloatValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(microGramsPerCubicMeter_);
              microGramsPerCubicMeter_ = subBuilder.buildPartial();
            }

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
    return pt.sharespot.iot.core.buf.model.MessageOuterClass.internal_static_pt_sharespot_iot_core_PM2_5_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return pt.sharespot.iot.core.buf.model.MessageOuterClass.internal_static_pt_sharespot_iot_core_PM2_5_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            pt.sharespot.iot.core.buf.model.PM2_5.class, pt.sharespot.iot.core.buf.model.PM2_5.Builder.class);
  }

  public static final int MICRO_GRAMS_PER_CUBIC_METER_FIELD_NUMBER = 1;
  private com.google.protobuf.FloatValue microGramsPerCubicMeter_;
  /**
   * <code>.google.protobuf.FloatValue micro_grams_per_cubic_meter = 1;</code>
   * @return Whether the microGramsPerCubicMeter field is set.
   */
  @java.lang.Override
  public boolean hasMicroGramsPerCubicMeter() {
    return microGramsPerCubicMeter_ != null;
  }
  /**
   * <code>.google.protobuf.FloatValue micro_grams_per_cubic_meter = 1;</code>
   * @return The microGramsPerCubicMeter.
   */
  @java.lang.Override
  public com.google.protobuf.FloatValue getMicroGramsPerCubicMeter() {
    return microGramsPerCubicMeter_ == null ? com.google.protobuf.FloatValue.getDefaultInstance() : microGramsPerCubicMeter_;
  }
  /**
   * <code>.google.protobuf.FloatValue micro_grams_per_cubic_meter = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FloatValueOrBuilder getMicroGramsPerCubicMeterOrBuilder() {
    return getMicroGramsPerCubicMeter();
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
    if (microGramsPerCubicMeter_ != null) {
      output.writeMessage(1, getMicroGramsPerCubicMeter());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (microGramsPerCubicMeter_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMicroGramsPerCubicMeter());
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
    if (!(obj instanceof pt.sharespot.iot.core.buf.model.PM2_5)) {
      return super.equals(obj);
    }
    pt.sharespot.iot.core.buf.model.PM2_5 other = (pt.sharespot.iot.core.buf.model.PM2_5) obj;

    if (hasMicroGramsPerCubicMeter() != other.hasMicroGramsPerCubicMeter()) return false;
    if (hasMicroGramsPerCubicMeter()) {
      if (!getMicroGramsPerCubicMeter()
          .equals(other.getMicroGramsPerCubicMeter())) return false;
    }
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
    if (hasMicroGramsPerCubicMeter()) {
      hash = (37 * hash) + MICRO_GRAMS_PER_CUBIC_METER_FIELD_NUMBER;
      hash = (53 * hash) + getMicroGramsPerCubicMeter().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static pt.sharespot.iot.core.buf.model.PM2_5 parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static pt.sharespot.iot.core.buf.model.PM2_5 parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static pt.sharespot.iot.core.buf.model.PM2_5 parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static pt.sharespot.iot.core.buf.model.PM2_5 parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static pt.sharespot.iot.core.buf.model.PM2_5 parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static pt.sharespot.iot.core.buf.model.PM2_5 parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static pt.sharespot.iot.core.buf.model.PM2_5 parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static pt.sharespot.iot.core.buf.model.PM2_5 parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static pt.sharespot.iot.core.buf.model.PM2_5 parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static pt.sharespot.iot.core.buf.model.PM2_5 parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static pt.sharespot.iot.core.buf.model.PM2_5 parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static pt.sharespot.iot.core.buf.model.PM2_5 parseFrom(
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
  public static Builder newBuilder(pt.sharespot.iot.core.buf.model.PM2_5 prototype) {
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
   * Protobuf type {@code pt.sharespot.iot.core.PM2_5}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pt.sharespot.iot.core.PM2_5)
      pt.sharespot.iot.core.buf.model.PM2_5OrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return pt.sharespot.iot.core.buf.model.MessageOuterClass.internal_static_pt_sharespot_iot_core_PM2_5_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return pt.sharespot.iot.core.buf.model.MessageOuterClass.internal_static_pt_sharespot_iot_core_PM2_5_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              pt.sharespot.iot.core.buf.model.PM2_5.class, pt.sharespot.iot.core.buf.model.PM2_5.Builder.class);
    }

    // Construct using pt.sharespot.iot.core.buf.model.PM2_5.newBuilder()
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
      if (microGramsPerCubicMeterBuilder_ == null) {
        microGramsPerCubicMeter_ = null;
      } else {
        microGramsPerCubicMeter_ = null;
        microGramsPerCubicMeterBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return pt.sharespot.iot.core.buf.model.MessageOuterClass.internal_static_pt_sharespot_iot_core_PM2_5_descriptor;
    }

    @java.lang.Override
    public pt.sharespot.iot.core.buf.model.PM2_5 getDefaultInstanceForType() {
      return pt.sharespot.iot.core.buf.model.PM2_5.getDefaultInstance();
    }

    @java.lang.Override
    public pt.sharespot.iot.core.buf.model.PM2_5 build() {
      pt.sharespot.iot.core.buf.model.PM2_5 result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public pt.sharespot.iot.core.buf.model.PM2_5 buildPartial() {
      pt.sharespot.iot.core.buf.model.PM2_5 result = new pt.sharespot.iot.core.buf.model.PM2_5(this);
      if (microGramsPerCubicMeterBuilder_ == null) {
        result.microGramsPerCubicMeter_ = microGramsPerCubicMeter_;
      } else {
        result.microGramsPerCubicMeter_ = microGramsPerCubicMeterBuilder_.build();
      }
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
      if (other instanceof pt.sharespot.iot.core.buf.model.PM2_5) {
        return mergeFrom((pt.sharespot.iot.core.buf.model.PM2_5)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(pt.sharespot.iot.core.buf.model.PM2_5 other) {
      if (other == pt.sharespot.iot.core.buf.model.PM2_5.getDefaultInstance()) return this;
      if (other.hasMicroGramsPerCubicMeter()) {
        mergeMicroGramsPerCubicMeter(other.getMicroGramsPerCubicMeter());
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
      pt.sharespot.iot.core.buf.model.PM2_5 parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (pt.sharespot.iot.core.buf.model.PM2_5) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.FloatValue microGramsPerCubicMeter_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FloatValue, com.google.protobuf.FloatValue.Builder, com.google.protobuf.FloatValueOrBuilder> microGramsPerCubicMeterBuilder_;
    /**
     * <code>.google.protobuf.FloatValue micro_grams_per_cubic_meter = 1;</code>
     * @return Whether the microGramsPerCubicMeter field is set.
     */
    public boolean hasMicroGramsPerCubicMeter() {
      return microGramsPerCubicMeterBuilder_ != null || microGramsPerCubicMeter_ != null;
    }
    /**
     * <code>.google.protobuf.FloatValue micro_grams_per_cubic_meter = 1;</code>
     * @return The microGramsPerCubicMeter.
     */
    public com.google.protobuf.FloatValue getMicroGramsPerCubicMeter() {
      if (microGramsPerCubicMeterBuilder_ == null) {
        return microGramsPerCubicMeter_ == null ? com.google.protobuf.FloatValue.getDefaultInstance() : microGramsPerCubicMeter_;
      } else {
        return microGramsPerCubicMeterBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.FloatValue micro_grams_per_cubic_meter = 1;</code>
     */
    public Builder setMicroGramsPerCubicMeter(com.google.protobuf.FloatValue value) {
      if (microGramsPerCubicMeterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        microGramsPerCubicMeter_ = value;
        onChanged();
      } else {
        microGramsPerCubicMeterBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.FloatValue micro_grams_per_cubic_meter = 1;</code>
     */
    public Builder setMicroGramsPerCubicMeter(
        com.google.protobuf.FloatValue.Builder builderForValue) {
      if (microGramsPerCubicMeterBuilder_ == null) {
        microGramsPerCubicMeter_ = builderForValue.build();
        onChanged();
      } else {
        microGramsPerCubicMeterBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.FloatValue micro_grams_per_cubic_meter = 1;</code>
     */
    public Builder mergeMicroGramsPerCubicMeter(com.google.protobuf.FloatValue value) {
      if (microGramsPerCubicMeterBuilder_ == null) {
        if (microGramsPerCubicMeter_ != null) {
          microGramsPerCubicMeter_ =
            com.google.protobuf.FloatValue.newBuilder(microGramsPerCubicMeter_).mergeFrom(value).buildPartial();
        } else {
          microGramsPerCubicMeter_ = value;
        }
        onChanged();
      } else {
        microGramsPerCubicMeterBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.FloatValue micro_grams_per_cubic_meter = 1;</code>
     */
    public Builder clearMicroGramsPerCubicMeter() {
      if (microGramsPerCubicMeterBuilder_ == null) {
        microGramsPerCubicMeter_ = null;
        onChanged();
      } else {
        microGramsPerCubicMeter_ = null;
        microGramsPerCubicMeterBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.FloatValue micro_grams_per_cubic_meter = 1;</code>
     */
    public com.google.protobuf.FloatValue.Builder getMicroGramsPerCubicMeterBuilder() {
      
      onChanged();
      return getMicroGramsPerCubicMeterFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.FloatValue micro_grams_per_cubic_meter = 1;</code>
     */
    public com.google.protobuf.FloatValueOrBuilder getMicroGramsPerCubicMeterOrBuilder() {
      if (microGramsPerCubicMeterBuilder_ != null) {
        return microGramsPerCubicMeterBuilder_.getMessageOrBuilder();
      } else {
        return microGramsPerCubicMeter_ == null ?
            com.google.protobuf.FloatValue.getDefaultInstance() : microGramsPerCubicMeter_;
      }
    }
    /**
     * <code>.google.protobuf.FloatValue micro_grams_per_cubic_meter = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FloatValue, com.google.protobuf.FloatValue.Builder, com.google.protobuf.FloatValueOrBuilder> 
        getMicroGramsPerCubicMeterFieldBuilder() {
      if (microGramsPerCubicMeterBuilder_ == null) {
        microGramsPerCubicMeterBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FloatValue, com.google.protobuf.FloatValue.Builder, com.google.protobuf.FloatValueOrBuilder>(
                getMicroGramsPerCubicMeter(),
                getParentForChildren(),
                isClean());
        microGramsPerCubicMeter_ = null;
      }
      return microGramsPerCubicMeterBuilder_;
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


    // @@protoc_insertion_point(builder_scope:pt.sharespot.iot.core.PM2_5)
  }

  // @@protoc_insertion_point(class_scope:pt.sharespot.iot.core.PM2_5)
  private static final pt.sharespot.iot.core.buf.model.PM2_5 DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new pt.sharespot.iot.core.buf.model.PM2_5();
  }

  public static pt.sharespot.iot.core.buf.model.PM2_5 getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PM2_5>
      PARSER = new com.google.protobuf.AbstractParser<PM2_5>() {
    @java.lang.Override
    public PM2_5 parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PM2_5(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PM2_5> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PM2_5> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public pt.sharespot.iot.core.buf.model.PM2_5 getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

