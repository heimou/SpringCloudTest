package com.ideal.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liyujie
 * @Description:  配置中心启动类
 * @date 2017/12/6 14:40
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigApplication {

    private final static Logger LOGGER = LoggerFactory.getLogger(ConfigApplication.class);

    public static void main(String[] args){
        SpringApplication.run(ConfigApplication.class,args);
        LOGGER.info("ConfigApplication 启动成功 !");
    }
}
