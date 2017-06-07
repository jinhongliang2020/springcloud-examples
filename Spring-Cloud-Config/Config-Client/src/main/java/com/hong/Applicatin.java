package com.hong;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 配置中心启动类.
 * Created by hong on 2017/6/7.
 */
/* 启动类添加@EnableConfigServer，激活对配置中心的支持 */
@EnableConfigServer
@SpringBootApplication
public class Applicatin {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Applicatin.class).web(true).run(args);
    }
}
