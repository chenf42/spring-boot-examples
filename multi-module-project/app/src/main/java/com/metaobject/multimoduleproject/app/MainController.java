package com.metaobject.multimoduleproject.app;

import com.metaobjectmultimoduleproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private UserService userService;

    @Autowired
    public MainController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/admin")
    public User showDefaultAdmin() {
        User user = new User();
        user.setName(userService.getDefaultAdminName());
        return user;
    }
}
