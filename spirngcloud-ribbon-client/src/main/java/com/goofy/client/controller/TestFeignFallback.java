package com.goofy.client.controller;

import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 关联fallback = TestFeignFallback.class 一旦错误就回调同名称的方法
 * Created by jinFei on 2020-7-30.
 */
@Component
public class TestFeignFallback implements TestFeign {
    @Override
    public String testByFeign() {
        return "error";
    }

    @Override
    public String testByParam(String from) {
        return "error";
    }

    @Override
    public String testByMap(Map<String, Object> map) {
        return "error";
    }

    @Override
    public String testByRequestBody(User user) {
        return "error";
    }


}
