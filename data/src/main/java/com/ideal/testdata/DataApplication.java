package com.ideal.testdata;

import com.alibaba.druid.pool.DruidDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @author liyujie
 * @Description: data启动类
 * @date 2017/12/7 17:39
 */
@EnableEurekaClient
@SpringBootApplication
public class DataApplication {

    private final static Logger log = LoggerFactory.getLogger(DataApplication.class);






    public static void main(String[] args) {
        SpringApplication.run(DataApplication.class, args);
        log.info("DataApplication 启动成功!");
    }
}
