// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agent.proto

package com.tr.poc.grpc;

/**
 * Protobuf type {@code com.tr.poc.grpc.AgentsResponse}
 */
public final class AgentsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.tr.poc.grpc.AgentsResponse)
    AgentsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AgentsResponse.newBuilder() to construct.
  private AgentsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AgentsResponse() {
    agent_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AgentsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tr.poc.grpc.AgentOuterClass.internal_static_com_tr_poc_grpc_AgentsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tr.poc.grpc.AgentOuterClass.internal_static_com_tr_poc_grpc_AgentsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tr.poc.grpc.AgentsResponse.class, com.tr.poc.grpc.AgentsResponse.Builder.class);
  }

  public static final int AGENT_FIELD_NUMBER = 1;
  private java.util.List<com.tr.poc.grpc.Agent> agent_;
  /**
   * <code>repeated .com.tr.poc.grpc.Agent agent = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.tr.poc.grpc.Agent> getAgentList() {
    return agent_;
  }
  /**
   * <code>repeated .com.tr.poc.grpc.Agent agent = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tr.poc.grpc.AgentOrBuilder> 
      getAgentOrBuilderList() {
    return agent_;
  }
  /**
   * <code>repeated .com.tr.poc.grpc.Agent agent = 1;</code>
   */
  @java.lang.Override
  public int getAgentCount() {
    return agent_.size();
  }
  /**
   * <code>repeated .com.tr.poc.grpc.Agent agent = 1;</code>
   */
  @java.lang.Override
  public com.tr.poc.grpc.Agent getAgent(int index) {
    return agent_.get(index);
  }
  /**
   * <code>repeated .com.tr.poc.grpc.Agent agent = 1;</code>
   */
  @java.lang.Override
  public com.tr.poc.grpc.AgentOrBuilder getAgentOrBuilder(
      int index) {
    return agent_.get(index);
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
    for (int i = 0; i < agent_.size(); i++) {
      output.writeMessage(1, agent_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < agent_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, agent_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.tr.poc.grpc.AgentsResponse)) {
      return super.equals(obj);
    }
    com.tr.poc.grpc.AgentsResponse other = (com.tr.poc.grpc.AgentsResponse) obj;

    if (!getAgentList()
        .equals(other.getAgentList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getAgentCount() > 0) {
      hash = (37 * hash) + AGENT_FIELD_NUMBER;
      hash = (53 * hash) + getAgentList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tr.poc.grpc.AgentsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tr.poc.grpc.AgentsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tr.poc.grpc.AgentsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tr.poc.grpc.AgentsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tr.poc.grpc.AgentsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tr.poc.grpc.AgentsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tr.poc.grpc.AgentsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tr.poc.grpc.AgentsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tr.poc.grpc.AgentsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.tr.poc.grpc.AgentsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tr.poc.grpc.AgentsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tr.poc.grpc.AgentsResponse parseFrom(
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
  public static Builder newBuilder(com.tr.poc.grpc.AgentsResponse prototype) {
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
   * Protobuf type {@code com.tr.poc.grpc.AgentsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.tr.poc.grpc.AgentsResponse)
      com.tr.poc.grpc.AgentsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tr.poc.grpc.AgentOuterClass.internal_static_com_tr_poc_grpc_AgentsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tr.poc.grpc.AgentOuterClass.internal_static_com_tr_poc_grpc_AgentsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tr.poc.grpc.AgentsResponse.class, com.tr.poc.grpc.AgentsResponse.Builder.class);
    }

    // Construct using com.tr.poc.grpc.AgentsResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (agentBuilder_ == null) {
        agent_ = java.util.Collections.emptyList();
      } else {
        agent_ = null;
        agentBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tr.poc.grpc.AgentOuterClass.internal_static_com_tr_poc_grpc_AgentsResponse_descriptor;
    }

    @java.lang.Override
    public com.tr.poc.grpc.AgentsResponse getDefaultInstanceForType() {
      return com.tr.poc.grpc.AgentsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tr.poc.grpc.AgentsResponse build() {
      com.tr.poc.grpc.AgentsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tr.poc.grpc.AgentsResponse buildPartial() {
      com.tr.poc.grpc.AgentsResponse result = new com.tr.poc.grpc.AgentsResponse(this);
      int from_bitField0_ = bitField0_;
      if (agentBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          agent_ = java.util.Collections.unmodifiableList(agent_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.agent_ = agent_;
      } else {
        result.agent_ = agentBuilder_.build();
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
      if (other instanceof com.tr.poc.grpc.AgentsResponse) {
        return mergeFrom((com.tr.poc.grpc.AgentsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tr.poc.grpc.AgentsResponse other) {
      if (other == com.tr.poc.grpc.AgentsResponse.getDefaultInstance()) return this;
      if (agentBuilder_ == null) {
        if (!other.agent_.isEmpty()) {
          if (agent_.isEmpty()) {
            agent_ = other.agent_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAgentIsMutable();
            agent_.addAll(other.agent_);
          }
          onChanged();
        }
      } else {
        if (!other.agent_.isEmpty()) {
          if (agentBuilder_.isEmpty()) {
            agentBuilder_.dispose();
            agentBuilder_ = null;
            agent_ = other.agent_;
            bitField0_ = (bitField0_ & ~0x00000001);
            agentBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAgentFieldBuilder() : null;
          } else {
            agentBuilder_.addAllMessages(other.agent_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.tr.poc.grpc.Agent m =
                  input.readMessage(
                      com.tr.poc.grpc.Agent.parser(),
                      extensionRegistry);
              if (agentBuilder_ == null) {
                ensureAgentIsMutable();
                agent_.add(m);
              } else {
                agentBuilder_.addMessage(m);
              }
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.util.List<com.tr.poc.grpc.Agent> agent_ =
      java.util.Collections.emptyList();
    private void ensureAgentIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        agent_ = new java.util.ArrayList<com.tr.poc.grpc.Agent>(agent_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tr.poc.grpc.Agent, com.tr.poc.grpc.Agent.Builder, com.tr.poc.grpc.AgentOrBuilder> agentBuilder_;

    /**
     * <code>repeated .com.tr.poc.grpc.Agent agent = 1;</code>
     */
    public java.util.List<com.tr.poc.grpc.Agent> getAgentList() {
      if (agentBuilder_ == null) {
        return java.util.Collections.unmodifiableList(agent_);
      } else {
        return agentBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.tr.poc.grpc.Agent agent = 1;</code>
     */
    public int getAgentCount() {
      if (agentBuilder_ == null) {
        return agent_.size();
      } else {
        return agentBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.tr.poc.grpc.Agent agent = 1;</code>
     */
    public com.tr.poc.grpc.Agent getAgent(int index) {
      if (agentBuilder_ == null) {
        return agent_.get(index);
      } else {
        return agentBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.tr.poc.grpc.Agent agent = 1;</code>
     */
    public Builder setAgent(
        int index, com.tr.poc.grpc.Agent value) {
      if (agentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAgentIsMutable();
        agent_.set(index, value);
        onChanged();
      } else {
        agentBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.tr.poc.grpc.Agent agent = 1;</code>
     */
    public Builder setAgent(
        int index, com.tr.poc.grpc.Agent.Builder builderForValue) {
      if (agentBuilder_ == null) {
        ensureAgentIsMutable();
        agent_.set(index, builderForValue.build());
        onChanged();
      } else {
        agentBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.tr.poc.grpc.Agent agent = 1;</code>
     */
    public Builder addAgent(com.tr.poc.grpc.Agent value) {
      if (agentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAgentIsMutable();
        agent_.add(value);
        onChanged();
      } else {
        agentBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.tr.poc.grpc.Agent agent = 1;</code>
     */
    public Builder addAgent(
        int index, com.tr.poc.grpc.Agent value) {
      if (agentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAgentIsMutable();
        agent_.add(index, value);
        onChanged();
      } else {
        agentBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.tr.poc.grpc.Agent agent = 1;</code>
     */
    public Builder addAgent(
        com.tr.poc.grpc.Agent.Builder builderForValue) {
      if (agentBuilder_ == null) {
        ensureAgentIsMutable();
        agent_.add(builderForValue.build());
        onChanged();
      } else {
        agentBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.tr.poc.grpc.Agent agent = 1;</code>
     */
    public Builder addAgent(
        int index, com.tr.poc.grpc.Agent.Builder builderForValue) {
      if (agentBuilder_ == null) {
        ensureAgentIsMutable();
        agent_.add(index, builderForValue.build());
        onChanged();
      } else {
        agentBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.tr.poc.grpc.Agent agent = 1;</code>
     */
    public Builder addAllAgent(
        java.lang.Iterable<? extends com.tr.poc.grpc.Agent> values) {
      if (agentBuilder_ == null) {
        ensureAgentIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, agent_);
        onChanged();
      } else {
        agentBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.tr.poc.grpc.Agent agent = 1;</code>
     */
    public Builder clearAgent() {
      if (agentBuilder_ == null) {
        agent_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        agentBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.tr.poc.grpc.Agent agent = 1;</code>
     */
    public Builder removeAgent(int index) {
      if (agentBuilder_ == null) {
        ensureAgentIsMutable();
        agent_.remove(index);
        onChanged();
      } else {
        agentBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.tr.poc.grpc.Agent agent = 1;</code>
     */
    public com.tr.poc.grpc.Agent.Builder getAgentBuilder(
        int index) {
      return getAgentFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.tr.poc.grpc.Agent agent = 1;</code>
     */
    public com.tr.poc.grpc.AgentOrBuilder getAgentOrBuilder(
        int index) {
      if (agentBuilder_ == null) {
        return agent_.get(index);  } else {
        return agentBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.tr.poc.grpc.Agent agent = 1;</code>
     */
    public java.util.List<? extends com.tr.poc.grpc.AgentOrBuilder> 
         getAgentOrBuilderList() {
      if (agentBuilder_ != null) {
        return agentBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(agent_);
      }
    }
    /**
     * <code>repeated .com.tr.poc.grpc.Agent agent = 1;</code>
     */
    public com.tr.poc.grpc.Agent.Builder addAgentBuilder() {
      return getAgentFieldBuilder().addBuilder(
          com.tr.poc.grpc.Agent.getDefaultInstance());
    }
    /**
     * <code>repeated .com.tr.poc.grpc.Agent agent = 1;</code>
     */
    public com.tr.poc.grpc.Agent.Builder addAgentBuilder(
        int index) {
      return getAgentFieldBuilder().addBuilder(
          index, com.tr.poc.grpc.Agent.getDefaultInstance());
    }
    /**
     * <code>repeated .com.tr.poc.grpc.Agent agent = 1;</code>
     */
    public java.util.List<com.tr.poc.grpc.Agent.Builder> 
         getAgentBuilderList() {
      return getAgentFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tr.poc.grpc.Agent, com.tr.poc.grpc.Agent.Builder, com.tr.poc.grpc.AgentOrBuilder> 
        getAgentFieldBuilder() {
      if (agentBuilder_ == null) {
        agentBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tr.poc.grpc.Agent, com.tr.poc.grpc.Agent.Builder, com.tr.poc.grpc.AgentOrBuilder>(
                agent_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        agent_ = null;
      }
      return agentBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.tr.poc.grpc.AgentsResponse)
  }

  // @@protoc_insertion_point(class_scope:com.tr.poc.grpc.AgentsResponse)
  private static final com.tr.poc.grpc.AgentsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tr.poc.grpc.AgentsResponse();
  }

  public static com.tr.poc.grpc.AgentsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AgentsResponse>
      PARSER = new com.google.protobuf.AbstractParser<AgentsResponse>() {
    @java.lang.Override
    public AgentsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<AgentsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AgentsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tr.poc.grpc.AgentsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

