package com.ideal.test.webClient.Controller;

import com.ideal.test.webClient.dao.usertest.userDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liyujie
 * @Description: 测试controller
 * @date 2017/12/5 14:27
 */
@RestController
@RequestMapping(value = "/inter")
public class TestController {

    private  final  static Logger log= LoggerFactory.getLogger(TestController.class);

    @Autowired
    private  userDao userDao;

    @GetMapping(value = "/getheart")
    public String getHeart(){
        return "hrart die ! !";
    }

    @GetMapping(value = "/getbadBoy")
    public String getBadBoy(){
        return "oh! you met an  angel !";
    }

    @GetMapping(value = "/getuser")
    public String getuser(){
        return userDao.getUser();
    }
}
