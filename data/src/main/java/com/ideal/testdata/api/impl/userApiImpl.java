package com.ideal.testdata.api.impl;

import com.ideal.api.userApi.userApi;
import com.ideal.pojo.UserDo;
import com.ideal.testdata.mapper.usertest.userDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author liyujie
 * @Description: ${TODO}(用一句话描述该文件做什么)
 * @date 2017/12/8 14:45
 */
@RestController
public class userApiImpl implements userApi {

    private final static Logger log = LoggerFactory.getLogger(userApiImpl.class);

    @Autowired
    userDao userDao;

    @Override
    public String getUserByid(@PathVariable Long id) {
        log.info("===userApiImpl=getUserByid=id====" + id);
        String result = "";
        try {
            List<UserDo> list = userDao.getuserByid(id);
            for (UserDo user:list
                 ) {
                result= "name+"+user.getName()+ "id" +user.getId();
            }
        } catch (Exception e) {
            log.error("===userApiImpl=getUserByid Exception :" + e);
        }


        return result;
    }

    @Override
    public String getUser() {
        String result = "";
        try {
            List<UserDo> list = userDao.getuser();
            for (UserDo user:list
                    ) {
                result= "name+"+user.getName()+ "id" +user.getId();
            }
        } catch (Exception e) {
            log.error("===userApiImpl=getUser Exception :" + e);
        }


        return result;
    }
}
