package com.ideal.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liyujie
 * @Description: ${TODO}(用一句话描述该文件做什么)
 * @date 2017/12/11 17:16
 */

@Configuration
public class RabbitmqConfig {

    @Bean
    public Queue helloQueue(){
        return new Queue("hello");
    }

}
