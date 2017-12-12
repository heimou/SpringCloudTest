package com.ideal.stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @author liyujie
 * @Description: 接收来自Rabbitmq 的消费者
 * @date 2017/12/12 10:53
 */

//@EnableBinding加到应用上就可以实现与消息代理的连接
@EnableBinding({Sink.class,SinkSender.class})
public class SinkReceiver {

    private final static Logger log= LoggerFactory.getLogger(SinkReceiver.class);

    /**
     * @StreamListener（Sink.INPUT） 接收处理流的事件
     * @param payload
     */
    //@StreamListener注解加到方法上，使之可以接收处理流的事件。
    @StreamListener(Sink.INPUT)
    public void receive(Object payload){
        log.info("Receive :"+payload);
    }
}

/**
 *@EnableBinding  用来指定一个或者多个定义了@input 或者@output 注解的接口
 *
 * sink.class 是spring cloud stream 中默认实现对输入消息通道的绑定
 *
 * 出了Sink还有 Source 和Processor
 *
 *
 * 定义输出通道(channel)的时候 return MessageChannel 接口对象
 * 定义输入通道()的时候 return SubscribableChannel 接口对象 extends MessageChannel
 *
 *
 */