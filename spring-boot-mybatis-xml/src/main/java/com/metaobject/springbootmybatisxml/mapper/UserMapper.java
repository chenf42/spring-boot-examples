package com.metaobject.springbootmybatisxml.mapper;

import com.metaobject.springbootmybatisxml.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {

    User getUserById(Integer id);
}
