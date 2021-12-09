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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.11.0)",
    comments = "Source: UserOrder.proto")
public final class UserOrderGrpc {

  private UserOrderGrpc() {}

  public static final String SERVICE_NAME = "UserOrder";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getAddUserOrderMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.lrbj.grpc.lib.UserOrderOuterClass.UORequest,
      com.lrbj.grpc.lib.UserOrderOuterClass.UOResponse> METHOD_ADD_USER_ORDER = getAddUserOrderMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.lrbj.grpc.lib.UserOrderOuterClass.UORequest,
      com.lrbj.grpc.lib.UserOrderOuterClass.UOResponse> getAddUserOrderMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.lrbj.grpc.lib.UserOrderOuterClass.UORequest,
      com.lrbj.grpc.lib.UserOrderOuterClass.UOResponse> getAddUserOrderMethod() {
    return getAddUserOrderMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.lrbj.grpc.lib.UserOrderOuterClass.UORequest,
      com.lrbj.grpc.lib.UserOrderOuterClass.UOResponse> getAddUserOrderMethodHelper() {
    io.grpc.MethodDescriptor<com.lrbj.grpc.lib.UserOrderOuterClass.UORequest, com.lrbj.grpc.lib.UserOrderOuterClass.UOResponse> getAddUserOrderMethod;
    if ((getAddUserOrderMethod = UserOrderGrpc.getAddUserOrderMethod) == null) {
      synchronized (UserOrderGrpc.class) {
        if ((getAddUserOrderMethod = UserOrderGrpc.getAddUserOrderMethod) == null) {
          UserOrderGrpc.getAddUserOrderMethod = getAddUserOrderMethod = 
              io.grpc.MethodDescriptor.<com.lrbj.grpc.lib.UserOrderOuterClass.UORequest, com.lrbj.grpc.lib.UserOrderOuterClass.UOResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserOrder", "AddUserOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lrbj.grpc.lib.UserOrderOuterClass.UORequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lrbj.grpc.lib.UserOrderOuterClass.UOResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserOrderMethodDescriptorSupplier("AddUserOrder"))
                  .build();
          }
        }
     }
     return getAddUserOrderMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdateOrderMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.lrbj.grpc.lib.UserOrderOuterClass.order,
      com.lrbj.grpc.lib.UserOrderOuterClass.UOResponse> METHOD_UPDATE_ORDER = getUpdateOrderMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.lrbj.grpc.lib.UserOrderOuterClass.order,
      com.lrbj.grpc.lib.UserOrderOuterClass.UOResponse> getUpdateOrderMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.lrbj.grpc.lib.UserOrderOuterClass.order,
      com.lrbj.grpc.lib.UserOrderOuterClass.UOResponse> getUpdateOrderMethod() {
    return getUpdateOrderMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.lrbj.grpc.lib.UserOrderOuterClass.order,
      com.lrbj.grpc.lib.UserOrderOuterClass.UOResponse> getUpdateOrderMethodHelper() {
    io.grpc.MethodDescriptor<com.lrbj.grpc.lib.UserOrderOuterClass.order, com.lrbj.grpc.lib.UserOrderOuterClass.UOResponse> getUpdateOrderMethod;
    if ((getUpdateOrderMethod = UserOrderGrpc.getUpdateOrderMethod) == null) {
      synchronized (UserOrderGrpc.class) {
        if ((getUpdateOrderMethod = UserOrderGrpc.getUpdateOrderMethod) == null) {
          UserOrderGrpc.getUpdateOrderMethod = getUpdateOrderMethod = 
              io.grpc.MethodDescriptor.<com.lrbj.grpc.lib.UserOrderOuterClass.order, com.lrbj.grpc.lib.UserOrderOuterClass.UOResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserOrder", "UpdateOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lrbj.grpc.lib.UserOrderOuterClass.order.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lrbj.grpc.lib.UserOrderOuterClass.UOResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserOrderMethodDescriptorSupplier("UpdateOrder"))
                  .build();
          }
        }
     }
     return getUpdateOrderMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSelectOrderMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.lrbj.grpc.lib.UserOrderOuterClass.RequestId,
      com.lrbj.grpc.lib.UserOrderOuterClass.OResponse> METHOD_SELECT_ORDER = getSelectOrderMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.lrbj.grpc.lib.UserOrderOuterClass.RequestId,
      com.lrbj.grpc.lib.UserOrderOuterClass.OResponse> getSelectOrderMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.lrbj.grpc.lib.UserOrderOuterClass.RequestId,
      com.lrbj.grpc.lib.UserOrderOuterClass.OResponse> getSelectOrderMethod() {
    return getSelectOrderMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.lrbj.grpc.lib.UserOrderOuterClass.RequestId,
      com.lrbj.grpc.lib.UserOrderOuterClass.OResponse> getSelectOrderMethodHelper() {
    io.grpc.MethodDescriptor<com.lrbj.grpc.lib.UserOrderOuterClass.RequestId, com.lrbj.grpc.lib.UserOrderOuterClass.OResponse> getSelectOrderMethod;
    if ((getSelectOrderMethod = UserOrderGrpc.getSelectOrderMethod) == null) {
      synchronized (UserOrderGrpc.class) {
        if ((getSelectOrderMethod = UserOrderGrpc.getSelectOrderMethod) == null) {
          UserOrderGrpc.getSelectOrderMethod = getSelectOrderMethod = 
              io.grpc.MethodDescriptor.<com.lrbj.grpc.lib.UserOrderOuterClass.RequestId, com.lrbj.grpc.lib.UserOrderOuterClass.OResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserOrder", "SelectOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lrbj.grpc.lib.UserOrderOuterClass.RequestId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lrbj.grpc.lib.UserOrderOuterClass.OResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserOrderMethodDescriptorSupplier("SelectOrder"))
                  .build();
          }
        }
     }
     return getSelectOrderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserOrderStub newStub(io.grpc.Channel channel) {
    return new UserOrderStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserOrderBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserOrderBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserOrderFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserOrderFutureStub(channel);
  }

  /**
   */
  public static abstract class UserOrderImplBase implements io.grpc.BindableService {

    /**
     */
    public void addUserOrder(com.lrbj.grpc.lib.UserOrderOuterClass.UORequest request,
        io.grpc.stub.StreamObserver<com.lrbj.grpc.lib.UserOrderOuterClass.UOResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddUserOrderMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     *  rpc DeleteOrder(ORequest) returns(UOResponse) {}
     * </pre>
     */
    public void updateOrder(com.lrbj.grpc.lib.UserOrderOuterClass.order request,
        io.grpc.stub.StreamObserver<com.lrbj.grpc.lib.UserOrderOuterClass.UOResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateOrderMethodHelper(), responseObserver);
    }

    /**
     */
    public void selectOrder(com.lrbj.grpc.lib.UserOrderOuterClass.RequestId request,
        io.grpc.stub.StreamObserver<com.lrbj.grpc.lib.UserOrderOuterClass.OResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSelectOrderMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddUserOrderMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.lrbj.grpc.lib.UserOrderOuterClass.UORequest,
                com.lrbj.grpc.lib.UserOrderOuterClass.UOResponse>(
                  this, METHODID_ADD_USER_ORDER)))
          .addMethod(
            getUpdateOrderMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.lrbj.grpc.lib.UserOrderOuterClass.order,
                com.lrbj.grpc.lib.UserOrderOuterClass.UOResponse>(
                  this, METHODID_UPDATE_ORDER)))
          .addMethod(
            getSelectOrderMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.lrbj.grpc.lib.UserOrderOuterClass.RequestId,
                com.lrbj.grpc.lib.UserOrderOuterClass.OResponse>(
                  this, METHODID_SELECT_ORDER)))
          .build();
    }
  }

  /**
   */
  public static final class UserOrderStub extends io.grpc.stub.AbstractStub<UserOrderStub> {
    private UserOrderStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserOrderStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserOrderStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserOrderStub(channel, callOptions);
    }

    /**
     */
    public void addUserOrder(com.lrbj.grpc.lib.UserOrderOuterClass.UORequest request,
        io.grpc.stub.StreamObserver<com.lrbj.grpc.lib.UserOrderOuterClass.UOResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddUserOrderMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *  rpc DeleteOrder(ORequest) returns(UOResponse) {}
     * </pre>
     */
    public void updateOrder(com.lrbj.grpc.lib.UserOrderOuterClass.order request,
        io.grpc.stub.StreamObserver<com.lrbj.grpc.lib.UserOrderOuterClass.UOResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateOrderMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void selectOrder(com.lrbj.grpc.lib.UserOrderOuterClass.RequestId request,
        io.grpc.stub.StreamObserver<com.lrbj.grpc.lib.UserOrderOuterClass.OResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSelectOrderMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserOrderBlockingStub extends io.grpc.stub.AbstractStub<UserOrderBlockingStub> {
    private UserOrderBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserOrderBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserOrderBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserOrderBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.lrbj.grpc.lib.UserOrderOuterClass.UOResponse addUserOrder(com.lrbj.grpc.lib.UserOrderOuterClass.UORequest request) {
      return blockingUnaryCall(
          getChannel(), getAddUserOrderMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  rpc DeleteOrder(ORequest) returns(UOResponse) {}
     * </pre>
     */
    public com.lrbj.grpc.lib.UserOrderOuterClass.UOResponse updateOrder(com.lrbj.grpc.lib.UserOrderOuterClass.order request) {
      return blockingUnaryCall(
          getChannel(), getUpdateOrderMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.lrbj.grpc.lib.UserOrderOuterClass.OResponse selectOrder(com.lrbj.grpc.lib.UserOrderOuterClass.RequestId request) {
      return blockingUnaryCall(
          getChannel(), getSelectOrderMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserOrderFutureStub extends io.grpc.stub.AbstractStub<UserOrderFutureStub> {
    private UserOrderFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserOrderFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserOrderFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserOrderFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lrbj.grpc.lib.UserOrderOuterClass.UOResponse> addUserOrder(
        com.lrbj.grpc.lib.UserOrderOuterClass.UORequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddUserOrderMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     *  rpc DeleteOrder(ORequest) returns(UOResponse) {}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lrbj.grpc.lib.UserOrderOuterClass.UOResponse> updateOrder(
        com.lrbj.grpc.lib.UserOrderOuterClass.order request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateOrderMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lrbj.grpc.lib.UserOrderOuterClass.OResponse> selectOrder(
        com.lrbj.grpc.lib.UserOrderOuterClass.RequestId request) {
      return futureUnaryCall(
          getChannel().newCall(getSelectOrderMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_USER_ORDER = 0;
  private static final int METHODID_UPDATE_ORDER = 1;
  private static final int METHODID_SELECT_ORDER = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserOrderImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserOrderImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_USER_ORDER:
          serviceImpl.addUserOrder((com.lrbj.grpc.lib.UserOrderOuterClass.UORequest) request,
              (io.grpc.stub.StreamObserver<com.lrbj.grpc.lib.UserOrderOuterClass.UOResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ORDER:
          serviceImpl.updateOrder((com.lrbj.grpc.lib.UserOrderOuterClass.order) request,
              (io.grpc.stub.StreamObserver<com.lrbj.grpc.lib.UserOrderOuterClass.UOResponse>) responseObserver);
          break;
        case METHODID_SELECT_ORDER:
          serviceImpl.selectOrder((com.lrbj.grpc.lib.UserOrderOuterClass.RequestId) request,
              (io.grpc.stub.StreamObserver<com.lrbj.grpc.lib.UserOrderOuterClass.OResponse>) responseObserver);
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

  private static abstract class UserOrderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserOrderBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.lrbj.grpc.lib.UserOrderOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserOrder");
    }
  }

  private static final class UserOrderFileDescriptorSupplier
      extends UserOrderBaseDescriptorSupplier {
    UserOrderFileDescriptorSupplier() {}
  }

  private static final class UserOrderMethodDescriptorSupplier
      extends UserOrderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserOrderMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserOrderGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserOrderFileDescriptorSupplier())
              .addMethod(getAddUserOrderMethodHelper())
              .addMethod(getUpdateOrderMethodHelper())
              .addMethod(getSelectOrderMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
