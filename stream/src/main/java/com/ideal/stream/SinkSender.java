package com.ideal.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.MessageChannel;

/**
 * @author liyujie
 * @Description: 自定义输入流
 * @date 2017/12/12 14:22
 */

public interface SinkSender {

    @Output(Sink.INPUT)
    MessageChannel output();

}
