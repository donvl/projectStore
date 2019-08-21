package com.projectStore.projectStore.controller;

import com.projectStore.projectStore.service.UserService;
import com.projectStore.projectStore.util.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;


@Controller
public class HomeController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String main() {
        return "home";
    }

    @GetMapping("admin")
    public String users(Map<String, Object> model) {
        model.put("userList", userService.findAll());
        return "admin";
    }

    @GetMapping("registration")
    public String registration() {
        return "registration";
    }

    @GetMapping("/login")
    public String getLoginPage(ModelMap model, HttpServletRequest request){
        if (request.getParameterMap().containsKey("error")){
            model.addAttribute("error",true);
        }
        return "login";
    }
}