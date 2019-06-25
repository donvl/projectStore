package com.projectStore.projectStore.controller;

import com.projectStore.projectStore.service.UserServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;


@Controller
public class HomeController {

    @Autowired
    UserServise userServise;

    @GetMapping
    public String main(Map<String, Object> model) {
        model.put("textHome", "Главная страница");
        return "home";
    }

    @GetMapping("test")
    public String test(Map<String, Object> model) {
        model.put("key", "Страница админа");
        return "test";
    }

    @GetMapping("users")
    public String users(Map<String, Object> model) {

        model.put("userList", userServise.findAll());
        return "users";
    }
}