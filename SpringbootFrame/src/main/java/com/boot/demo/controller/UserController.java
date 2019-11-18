/*
 * Programmer:liuwu
 * Date:2019/8/9
 */
package com.boot.demo.controller;


import com.boot.demo.entity.User;
import com.boot.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
     private  UserService  userService ;

    @RequestMapping("/findall")
    @ResponseBody
    public String findAll() {
       List<User> userList= userService.findAll();
        return  userList.get(0).getSex() + "名字:"+userList.get(0).getName();


    }

    @RequestMapping("/test")
    @ResponseBody
    public String Test() {
     //   List<User> userList= userService.findAll();
        return  "hello springboot";

    }


}
