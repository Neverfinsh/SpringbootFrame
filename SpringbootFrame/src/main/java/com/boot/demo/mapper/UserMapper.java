/*
 * Programmer:liuwu
 * Date:2019/11/14
 */
package com.boot.demo.mapper;

import com.boot.demo.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    public List<User> findAll();

}
