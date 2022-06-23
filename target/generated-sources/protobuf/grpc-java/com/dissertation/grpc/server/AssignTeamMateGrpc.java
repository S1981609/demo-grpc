package com.dissertation.grpc.server;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.0)",
    comments = "Source: AssignTeamMategRPCService.proto")
public final class AssignTeamMateGrpc {

  private AssignTeamMateGrpc() {}

  public static final String SERVICE_NAME = "com.dissertation.grpc.server.AssignTeamMate";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dissertation.grpc.server.AssignTeamRequestgRPC,
      com.dissertation.grpc.server.AssignTeamResponsegRPC> getAssignTeamMateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignTeamMate",
      requestType = com.dissertation.grpc.server.AssignTeamRequestgRPC.class,
      responseType = com.dissertation.grpc.server.AssignTeamResponsegRPC.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dissertation.grpc.server.AssignTeamRequestgRPC,
      com.dissertation.grpc.server.AssignTeamResponsegRPC> getAssignTeamMateMethod() {
    io.grpc.MethodDescriptor<com.dissertation.grpc.server.AssignTeamRequestgRPC, com.dissertation.grpc.server.AssignTeamResponsegRPC> getAssignTeamMateMethod;
    if ((getAssignTeamMateMethod = AssignTeamMateGrpc.getAssignTeamMateMethod) == null) {
      synchronized (AssignTeamMateGrpc.class) {
        if ((getAssignTeamMateMethod = AssignTeamMateGrpc.getAssignTeamMateMethod) == null) {
          AssignTeamMateGrpc.getAssignTeamMateMethod = getAssignTeamMateMethod =
              io.grpc.MethodDescriptor.<com.dissertation.grpc.server.AssignTeamRequestgRPC, com.dissertation.grpc.server.AssignTeamResponsegRPC>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignTeamMate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dissertation.grpc.server.AssignTeamRequestgRPC.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dissertation.grpc.server.AssignTeamResponsegRPC.getDefaultInstance()))
              .setSchemaDescriptor(new AssignTeamMateMethodDescriptorSupplier("AssignTeamMate"))
              .build();
        }
      }
    }
    return getAssignTeamMateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AssignTeamMateStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssignTeamMateStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssignTeamMateStub>() {
        @java.lang.Override
        public AssignTeamMateStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssignTeamMateStub(channel, callOptions);
        }
      };
    return AssignTeamMateStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AssignTeamMateBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssignTeamMateBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssignTeamMateBlockingStub>() {
        @java.lang.Override
        public AssignTeamMateBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssignTeamMateBlockingStub(channel, callOptions);
        }
      };
    return AssignTeamMateBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AssignTeamMateFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssignTeamMateFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssignTeamMateFutureStub>() {
        @java.lang.Override
        public AssignTeamMateFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssignTeamMateFutureStub(channel, callOptions);
        }
      };
    return AssignTeamMateFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class AssignTeamMateImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void assignTeamMate(com.dissertation.grpc.server.AssignTeamRequestgRPC request,
        io.grpc.stub.StreamObserver<com.dissertation.grpc.server.AssignTeamResponsegRPC> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignTeamMateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAssignTeamMateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dissertation.grpc.server.AssignTeamRequestgRPC,
                com.dissertation.grpc.server.AssignTeamResponsegRPC>(
                  this, METHODID_ASSIGN_TEAM_MATE)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class AssignTeamMateStub extends io.grpc.stub.AbstractAsyncStub<AssignTeamMateStub> {
    private AssignTeamMateStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssignTeamMateStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssignTeamMateStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void assignTeamMate(com.dissertation.grpc.server.AssignTeamRequestgRPC request,
        io.grpc.stub.StreamObserver<com.dissertation.grpc.server.AssignTeamResponsegRPC> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignTeamMateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class AssignTeamMateBlockingStub extends io.grpc.stub.AbstractBlockingStub<AssignTeamMateBlockingStub> {
    private AssignTeamMateBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssignTeamMateBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssignTeamMateBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.dissertation.grpc.server.AssignTeamResponsegRPC assignTeamMate(com.dissertation.grpc.server.AssignTeamRequestgRPC request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignTeamMateMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class AssignTeamMateFutureStub extends io.grpc.stub.AbstractFutureStub<AssignTeamMateFutureStub> {
    private AssignTeamMateFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssignTeamMateFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssignTeamMateFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dissertation.grpc.server.AssignTeamResponsegRPC> assignTeamMate(
        com.dissertation.grpc.server.AssignTeamRequestgRPC request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignTeamMateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ASSIGN_TEAM_MATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AssignTeamMateImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AssignTeamMateImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ASSIGN_TEAM_MATE:
          serviceImpl.assignTeamMate((com.dissertation.grpc.server.AssignTeamRequestgRPC) request,
              (io.grpc.stub.StreamObserver<com.dissertation.grpc.server.AssignTeamResponsegRPC>) responseObserver);
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

  private static abstract class AssignTeamMateBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AssignTeamMateBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dissertation.grpc.server.AssignTeamMategRPCService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AssignTeamMate");
    }
  }

  private static final class AssignTeamMateFileDescriptorSupplier
      extends AssignTeamMateBaseDescriptorSupplier {
    AssignTeamMateFileDescriptorSupplier() {}
  }

  private static final class AssignTeamMateMethodDescriptorSupplier
      extends AssignTeamMateBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AssignTeamMateMethodDescriptorSupplier(String methodName) {
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
      synchronized (AssignTeamMateGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AssignTeamMateFileDescriptorSupplier())
              .addMethod(getAssignTeamMateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
