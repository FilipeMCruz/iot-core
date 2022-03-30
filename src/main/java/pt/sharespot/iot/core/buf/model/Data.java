// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/resources/message.proto

package pt.sharespot.iot.core.buf.model;

/**
 * Protobuf type {@code pt.sharespot.iot.core.Data}
 */
public final class Data extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pt.sharespot.iot.core.Data)
    DataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Data.newBuilder() to construct.
  private Data(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Data() {
    dataId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Data();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Data(
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
            java.lang.String s = input.readStringRequireUtf8();

            dataId_ = s;
            break;
          }
          case 16: {

            reportedAt_ = input.readInt64();
            break;
          }
          case 26: {
            pt.sharespot.iot.core.buf.model.Device.Builder subBuilder = null;
            if (device_ != null) {
              subBuilder = device_.toBuilder();
            }
            device_ = input.readMessage(pt.sharespot.iot.core.buf.model.Device.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(device_);
              device_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            pt.sharespot.iot.core.buf.model.SensorData.Builder subBuilder = null;
            if (sensorData_ != null) {
              subBuilder = sensorData_.toBuilder();
            }
            sensorData_ = input.readMessage(pt.sharespot.iot.core.buf.model.SensorData.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(sensorData_);
              sensorData_ = subBuilder.buildPartial();
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
    return pt.sharespot.iot.core.buf.model.MessageOuterClass.internal_static_pt_sharespot_iot_core_Data_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return pt.sharespot.iot.core.buf.model.MessageOuterClass.internal_static_pt_sharespot_iot_core_Data_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            pt.sharespot.iot.core.buf.model.Data.class, pt.sharespot.iot.core.buf.model.Data.Builder.class);
  }

  public static final int DATA_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object dataId_;
  /**
   * <code>string data_id = 1;</code>
   * @return The dataId.
   */
  @java.lang.Override
  public java.lang.String getDataId() {
    java.lang.Object ref = dataId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dataId_ = s;
      return s;
    }
  }
  /**
   * <code>string data_id = 1;</code>
   * @return The bytes for dataId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDataIdBytes() {
    java.lang.Object ref = dataId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dataId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REPORTED_AT_FIELD_NUMBER = 2;
  private long reportedAt_;
  /**
   * <code>int64 reported_at = 2;</code>
   * @return The reportedAt.
   */
  @java.lang.Override
  public long getReportedAt() {
    return reportedAt_;
  }

  public static final int DEVICE_FIELD_NUMBER = 3;
  private pt.sharespot.iot.core.buf.model.Device device_;
  /**
   * <code>.pt.sharespot.iot.core.Device device = 3;</code>
   * @return Whether the device field is set.
   */
  @java.lang.Override
  public boolean hasDevice() {
    return device_ != null;
  }
  /**
   * <code>.pt.sharespot.iot.core.Device device = 3;</code>
   * @return The device.
   */
  @java.lang.Override
  public pt.sharespot.iot.core.buf.model.Device getDevice() {
    return device_ == null ? pt.sharespot.iot.core.buf.model.Device.getDefaultInstance() : device_;
  }
  /**
   * <code>.pt.sharespot.iot.core.Device device = 3;</code>
   */
  @java.lang.Override
  public pt.sharespot.iot.core.buf.model.DeviceOrBuilder getDeviceOrBuilder() {
    return getDevice();
  }

  public static final int SENSOR_DATA_FIELD_NUMBER = 4;
  private pt.sharespot.iot.core.buf.model.SensorData sensorData_;
  /**
   * <code>.pt.sharespot.iot.core.SensorData sensor_data = 4;</code>
   * @return Whether the sensorData field is set.
   */
  @java.lang.Override
  public boolean hasSensorData() {
    return sensorData_ != null;
  }
  /**
   * <code>.pt.sharespot.iot.core.SensorData sensor_data = 4;</code>
   * @return The sensorData.
   */
  @java.lang.Override
  public pt.sharespot.iot.core.buf.model.SensorData getSensorData() {
    return sensorData_ == null ? pt.sharespot.iot.core.buf.model.SensorData.getDefaultInstance() : sensorData_;
  }
  /**
   * <code>.pt.sharespot.iot.core.SensorData sensor_data = 4;</code>
   */
  @java.lang.Override
  public pt.sharespot.iot.core.buf.model.SensorDataOrBuilder getSensorDataOrBuilder() {
    return getSensorData();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dataId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, dataId_);
    }
    if (reportedAt_ != 0L) {
      output.writeInt64(2, reportedAt_);
    }
    if (device_ != null) {
      output.writeMessage(3, getDevice());
    }
    if (sensorData_ != null) {
      output.writeMessage(4, getSensorData());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dataId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, dataId_);
    }
    if (reportedAt_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, reportedAt_);
    }
    if (device_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getDevice());
    }
    if (sensorData_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getSensorData());
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
    if (!(obj instanceof pt.sharespot.iot.core.buf.model.Data)) {
      return super.equals(obj);
    }
    pt.sharespot.iot.core.buf.model.Data other = (pt.sharespot.iot.core.buf.model.Data) obj;

    if (!getDataId()
        .equals(other.getDataId())) return false;
    if (getReportedAt()
        != other.getReportedAt()) return false;
    if (hasDevice() != other.hasDevice()) return false;
    if (hasDevice()) {
      if (!getDevice()
          .equals(other.getDevice())) return false;
    }
    if (hasSensorData() != other.hasSensorData()) return false;
    if (hasSensorData()) {
      if (!getSensorData()
          .equals(other.getSensorData())) return false;
    }
    return unknownFields.equals(other.unknownFields);
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DATA_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDataId().hashCode();
    hash = (37 * hash) + REPORTED_AT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getReportedAt());
    if (hasDevice()) {
      hash = (37 * hash) + DEVICE_FIELD_NUMBER;
      hash = (53 * hash) + getDevice().hashCode();
    }
    if (hasSensorData()) {
      hash = (37 * hash) + SENSOR_DATA_FIELD_NUMBER;
      hash = (53 * hash) + getSensorData().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static pt.sharespot.iot.core.buf.model.Data parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static pt.sharespot.iot.core.buf.model.Data parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static pt.sharespot.iot.core.buf.model.Data parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static pt.sharespot.iot.core.buf.model.Data parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static pt.sharespot.iot.core.buf.model.Data parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static pt.sharespot.iot.core.buf.model.Data parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static pt.sharespot.iot.core.buf.model.Data parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static pt.sharespot.iot.core.buf.model.Data parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static pt.sharespot.iot.core.buf.model.Data parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static pt.sharespot.iot.core.buf.model.Data parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static pt.sharespot.iot.core.buf.model.Data parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static pt.sharespot.iot.core.buf.model.Data parseFrom(
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
  public static Builder newBuilder(pt.sharespot.iot.core.buf.model.Data prototype) {
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
   * Protobuf type {@code pt.sharespot.iot.core.Data}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pt.sharespot.iot.core.Data)
      pt.sharespot.iot.core.buf.model.DataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return pt.sharespot.iot.core.buf.model.MessageOuterClass.internal_static_pt_sharespot_iot_core_Data_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return pt.sharespot.iot.core.buf.model.MessageOuterClass.internal_static_pt_sharespot_iot_core_Data_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              pt.sharespot.iot.core.buf.model.Data.class, pt.sharespot.iot.core.buf.model.Data.Builder.class);
    }

    // Construct using pt.sharespot.iot.core.buf.model.Data.newBuilder()
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
      dataId_ = "";

      reportedAt_ = 0L;

      if (deviceBuilder_ == null) {
        device_ = null;
      } else {
        device_ = null;
        deviceBuilder_ = null;
      }
      if (sensorDataBuilder_ == null) {
        sensorData_ = null;
      } else {
        sensorData_ = null;
        sensorDataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return pt.sharespot.iot.core.buf.model.MessageOuterClass.internal_static_pt_sharespot_iot_core_Data_descriptor;
    }

    @java.lang.Override
    public pt.sharespot.iot.core.buf.model.Data getDefaultInstanceForType() {
      return pt.sharespot.iot.core.buf.model.Data.getDefaultInstance();
    }

    @java.lang.Override
    public pt.sharespot.iot.core.buf.model.Data build() {
      pt.sharespot.iot.core.buf.model.Data result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public pt.sharespot.iot.core.buf.model.Data buildPartial() {
      pt.sharespot.iot.core.buf.model.Data result = new pt.sharespot.iot.core.buf.model.Data(this);
      result.dataId_ = dataId_;
      result.reportedAt_ = reportedAt_;
      if (deviceBuilder_ == null) {
        result.device_ = device_;
      } else {
        result.device_ = deviceBuilder_.build();
      }
      if (sensorDataBuilder_ == null) {
        result.sensorData_ = sensorData_;
      } else {
        result.sensorData_ = sensorDataBuilder_.build();
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
      if (other instanceof pt.sharespot.iot.core.buf.model.Data) {
        return mergeFrom((pt.sharespot.iot.core.buf.model.Data)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(pt.sharespot.iot.core.buf.model.Data other) {
      if (other == pt.sharespot.iot.core.buf.model.Data.getDefaultInstance()) return this;
      if (!other.getDataId().isEmpty()) {
        dataId_ = other.dataId_;
        onChanged();
      }
      if (other.getReportedAt() != 0L) {
        setReportedAt(other.getReportedAt());
      }
      if (other.hasDevice()) {
        mergeDevice(other.getDevice());
      }
      if (other.hasSensorData()) {
        mergeSensorData(other.getSensorData());
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
      pt.sharespot.iot.core.buf.model.Data parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (pt.sharespot.iot.core.buf.model.Data) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object dataId_ = "";
    /**
     * <code>string data_id = 1;</code>
     * @return The dataId.
     */
    public java.lang.String getDataId() {
      java.lang.Object ref = dataId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dataId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string data_id = 1;</code>
     * @return The bytes for dataId.
     */
    public com.google.protobuf.ByteString
        getDataIdBytes() {
      java.lang.Object ref = dataId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dataId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string data_id = 1;</code>
     * @param value The dataId to set.
     * @return This builder for chaining.
     */
    public Builder setDataId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dataId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string data_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDataId() {
      
      dataId_ = getDefaultInstance().getDataId();
      onChanged();
      return this;
    }
    /**
     * <code>string data_id = 1;</code>
     * @param value The bytes for dataId to set.
     * @return This builder for chaining.
     */
    public Builder setDataIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dataId_ = value;
      onChanged();
      return this;
    }

    private long reportedAt_ ;
    /**
     * <code>int64 reported_at = 2;</code>
     * @return The reportedAt.
     */
    @java.lang.Override
    public long getReportedAt() {
      return reportedAt_;
    }
    /**
     * <code>int64 reported_at = 2;</code>
     * @param value The reportedAt to set.
     * @return This builder for chaining.
     */
    public Builder setReportedAt(long value) {
      
      reportedAt_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 reported_at = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearReportedAt() {
      
      reportedAt_ = 0L;
      onChanged();
      return this;
    }

    private pt.sharespot.iot.core.buf.model.Device device_;
    private com.google.protobuf.SingleFieldBuilderV3<
        pt.sharespot.iot.core.buf.model.Device, pt.sharespot.iot.core.buf.model.Device.Builder, pt.sharespot.iot.core.buf.model.DeviceOrBuilder> deviceBuilder_;
    /**
     * <code>.pt.sharespot.iot.core.Device device = 3;</code>
     * @return Whether the device field is set.
     */
    public boolean hasDevice() {
      return deviceBuilder_ != null || device_ != null;
    }
    /**
     * <code>.pt.sharespot.iot.core.Device device = 3;</code>
     * @return The device.
     */
    public pt.sharespot.iot.core.buf.model.Device getDevice() {
      if (deviceBuilder_ == null) {
        return device_ == null ? pt.sharespot.iot.core.buf.model.Device.getDefaultInstance() : device_;
      } else {
        return deviceBuilder_.getMessage();
      }
    }
    /**
     * <code>.pt.sharespot.iot.core.Device device = 3;</code>
     */
    public Builder setDevice(pt.sharespot.iot.core.buf.model.Device value) {
      if (deviceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        device_ = value;
        onChanged();
      } else {
        deviceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.pt.sharespot.iot.core.Device device = 3;</code>
     */
    public Builder setDevice(
        pt.sharespot.iot.core.buf.model.Device.Builder builderForValue) {
      if (deviceBuilder_ == null) {
        device_ = builderForValue.build();
        onChanged();
      } else {
        deviceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.pt.sharespot.iot.core.Device device = 3;</code>
     */
    public Builder mergeDevice(pt.sharespot.iot.core.buf.model.Device value) {
      if (deviceBuilder_ == null) {
        if (device_ != null) {
          device_ =
            pt.sharespot.iot.core.buf.model.Device.newBuilder(device_).mergeFrom(value).buildPartial();
        } else {
          device_ = value;
        }
        onChanged();
      } else {
        deviceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.pt.sharespot.iot.core.Device device = 3;</code>
     */
    public Builder clearDevice() {
      if (deviceBuilder_ == null) {
        device_ = null;
        onChanged();
      } else {
        device_ = null;
        deviceBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.pt.sharespot.iot.core.Device device = 3;</code>
     */
    public pt.sharespot.iot.core.buf.model.Device.Builder getDeviceBuilder() {
      
      onChanged();
      return getDeviceFieldBuilder().getBuilder();
    }
    /**
     * <code>.pt.sharespot.iot.core.Device device = 3;</code>
     */
    public pt.sharespot.iot.core.buf.model.DeviceOrBuilder getDeviceOrBuilder() {
      if (deviceBuilder_ != null) {
        return deviceBuilder_.getMessageOrBuilder();
      } else {
        return device_ == null ?
            pt.sharespot.iot.core.buf.model.Device.getDefaultInstance() : device_;
      }
    }
    /**
     * <code>.pt.sharespot.iot.core.Device device = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        pt.sharespot.iot.core.buf.model.Device, pt.sharespot.iot.core.buf.model.Device.Builder, pt.sharespot.iot.core.buf.model.DeviceOrBuilder> 
        getDeviceFieldBuilder() {
      if (deviceBuilder_ == null) {
        deviceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            pt.sharespot.iot.core.buf.model.Device, pt.sharespot.iot.core.buf.model.Device.Builder, pt.sharespot.iot.core.buf.model.DeviceOrBuilder>(
                getDevice(),
                getParentForChildren(),
                isClean());
        device_ = null;
      }
      return deviceBuilder_;
    }

    private pt.sharespot.iot.core.buf.model.SensorData sensorData_;
    private com.google.protobuf.SingleFieldBuilderV3<
        pt.sharespot.iot.core.buf.model.SensorData, pt.sharespot.iot.core.buf.model.SensorData.Builder, pt.sharespot.iot.core.buf.model.SensorDataOrBuilder> sensorDataBuilder_;
    /**
     * <code>.pt.sharespot.iot.core.SensorData sensor_data = 4;</code>
     * @return Whether the sensorData field is set.
     */
    public boolean hasSensorData() {
      return sensorDataBuilder_ != null || sensorData_ != null;
    }
    /**
     * <code>.pt.sharespot.iot.core.SensorData sensor_data = 4;</code>
     * @return The sensorData.
     */
    public pt.sharespot.iot.core.buf.model.SensorData getSensorData() {
      if (sensorDataBuilder_ == null) {
        return sensorData_ == null ? pt.sharespot.iot.core.buf.model.SensorData.getDefaultInstance() : sensorData_;
      } else {
        return sensorDataBuilder_.getMessage();
      }
    }
    /**
     * <code>.pt.sharespot.iot.core.SensorData sensor_data = 4;</code>
     */
    public Builder setSensorData(pt.sharespot.iot.core.buf.model.SensorData value) {
      if (sensorDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sensorData_ = value;
        onChanged();
      } else {
        sensorDataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.pt.sharespot.iot.core.SensorData sensor_data = 4;</code>
     */
    public Builder setSensorData(
        pt.sharespot.iot.core.buf.model.SensorData.Builder builderForValue) {
      if (sensorDataBuilder_ == null) {
        sensorData_ = builderForValue.build();
        onChanged();
      } else {
        sensorDataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.pt.sharespot.iot.core.SensorData sensor_data = 4;</code>
     */
    public Builder mergeSensorData(pt.sharespot.iot.core.buf.model.SensorData value) {
      if (sensorDataBuilder_ == null) {
        if (sensorData_ != null) {
          sensorData_ =
            pt.sharespot.iot.core.buf.model.SensorData.newBuilder(sensorData_).mergeFrom(value).buildPartial();
        } else {
          sensorData_ = value;
        }
        onChanged();
      } else {
        sensorDataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.pt.sharespot.iot.core.SensorData sensor_data = 4;</code>
     */
    public Builder clearSensorData() {
      if (sensorDataBuilder_ == null) {
        sensorData_ = null;
        onChanged();
      } else {
        sensorData_ = null;
        sensorDataBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.pt.sharespot.iot.core.SensorData sensor_data = 4;</code>
     */
    public pt.sharespot.iot.core.buf.model.SensorData.Builder getSensorDataBuilder() {
      
      onChanged();
      return getSensorDataFieldBuilder().getBuilder();
    }
    /**
     * <code>.pt.sharespot.iot.core.SensorData sensor_data = 4;</code>
     */
    public pt.sharespot.iot.core.buf.model.SensorDataOrBuilder getSensorDataOrBuilder() {
      if (sensorDataBuilder_ != null) {
        return sensorDataBuilder_.getMessageOrBuilder();
      } else {
        return sensorData_ == null ?
            pt.sharespot.iot.core.buf.model.SensorData.getDefaultInstance() : sensorData_;
      }
    }
    /**
     * <code>.pt.sharespot.iot.core.SensorData sensor_data = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        pt.sharespot.iot.core.buf.model.SensorData, pt.sharespot.iot.core.buf.model.SensorData.Builder, pt.sharespot.iot.core.buf.model.SensorDataOrBuilder> 
        getSensorDataFieldBuilder() {
      if (sensorDataBuilder_ == null) {
        sensorDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            pt.sharespot.iot.core.buf.model.SensorData, pt.sharespot.iot.core.buf.model.SensorData.Builder, pt.sharespot.iot.core.buf.model.SensorDataOrBuilder>(
                getSensorData(),
                getParentForChildren(),
                isClean());
        sensorData_ = null;
      }
      return sensorDataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:pt.sharespot.iot.core.Data)
  }

  // @@protoc_insertion_point(class_scope:pt.sharespot.iot.core.Data)
  private static final pt.sharespot.iot.core.buf.model.Data DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new pt.sharespot.iot.core.buf.model.Data();
  }

  public static pt.sharespot.iot.core.buf.model.Data getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Data>
      PARSER = new com.google.protobuf.AbstractParser<Data>() {
    @java.lang.Override
    public Data parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Data(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Data> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Data> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public pt.sharespot.iot.core.buf.model.Data getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

