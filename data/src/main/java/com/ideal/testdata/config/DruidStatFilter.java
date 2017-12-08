package com.ideal.testdata.config;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.xml.ws.WebServiceFeature;

/**
 * @author liyujie
 * @Description: Druid 拦截器，用于查看Druid 监控
 * @date 2017/12/8 10:56
 */
@WebFilter(filterName = "druidWebStatFilter",urlPatterns = "/*",
        initParams = {
                @WebInitParam(name = "exclusions", value = "*js，*.gif，*.jpg，/druid/*")//忽略资源
        })

public class DruidStatFilter extends WebStatFilter{
}
