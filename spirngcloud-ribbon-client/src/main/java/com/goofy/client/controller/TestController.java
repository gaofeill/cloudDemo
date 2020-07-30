package com.goofy.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jinFei on 2020-7-30.
 */
@RestController
public class TestController {
    @Autowired
    TestFeign testFeign;// 注入 Feign接口
    @RequestMapping(value = "/test1")
    public String test(){
        return testFeign.testByFeign();
    }
}