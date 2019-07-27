package com.qsmy.mybatis.service.impl;

import com.qsmy.mybatis.mapper.AnnotationUsersMapper;
import com.qsmy.mybatis.mapper.UsersMapper;
import com.qsmy.mybatis.model.Users;
import com.qsmy.mybatis.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author qsmy
 * @date 2019-07-24
 */
@Service
@Transactional
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Autowired
    private AnnotationUsersMapper annotationUsersMapper;

    @Override
    public void addUser(Users users) {
        usersMapper.insertUser(users);
    }

    @Override
    public void addUserAnn(Users users) {
        annotationUsersMapper.insertUser(users);
    }

    @Override
    public List<Users> findAll() {
        return usersMapper.findAll();
    }
}
