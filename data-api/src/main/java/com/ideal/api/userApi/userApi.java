package com.ideal.api.userApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liyujie
 * @Description: 对外暴露的Api
 * @date 2017/12/8 14:40
 */
@RequestMapping("/userApi")
public interface userApi {

    @GetMapping("/getuserbyid/{id}")
    String getUserByid(@PathVariable (value = "id") Long id);

   @GetMapping("/getuser")
   String getUser();
}
