package com.ideal.testdata.config;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * @author liyujie
 * @Description: 监控
 * @date 2017/12/8 11:30
 */
@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/druid/*",
        initParams = {
                @WebInitParam(name = "allow", value = "127.0.0.1"),//白名单
                @WebInitParam(name = "deny", value = ""), //黑名单
                @WebInitParam(name = "loginUsername", value = " "),
                @WebInitParam(name = "loginPassword", value = " "),
                @WebInitParam(name = "resetEnable", value = "false") //禁用HTML 页面上的“reset all ” 功能
        })

public class DruidStatViewServlet extends StatViewServlet {
}
