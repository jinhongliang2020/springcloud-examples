package com.hong;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 服务调用者 启动类.
 * Created by hong on 2017/6/5.
 */
@SpringBootApplication
/* 启用服务注册与发现 */
@EnableDiscoveryClient
/* 启用feign进行远程调用 */
@EnableFeignClients
public class Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }
}
