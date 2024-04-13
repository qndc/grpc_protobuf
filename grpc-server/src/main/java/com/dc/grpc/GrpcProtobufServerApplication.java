package com.dc.grpc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Mr.Deng
 */
@SpringBootApplication
public class GrpcProtobufServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(GrpcProtobufServerApplication.class,args);
    }
}