package com.ideal.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;






/**
 * @author liyujie
 * @Description: rabbitMq 启动类
 * @date 2017/12/11 15:23
 */
@SpringBootApplication
public class RabbitMqApplication {


    public static void main(String[] args){
        SpringApplication.run(RabbitMqApplication.class,args);
    }
}


/**
 * @RabbitListener
 * 用于注册Listener时使用的信息：如queue，exchange，key、ListenerContainerFactory和RabbitAdmin的bean name。
 *
 *
 * @RabbitListener 和 @RabbitHandler结合使用，不同类型的消息使用不同的方法来处理。
 *
 *@EnableRabbit和@Configuration一起使用，
 * 可以加在类或者方法上，这个注解开启了容器对注册的bean的@RabbitListener检查。
 *
 */