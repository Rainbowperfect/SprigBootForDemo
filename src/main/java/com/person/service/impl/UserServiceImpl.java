package com.person.service.impl;

import com.person.dao.UserDao;
import com.person.mapper.UserMapper;
import com.person.pojo.User;
import com.person.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @version 1.0
 * @description com.person.service.impl
 * @date 2017-8-17
 */
@Service
//@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private UserMapper userMapper;
    @Override
    //@Transactional(readOnly = true)
    public User getUser() {
        return userDao.getUser();
    }

    @Override
    public void saveUser(User user) {
        userMapper.saveUser(user);
        int i = 1/0;
    }

    @Override
    //@Transactional(readOnly = true)
    public User queryUserById(Long id) {
        return userMapper.queryUserById(id);
    }
}
