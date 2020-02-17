package com.metaobjcet.springbootexamples.springbootmybatisxml.mapper;

import com.metaobjcet.springbootexamples.springbootmybatisxml.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User getUserById(Integer id);
}
