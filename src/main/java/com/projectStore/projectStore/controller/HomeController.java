package com.projectStore.projectStore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * Created by 111 on 01.04.2019.
 */
@Controller
public class HomeController {

    @GetMapping
    public String main(Map<String, Object> model) {
        model.put("key", "Главная страница");
        return "home";
    }
}