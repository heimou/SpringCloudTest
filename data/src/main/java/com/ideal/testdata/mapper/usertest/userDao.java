package com.ideal.testdata.mapper.usertest;

import com.ideal.pojo.UserDo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author liyujie
 * @Description: 接口 mapper
 * @date 2017/12/8 14:31
 */
@Repository
@Mapper
public interface userDao {

    @Select("select* from usertest")
    List<UserDo> getuser();

    List<UserDo> getuserByid(Long id);

}
