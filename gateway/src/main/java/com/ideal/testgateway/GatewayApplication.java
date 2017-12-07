package com.ideal.testgateway;

import com.ideal.testgateway.filter.TestFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;
import org.springframework.context.annotation.Bean;

/**
 * @author liyujie
 * @Description: Spring cloud 路由启动类
 * @date 2017/12/5 14:31
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class GatewayApplication {

    private final static Logger log= LoggerFactory.getLogger(GatewayApplication.class);

    /**
     * 自定义过滤器 需要被注入才能生效
     * @return
     */
    @Bean
    public TestFilter testFilter(){
        return new TestFilter();
    }

    public  static  void  main(String[] args){
        SpringApplication.run(GatewayApplication.class,args);
        log.info("GateWayApplication 启动成功!");
    }
}
