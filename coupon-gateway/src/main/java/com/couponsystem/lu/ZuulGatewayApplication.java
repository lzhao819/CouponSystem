package com.couponsystem.lu;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/*网关应用启动入口
* @EnableZuulProxy 表示当前应用是Zuul server
* @SpringCloudApplication*/
@EnableZuulProxy
@SpringCloudApplication
public class ZuulGatewayApplication {
    public static void main(String[] args){
        SpringApplication.run(ZuulGatewayApplication.class, args);
    }
}
