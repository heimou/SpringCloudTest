package com.ideal.test.discover;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author liyujie
 * @Description: 注册中心启动类
 * @date 2017/12/5 11:15
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoverApplication {

    private final static Logger log=LoggerFactory.getLogger(DiscoverApplication.class);

    public static  void main(String[] args){
        SpringApplication.run(DiscoverApplication.class,args);
        log.info("com.ideal.test.discover.DiscoverApplication 启动成功!");
    }
}
