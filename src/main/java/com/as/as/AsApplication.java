package com.as.as;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AsApplication {
    //这是eureka的server     tensquare的eureka服务器
    public static void main(String[] args) {
        SpringApplication.run(AsApplication.class, args);
    }

}
