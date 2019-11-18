/*
 * Programmer:liuwu
 * Date:2019/11/14
 */
package com.boot.demo.service;

import com.boot.demo.entity.User;
import com.boot.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> findAll() {
        return userMapper.findAll();
    }

}
