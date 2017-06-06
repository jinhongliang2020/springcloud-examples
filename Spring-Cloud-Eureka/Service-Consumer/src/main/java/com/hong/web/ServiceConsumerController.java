package com.hong.web;

import com.hong.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hong on 2017/6/5.
 */
@RestController
public class ServiceConsumerController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello/{msg}")
    public String index(@PathVariable("msg") String msg) {
        return helloService.hello(msg);
    }
}
