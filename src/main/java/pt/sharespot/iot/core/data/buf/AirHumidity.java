// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/resources/sensor.proto

package pt.sharespot.iot.core.data.buf;

/**
 * Protobuf type {@code pt.sharespot.iot.core.AirHumidity}
 */
public final class AirHumidity extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pt.sharespot.iot.core.AirHumidity)
    AirHumidityOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AirHumidity.newBuilder() to construct.
  private AirHumidity(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AirHumidity() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AirHumidity();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AirHumidity(
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
            if (gramsPerCubicMeter_ != null) {
              subBuilder = gramsPerCubicMeter_.toBuilder();
            }
            gramsPerCubicMeter_ = input.readMessage(com.google.protobuf.FloatValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(gramsPerCubicMeter_);
              gramsPerCubicMeter_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.FloatValue.Builder subBuilder = null;
            if (relativePercentage_ != null) {
              subBuilder = relativePercentage_.toBuilder();
            }
            relativePercentage_ = input.readMessage(com.google.protobuf.FloatValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(relativePercentage_);
              relativePercentage_ = subBuilder.buildPartial();
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return pt.sharespot.iot.core.data.buf.Sensor.internal_static_pt_sharespot_iot_core_AirHumidity_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return pt.sharespot.iot.core.data.buf.Sensor.internal_static_pt_sharespot_iot_core_AirHumidity_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            pt.sharespot.iot.core.data.buf.AirHumidity.class, pt.sharespot.iot.core.data.buf.AirHumidity.Builder.class);
  }

  public static final int GRAMS_PER_CUBIC_METER_FIELD_NUMBER = 1;
  private com.google.protobuf.FloatValue gramsPerCubicMeter_;
  /**
   * <code>.google.protobuf.FloatValue grams_per_cubic_meter = 1;</code>
   * @return Whether the gramsPerCubicMeter field is set.
   */
  @java.lang.Override
  public boolean hasGramsPerCubicMeter() {
    return gramsPerCubicMeter_ != null;
  }
  /**
   * <code>.google.protobuf.FloatValue grams_per_cubic_meter = 1;</code>
   * @return The gramsPerCubicMeter.
   */
  @java.lang.Override
  public com.google.protobuf.FloatValue getGramsPerCubicMeter() {
    return gramsPerCubicMeter_ == null ? com.google.protobuf.FloatValue.getDefaultInstance() : gramsPerCubicMeter_;
  }
  /**
   * <code>.google.protobuf.FloatValue grams_per_cubic_meter = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FloatValueOrBuilder getGramsPerCubicMeterOrBuilder() {
    return getGramsPerCubicMeter();
  }

  public static final int RELATIVE_PERCENTAGE_FIELD_NUMBER = 2;
  private com.google.protobuf.FloatValue relativePercentage_;
  /**
   * <code>.google.protobuf.FloatValue relative_percentage = 2;</code>
   * @return Whether the relativePercentage field is set.
   */
  @java.lang.Override
  public boolean hasRelativePercentage() {
    return relativePercentage_ != null;
  }
  /**
   * <code>.google.protobuf.FloatValue relative_percentage = 2;</code>
   * @return The relativePercentage.
   */
  @java.lang.Override
  public com.google.protobuf.FloatValue getRelativePercentage() {
    return relativePercentage_ == null ? com.google.protobuf.FloatValue.getDefaultInstance() : relativePercentage_;
  }
  /**
   * <code>.google.protobuf.FloatValue relative_percentage = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FloatValueOrBuilder getRelativePercentageOrBuilder() {
    return getRelativePercentage();
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
    if (gramsPerCubicMeter_ != null) {
      output.writeMessage(1, getGramsPerCubicMeter());
    }
    if (relativePercentage_ != null) {
      output.writeMessage(2, getRelativePercentage());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (gramsPerCubicMeter_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getGramsPerCubicMeter());
    }
    if (relativePercentage_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getRelativePercentage());
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
    if (!(obj instanceof pt.sharespot.iot.core.data.buf.AirHumidity)) {
      return super.equals(obj);
    }
    pt.sharespot.iot.core.data.buf.AirHumidity other = (pt.sharespot.iot.core.data.buf.AirHumidity) obj;

    if (hasGramsPerCubicMeter() != other.hasGramsPerCubicMeter()) return false;
    if (hasGramsPerCubicMeter()) {
      if (!getGramsPerCubicMeter()
          .equals(other.getGramsPerCubicMeter())) return false;
    }
    if (hasRelativePercentage() != other.hasRelativePercentage()) return false;
    if (hasRelativePercentage()) {
      if (!getRelativePercentage()
          .equals(other.getRelativePercentage())) return false;
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
    if (hasGramsPerCubicMeter()) {
      hash = (37 * hash) + GRAMS_PER_CUBIC_METER_FIELD_NUMBER;
      hash = (53 * hash) + getGramsPerCubicMeter().hashCode();
    }
    if (hasRelativePercentage()) {
      hash = (37 * hash) + RELATIVE_PERCENTAGE_FIELD_NUMBER;
      hash = (53 * hash) + getRelativePercentage().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static pt.sharespot.iot.core.data.buf.AirHumidity parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static pt.sharespot.iot.core.data.buf.AirHumidity parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static pt.sharespot.iot.core.data.buf.AirHumidity parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static pt.sharespot.iot.core.data.buf.AirHumidity parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static pt.sharespot.iot.core.data.buf.AirHumidity parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static pt.sharespot.iot.core.data.buf.AirHumidity parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static pt.sharespot.iot.core.data.buf.AirHumidity parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static pt.sharespot.iot.core.data.buf.AirHumidity parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static pt.sharespot.iot.core.data.buf.AirHumidity parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static pt.sharespot.iot.core.data.buf.AirHumidity parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static pt.sharespot.iot.core.data.buf.AirHumidity parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static pt.sharespot.iot.core.data.buf.AirHumidity parseFrom(
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
  public static Builder newBuilder(pt.sharespot.iot.core.data.buf.AirHumidity prototype) {
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
   * Protobuf type {@code pt.sharespot.iot.core.AirHumidity}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pt.sharespot.iot.core.AirHumidity)
      pt.sharespot.iot.core.data.buf.AirHumidityOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return pt.sharespot.iot.core.data.buf.Sensor.internal_static_pt_sharespot_iot_core_AirHumidity_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return pt.sharespot.iot.core.data.buf.Sensor.internal_static_pt_sharespot_iot_core_AirHumidity_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              pt.sharespot.iot.core.data.buf.AirHumidity.class, pt.sharespot.iot.core.data.buf.AirHumidity.Builder.class);
    }

    // Construct using pt.sharespot.iot.core.data.buf.AirHumidity.newBuilder()
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
      if (gramsPerCubicMeterBuilder_ == null) {
        gramsPerCubicMeter_ = null;
      } else {
        gramsPerCubicMeter_ = null;
        gramsPerCubicMeterBuilder_ = null;
      }
      if (relativePercentageBuilder_ == null) {
        relativePercentage_ = null;
      } else {
        relativePercentage_ = null;
        relativePercentageBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return pt.sharespot.iot.core.data.buf.Sensor.internal_static_pt_sharespot_iot_core_AirHumidity_descriptor;
    }

    @java.lang.Override
    public pt.sharespot.iot.core.data.buf.AirHumidity getDefaultInstanceForType() {
      return pt.sharespot.iot.core.data.buf.AirHumidity.getDefaultInstance();
    }

    @java.lang.Override
    public pt.sharespot.iot.core.data.buf.AirHumidity build() {
      pt.sharespot.iot.core.data.buf.AirHumidity result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public pt.sharespot.iot.core.data.buf.AirHumidity buildPartial() {
      pt.sharespot.iot.core.data.buf.AirHumidity result = new pt.sharespot.iot.core.data.buf.AirHumidity(this);
      if (gramsPerCubicMeterBuilder_ == null) {
        result.gramsPerCubicMeter_ = gramsPerCubicMeter_;
      } else {
        result.gramsPerCubicMeter_ = gramsPerCubicMeterBuilder_.build();
      }
      if (relativePercentageBuilder_ == null) {
        result.relativePercentage_ = relativePercentage_;
      } else {
        result.relativePercentage_ = relativePercentageBuilder_.build();
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
      if (other instanceof pt.sharespot.iot.core.data.buf.AirHumidity) {
        return mergeFrom((pt.sharespot.iot.core.data.buf.AirHumidity)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(pt.sharespot.iot.core.data.buf.AirHumidity other) {
      if (other == pt.sharespot.iot.core.data.buf.AirHumidity.getDefaultInstance()) return this;
      if (other.hasGramsPerCubicMeter()) {
        mergeGramsPerCubicMeter(other.getGramsPerCubicMeter());
      }
      if (other.hasRelativePercentage()) {
        mergeRelativePercentage(other.getRelativePercentage());
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
      pt.sharespot.iot.core.data.buf.AirHumidity parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (pt.sharespot.iot.core.data.buf.AirHumidity) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.FloatValue gramsPerCubicMeter_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FloatValue, com.google.protobuf.FloatValue.Builder, com.google.protobuf.FloatValueOrBuilder> gramsPerCubicMeterBuilder_;
    /**
     * <code>.google.protobuf.FloatValue grams_per_cubic_meter = 1;</code>
     * @return Whether the gramsPerCubicMeter field is set.
     */
    public boolean hasGramsPerCubicMeter() {
      return gramsPerCubicMeterBuilder_ != null || gramsPerCubicMeter_ != null;
    }
    /**
     * <code>.google.protobuf.FloatValue grams_per_cubic_meter = 1;</code>
     * @return The gramsPerCubicMeter.
     */
    public com.google.protobuf.FloatValue getGramsPerCubicMeter() {
      if (gramsPerCubicMeterBuilder_ == null) {
        return gramsPerCubicMeter_ == null ? com.google.protobuf.FloatValue.getDefaultInstance() : gramsPerCubicMeter_;
      } else {
        return gramsPerCubicMeterBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.FloatValue grams_per_cubic_meter = 1;</code>
     */
    public Builder setGramsPerCubicMeter(com.google.protobuf.FloatValue value) {
      if (gramsPerCubicMeterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        gramsPerCubicMeter_ = value;
        onChanged();
      } else {
        gramsPerCubicMeterBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.FloatValue grams_per_cubic_meter = 1;</code>
     */
    public Builder setGramsPerCubicMeter(
        com.google.protobuf.FloatValue.Builder builderForValue) {
      if (gramsPerCubicMeterBuilder_ == null) {
        gramsPerCubicMeter_ = builderForValue.build();
        onChanged();
      } else {
        gramsPerCubicMeterBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.FloatValue grams_per_cubic_meter = 1;</code>
     */
    public Builder mergeGramsPerCubicMeter(com.google.protobuf.FloatValue value) {
      if (gramsPerCubicMeterBuilder_ == null) {
        if (gramsPerCubicMeter_ != null) {
          gramsPerCubicMeter_ =
            com.google.protobuf.FloatValue.newBuilder(gramsPerCubicMeter_).mergeFrom(value).buildPartial();
        } else {
          gramsPerCubicMeter_ = value;
        }
        onChanged();
      } else {
        gramsPerCubicMeterBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.FloatValue grams_per_cubic_meter = 1;</code>
     */
    public Builder clearGramsPerCubicMeter() {
      if (gramsPerCubicMeterBuilder_ == null) {
        gramsPerCubicMeter_ = null;
        onChanged();
      } else {
        gramsPerCubicMeter_ = null;
        gramsPerCubicMeterBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.FloatValue grams_per_cubic_meter = 1;</code>
     */
    public com.google.protobuf.FloatValue.Builder getGramsPerCubicMeterBuilder() {
      
      onChanged();
      return getGramsPerCubicMeterFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.FloatValue grams_per_cubic_meter = 1;</code>
     */
    public com.google.protobuf.FloatValueOrBuilder getGramsPerCubicMeterOrBuilder() {
      if (gramsPerCubicMeterBuilder_ != null) {
        return gramsPerCubicMeterBuilder_.getMessageOrBuilder();
      } else {
        return gramsPerCubicMeter_ == null ?
            com.google.protobuf.FloatValue.getDefaultInstance() : gramsPerCubicMeter_;
      }
    }
    /**
     * <code>.google.protobuf.FloatValue grams_per_cubic_meter = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FloatValue, com.google.protobuf.FloatValue.Builder, com.google.protobuf.FloatValueOrBuilder> 
        getGramsPerCubicMeterFieldBuilder() {
      if (gramsPerCubicMeterBuilder_ == null) {
        gramsPerCubicMeterBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FloatValue, com.google.protobuf.FloatValue.Builder, com.google.protobuf.FloatValueOrBuilder>(
                getGramsPerCubicMeter(),
                getParentForChildren(),
                isClean());
        gramsPerCubicMeter_ = null;
      }
      return gramsPerCubicMeterBuilder_;
    }

    private com.google.protobuf.FloatValue relativePercentage_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FloatValue, com.google.protobuf.FloatValue.Builder, com.google.protobuf.FloatValueOrBuilder> relativePercentageBuilder_;
    /**
     * <code>.google.protobuf.FloatValue relative_percentage = 2;</code>
     * @return Whether the relativePercentage field is set.
     */
    public boolean hasRelativePercentage() {
      return relativePercentageBuilder_ != null || relativePercentage_ != null;
    }
    /**
     * <code>.google.protobuf.FloatValue relative_percentage = 2;</code>
     * @return The relativePercentage.
     */
    public com.google.protobuf.FloatValue getRelativePercentage() {
      if (relativePercentageBuilder_ == null) {
        return relativePercentage_ == null ? com.google.protobuf.FloatValue.getDefaultInstance() : relativePercentage_;
      } else {
        return relativePercentageBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.FloatValue relative_percentage = 2;</code>
     */
    public Builder setRelativePercentage(com.google.protobuf.FloatValue value) {
      if (relativePercentageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        relativePercentage_ = value;
        onChanged();
      } else {
        relativePercentageBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.FloatValue relative_percentage = 2;</code>
     */
    public Builder setRelativePercentage(
        com.google.protobuf.FloatValue.Builder builderForValue) {
      if (relativePercentageBuilder_ == null) {
        relativePercentage_ = builderForValue.build();
        onChanged();
      } else {
        relativePercentageBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.FloatValue relative_percentage = 2;</code>
     */
    public Builder mergeRelativePercentage(com.google.protobuf.FloatValue value) {
      if (relativePercentageBuilder_ == null) {
        if (relativePercentage_ != null) {
          relativePercentage_ =
            com.google.protobuf.FloatValue.newBuilder(relativePercentage_).mergeFrom(value).buildPartial();
        } else {
          relativePercentage_ = value;
        }
        onChanged();
      } else {
        relativePercentageBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.FloatValue relative_percentage = 2;</code>
     */
    public Builder clearRelativePercentage() {
      if (relativePercentageBuilder_ == null) {
        relativePercentage_ = null;
        onChanged();
      } else {
        relativePercentage_ = null;
        relativePercentageBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.FloatValue relative_percentage = 2;</code>
     */
    public com.google.protobuf.FloatValue.Builder getRelativePercentageBuilder() {
      
      onChanged();
      return getRelativePercentageFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.FloatValue relative_percentage = 2;</code>
     */
    public com.google.protobuf.FloatValueOrBuilder getRelativePercentageOrBuilder() {
      if (relativePercentageBuilder_ != null) {
        return relativePercentageBuilder_.getMessageOrBuilder();
      } else {
        return relativePercentage_ == null ?
            com.google.protobuf.FloatValue.getDefaultInstance() : relativePercentage_;
      }
    }
    /**
     * <code>.google.protobuf.FloatValue relative_percentage = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FloatValue, com.google.protobuf.FloatValue.Builder, com.google.protobuf.FloatValueOrBuilder> 
        getRelativePercentageFieldBuilder() {
      if (relativePercentageBuilder_ == null) {
        relativePercentageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FloatValue, com.google.protobuf.FloatValue.Builder, com.google.protobuf.FloatValueOrBuilder>(
                getRelativePercentage(),
                getParentForChildren(),
                isClean());
        relativePercentage_ = null;
      }
      return relativePercentageBuilder_;
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


    // @@protoc_insertion_point(builder_scope:pt.sharespot.iot.core.AirHumidity)
  }

  // @@protoc_insertion_point(class_scope:pt.sharespot.iot.core.AirHumidity)
  private static final pt.sharespot.iot.core.data.buf.AirHumidity DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new pt.sharespot.iot.core.data.buf.AirHumidity();
  }

  public static pt.sharespot.iot.core.data.buf.AirHumidity getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AirHumidity>
      PARSER = new com.google.protobuf.AbstractParser<AirHumidity>() {
    @java.lang.Override
    public AirHumidity parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AirHumidity(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AirHumidity> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AirHumidity> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public pt.sharespot.iot.core.data.buf.AirHumidity getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

