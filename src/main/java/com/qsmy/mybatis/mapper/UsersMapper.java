package com.qsmy.mybatis.mapper;

import com.qsmy.mybatis.model.Users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author qsmy
 * @date 2019-07-24
 */
@Mapper
public interface UsersMapper {
    void insertUser(Users users);
    List<Users> findAll();
}
