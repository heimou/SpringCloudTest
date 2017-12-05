package com.ideal.test.webClient.Utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.security.MessageDigest;

/**
 * @author liyujie
 * @Description: 返回报文加密
 * @date 2017/11/24 16:58
 */
public class MD5EncryptionUtils {

    private final static Logger log = LoggerFactory.getLogger(MD5EncryptionUtils.class);

    /**
     * 报文加密格式
     * transactionId +”svcCont”开始到”svcCont”结束的业务信息json串+ SecretKey
     * 采用MD5方式取哈希值（32位小写）进行签名，签名后的数据放在tcpCont/ sign字段。
     */
    public static String getMD5(String transactionId, String svcCont, String SecretKey) {
        log.info("==transactionId==" + transactionId);
        log.info("==svcCont==" + svcCont);
        log.info("==SecretKey==" + SecretKey);
        String param = null;
        try {
            StringBuffer sb = new StringBuffer();
            param = sb.append(transactionId).append("\"").append("svcCont").append("\"").append(":")
                    .append(svcCont).append(SecretKey).toString();
            log.info("===MD5加密前的参数：====" + param);
            // 生成一个MD5加密计算摘要
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(param.getBytes());
            byte b[] = md.digest();
            int i;
            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }
            String md5 =buf.toString();
            log.info("===MD5加密后参数: ====="+md5);
            return md5;
        } catch (Exception e) {
            log.error("MD5加密错误:", e);
            throw new RuntimeException("MD5加密错误:" + e.getMessage(), e);
        }

    }

}
