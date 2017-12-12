package com.ideal.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author liyujie
 * @Description:  消息生产者
 * @date 2017/12/11 15:27
 */
@Component
public class Sender {

    /**
     * amqpTemplate 接口定义了一套针对AMQP 协议的基础操作
     */
    @Autowired
    private AmqpTemplate amqpTemplate;


    public void send(){
        String context="hello "+ new Date();
        System.out.println("Sender :"+context);
        this.amqpTemplate.convertAndSend("hello",context);
    }
}
