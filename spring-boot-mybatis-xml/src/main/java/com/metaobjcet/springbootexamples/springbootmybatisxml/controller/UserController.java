package com.metaobjcet.springbootexamples.springbootmybatisxml.controller;

import com.metaobjcet.springbootexamples.springbootmybatisxml.mapper.UserMapper;
import com.metaobjcet.springbootexamples.springbootmybatisxml.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {

    private UserMapper userMapper;

    @Autowired
    public UserController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @GetMapping("/{id}")
    public User showUser(@PathVariable("id") Integer id) {
        return userMapper.getUserById(id);
    }
}
