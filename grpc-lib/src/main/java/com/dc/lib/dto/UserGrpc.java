package com.dc.lib.dto;

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
 * 定义服务列表和入参出参
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.34.1)",
    comments = "Source: user.proto")
public final class UserGrpc {

  private UserGrpc() {}

  public static final String SERVICE_NAME = "User";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dc.lib.dto.CommProto.PageInfo,
      com.dc.lib.dto.UserProto.UserListResp> getGetUserListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserList",
      requestType = com.dc.lib.dto.CommProto.PageInfo.class,
      responseType = com.dc.lib.dto.UserProto.UserListResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dc.lib.dto.CommProto.PageInfo,
      com.dc.lib.dto.UserProto.UserListResp> getGetUserListMethod() {
    io.grpc.MethodDescriptor<com.dc.lib.dto.CommProto.PageInfo, com.dc.lib.dto.UserProto.UserListResp> getGetUserListMethod;
    if ((getGetUserListMethod = UserGrpc.getGetUserListMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getGetUserListMethod = UserGrpc.getGetUserListMethod) == null) {
          UserGrpc.getGetUserListMethod = getGetUserListMethod =
              io.grpc.MethodDescriptor.<com.dc.lib.dto.CommProto.PageInfo, com.dc.lib.dto.UserProto.UserListResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dc.lib.dto.CommProto.PageInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dc.lib.dto.UserProto.UserListResp.getDefaultInstance()))
              .setSchemaDescriptor(new UserMethodDescriptorSupplier("GetUserList"))
              .build();
        }
      }
    }
    return getGetUserListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dc.lib.dto.UserProto.MobileReq,
      com.dc.lib.dto.UserProto.UserInfoResp> getGetUserByMobileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserByMobile",
      requestType = com.dc.lib.dto.UserProto.MobileReq.class,
      responseType = com.dc.lib.dto.UserProto.UserInfoResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dc.lib.dto.UserProto.MobileReq,
      com.dc.lib.dto.UserProto.UserInfoResp> getGetUserByMobileMethod() {
    io.grpc.MethodDescriptor<com.dc.lib.dto.UserProto.MobileReq, com.dc.lib.dto.UserProto.UserInfoResp> getGetUserByMobileMethod;
    if ((getGetUserByMobileMethod = UserGrpc.getGetUserByMobileMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getGetUserByMobileMethod = UserGrpc.getGetUserByMobileMethod) == null) {
          UserGrpc.getGetUserByMobileMethod = getGetUserByMobileMethod =
              io.grpc.MethodDescriptor.<com.dc.lib.dto.UserProto.MobileReq, com.dc.lib.dto.UserProto.UserInfoResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserByMobile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dc.lib.dto.UserProto.MobileReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dc.lib.dto.UserProto.UserInfoResp.getDefaultInstance()))
              .setSchemaDescriptor(new UserMethodDescriptorSupplier("GetUserByMobile"))
              .build();
        }
      }
    }
    return getGetUserByMobileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dc.lib.dto.UserProto.IdReq,
      com.dc.lib.dto.UserProto.UserInfoResp> getGetUserByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserById",
      requestType = com.dc.lib.dto.UserProto.IdReq.class,
      responseType = com.dc.lib.dto.UserProto.UserInfoResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dc.lib.dto.UserProto.IdReq,
      com.dc.lib.dto.UserProto.UserInfoResp> getGetUserByIdMethod() {
    io.grpc.MethodDescriptor<com.dc.lib.dto.UserProto.IdReq, com.dc.lib.dto.UserProto.UserInfoResp> getGetUserByIdMethod;
    if ((getGetUserByIdMethod = UserGrpc.getGetUserByIdMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getGetUserByIdMethod = UserGrpc.getGetUserByIdMethod) == null) {
          UserGrpc.getGetUserByIdMethod = getGetUserByIdMethod =
              io.grpc.MethodDescriptor.<com.dc.lib.dto.UserProto.IdReq, com.dc.lib.dto.UserProto.UserInfoResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dc.lib.dto.UserProto.IdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dc.lib.dto.UserProto.UserInfoResp.getDefaultInstance()))
              .setSchemaDescriptor(new UserMethodDescriptorSupplier("GetUserById"))
              .build();
        }
      }
    }
    return getGetUserByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dc.lib.dto.UserProto.CreateUserReq,
      com.dc.lib.dto.UserProto.UserInfoResp> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUser",
      requestType = com.dc.lib.dto.UserProto.CreateUserReq.class,
      responseType = com.dc.lib.dto.UserProto.UserInfoResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dc.lib.dto.UserProto.CreateUserReq,
      com.dc.lib.dto.UserProto.UserInfoResp> getCreateUserMethod() {
    io.grpc.MethodDescriptor<com.dc.lib.dto.UserProto.CreateUserReq, com.dc.lib.dto.UserProto.UserInfoResp> getCreateUserMethod;
    if ((getCreateUserMethod = UserGrpc.getCreateUserMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getCreateUserMethod = UserGrpc.getCreateUserMethod) == null) {
          UserGrpc.getCreateUserMethod = getCreateUserMethod =
              io.grpc.MethodDescriptor.<com.dc.lib.dto.UserProto.CreateUserReq, com.dc.lib.dto.UserProto.UserInfoResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dc.lib.dto.UserProto.CreateUserReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dc.lib.dto.UserProto.UserInfoResp.getDefaultInstance()))
              .setSchemaDescriptor(new UserMethodDescriptorSupplier("CreateUser"))
              .build();
        }
      }
    }
    return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dc.lib.dto.UserProto.UpdateUserReq,
      com.dc.lib.dto.EmptyProto.Empty> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUser",
      requestType = com.dc.lib.dto.UserProto.UpdateUserReq.class,
      responseType = com.dc.lib.dto.EmptyProto.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dc.lib.dto.UserProto.UpdateUserReq,
      com.dc.lib.dto.EmptyProto.Empty> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<com.dc.lib.dto.UserProto.UpdateUserReq, com.dc.lib.dto.EmptyProto.Empty> getUpdateUserMethod;
    if ((getUpdateUserMethod = UserGrpc.getUpdateUserMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getUpdateUserMethod = UserGrpc.getUpdateUserMethod) == null) {
          UserGrpc.getUpdateUserMethod = getUpdateUserMethod =
              io.grpc.MethodDescriptor.<com.dc.lib.dto.UserProto.UpdateUserReq, com.dc.lib.dto.EmptyProto.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dc.lib.dto.UserProto.UpdateUserReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dc.lib.dto.EmptyProto.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UserMethodDescriptorSupplier("UpdateUser"))
              .build();
        }
      }
    }
    return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dc.lib.dto.UserProto.VerifyPwdReq,
      com.dc.lib.dto.UserProto.VerifyPwdResp> getVerifyPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerifyPassword",
      requestType = com.dc.lib.dto.UserProto.VerifyPwdReq.class,
      responseType = com.dc.lib.dto.UserProto.VerifyPwdResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dc.lib.dto.UserProto.VerifyPwdReq,
      com.dc.lib.dto.UserProto.VerifyPwdResp> getVerifyPasswordMethod() {
    io.grpc.MethodDescriptor<com.dc.lib.dto.UserProto.VerifyPwdReq, com.dc.lib.dto.UserProto.VerifyPwdResp> getVerifyPasswordMethod;
    if ((getVerifyPasswordMethod = UserGrpc.getVerifyPasswordMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getVerifyPasswordMethod = UserGrpc.getVerifyPasswordMethod) == null) {
          UserGrpc.getVerifyPasswordMethod = getVerifyPasswordMethod =
              io.grpc.MethodDescriptor.<com.dc.lib.dto.UserProto.VerifyPwdReq, com.dc.lib.dto.UserProto.VerifyPwdResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VerifyPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dc.lib.dto.UserProto.VerifyPwdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dc.lib.dto.UserProto.VerifyPwdResp.getDefaultInstance()))
              .setSchemaDescriptor(new UserMethodDescriptorSupplier("VerifyPassword"))
              .build();
        }
      }
    }
    return getVerifyPasswordMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserStub>() {
        @java.lang.Override
        public UserStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserStub(channel, callOptions);
        }
      };
    return UserStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserBlockingStub>() {
        @java.lang.Override
        public UserBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserBlockingStub(channel, callOptions);
        }
      };
    return UserBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserFutureStub>() {
        @java.lang.Override
        public UserFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserFutureStub(channel, callOptions);
        }
      };
    return UserFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 定义服务列表和入参出参
   * </pre>
   */
  public static abstract class UserImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *查询用户列表
     * </pre>
     */
    public void getUserList(com.dc.lib.dto.CommProto.PageInfo request,
        io.grpc.stub.StreamObserver<com.dc.lib.dto.UserProto.UserListResp> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserListMethod(), responseObserver);
    }

    /**
     * <pre>
     *通过手机号码查询用户（1-1）
     * </pre>
     */
    public void getUserByMobile(com.dc.lib.dto.UserProto.MobileReq request,
        io.grpc.stub.StreamObserver<com.dc.lib.dto.UserProto.UserInfoResp> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserByMobileMethod(), responseObserver);
    }

    /**
     * <pre>
     *通过Id查询用户(1-1)
     * </pre>
     */
    public void getUserById(com.dc.lib.dto.UserProto.IdReq request,
        io.grpc.stub.StreamObserver<com.dc.lib.dto.UserProto.UserInfoResp> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     *创建用户
     * </pre>
     */
    public void createUser(com.dc.lib.dto.UserProto.CreateUserReq request,
        io.grpc.stub.StreamObserver<com.dc.lib.dto.UserProto.UserInfoResp> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     * <pre>
     *更新用户
     * </pre>
     */
    public void updateUser(com.dc.lib.dto.UserProto.UpdateUserReq request,
        io.grpc.stub.StreamObserver<com.dc.lib.dto.EmptyProto.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     * <pre>
     *验证用户密码
     * </pre>
     */
    public void verifyPassword(com.dc.lib.dto.UserProto.VerifyPwdReq request,
        io.grpc.stub.StreamObserver<com.dc.lib.dto.UserProto.VerifyPwdResp> responseObserver) {
      asyncUnimplementedUnaryCall(getVerifyPasswordMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetUserListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.dc.lib.dto.CommProto.PageInfo,
                com.dc.lib.dto.UserProto.UserListResp>(
                  this, METHODID_GET_USER_LIST)))
          .addMethod(
            getGetUserByMobileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.dc.lib.dto.UserProto.MobileReq,
                com.dc.lib.dto.UserProto.UserInfoResp>(
                  this, METHODID_GET_USER_BY_MOBILE)))
          .addMethod(
            getGetUserByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.dc.lib.dto.UserProto.IdReq,
                com.dc.lib.dto.UserProto.UserInfoResp>(
                  this, METHODID_GET_USER_BY_ID)))
          .addMethod(
            getCreateUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.dc.lib.dto.UserProto.CreateUserReq,
                com.dc.lib.dto.UserProto.UserInfoResp>(
                  this, METHODID_CREATE_USER)))
          .addMethod(
            getUpdateUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.dc.lib.dto.UserProto.UpdateUserReq,
                com.dc.lib.dto.EmptyProto.Empty>(
                  this, METHODID_UPDATE_USER)))
          .addMethod(
            getVerifyPasswordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.dc.lib.dto.UserProto.VerifyPwdReq,
                com.dc.lib.dto.UserProto.VerifyPwdResp>(
                  this, METHODID_VERIFY_PASSWORD)))
          .build();
    }
  }

  /**
   * <pre>
   * 定义服务列表和入参出参
   * </pre>
   */
  public static final class UserStub extends io.grpc.stub.AbstractAsyncStub<UserStub> {
    private UserStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserStub(channel, callOptions);
    }

    /**
     * <pre>
     *查询用户列表
     * </pre>
     */
    public void getUserList(com.dc.lib.dto.CommProto.PageInfo request,
        io.grpc.stub.StreamObserver<com.dc.lib.dto.UserProto.UserListResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *通过手机号码查询用户（1-1）
     * </pre>
     */
    public void getUserByMobile(com.dc.lib.dto.UserProto.MobileReq request,
        io.grpc.stub.StreamObserver<com.dc.lib.dto.UserProto.UserInfoResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserByMobileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *通过Id查询用户(1-1)
     * </pre>
     */
    public void getUserById(com.dc.lib.dto.UserProto.IdReq request,
        io.grpc.stub.StreamObserver<com.dc.lib.dto.UserProto.UserInfoResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *创建用户
     * </pre>
     */
    public void createUser(com.dc.lib.dto.UserProto.CreateUserReq request,
        io.grpc.stub.StreamObserver<com.dc.lib.dto.UserProto.UserInfoResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *更新用户
     * </pre>
     */
    public void updateUser(com.dc.lib.dto.UserProto.UpdateUserReq request,
        io.grpc.stub.StreamObserver<com.dc.lib.dto.EmptyProto.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *验证用户密码
     * </pre>
     */
    public void verifyPassword(com.dc.lib.dto.UserProto.VerifyPwdReq request,
        io.grpc.stub.StreamObserver<com.dc.lib.dto.UserProto.VerifyPwdResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVerifyPasswordMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * 定义服务列表和入参出参
   * </pre>
   */
  public static final class UserBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserBlockingStub> {
    private UserBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *查询用户列表
     * </pre>
     */
    public com.dc.lib.dto.UserProto.UserListResp getUserList(com.dc.lib.dto.CommProto.PageInfo request) {
      return blockingUnaryCall(
          getChannel(), getGetUserListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *通过手机号码查询用户（1-1）
     * </pre>
     */
    public com.dc.lib.dto.UserProto.UserInfoResp getUserByMobile(com.dc.lib.dto.UserProto.MobileReq request) {
      return blockingUnaryCall(
          getChannel(), getGetUserByMobileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *通过Id查询用户(1-1)
     * </pre>
     */
    public com.dc.lib.dto.UserProto.UserInfoResp getUserById(com.dc.lib.dto.UserProto.IdReq request) {
      return blockingUnaryCall(
          getChannel(), getGetUserByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *创建用户
     * </pre>
     */
    public com.dc.lib.dto.UserProto.UserInfoResp createUser(com.dc.lib.dto.UserProto.CreateUserReq request) {
      return blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *更新用户
     * </pre>
     */
    public com.dc.lib.dto.EmptyProto.Empty updateUser(com.dc.lib.dto.UserProto.UpdateUserReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *验证用户密码
     * </pre>
     */
    public com.dc.lib.dto.UserProto.VerifyPwdResp verifyPassword(com.dc.lib.dto.UserProto.VerifyPwdReq request) {
      return blockingUnaryCall(
          getChannel(), getVerifyPasswordMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 定义服务列表和入参出参
   * </pre>
   */
  public static final class UserFutureStub extends io.grpc.stub.AbstractFutureStub<UserFutureStub> {
    private UserFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *查询用户列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dc.lib.dto.UserProto.UserListResp> getUserList(
        com.dc.lib.dto.CommProto.PageInfo request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *通过手机号码查询用户（1-1）
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dc.lib.dto.UserProto.UserInfoResp> getUserByMobile(
        com.dc.lib.dto.UserProto.MobileReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserByMobileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *通过Id查询用户(1-1)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dc.lib.dto.UserProto.UserInfoResp> getUserById(
        com.dc.lib.dto.UserProto.IdReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *创建用户
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dc.lib.dto.UserProto.UserInfoResp> createUser(
        com.dc.lib.dto.UserProto.CreateUserReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *更新用户
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dc.lib.dto.EmptyProto.Empty> updateUser(
        com.dc.lib.dto.UserProto.UpdateUserReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *验证用户密码
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dc.lib.dto.UserProto.VerifyPwdResp> verifyPassword(
        com.dc.lib.dto.UserProto.VerifyPwdReq request) {
      return futureUnaryCall(
          getChannel().newCall(getVerifyPasswordMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER_LIST = 0;
  private static final int METHODID_GET_USER_BY_MOBILE = 1;
  private static final int METHODID_GET_USER_BY_ID = 2;
  private static final int METHODID_CREATE_USER = 3;
  private static final int METHODID_UPDATE_USER = 4;
  private static final int METHODID_VERIFY_PASSWORD = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USER_LIST:
          serviceImpl.getUserList((com.dc.lib.dto.CommProto.PageInfo) request,
              (io.grpc.stub.StreamObserver<com.dc.lib.dto.UserProto.UserListResp>) responseObserver);
          break;
        case METHODID_GET_USER_BY_MOBILE:
          serviceImpl.getUserByMobile((com.dc.lib.dto.UserProto.MobileReq) request,
              (io.grpc.stub.StreamObserver<com.dc.lib.dto.UserProto.UserInfoResp>) responseObserver);
          break;
        case METHODID_GET_USER_BY_ID:
          serviceImpl.getUserById((com.dc.lib.dto.UserProto.IdReq) request,
              (io.grpc.stub.StreamObserver<com.dc.lib.dto.UserProto.UserInfoResp>) responseObserver);
          break;
        case METHODID_CREATE_USER:
          serviceImpl.createUser((com.dc.lib.dto.UserProto.CreateUserReq) request,
              (io.grpc.stub.StreamObserver<com.dc.lib.dto.UserProto.UserInfoResp>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((com.dc.lib.dto.UserProto.UpdateUserReq) request,
              (io.grpc.stub.StreamObserver<com.dc.lib.dto.EmptyProto.Empty>) responseObserver);
          break;
        case METHODID_VERIFY_PASSWORD:
          serviceImpl.verifyPassword((com.dc.lib.dto.UserProto.VerifyPwdReq) request,
              (io.grpc.stub.StreamObserver<com.dc.lib.dto.UserProto.VerifyPwdResp>) responseObserver);
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

  private static abstract class UserBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dc.lib.dto.UserProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("User");
    }
  }

  private static final class UserFileDescriptorSupplier
      extends UserBaseDescriptorSupplier {
    UserFileDescriptorSupplier() {}
  }

  private static final class UserMethodDescriptorSupplier
      extends UserBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserFileDescriptorSupplier())
              .addMethod(getGetUserListMethod())
              .addMethod(getGetUserByMobileMethod())
              .addMethod(getGetUserByIdMethod())
              .addMethod(getCreateUserMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getVerifyPasswordMethod())
              .build();
        }
      }
    }
    return result;
  }
}
