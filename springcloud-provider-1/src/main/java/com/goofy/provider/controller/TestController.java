package com.goofy.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jinFei on 2020-7-30.
 */
@RestController
public class TestController {

    @Value("${server.port}")
    String port;

    @Value("${spring.application.name}")
    String name;
    @Value("${kd.app.name}")
    String appName;

    @RequestMapping("/test")
    public String test() {
        return appName+"上线测试1:"+name+":"+port;
    }
}
