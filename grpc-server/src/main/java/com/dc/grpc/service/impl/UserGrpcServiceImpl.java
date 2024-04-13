package com.dc.grpc.service.impl;

import com.dc.lib.dto.CommProto;
import com.dc.lib.dto.UserGrpc;
import com.dc.lib.dto.UserProto;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

/**
 * @author Mr.Deng
 */
@Slf4j
@GrpcService
public class UserGrpcServiceImpl extends UserGrpc.UserImplBase {

    /**
     * <pre>
     * 查询用户列表
     * </pre>
     *
     * @param request
     * @param responseObserver
     */
    @Override
    public void getUserList(CommProto.PageInfo request, StreamObserver<UserProto.UserListResp> responseObserver) {
        log.info("接收到客户端调用>>>");
        UserProto.UserInfoResp userInfoResp = UserProto.UserInfoResp.newBuilder()
                .setId(1)
                .setNikeName("dengchao")
                .setMobile("18229735193")
                .setBirthday(899637345L)
                .setGender(1)
                .setRole(2)
                .setPassword("3GXoiRCZM").build();

        UserProto.UserListResp userListResp = UserProto.UserListResp.newBuilder()
                .setTotal(2)
                .addRecords(userInfoResp)
                .addRecords(userInfoResp)
                .addRecords(userInfoResp)
                .addRecords(userInfoResp)
                .addRecords(userInfoResp).build();

        // 向客户端输出数据
        responseObserver.onNext(userListResp);
        // 结束输出
        responseObserver.onCompleted();
        log.info("客户端调用结束<<<");

    }
}
