package com.goofy.provider.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by jinFei on 2020-7-30.
 */
@SpringBootApplication
@EnableDiscoveryClient  //注册服务到注册中心去
public class ProviderRun_1 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderRun_1.class, args);
    }
}