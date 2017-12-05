package com.ideal.test.webClient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author liyujie
 * @Description: webClientApplication 启动类
 * @date 2017/12/5 14:09
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
public class WebClientApplication {

    private final static Logger log = LoggerFactory.getLogger(WebClientApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(WebClientApplication.class, args);
        log.info("WebClientApplication 启动成功!");
    }
}
