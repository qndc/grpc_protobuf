package com.dc.client.controller;

import com.alibaba.fastjson.JSONObject;
import com.dc.lib.dto.CommProto;
import com.dc.lib.dto.UserGrpc;
import com.dc.lib.dto.UserProto;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mr.Deng
 */
@Slf4j
@RestController
@RequestMapping("/userInfo")
public class UserController {

    @GrpcClient("grpc-server")
    UserGrpc.UserBlockingStub userBlockingStub;

    /**
     * 获取用户列表
     * @return
     */
    @RequestMapping("/getUser")
    public String getUserList() {
        log.info("调用远程服务开始>>>");
        CommProto.PageInfo pageInfo = CommProto.PageInfo.newBuilder().setPageNum(1).setPageSize(5).build();
        UserProto.UserListResp userList = userBlockingStub.getUserList(pageInfo);
        log.info("调用远程服务结束<<<");
        return JSONObject.toJSONString(userList.getRecordsList());
    }

}
