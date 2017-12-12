package com.ideal.zipkinserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * @author liyujie
 * @Description: zipkinServer 启动类
 * @date 2017/12/12 15:34
 */


@SpringBootApplication
@EnableZipkinServer
public class ZipkinApplication {

    private  final static Logger log= LoggerFactory.getLogger(ZipkinApplication.class);


    public  static  void  main(String[] args){
        SpringApplication.run(ZipkinApplication.class
        ,args);
        log.info("ZipKinApplicaton 启动成功！");
    }
}
