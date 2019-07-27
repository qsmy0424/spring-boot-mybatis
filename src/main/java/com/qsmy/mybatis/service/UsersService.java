package com.qsmy.mybatis.service;

import com.qsmy.mybatis.model.Users;

import java.util.List;

/**
 * @author qsmy
 * @date 2019-07-24
 */
public interface UsersService {
    public void addUser(Users users);

    public void addUserAnn(Users users);

    public List<Users> findAll();
}
