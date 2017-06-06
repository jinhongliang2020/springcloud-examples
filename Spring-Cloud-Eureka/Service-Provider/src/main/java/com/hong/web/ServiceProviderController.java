package com.hong.web;

import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.EurekaClientConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hong on 2017/6/5.
 */
@RestController
public class ServiceProviderController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private EurekaClient client;

    @GetMapping("/hello")
    public String add(@RequestParam String msg) {
        EurekaClientConfig config = client.getEurekaClientConfig();
        String host = config.getProxyHost();
        logger.info("hello " + host+"..."+msg);
        return "hello..."+msg;
    }
}
