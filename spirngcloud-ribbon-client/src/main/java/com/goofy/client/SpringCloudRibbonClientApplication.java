package com.goofy.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by jinFei on 2020-7-30.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix//开启断路器功能
public class SpringCloudRibbonClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudRibbonClientApplication.class, args);
    }
}
