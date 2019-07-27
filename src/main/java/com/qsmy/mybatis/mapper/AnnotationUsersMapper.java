package com.qsmy.mybatis.mapper;

import com.qsmy.mybatis.model.Users;
import org.apache.ibatis.annotations.Insert;

/**
 * @author qsmy
 * @date 2019-07-25
 */
public interface AnnotationUsersMapper {

    @Insert("insert into users(name, age) values (#{name}, #{age})")
    void insertUser(Users users);
}
