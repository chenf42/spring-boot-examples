package com.metaobject.multimoduleproject.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User getDefaultAdmin() {
        User user = new User();
        user.setName("admin");
        return user;
    }
}
