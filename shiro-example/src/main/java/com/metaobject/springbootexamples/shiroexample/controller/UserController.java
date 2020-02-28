package com.metaobject.springbootexamples.shiroexample.controller;

import com.metaobject.springbootexamples.shiroexample.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    //private static Logger log = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/login")
    public String submitLoginForm(@ModelAttribute User user, Model model) {
        if (!user.getLogin().equals("admin") || !user.getPassword().equals("123")) {
            model.addAttribute("error", "invalid login or password!");
        }

        return "home";
    }
}
