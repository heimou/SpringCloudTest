package com.ideal.testgateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

/**
 * @author liyujie
 * @Description: Spring cloud 路由启动类
 * @date 2017/12/5 14:31
 */
@SpringBootApplication
@EnableZuulServer
@EnableEurekaClient
public class GatewayApplication {

    private final static Logger log= LoggerFactory.getLogger(GatewayApplication.class);

    public  static  void  main(String[] args){
        SpringApplication.run(GatewayApplication.class,args);
        log.info("GateWayApplication 启动成功!s");
    }
}
