package com.controller;

import com.pojo.User;
import com.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/myweb")
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @GetMapping("/alluser")
    @ResponseBody
    public List<User> getUser(){
        List<User> userlist = userService.alluser();
        return userlist;
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @PostMapping("tologin")
    @ResponseBody
    public String tologin(){
        return "hello world";
    }
}
