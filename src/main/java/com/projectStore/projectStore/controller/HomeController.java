package com.projectStore.projectStore.controller;

import com.projectStore.projectStore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;


@Controller
public class HomeController {

    @Autowired
    UserService userService;

    @GetMapping
    public String main(Map<String, Object> model) {
        model.put("textHome", "Главная страница");
        return "home";
    }

    @GetMapping("admin")
    public String users(Map<String, Object> model) {
        model.put("userList", userService.findAll());
        return "admin";
    }

    @GetMapping("registration")
    public String registration(Map<String, Object> model) {
        return "registration";
    }
}