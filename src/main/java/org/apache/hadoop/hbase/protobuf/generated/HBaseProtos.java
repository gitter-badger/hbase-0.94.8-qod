// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hbase.proto

package org.apache.hadoop.hbase.protobuf.generated;

public final class HBaseProtos {
  private HBaseProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface SnapshotDescriptionOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string name = 1;
    boolean hasName();
    String getName();
    
    // optional string table = 2;
    boolean hasTable();
    String getTable();
    
    // optional int64 creationTime = 3 [default = 0];
    boolean hasCreationTime();
    long getCreationTime();
    
    // optional .SnapshotDescription.Type type = 4 [default = FLUSH];
    boolean hasType();
    org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription.Type getType();
    
    // optional int32 version = 5;
    boolean hasVersion();
    int getVersion();
  }
  public static final class SnapshotDescription extends
      com.google.protobuf.GeneratedMessage
      implements SnapshotDescriptionOrBuilder {
    // Use SnapshotDescription.newBuilder() to construct.
    private SnapshotDescription(Builder builder) {
      super(builder);
    }
    private SnapshotDescription(boolean noInit) {}
    
    private static final SnapshotDescription defaultInstance;
    public static SnapshotDescription getDefaultInstance() {
      return defaultInstance;
    }
    
    public SnapshotDescription getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.internal_static_SnapshotDescription_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.internal_static_SnapshotDescription_fieldAccessorTable;
    }
    
    public enum Type
        implements com.google.protobuf.ProtocolMessageEnum {
      DISABLED(0, 0),
      FLUSH(1, 1),
      ;
      
      public static final int DISABLED_VALUE = 0;
      public static final int FLUSH_VALUE = 1;
      
      
      public final int getNumber() { return value; }
      
      public static Type valueOf(int value) {
        switch (value) {
          case 0: return DISABLED;
          case 1: return FLUSH;
          default: return null;
        }
      }
      
      public static com.google.protobuf.Internal.EnumLiteMap<Type>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<Type>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Type>() {
              public Type findValueByNumber(int number) {
                return Type.valueOf(number);
              }
            };
      
      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription.getDescriptor().getEnumTypes().get(0);
      }
      
      private static final Type[] VALUES = {
        DISABLED, FLUSH, 
      };
      
      public static Type valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }
      
      private final int index;
      private final int value;
      
      private Type(int index, int value) {
        this.index = index;
        this.value = value;
      }
      
      // @@protoc_insertion_point(enum_scope:SnapshotDescription.Type)
    }
    
    private int bitField0_;
    // required string name = 1;
    public static final int NAME_FIELD_NUMBER = 1;
    private java.lang.Object name_;
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          name_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string table = 2;
    public static final int TABLE_FIELD_NUMBER = 2;
    private java.lang.Object table_;
    public boolean hasTable() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getTable() {
      java.lang.Object ref = table_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          table_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getTableBytes() {
      java.lang.Object ref = table_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        table_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional int64 creationTime = 3 [default = 0];
    public static final int CREATIONTIME_FIELD_NUMBER = 3;
    private long creationTime_;
    public boolean hasCreationTime() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public long getCreationTime() {
      return creationTime_;
    }
    
    // optional .SnapshotDescription.Type type = 4 [default = FLUSH];
    public static final int TYPE_FIELD_NUMBER = 4;
    private org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription.Type type_;
    public boolean hasType() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription.Type getType() {
      return type_;
    }
    
    // optional int32 version = 5;
    public static final int VERSION_FIELD_NUMBER = 5;
    private int version_;
    public boolean hasVersion() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public int getVersion() {
      return version_;
    }
    
    private void initFields() {
      name_ = "";
      table_ = "";
      creationTime_ = 0L;
      type_ = org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription.Type.FLUSH;
      version_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getTableBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt64(3, creationTime_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeEnum(4, type_.getNumber());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, version_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getTableBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, creationTime_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, type_.getNumber());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, version_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription other = (org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription) obj;
      
      boolean result = true;
      result = result && (hasName() == other.hasName());
      if (hasName()) {
        result = result && getName()
            .equals(other.getName());
      }
      result = result && (hasTable() == other.hasTable());
      if (hasTable()) {
        result = result && getTable()
            .equals(other.getTable());
      }
      result = result && (hasCreationTime() == other.hasCreationTime());
      if (hasCreationTime()) {
        result = result && (getCreationTime()
            == other.getCreationTime());
      }
      result = result && (hasType() == other.hasType());
      if (hasType()) {
        result = result &&
            (getType() == other.getType());
      }
      result = result && (hasVersion() == other.hasVersion());
      if (hasVersion()) {
        result = result && (getVersion()
            == other.getVersion());
      }
      result = result &&
          getUnknownFields().equals(other.getUnknownFields());
      return result;
    }
    
    @java.lang.Override
    public int hashCode() {
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      if (hasTable()) {
        hash = (37 * hash) + TABLE_FIELD_NUMBER;
        hash = (53 * hash) + getTable().hashCode();
      }
      if (hasCreationTime()) {
        hash = (37 * hash) + CREATIONTIME_FIELD_NUMBER;
        hash = (53 * hash) + hashLong(getCreationTime());
      }
      if (hasType()) {
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + hashEnum(getType());
      }
      if (hasVersion()) {
        hash = (37 * hash) + VERSION_FIELD_NUMBER;
        hash = (53 * hash) + getVersion();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      return hash;
    }
    
    public static org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescriptionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.internal_static_SnapshotDescription_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.internal_static_SnapshotDescription_fieldAccessorTable;
      }
      
      // Construct using org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        table_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        creationTime_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        type_ = org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription.Type.FLUSH;
        bitField0_ = (bitField0_ & ~0x00000008);
        version_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription.getDescriptor();
      }
      
      public org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription getDefaultInstanceForType() {
        return org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription.getDefaultInstance();
      }
      
      public org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription build() {
        org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription buildPartial() {
        org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription result = new org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.table_ = table_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.creationTime_ = creationTime_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.version_ = version_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription) {
          return mergeFrom((org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription other) {
        if (other == org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription.getDefaultInstance()) return this;
        if (other.hasName()) {
          setName(other.getName());
        }
        if (other.hasTable()) {
          setTable(other.getTable());
        }
        if (other.hasCreationTime()) {
          setCreationTime(other.getCreationTime());
        }
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasVersion()) {
          setVersion(other.getVersion());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasName()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              name_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              table_ = input.readBytes();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              creationTime_ = input.readInt64();
              break;
            }
            case 32: {
              int rawValue = input.readEnum();
              org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription.Type value = org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription.Type.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(4, rawValue);
              } else {
                bitField0_ |= 0x00000008;
                type_ = value;
              }
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              version_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string name = 1;
      private java.lang.Object name_ = "";
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setName(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      void setName(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
      }
      
      // optional string table = 2;
      private java.lang.Object table_ = "";
      public boolean hasTable() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getTable() {
        java.lang.Object ref = table_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          table_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setTable(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        table_ = value;
        onChanged();
        return this;
      }
      public Builder clearTable() {
        bitField0_ = (bitField0_ & ~0x00000002);
        table_ = getDefaultInstance().getTable();
        onChanged();
        return this;
      }
      void setTable(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        table_ = value;
        onChanged();
      }
      
      // optional int64 creationTime = 3 [default = 0];
      private long creationTime_ ;
      public boolean hasCreationTime() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public long getCreationTime() {
        return creationTime_;
      }
      public Builder setCreationTime(long value) {
        bitField0_ |= 0x00000004;
        creationTime_ = value;
        onChanged();
        return this;
      }
      public Builder clearCreationTime() {
        bitField0_ = (bitField0_ & ~0x00000004);
        creationTime_ = 0L;
        onChanged();
        return this;
      }
      
      // optional .SnapshotDescription.Type type = 4 [default = FLUSH];
      private org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription.Type type_ = org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription.Type.FLUSH;
      public boolean hasType() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription.Type getType() {
        return type_;
      }
      public Builder setType(org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription.Type value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        type_ = value;
        onChanged();
        return this;
      }
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000008);
        type_ = org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription.Type.FLUSH;
        onChanged();
        return this;
      }
      
      // optional int32 version = 5;
      private int version_ ;
      public boolean hasVersion() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public int getVersion() {
        return version_;
      }
      public Builder setVersion(int value) {
        bitField0_ |= 0x00000010;
        version_ = value;
        onChanged();
        return this;
      }
      public Builder clearVersion() {
        bitField0_ = (bitField0_ & ~0x00000010);
        version_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:SnapshotDescription)
    }
    
    static {
      defaultInstance = new SnapshotDescription(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:SnapshotDescription)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_SnapshotDescription_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_SnapshotDescription_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013hbase.proto\"\255\001\n\023SnapshotDescription\022\014\n" +
      "\004name\030\001 \002(\t\022\r\n\005table\030\002 \001(\t\022\027\n\014creationTi" +
      "me\030\003 \001(\003:\0010\022.\n\004type\030\004 \001(\0162\031.SnapshotDesc" +
      "ription.Type:\005FLUSH\022\017\n\007version\030\005 \001(\005\"\037\n\004" +
      "Type\022\014\n\010DISABLED\020\000\022\t\n\005FLUSH\020\001B>\n*org.apa" +
      "che.hadoop.hbase.protobuf.generatedB\013HBa" +
      "seProtosH\001\240\001\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_SnapshotDescription_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_SnapshotDescription_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_SnapshotDescription_descriptor,
              new java.lang.String[] { "Name", "Table", "CreationTime", "Type", "Version", },
              org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription.class,
              org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
