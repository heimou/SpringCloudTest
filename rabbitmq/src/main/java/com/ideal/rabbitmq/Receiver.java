package com.ideal.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author liyujie
 * @Description: 消费者
 * @date 2017/12/11 15:28
 */
@Component
@RabbitListener(queues = "hello")
public class Receiver {

    /**
     * @RabbitHandler 处理对queues 队列的处理
     * @param hello
     */
    @RabbitHandler
    public  void process(String hello){

        System.out.println("Receiver :"+hello);
    }


}
