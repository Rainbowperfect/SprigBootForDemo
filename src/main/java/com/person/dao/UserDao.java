package com.person.dao;

import com.person.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * @version 1.0
 * @description com.person.dao
 * @date 2017-8-17
 */
@Repository
public class UserDao {

    public User getUser(){
        User user = new User(1L, "赵云", 18);
        return user;
    }
}
