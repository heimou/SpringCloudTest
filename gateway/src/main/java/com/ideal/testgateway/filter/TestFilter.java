package com.ideal.testgateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * @author liyujie
 * @Description: Spring Cloud Zuul 拦截器
 * @date 2017/12/5 16:57
 */
public class TestFilter  extends ZuulFilter{

    private  final  static Logger log= LoggerFactory.getLogger(TestFilter.class);
    /**
     *filterType 过滤器类型 在请求的那个生命周期中执行
     * pre 可以在请求被路由前调用  常用这个进行自己的业务判断
     * route 在路由请求时被调用
     * post 在route和error 过滤之后被调用
     * error 处理请求发生错误的时候被调用
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * filterOrder：通过int值来定义过滤器的执行顺序
     * 多个过滤器按照 执行顺序来执行
     *  优先级为0，数字越大，优先级越低
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * shouldFilter :控制该过滤器是否需要执行
     *  true 执行 false 不执行
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * run 具体的执行逻辑
     * @return
     */
    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info(String.format("send %s request to %s", request.getMethod(), request.getRequestURL().toString()));
        return null;
    }


}
