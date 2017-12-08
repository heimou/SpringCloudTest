package com.ideal.test.webClient.dao.usertest;

import com.ideal.api.userApi.userApi;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @author liyujie
 * @Description: Fegin 远程调用
 * @date 2017/12/8 15:46
 */
@FeignClient(value = "dataconfig")
public interface userDao extends userApi {
}
