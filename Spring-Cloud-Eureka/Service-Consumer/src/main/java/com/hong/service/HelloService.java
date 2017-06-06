package com.hong.service;

import com.hong.hystrix.HelloServiceHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 消费服务.
 * Created by hong on 2017/6/5.
 */
/* fallback指定回调类，当请求后端服务出现异常的时候, 可以使用fallback方法返回的值.  */
@FeignClient(name = "service-provider",fallback = HelloServiceHystrix.class)
public interface HelloService {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(@RequestParam(value = "msg") String msg);
}
