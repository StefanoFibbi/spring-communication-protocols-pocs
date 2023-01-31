package com.tr.poc.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: ticket.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TicketServiceGrpc {

  private TicketServiceGrpc() {}

  public static final String SERVICE_NAME = "com.tr.poc.grpc.TicketService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tr.poc.grpc.TicketsRequest,
      com.tr.poc.grpc.TicketsResponse> getTicketsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "tickets",
      requestType = com.tr.poc.grpc.TicketsRequest.class,
      responseType = com.tr.poc.grpc.TicketsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tr.poc.grpc.TicketsRequest,
      com.tr.poc.grpc.TicketsResponse> getTicketsMethod() {
    io.grpc.MethodDescriptor<com.tr.poc.grpc.TicketsRequest, com.tr.poc.grpc.TicketsResponse> getTicketsMethod;
    if ((getTicketsMethod = TicketServiceGrpc.getTicketsMethod) == null) {
      synchronized (TicketServiceGrpc.class) {
        if ((getTicketsMethod = TicketServiceGrpc.getTicketsMethod) == null) {
          TicketServiceGrpc.getTicketsMethod = getTicketsMethod =
              io.grpc.MethodDescriptor.<com.tr.poc.grpc.TicketsRequest, com.tr.poc.grpc.TicketsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "tickets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tr.poc.grpc.TicketsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tr.poc.grpc.TicketsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TicketServiceMethodDescriptorSupplier("tickets"))
              .build();
        }
      }
    }
    return getTicketsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tr.poc.grpc.TicketRequest,
      com.tr.poc.grpc.Ticket> getTicketByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ticketById",
      requestType = com.tr.poc.grpc.TicketRequest.class,
      responseType = com.tr.poc.grpc.Ticket.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tr.poc.grpc.TicketRequest,
      com.tr.poc.grpc.Ticket> getTicketByIdMethod() {
    io.grpc.MethodDescriptor<com.tr.poc.grpc.TicketRequest, com.tr.poc.grpc.Ticket> getTicketByIdMethod;
    if ((getTicketByIdMethod = TicketServiceGrpc.getTicketByIdMethod) == null) {
      synchronized (TicketServiceGrpc.class) {
        if ((getTicketByIdMethod = TicketServiceGrpc.getTicketByIdMethod) == null) {
          TicketServiceGrpc.getTicketByIdMethod = getTicketByIdMethod =
              io.grpc.MethodDescriptor.<com.tr.poc.grpc.TicketRequest, com.tr.poc.grpc.Ticket>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ticketById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tr.poc.grpc.TicketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tr.poc.grpc.Ticket.getDefaultInstance()))
              .setSchemaDescriptor(new TicketServiceMethodDescriptorSupplier("ticketById"))
              .build();
        }
      }
    }
    return getTicketByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TicketServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TicketServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TicketServiceStub>() {
        @java.lang.Override
        public TicketServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TicketServiceStub(channel, callOptions);
        }
      };
    return TicketServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TicketServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TicketServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TicketServiceBlockingStub>() {
        @java.lang.Override
        public TicketServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TicketServiceBlockingStub(channel, callOptions);
        }
      };
    return TicketServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TicketServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TicketServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TicketServiceFutureStub>() {
        @java.lang.Override
        public TicketServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TicketServiceFutureStub(channel, callOptions);
        }
      };
    return TicketServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TicketServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void tickets(com.tr.poc.grpc.TicketsRequest request,
        io.grpc.stub.StreamObserver<com.tr.poc.grpc.TicketsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTicketsMethod(), responseObserver);
    }

    /**
     */
    public void ticketById(com.tr.poc.grpc.TicketRequest request,
        io.grpc.stub.StreamObserver<com.tr.poc.grpc.Ticket> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTicketByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTicketsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tr.poc.grpc.TicketsRequest,
                com.tr.poc.grpc.TicketsResponse>(
                  this, METHODID_TICKETS)))
          .addMethod(
            getTicketByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tr.poc.grpc.TicketRequest,
                com.tr.poc.grpc.Ticket>(
                  this, METHODID_TICKET_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class TicketServiceStub extends io.grpc.stub.AbstractAsyncStub<TicketServiceStub> {
    private TicketServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TicketServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TicketServiceStub(channel, callOptions);
    }

    /**
     */
    public void tickets(com.tr.poc.grpc.TicketsRequest request,
        io.grpc.stub.StreamObserver<com.tr.poc.grpc.TicketsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTicketsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void ticketById(com.tr.poc.grpc.TicketRequest request,
        io.grpc.stub.StreamObserver<com.tr.poc.grpc.Ticket> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTicketByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TicketServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TicketServiceBlockingStub> {
    private TicketServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TicketServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TicketServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tr.poc.grpc.TicketsResponse tickets(com.tr.poc.grpc.TicketsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTicketsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tr.poc.grpc.Ticket ticketById(com.tr.poc.grpc.TicketRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTicketByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TicketServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TicketServiceFutureStub> {
    private TicketServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TicketServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TicketServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tr.poc.grpc.TicketsResponse> tickets(
        com.tr.poc.grpc.TicketsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTicketsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tr.poc.grpc.Ticket> ticketById(
        com.tr.poc.grpc.TicketRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTicketByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TICKETS = 0;
  private static final int METHODID_TICKET_BY_ID = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TicketServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TicketServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TICKETS:
          serviceImpl.tickets((com.tr.poc.grpc.TicketsRequest) request,
              (io.grpc.stub.StreamObserver<com.tr.poc.grpc.TicketsResponse>) responseObserver);
          break;
        case METHODID_TICKET_BY_ID:
          serviceImpl.ticketById((com.tr.poc.grpc.TicketRequest) request,
              (io.grpc.stub.StreamObserver<com.tr.poc.grpc.Ticket>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TicketServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TicketServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tr.poc.grpc.TicketOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TicketService");
    }
  }

  private static final class TicketServiceFileDescriptorSupplier
      extends TicketServiceBaseDescriptorSupplier {
    TicketServiceFileDescriptorSupplier() {}
  }

  private static final class TicketServiceMethodDescriptorSupplier
      extends TicketServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TicketServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TicketServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TicketServiceFileDescriptorSupplier())
              .addMethod(getTicketsMethod())
              .addMethod(getTicketByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
