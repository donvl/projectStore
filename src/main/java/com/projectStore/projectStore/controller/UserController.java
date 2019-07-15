package com.projectStore.projectStore.controller;

import com.projectStore.projectStore.service.UserService;
import com.projectStore.projectStore.util.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    UserUtil userUtil;

    @RequestMapping(value = "addUser", method = RequestMethod.POST)
    public String addUser(@RequestParam(value = "login") String login,
                          @RequestParam(value = "userName") String userName,
                          @RequestParam(value = "mobile") String mobile,
                          @RequestParam(value = "password") String userPassword,
                          @RequestParam(value = "mail") String mail,
                          Map<String, Object> model) {
        if (mobile.length() < 10 || mobile.length() > 14) {
            model.put("error", "телефон должен быть от 10 до 14 символов");
            return "error";
        }
        userUtil.addUser(login, userName, mobile, userPassword, mail);
        return "redirect:/admin";
    }

    @RequestMapping(value = "/deleteUser/{userId}", method = RequestMethod.GET)
    public String deleteUser(@PathVariable("userId") Long id) {
        userService.deleteById(id);
        return "redirect:/admin";
    }

    @PostMapping("editUser")
    public String editUser(@RequestParam(value = "login", required = false) String login,
                           @RequestParam(value = "userName", required = false) String userName,
                           @RequestParam(value = "mobile", required = false) String mobile,
                           @RequestParam(value = "password", required = false) String userPassword,
                           @RequestParam(value = "mail", required = false) String mail,
                           @RequestParam(value = "id", required = false) Long userId,
                           Map<String, Object> model)throws IOException {
        if (mobile.length() < 10 || mobile.length() > 14) {
            model.put("error", "телефон должен быть от 10 до 14 символов");
            return "error";
        }
       userUtil.updateUser(login, userName, mobile, userPassword, mail, userId);
        return "redirect:/admin";
    }

    @PostMapping("registration")
    public String registration(@RequestParam(value = "login") String login,
                               @RequestParam(value = "userName") String userName,
                               @RequestParam(value = "mobile") String mobile,
                               @RequestParam(value = "password") String userPassword,
                               @RequestParam(value = "mail") String mail,
                               Map<String, Object> model) {
        if (mobile.length() < 10 || mobile.length() > 14) {
            model.put("error", "телефон должен быть от 10 до 14 символов");
            return "error";
        }
        userUtil.addUser(login, userName, mobile, userPassword, mail);
        return "redirect:/login";
    }
}
