package io.grpc.fcw;

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
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: SendPayNotify.proto")
public final class SendPayNotifyGrpc {

  private SendPayNotifyGrpc() {}

  public static final String SERVICE_NAME = "grpc.SendPayNotify";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.fcw.SendAliPayRequest,
      io.grpc.fcw.Response> getSendAliPayNotifyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendAliPayNotify",
      requestType = io.grpc.fcw.SendAliPayRequest.class,
      responseType = io.grpc.fcw.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<io.grpc.fcw.SendAliPayRequest,
      io.grpc.fcw.Response> getSendAliPayNotifyMethod() {
    io.grpc.MethodDescriptor<io.grpc.fcw.SendAliPayRequest, io.grpc.fcw.Response> getSendAliPayNotifyMethod;
    if ((getSendAliPayNotifyMethod = SendPayNotifyGrpc.getSendAliPayNotifyMethod) == null) {
      synchronized (SendPayNotifyGrpc.class) {
        if ((getSendAliPayNotifyMethod = SendPayNotifyGrpc.getSendAliPayNotifyMethod) == null) {
          SendPayNotifyGrpc.getSendAliPayNotifyMethod = getSendAliPayNotifyMethod = 
              io.grpc.MethodDescriptor.<io.grpc.fcw.SendAliPayRequest, io.grpc.fcw.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "grpc.SendPayNotify", "SendAliPayNotify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.fcw.SendAliPayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.fcw.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new SendPayNotifyMethodDescriptorSupplier("SendAliPayNotify"))
                  .build();
          }
        }
     }
     return getSendAliPayNotifyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SendPayNotifyStub newStub(io.grpc.Channel channel) {
    return new SendPayNotifyStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SendPayNotifyBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SendPayNotifyBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SendPayNotifyFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SendPayNotifyFutureStub(channel);
  }

  /**
   */
  public static abstract class SendPayNotifyImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<io.grpc.fcw.SendAliPayRequest> sendAliPayNotify(
        io.grpc.stub.StreamObserver<io.grpc.fcw.Response> responseObserver) {
      return asyncUnimplementedStreamingCall(getSendAliPayNotifyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendAliPayNotifyMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                io.grpc.fcw.SendAliPayRequest,
                io.grpc.fcw.Response>(
                  this, METHODID_SEND_ALI_PAY_NOTIFY)))
          .build();
    }
  }

  /**
   */
  public static final class SendPayNotifyStub extends io.grpc.stub.AbstractStub<SendPayNotifyStub> {
    private SendPayNotifyStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SendPayNotifyStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SendPayNotifyStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SendPayNotifyStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<io.grpc.fcw.SendAliPayRequest> sendAliPayNotify(
        io.grpc.stub.StreamObserver<io.grpc.fcw.Response> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getSendAliPayNotifyMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class SendPayNotifyBlockingStub extends io.grpc.stub.AbstractStub<SendPayNotifyBlockingStub> {
    private SendPayNotifyBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SendPayNotifyBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SendPayNotifyBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SendPayNotifyBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class SendPayNotifyFutureStub extends io.grpc.stub.AbstractStub<SendPayNotifyFutureStub> {
    private SendPayNotifyFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SendPayNotifyFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SendPayNotifyFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SendPayNotifyFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SEND_ALI_PAY_NOTIFY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SendPayNotifyImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SendPayNotifyImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_ALI_PAY_NOTIFY:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendAliPayNotify(
              (io.grpc.stub.StreamObserver<io.grpc.fcw.Response>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SendPayNotifyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SendPayNotifyBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.fcw.SendPayNotifyProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SendPayNotify");
    }
  }

  private static final class SendPayNotifyFileDescriptorSupplier
      extends SendPayNotifyBaseDescriptorSupplier {
    SendPayNotifyFileDescriptorSupplier() {}
  }

  private static final class SendPayNotifyMethodDescriptorSupplier
      extends SendPayNotifyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SendPayNotifyMethodDescriptorSupplier(String methodName) {
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
      synchronized (SendPayNotifyGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SendPayNotifyFileDescriptorSupplier())
              .addMethod(getSendAliPayNotifyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
