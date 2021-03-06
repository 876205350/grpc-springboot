package com.lrbj.grpc.lib;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 *数量不一致
 *option java_multiple_files = true;
 *package com.lrbj.grpclib.greeter;
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.11.0)",
    comments = "Source: Greeter.proto")
public final class GreeterGrpc {

  private GreeterGrpc() {}

  public static final String SERVICE_NAME = "Greeter";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSayHelloMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.lrbj.grpc.lib.GreeterOuterClass.HelloRequest,
      com.lrbj.grpc.lib.GreeterOuterClass.HelloReply> METHOD_SAY_HELLO = getSayHelloMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.lrbj.grpc.lib.GreeterOuterClass.HelloRequest,
      com.lrbj.grpc.lib.GreeterOuterClass.HelloReply> getSayHelloMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.lrbj.grpc.lib.GreeterOuterClass.HelloRequest,
      com.lrbj.grpc.lib.GreeterOuterClass.HelloReply> getSayHelloMethod() {
    return getSayHelloMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.lrbj.grpc.lib.GreeterOuterClass.HelloRequest,
      com.lrbj.grpc.lib.GreeterOuterClass.HelloReply> getSayHelloMethodHelper() {
    io.grpc.MethodDescriptor<com.lrbj.grpc.lib.GreeterOuterClass.HelloRequest, com.lrbj.grpc.lib.GreeterOuterClass.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = GreeterGrpc.getSayHelloMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayHelloMethod = GreeterGrpc.getSayHelloMethod) == null) {
          GreeterGrpc.getSayHelloMethod = getSayHelloMethod = 
              io.grpc.MethodDescriptor.<com.lrbj.grpc.lib.GreeterOuterClass.HelloRequest, com.lrbj.grpc.lib.GreeterOuterClass.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Greeter", "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lrbj.grpc.lib.GreeterOuterClass.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lrbj.grpc.lib.GreeterOuterClass.HelloReply.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("SayHello"))
                  .build();
          }
        }
     }
     return getSayHelloMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getRecordRouteMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.lrbj.grpc.lib.GreeterOuterClass.Point,
      com.lrbj.grpc.lib.GreeterOuterClass.RouteSummary> METHOD_RECORD_ROUTE = getRecordRouteMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.lrbj.grpc.lib.GreeterOuterClass.Point,
      com.lrbj.grpc.lib.GreeterOuterClass.RouteSummary> getRecordRouteMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.lrbj.grpc.lib.GreeterOuterClass.Point,
      com.lrbj.grpc.lib.GreeterOuterClass.RouteSummary> getRecordRouteMethod() {
    return getRecordRouteMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.lrbj.grpc.lib.GreeterOuterClass.Point,
      com.lrbj.grpc.lib.GreeterOuterClass.RouteSummary> getRecordRouteMethodHelper() {
    io.grpc.MethodDescriptor<com.lrbj.grpc.lib.GreeterOuterClass.Point, com.lrbj.grpc.lib.GreeterOuterClass.RouteSummary> getRecordRouteMethod;
    if ((getRecordRouteMethod = GreeterGrpc.getRecordRouteMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getRecordRouteMethod = GreeterGrpc.getRecordRouteMethod) == null) {
          GreeterGrpc.getRecordRouteMethod = getRecordRouteMethod = 
              io.grpc.MethodDescriptor.<com.lrbj.grpc.lib.GreeterOuterClass.Point, com.lrbj.grpc.lib.GreeterOuterClass.RouteSummary>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Greeter", "RecordRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lrbj.grpc.lib.GreeterOuterClass.Point.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lrbj.grpc.lib.GreeterOuterClass.RouteSummary.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("RecordRoute"))
                  .build();
          }
        }
     }
     return getRecordRouteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreeterStub newStub(io.grpc.Channel channel) {
    return new GreeterStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreeterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GreeterBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreeterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GreeterFutureStub(channel);
  }

  /**
   * <pre>
   *数量不一致
   *option java_multiple_files = true;
   *package com.lrbj.grpclib.greeter;
   * The greeting service definition.
   * </pre>
   */
  public static abstract class GreeterImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(com.lrbj.grpc.lib.GreeterOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.lrbj.grpc.lib.GreeterOuterClass.HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethodHelper(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.lrbj.grpc.lib.GreeterOuterClass.Point> recordRoute(
        io.grpc.stub.StreamObserver<com.lrbj.grpc.lib.GreeterOuterClass.RouteSummary> responseObserver) {
      return asyncUnimplementedStreamingCall(getRecordRouteMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.lrbj.grpc.lib.GreeterOuterClass.HelloRequest,
                com.lrbj.grpc.lib.GreeterOuterClass.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .addMethod(
            getRecordRouteMethodHelper(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.lrbj.grpc.lib.GreeterOuterClass.Point,
                com.lrbj.grpc.lib.GreeterOuterClass.RouteSummary>(
                  this, METHODID_RECORD_ROUTE)))
          .build();
    }
  }

  /**
   * <pre>
   *数量不一致
   *option java_multiple_files = true;
   *package com.lrbj.grpclib.greeter;
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterStub extends io.grpc.stub.AbstractStub<GreeterStub> {
    private GreeterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(com.lrbj.grpc.lib.GreeterOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.lrbj.grpc.lib.GreeterOuterClass.HelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.lrbj.grpc.lib.GreeterOuterClass.Point> recordRoute(
        io.grpc.stub.StreamObserver<com.lrbj.grpc.lib.GreeterOuterClass.RouteSummary> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getRecordRouteMethodHelper(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   *数量不一致
   *option java_multiple_files = true;
   *package com.lrbj.grpclib.greeter;
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterBlockingStub extends io.grpc.stub.AbstractStub<GreeterBlockingStub> {
    private GreeterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.lrbj.grpc.lib.GreeterOuterClass.HelloReply sayHello(com.lrbj.grpc.lib.GreeterOuterClass.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *数量不一致
   *option java_multiple_files = true;
   *package com.lrbj.grpclib.greeter;
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterFutureStub extends io.grpc.stub.AbstractStub<GreeterFutureStub> {
    private GreeterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lrbj.grpc.lib.GreeterOuterClass.HelloReply> sayHello(
        com.lrbj.grpc.lib.GreeterOuterClass.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_RECORD_ROUTE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreeterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreeterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.lrbj.grpc.lib.GreeterOuterClass.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.lrbj.grpc.lib.GreeterOuterClass.HelloReply>) responseObserver);
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
        case METHODID_RECORD_ROUTE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.recordRoute(
              (io.grpc.stub.StreamObserver<com.lrbj.grpc.lib.GreeterOuterClass.RouteSummary>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreeterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.lrbj.grpc.lib.GreeterOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Greeter");
    }
  }

  private static final class GreeterFileDescriptorSupplier
      extends GreeterBaseDescriptorSupplier {
    GreeterFileDescriptorSupplier() {}
  }

  private static final class GreeterMethodDescriptorSupplier
      extends GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreeterMethodDescriptorSupplier(String methodName) {
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
      synchronized (GreeterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreeterFileDescriptorSupplier())
              .addMethod(getSayHelloMethodHelper())
              .addMethod(getRecordRouteMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
