package com.goofy.client.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jinFei on 2020-7-30.
 */
@Configuration
public class FeignConfig {
//    @Bean
//    public RequestInterceptor getRequestInterceptor(){
//        return new RequestInterceptor() {
//            @Override
//            public void apply(RequestTemplate requestTemplate) {
//                /** 设置请求头信息 **/
//                // requestTemplate.header("Content-Type", "application/json");
//                // 可以做日志记录
//                System.out.println("自定义拦截器-日志记录");
//            }
//        };
//    }

    @Bean
    public RequestInterceptor getRequestInterceptor(){
        return new RequestInterceptor() {
            @Override
            public void apply(RequestTemplate requestTemplate) {
                /** 设置请求头信息 **/
                 requestTemplate.header("Content-Type", "application/json");
                // 可以做权限判断
                System.out.println("自定义拦截器2-权限判断");
            }
        };
    }
}
