package com.tr.poc.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: agent.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AgentServiceGrpc {

  private AgentServiceGrpc() {}

  public static final String SERVICE_NAME = "com.tr.poc.grpc.AgentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tr.poc.grpc.AgentsRequest,
      com.tr.poc.grpc.Agent> getAgentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "agents",
      requestType = com.tr.poc.grpc.AgentsRequest.class,
      responseType = com.tr.poc.grpc.Agent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tr.poc.grpc.AgentsRequest,
      com.tr.poc.grpc.Agent> getAgentsMethod() {
    io.grpc.MethodDescriptor<com.tr.poc.grpc.AgentsRequest, com.tr.poc.grpc.Agent> getAgentsMethod;
    if ((getAgentsMethod = AgentServiceGrpc.getAgentsMethod) == null) {
      synchronized (AgentServiceGrpc.class) {
        if ((getAgentsMethod = AgentServiceGrpc.getAgentsMethod) == null) {
          AgentServiceGrpc.getAgentsMethod = getAgentsMethod =
              io.grpc.MethodDescriptor.<com.tr.poc.grpc.AgentsRequest, com.tr.poc.grpc.Agent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "agents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tr.poc.grpc.AgentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tr.poc.grpc.Agent.getDefaultInstance()))
              .setSchemaDescriptor(new AgentServiceMethodDescriptorSupplier("agents"))
              .build();
        }
      }
    }
    return getAgentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tr.poc.grpc.AgentRequest,
      com.tr.poc.grpc.Agent> getAgentByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "agentById",
      requestType = com.tr.poc.grpc.AgentRequest.class,
      responseType = com.tr.poc.grpc.Agent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tr.poc.grpc.AgentRequest,
      com.tr.poc.grpc.Agent> getAgentByIdMethod() {
    io.grpc.MethodDescriptor<com.tr.poc.grpc.AgentRequest, com.tr.poc.grpc.Agent> getAgentByIdMethod;
    if ((getAgentByIdMethod = AgentServiceGrpc.getAgentByIdMethod) == null) {
      synchronized (AgentServiceGrpc.class) {
        if ((getAgentByIdMethod = AgentServiceGrpc.getAgentByIdMethod) == null) {
          AgentServiceGrpc.getAgentByIdMethod = getAgentByIdMethod =
              io.grpc.MethodDescriptor.<com.tr.poc.grpc.AgentRequest, com.tr.poc.grpc.Agent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "agentById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tr.poc.grpc.AgentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tr.poc.grpc.Agent.getDefaultInstance()))
              .setSchemaDescriptor(new AgentServiceMethodDescriptorSupplier("agentById"))
              .build();
        }
      }
    }
    return getAgentByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tr.poc.grpc.ConversationRequest,
      com.tr.poc.grpc.Message> getConversationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "conversation",
      requestType = com.tr.poc.grpc.ConversationRequest.class,
      responseType = com.tr.poc.grpc.Message.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.tr.poc.grpc.ConversationRequest,
      com.tr.poc.grpc.Message> getConversationMethod() {
    io.grpc.MethodDescriptor<com.tr.poc.grpc.ConversationRequest, com.tr.poc.grpc.Message> getConversationMethod;
    if ((getConversationMethod = AgentServiceGrpc.getConversationMethod) == null) {
      synchronized (AgentServiceGrpc.class) {
        if ((getConversationMethod = AgentServiceGrpc.getConversationMethod) == null) {
          AgentServiceGrpc.getConversationMethod = getConversationMethod =
              io.grpc.MethodDescriptor.<com.tr.poc.grpc.ConversationRequest, com.tr.poc.grpc.Message>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "conversation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tr.poc.grpc.ConversationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tr.poc.grpc.Message.getDefaultInstance()))
              .setSchemaDescriptor(new AgentServiceMethodDescriptorSupplier("conversation"))
              .build();
        }
      }
    }
    return getConversationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tr.poc.grpc.ConversationListenerRequest,
      com.tr.poc.grpc.Message> getConversationListenerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "conversationListener",
      requestType = com.tr.poc.grpc.ConversationListenerRequest.class,
      responseType = com.tr.poc.grpc.Message.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tr.poc.grpc.ConversationListenerRequest,
      com.tr.poc.grpc.Message> getConversationListenerMethod() {
    io.grpc.MethodDescriptor<com.tr.poc.grpc.ConversationListenerRequest, com.tr.poc.grpc.Message> getConversationListenerMethod;
    if ((getConversationListenerMethod = AgentServiceGrpc.getConversationListenerMethod) == null) {
      synchronized (AgentServiceGrpc.class) {
        if ((getConversationListenerMethod = AgentServiceGrpc.getConversationListenerMethod) == null) {
          AgentServiceGrpc.getConversationListenerMethod = getConversationListenerMethod =
              io.grpc.MethodDescriptor.<com.tr.poc.grpc.ConversationListenerRequest, com.tr.poc.grpc.Message>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "conversationListener"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tr.poc.grpc.ConversationListenerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tr.poc.grpc.Message.getDefaultInstance()))
              .setSchemaDescriptor(new AgentServiceMethodDescriptorSupplier("conversationListener"))
              .build();
        }
      }
    }
    return getConversationListenerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AgentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentServiceStub>() {
        @java.lang.Override
        public AgentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentServiceStub(channel, callOptions);
        }
      };
    return AgentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AgentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentServiceBlockingStub>() {
        @java.lang.Override
        public AgentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentServiceBlockingStub(channel, callOptions);
        }
      };
    return AgentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AgentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentServiceFutureStub>() {
        @java.lang.Override
        public AgentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentServiceFutureStub(channel, callOptions);
        }
      };
    return AgentServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AgentServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * unidirectional streaming
     * the FE opens a connection with the BE in order to retrieve all agents
     * this connection will retrieve and stream the agents one by one
     * </pre>
     */
    public void agents(com.tr.poc.grpc.AgentsRequest request,
        io.grpc.stub.StreamObserver<com.tr.poc.grpc.Agent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAgentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * unary call
     * similar to REST where a request is done and a response is expected
     * retrieves a customer by ID and returns given agent
     * </pre>
     */
    public void agentById(com.tr.poc.grpc.AgentRequest request,
        io.grpc.stub.StreamObserver<com.tr.poc.grpc.Agent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAgentByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * bidirectional streaming
     * new messages are sent by the agent and new messages sent by the customer are
     * caught and sent back to the FE
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.tr.poc.grpc.ConversationRequest> conversation(
        io.grpc.stub.StreamObserver<com.tr.poc.grpc.Message> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getConversationMethod(), responseObserver);
    }

    /**
     * <pre>
     * unidirectional streaming
     * the FE starts listening for any new messages that are sent to the conversation
     * </pre>
     */
    public void conversationListener(com.tr.poc.grpc.ConversationListenerRequest request,
        io.grpc.stub.StreamObserver<com.tr.poc.grpc.Message> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConversationListenerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAgentsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.tr.poc.grpc.AgentsRequest,
                com.tr.poc.grpc.Agent>(
                  this, METHODID_AGENTS)))
          .addMethod(
            getAgentByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tr.poc.grpc.AgentRequest,
                com.tr.poc.grpc.Agent>(
                  this, METHODID_AGENT_BY_ID)))
          .addMethod(
            getConversationMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.tr.poc.grpc.ConversationRequest,
                com.tr.poc.grpc.Message>(
                  this, METHODID_CONVERSATION)))
          .addMethod(
            getConversationListenerMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.tr.poc.grpc.ConversationListenerRequest,
                com.tr.poc.grpc.Message>(
                  this, METHODID_CONVERSATION_LISTENER)))
          .build();
    }
  }

  /**
   */
  public static final class AgentServiceStub extends io.grpc.stub.AbstractAsyncStub<AgentServiceStub> {
    private AgentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * unidirectional streaming
     * the FE opens a connection with the BE in order to retrieve all agents
     * this connection will retrieve and stream the agents one by one
     * </pre>
     */
    public void agents(com.tr.poc.grpc.AgentsRequest request,
        io.grpc.stub.StreamObserver<com.tr.poc.grpc.Agent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getAgentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * unary call
     * similar to REST where a request is done and a response is expected
     * retrieves a customer by ID and returns given agent
     * </pre>
     */
    public void agentById(com.tr.poc.grpc.AgentRequest request,
        io.grpc.stub.StreamObserver<com.tr.poc.grpc.Agent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAgentByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * bidirectional streaming
     * new messages are sent by the agent and new messages sent by the customer are
     * caught and sent back to the FE
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.tr.poc.grpc.ConversationRequest> conversation(
        io.grpc.stub.StreamObserver<com.tr.poc.grpc.Message> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getConversationMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * unidirectional streaming
     * the FE starts listening for any new messages that are sent to the conversation
     * </pre>
     */
    public void conversationListener(com.tr.poc.grpc.ConversationListenerRequest request,
        io.grpc.stub.StreamObserver<com.tr.poc.grpc.Message> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getConversationListenerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AgentServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AgentServiceBlockingStub> {
    private AgentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * unidirectional streaming
     * the FE opens a connection with the BE in order to retrieve all agents
     * this connection will retrieve and stream the agents one by one
     * </pre>
     */
    public java.util.Iterator<com.tr.poc.grpc.Agent> agents(
        com.tr.poc.grpc.AgentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getAgentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * unary call
     * similar to REST where a request is done and a response is expected
     * retrieves a customer by ID and returns given agent
     * </pre>
     */
    public com.tr.poc.grpc.Agent agentById(com.tr.poc.grpc.AgentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAgentByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * unidirectional streaming
     * the FE starts listening for any new messages that are sent to the conversation
     * </pre>
     */
    public java.util.Iterator<com.tr.poc.grpc.Message> conversationListener(
        com.tr.poc.grpc.ConversationListenerRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getConversationListenerMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AgentServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AgentServiceFutureStub> {
    private AgentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary call
     * similar to REST where a request is done and a response is expected
     * retrieves a customer by ID and returns given agent
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tr.poc.grpc.Agent> agentById(
        com.tr.poc.grpc.AgentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAgentByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AGENTS = 0;
  private static final int METHODID_AGENT_BY_ID = 1;
  private static final int METHODID_CONVERSATION_LISTENER = 2;
  private static final int METHODID_CONVERSATION = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AgentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AgentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AGENTS:
          serviceImpl.agents((com.tr.poc.grpc.AgentsRequest) request,
              (io.grpc.stub.StreamObserver<com.tr.poc.grpc.Agent>) responseObserver);
          break;
        case METHODID_AGENT_BY_ID:
          serviceImpl.agentById((com.tr.poc.grpc.AgentRequest) request,
              (io.grpc.stub.StreamObserver<com.tr.poc.grpc.Agent>) responseObserver);
          break;
        case METHODID_CONVERSATION_LISTENER:
          serviceImpl.conversationListener((com.tr.poc.grpc.ConversationListenerRequest) request,
              (io.grpc.stub.StreamObserver<com.tr.poc.grpc.Message>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONVERSATION:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.conversation(
              (io.grpc.stub.StreamObserver<com.tr.poc.grpc.Message>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AgentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AgentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tr.poc.grpc.AgentOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AgentService");
    }
  }

  private static final class AgentServiceFileDescriptorSupplier
      extends AgentServiceBaseDescriptorSupplier {
    AgentServiceFileDescriptorSupplier() {}
  }

  private static final class AgentServiceMethodDescriptorSupplier
      extends AgentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AgentServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AgentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AgentServiceFileDescriptorSupplier())
              .addMethod(getAgentsMethod())
              .addMethod(getAgentByIdMethod())
              .addMethod(getConversationMethod())
              .addMethod(getConversationListenerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
