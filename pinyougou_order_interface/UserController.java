package com.itheima.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    @ResponseBody
    public String findAll() throws IOException {
        List<User> users = userService.findAll();
        System.out.println(users);
//        String userList = JSONUtils.toJSONString(users);
        return "list";
    }
}
