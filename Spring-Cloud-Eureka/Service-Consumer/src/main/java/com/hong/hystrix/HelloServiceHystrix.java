package com.hong.hystrix;

import com.hong.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * Hystrix 回调类.
 * Created by hong on 2017/6/6.
 */
@Component
public class HelloServiceHystrix implements HelloService {


    @Override
    public String hello(String msg) {
        return "hello..."+"hystrix default!";
    }
}
