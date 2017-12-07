package com.ideal.testgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liyujie
 * @Description: 路由本地测试
 * @date 2017/12/6 14:03
 */
@RestController
public class GatewayController {

    @GetMapping("/hi")
    public  String getGateway(){

        return "Gateway say hi !";
    }
}
