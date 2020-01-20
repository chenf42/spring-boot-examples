package com.metaobjectmultimoduleproject.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String getDefaultAdminName() {
        return "admin";
    }
}
