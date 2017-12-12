package com.ideal.testRabbitmq;

import com.ideal.rabbitmq.RabbitMqApplication;
import com.ideal.rabbitmq.Receiver;
import com.ideal.rabbitmq.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author liyujie
 * @Description: rabbitmq 测试
 * @date 2017/12/11 15:47
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RabbitMqApplication.class)
//@WebAppConfiguration
public class HelloApplicationTests {

    @Autowired
    private Sender sender;

    @Autowired
    private Receiver receiver;

    @Test
    public  void  hello() throws  Exception{
        sender.send();
    }


    @Test
    public void process() throws Exception {
//        receiver.process();
    }

}
