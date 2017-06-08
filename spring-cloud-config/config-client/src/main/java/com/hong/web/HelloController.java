package com.hong.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hong on 2017/6/8.
 */
@RestController
public class HelloController {

    @Value("${profile}")
    private String profile;

    @GetMapping("/hello")
    public String hello(){
        return profile;
    }
}
