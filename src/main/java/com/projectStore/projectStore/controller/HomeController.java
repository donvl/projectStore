package com.projectStore.projectStore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;


@Controller
public class HomeController {

    @GetMapping
    public String main(Map<String, Object> model) {
        model.put("key", "Главная страница");
        return "home";
    }
    @GetMapping("test")
    public String test(Map<String, Object> model) {
        model.put("key", "Страница админа");
        return "test";
    }

}