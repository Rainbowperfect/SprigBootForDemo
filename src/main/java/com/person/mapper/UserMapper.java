package com.person.mapper;

import com.person.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @version 1.0
 * @description com.person.mapper
 * @date 2017-8-17
 */
@Mapper
public interface UserMapper {
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
