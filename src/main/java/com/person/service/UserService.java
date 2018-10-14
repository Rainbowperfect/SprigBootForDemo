package com.person.service;

import com.person.pojo.User;

/**
 * @version 1.0
 * @description com.person.service
 * @date 2017-8-17
 */
public interface UserService {
    /**
     * 获取用户信息
     * @return
     */
    User getUser();

    /**
     * 保存用户
     * @param user
     */
    void saveUser(User user);

    /**
     * 跟据id查询用户信息
     * @param id
     * @return
     */
    User queryUserById(Long id);
}
