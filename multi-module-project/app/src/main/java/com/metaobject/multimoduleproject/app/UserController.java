package com.metaobject.multimoduleproject.app;

import com.metaobject.multimoduleproject.service.User;
import com.metaobject.multimoduleproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/admin")
    public User showDefaultAdmin() {
        return userService.getDefaultAdmin();
    }
}
