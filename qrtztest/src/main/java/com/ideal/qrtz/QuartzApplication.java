package com.ideal.qrtz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author liyujie
 * @Description: 定时任务启动类
 * @date 2017/12/22 14:26
 */

/**
 * @EnableScheduling  开启任务调度
 */
@ComponentScan
@EnableAutoConfiguration
@EnableScheduling
@Configuration
@SpringBootApplication
public class QuartzApplication {

    private final static Logger log= LoggerFactory.getLogger(QuartzApplication.class);
    public  static  void  main(String[] args){
        SpringApplication.run(QuartzApplication.class,args);
        log.info("QuartzApplciation 启动成功!");
    }
}
