package com.ideal.test.webClient.Utils;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author liyujie
 * @Description: httpClient  客户端
 * @date 2017/12/5 15:00
 */
public class HttpClientUtils {

    private  final  static Logger  log= LoggerFactory.getLogger(HttpClientUtils.class);

    /**
     *
     * @param requestData
     * @param url
     * @return  String
     * @throws Exception
     */
    public static String doPost(String requestData, String url) throws Exception {
        log.info("开始调用doPost....");
        log.info("传入参数" + url);
        log.info("传入参数：" + requestData.trim());
        int statusCode=0;
        String returnMessage="";
        try {
            PostMethod postmethod = new PostMethod(url);
            RequestEntity re = new StringRequestEntity(requestData,"application/json","UTF-8");
            postmethod.setRequestEntity(re);
            HttpClient httpClient = new HttpClient();
            statusCode = httpClient.executeMethod(postmethod);
            returnMessage = postmethod.getResponseBodyAsString();
            log.info("调用返回数据："+returnMessage);
        } catch (Exception e) {
            log.error("调用异常:Http错误码:{"+statusCode+"},异常信息:{"+e.getMessage()+"}",e);
            log.error("异常url地址:"+url);
        }
        return  returnMessage;

    }


    public static String doGet(String requestData,String url) throws Exception{
        String returnMessage="";
        log.info("开始调用doPost....");
        log.info("传入参数" + url);
        log.info("传入参数：" + requestData.trim());
        int statusCode=0;
        try {
            HttpClient httpClient = new HttpClient();
            GetMethod getMethod=new GetMethod(url);
            statusCode = httpClient.executeMethod(getMethod);
            returnMessage=getMethod.getResponseBodyAsString();
            log.info("调用返回数据："+returnMessage);
        }catch (Exception e){
            log.error("调用异常:Http错误码:{"+statusCode+"},异常信息:{"+e.getMessage()+"}",e);
            log.error("异常url地址:"+url);
        }
        return returnMessage;
    }

}
