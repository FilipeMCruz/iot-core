// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/resources/sensor.proto

package pt.sharespot.iot.core.data.buf;

/**
 * Protobuf type {@code pt.sharespot.iot.core.GPS}
 */
public final class GPS extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pt.sharespot.iot.core.GPS)
    GPSOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GPS.newBuilder() to construct.
  private GPS(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GPS() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GPS();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GPS(
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
            com.google.protobuf.DoubleValue.Builder subBuilder = null;
            if (latitude_ != null) {
              subBuilder = latitude_.toBuilder();
            }
            latitude_ = input.readMessage(com.google.protobuf.DoubleValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(latitude_);
              latitude_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.DoubleValue.Builder subBuilder = null;
            if (longitude_ != null) {
              subBuilder = longitude_.toBuilder();
            }
            longitude_ = input.readMessage(com.google.protobuf.DoubleValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(longitude_);
              longitude_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.google.protobuf.FloatValue.Builder subBuilder = null;
            if (altitude_ != null) {
              subBuilder = altitude_.toBuilder();
            }
            altitude_ = input.readMessage(com.google.protobuf.FloatValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(altitude_);
              altitude_ = subBuilder.buildPartial();
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
    return pt.sharespot.iot.core.data.buf.Sensor.internal_static_pt_sharespot_iot_core_GPS_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return pt.sharespot.iot.core.data.buf.Sensor.internal_static_pt_sharespot_iot_core_GPS_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            pt.sharespot.iot.core.data.buf.GPS.class, pt.sharespot.iot.core.data.buf.GPS.Builder.class);
  }

  public static final int LATITUDE_FIELD_NUMBER = 1;
  private com.google.protobuf.DoubleValue latitude_;
  /**
   * <code>.google.protobuf.DoubleValue latitude = 1;</code>
   * @return Whether the latitude field is set.
   */
  @java.lang.Override
  public boolean hasLatitude() {
    return latitude_ != null;
  }
  /**
   * <code>.google.protobuf.DoubleValue latitude = 1;</code>
   * @return The latitude.
   */
  @java.lang.Override
  public com.google.protobuf.DoubleValue getLatitude() {
    return latitude_ == null ? com.google.protobuf.DoubleValue.getDefaultInstance() : latitude_;
  }
  /**
   * <code>.google.protobuf.DoubleValue latitude = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.DoubleValueOrBuilder getLatitudeOrBuilder() {
    return getLatitude();
  }

  public static final int LONGITUDE_FIELD_NUMBER = 2;
  private com.google.protobuf.DoubleValue longitude_;
  /**
   * <code>.google.protobuf.DoubleValue longitude = 2;</code>
   * @return Whether the longitude field is set.
   */
  @java.lang.Override
  public boolean hasLongitude() {
    return longitude_ != null;
  }
  /**
   * <code>.google.protobuf.DoubleValue longitude = 2;</code>
   * @return The longitude.
   */
  @java.lang.Override
  public com.google.protobuf.DoubleValue getLongitude() {
    return longitude_ == null ? com.google.protobuf.DoubleValue.getDefaultInstance() : longitude_;
  }
  /**
   * <code>.google.protobuf.DoubleValue longitude = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.DoubleValueOrBuilder getLongitudeOrBuilder() {
    return getLongitude();
  }

  public static final int ALTITUDE_FIELD_NUMBER = 3;
  private com.google.protobuf.FloatValue altitude_;
  /**
   * <code>.google.protobuf.FloatValue altitude = 3;</code>
   * @return Whether the altitude field is set.
   */
  @java.lang.Override
  public boolean hasAltitude() {
    return altitude_ != null;
  }
  /**
   * <code>.google.protobuf.FloatValue altitude = 3;</code>
   * @return The altitude.
   */
  @java.lang.Override
  public com.google.protobuf.FloatValue getAltitude() {
    return altitude_ == null ? com.google.protobuf.FloatValue.getDefaultInstance() : altitude_;
  }
  /**
   * <code>.google.protobuf.FloatValue altitude = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FloatValueOrBuilder getAltitudeOrBuilder() {
    return getAltitude();
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
    if (latitude_ != null) {
      output.writeMessage(1, getLatitude());
    }
    if (longitude_ != null) {
      output.writeMessage(2, getLongitude());
    }
    if (altitude_ != null) {
      output.writeMessage(3, getAltitude());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (latitude_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLatitude());
    }
    if (longitude_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getLongitude());
    }
    if (altitude_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getAltitude());
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
    if (!(obj instanceof pt.sharespot.iot.core.data.buf.GPS)) {
      return super.equals(obj);
    }
    pt.sharespot.iot.core.data.buf.GPS other = (pt.sharespot.iot.core.data.buf.GPS) obj;

    if (hasLatitude() != other.hasLatitude()) return false;
    if (hasLatitude()) {
      if (!getLatitude()
          .equals(other.getLatitude())) return false;
    }
    if (hasLongitude() != other.hasLongitude()) return false;
    if (hasLongitude()) {
      if (!getLongitude()
          .equals(other.getLongitude())) return false;
    }
    if (hasAltitude() != other.hasAltitude()) return false;
    if (hasAltitude()) {
      if (!getAltitude()
          .equals(other.getAltitude())) return false;
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
    if (hasLatitude()) {
      hash = (37 * hash) + LATITUDE_FIELD_NUMBER;
      hash = (53 * hash) + getLatitude().hashCode();
    }
    if (hasLongitude()) {
      hash = (37 * hash) + LONGITUDE_FIELD_NUMBER;
      hash = (53 * hash) + getLongitude().hashCode();
    }
    if (hasAltitude()) {
      hash = (37 * hash) + ALTITUDE_FIELD_NUMBER;
      hash = (53 * hash) + getAltitude().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static pt.sharespot.iot.core.data.buf.GPS parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static pt.sharespot.iot.core.data.buf.GPS parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static pt.sharespot.iot.core.data.buf.GPS parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static pt.sharespot.iot.core.data.buf.GPS parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static pt.sharespot.iot.core.data.buf.GPS parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static pt.sharespot.iot.core.data.buf.GPS parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static pt.sharespot.iot.core.data.buf.GPS parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static pt.sharespot.iot.core.data.buf.GPS parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static pt.sharespot.iot.core.data.buf.GPS parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static pt.sharespot.iot.core.data.buf.GPS parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static pt.sharespot.iot.core.data.buf.GPS parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static pt.sharespot.iot.core.data.buf.GPS parseFrom(
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
  public static Builder newBuilder(pt.sharespot.iot.core.data.buf.GPS prototype) {
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
   * Protobuf type {@code pt.sharespot.iot.core.GPS}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pt.sharespot.iot.core.GPS)
      pt.sharespot.iot.core.data.buf.GPSOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return pt.sharespot.iot.core.data.buf.Sensor.internal_static_pt_sharespot_iot_core_GPS_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return pt.sharespot.iot.core.data.buf.Sensor.internal_static_pt_sharespot_iot_core_GPS_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              pt.sharespot.iot.core.data.buf.GPS.class, pt.sharespot.iot.core.data.buf.GPS.Builder.class);
    }

    // Construct using pt.sharespot.iot.core.data.buf.GPS.newBuilder()
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
      if (latitudeBuilder_ == null) {
        latitude_ = null;
      } else {
        latitude_ = null;
        latitudeBuilder_ = null;
      }
      if (longitudeBuilder_ == null) {
        longitude_ = null;
      } else {
        longitude_ = null;
        longitudeBuilder_ = null;
      }
      if (altitudeBuilder_ == null) {
        altitude_ = null;
      } else {
        altitude_ = null;
        altitudeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return pt.sharespot.iot.core.data.buf.Sensor.internal_static_pt_sharespot_iot_core_GPS_descriptor;
    }

    @java.lang.Override
    public pt.sharespot.iot.core.data.buf.GPS getDefaultInstanceForType() {
      return pt.sharespot.iot.core.data.buf.GPS.getDefaultInstance();
    }

    @java.lang.Override
    public pt.sharespot.iot.core.data.buf.GPS build() {
      pt.sharespot.iot.core.data.buf.GPS result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public pt.sharespot.iot.core.data.buf.GPS buildPartial() {
      pt.sharespot.iot.core.data.buf.GPS result = new pt.sharespot.iot.core.data.buf.GPS(this);
      if (latitudeBuilder_ == null) {
        result.latitude_ = latitude_;
      } else {
        result.latitude_ = latitudeBuilder_.build();
      }
      if (longitudeBuilder_ == null) {
        result.longitude_ = longitude_;
      } else {
        result.longitude_ = longitudeBuilder_.build();
      }
      if (altitudeBuilder_ == null) {
        result.altitude_ = altitude_;
      } else {
        result.altitude_ = altitudeBuilder_.build();
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
      if (other instanceof pt.sharespot.iot.core.data.buf.GPS) {
        return mergeFrom((pt.sharespot.iot.core.data.buf.GPS)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(pt.sharespot.iot.core.data.buf.GPS other) {
      if (other == pt.sharespot.iot.core.data.buf.GPS.getDefaultInstance()) return this;
      if (other.hasLatitude()) {
        mergeLatitude(other.getLatitude());
      }
      if (other.hasLongitude()) {
        mergeLongitude(other.getLongitude());
      }
      if (other.hasAltitude()) {
        mergeAltitude(other.getAltitude());
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
      pt.sharespot.iot.core.data.buf.GPS parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (pt.sharespot.iot.core.data.buf.GPS) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.DoubleValue latitude_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder> latitudeBuilder_;
    /**
     * <code>.google.protobuf.DoubleValue latitude = 1;</code>
     * @return Whether the latitude field is set.
     */
    public boolean hasLatitude() {
      return latitudeBuilder_ != null || latitude_ != null;
    }
    /**
     * <code>.google.protobuf.DoubleValue latitude = 1;</code>
     * @return The latitude.
     */
    public com.google.protobuf.DoubleValue getLatitude() {
      if (latitudeBuilder_ == null) {
        return latitude_ == null ? com.google.protobuf.DoubleValue.getDefaultInstance() : latitude_;
      } else {
        return latitudeBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.DoubleValue latitude = 1;</code>
     */
    public Builder setLatitude(com.google.protobuf.DoubleValue value) {
      if (latitudeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        latitude_ = value;
        onChanged();
      } else {
        latitudeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.DoubleValue latitude = 1;</code>
     */
    public Builder setLatitude(
        com.google.protobuf.DoubleValue.Builder builderForValue) {
      if (latitudeBuilder_ == null) {
        latitude_ = builderForValue.build();
        onChanged();
      } else {
        latitudeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.DoubleValue latitude = 1;</code>
     */
    public Builder mergeLatitude(com.google.protobuf.DoubleValue value) {
      if (latitudeBuilder_ == null) {
        if (latitude_ != null) {
          latitude_ =
            com.google.protobuf.DoubleValue.newBuilder(latitude_).mergeFrom(value).buildPartial();
        } else {
          latitude_ = value;
        }
        onChanged();
      } else {
        latitudeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.DoubleValue latitude = 1;</code>
     */
    public Builder clearLatitude() {
      if (latitudeBuilder_ == null) {
        latitude_ = null;
        onChanged();
      } else {
        latitude_ = null;
        latitudeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.DoubleValue latitude = 1;</code>
     */
    public com.google.protobuf.DoubleValue.Builder getLatitudeBuilder() {
      
      onChanged();
      return getLatitudeFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.DoubleValue latitude = 1;</code>
     */
    public com.google.protobuf.DoubleValueOrBuilder getLatitudeOrBuilder() {
      if (latitudeBuilder_ != null) {
        return latitudeBuilder_.getMessageOrBuilder();
      } else {
        return latitude_ == null ?
            com.google.protobuf.DoubleValue.getDefaultInstance() : latitude_;
      }
    }
    /**
     * <code>.google.protobuf.DoubleValue latitude = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder> 
        getLatitudeFieldBuilder() {
      if (latitudeBuilder_ == null) {
        latitudeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder>(
                getLatitude(),
                getParentForChildren(),
                isClean());
        latitude_ = null;
      }
      return latitudeBuilder_;
    }

    private com.google.protobuf.DoubleValue longitude_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder> longitudeBuilder_;
    /**
     * <code>.google.protobuf.DoubleValue longitude = 2;</code>
     * @return Whether the longitude field is set.
     */
    public boolean hasLongitude() {
      return longitudeBuilder_ != null || longitude_ != null;
    }
    /**
     * <code>.google.protobuf.DoubleValue longitude = 2;</code>
     * @return The longitude.
     */
    public com.google.protobuf.DoubleValue getLongitude() {
      if (longitudeBuilder_ == null) {
        return longitude_ == null ? com.google.protobuf.DoubleValue.getDefaultInstance() : longitude_;
      } else {
        return longitudeBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.DoubleValue longitude = 2;</code>
     */
    public Builder setLongitude(com.google.protobuf.DoubleValue value) {
      if (longitudeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        longitude_ = value;
        onChanged();
      } else {
        longitudeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.DoubleValue longitude = 2;</code>
     */
    public Builder setLongitude(
        com.google.protobuf.DoubleValue.Builder builderForValue) {
      if (longitudeBuilder_ == null) {
        longitude_ = builderForValue.build();
        onChanged();
      } else {
        longitudeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.DoubleValue longitude = 2;</code>
     */
    public Builder mergeLongitude(com.google.protobuf.DoubleValue value) {
      if (longitudeBuilder_ == null) {
        if (longitude_ != null) {
          longitude_ =
            com.google.protobuf.DoubleValue.newBuilder(longitude_).mergeFrom(value).buildPartial();
        } else {
          longitude_ = value;
        }
        onChanged();
      } else {
        longitudeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.DoubleValue longitude = 2;</code>
     */
    public Builder clearLongitude() {
      if (longitudeBuilder_ == null) {
        longitude_ = null;
        onChanged();
      } else {
        longitude_ = null;
        longitudeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.DoubleValue longitude = 2;</code>
     */
    public com.google.protobuf.DoubleValue.Builder getLongitudeBuilder() {
      
      onChanged();
      return getLongitudeFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.DoubleValue longitude = 2;</code>
     */
    public com.google.protobuf.DoubleValueOrBuilder getLongitudeOrBuilder() {
      if (longitudeBuilder_ != null) {
        return longitudeBuilder_.getMessageOrBuilder();
      } else {
        return longitude_ == null ?
            com.google.protobuf.DoubleValue.getDefaultInstance() : longitude_;
      }
    }
    /**
     * <code>.google.protobuf.DoubleValue longitude = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder> 
        getLongitudeFieldBuilder() {
      if (longitudeBuilder_ == null) {
        longitudeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder>(
                getLongitude(),
                getParentForChildren(),
                isClean());
        longitude_ = null;
      }
      return longitudeBuilder_;
    }

    private com.google.protobuf.FloatValue altitude_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FloatValue, com.google.protobuf.FloatValue.Builder, com.google.protobuf.FloatValueOrBuilder> altitudeBuilder_;
    /**
     * <code>.google.protobuf.FloatValue altitude = 3;</code>
     * @return Whether the altitude field is set.
     */
    public boolean hasAltitude() {
      return altitudeBuilder_ != null || altitude_ != null;
    }
    /**
     * <code>.google.protobuf.FloatValue altitude = 3;</code>
     * @return The altitude.
     */
    public com.google.protobuf.FloatValue getAltitude() {
      if (altitudeBuilder_ == null) {
        return altitude_ == null ? com.google.protobuf.FloatValue.getDefaultInstance() : altitude_;
      } else {
        return altitudeBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.FloatValue altitude = 3;</code>
     */
    public Builder setAltitude(com.google.protobuf.FloatValue value) {
      if (altitudeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        altitude_ = value;
        onChanged();
      } else {
        altitudeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.FloatValue altitude = 3;</code>
     */
    public Builder setAltitude(
        com.google.protobuf.FloatValue.Builder builderForValue) {
      if (altitudeBuilder_ == null) {
        altitude_ = builderForValue.build();
        onChanged();
      } else {
        altitudeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.FloatValue altitude = 3;</code>
     */
    public Builder mergeAltitude(com.google.protobuf.FloatValue value) {
      if (altitudeBuilder_ == null) {
        if (altitude_ != null) {
          altitude_ =
            com.google.protobuf.FloatValue.newBuilder(altitude_).mergeFrom(value).buildPartial();
        } else {
          altitude_ = value;
        }
        onChanged();
      } else {
        altitudeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.FloatValue altitude = 3;</code>
     */
    public Builder clearAltitude() {
      if (altitudeBuilder_ == null) {
        altitude_ = null;
        onChanged();
      } else {
        altitude_ = null;
        altitudeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.FloatValue altitude = 3;</code>
     */
    public com.google.protobuf.FloatValue.Builder getAltitudeBuilder() {
      
      onChanged();
      return getAltitudeFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.FloatValue altitude = 3;</code>
     */
    public com.google.protobuf.FloatValueOrBuilder getAltitudeOrBuilder() {
      if (altitudeBuilder_ != null) {
        return altitudeBuilder_.getMessageOrBuilder();
      } else {
        return altitude_ == null ?
            com.google.protobuf.FloatValue.getDefaultInstance() : altitude_;
      }
    }
    /**
     * <code>.google.protobuf.FloatValue altitude = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FloatValue, com.google.protobuf.FloatValue.Builder, com.google.protobuf.FloatValueOrBuilder> 
        getAltitudeFieldBuilder() {
      if (altitudeBuilder_ == null) {
        altitudeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FloatValue, com.google.protobuf.FloatValue.Builder, com.google.protobuf.FloatValueOrBuilder>(
                getAltitude(),
                getParentForChildren(),
                isClean());
        altitude_ = null;
      }
      return altitudeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:pt.sharespot.iot.core.GPS)
  }

  // @@protoc_insertion_point(class_scope:pt.sharespot.iot.core.GPS)
  private static final pt.sharespot.iot.core.data.buf.GPS DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new pt.sharespot.iot.core.data.buf.GPS();
  }

  public static pt.sharespot.iot.core.data.buf.GPS getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GPS>
      PARSER = new com.google.protobuf.AbstractParser<GPS>() {
    @java.lang.Override
    public GPS parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GPS(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GPS> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GPS> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public pt.sharespot.iot.core.data.buf.GPS getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

