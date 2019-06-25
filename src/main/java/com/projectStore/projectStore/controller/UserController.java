package com.projectStore.projectStore.controller;

import com.projectStore.projectStore.entity.User;
import com.projectStore.projectStore.service.UserServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class UserController {
    @Autowired
    UserServise userServise;

    @RequestMapping(value = "addUser", method = RequestMethod.POST)
    public String addUser(@RequestParam(value = "login") String login,
                          @RequestParam(value = "userName") String userName,
                          @RequestParam(value = "mobile") String mobile,
                          Map<String, Object> model) {
        if (mobile.length() < 10 || mobile.length() > 14) {
            model.put("error", "телефон должен быть от 10 до 14 символов");
            return "error";
        }
        User user = new User();
        user.setUserLogin(login);
        user.setUserName(userName);
        user.setMobile(mobile);
        userServise.save(user);
        return "redirect:/users";
    }

    @RequestMapping(value = "/deleteUser/{userId}", method = RequestMethod.GET)
    public String deleteUser(@PathVariable("userId") Long id) {
        userServise.deleteById(id);
        return "redirect:/users";
    }

    @RequestMapping(value = "editUser", method = RequestMethod.POST)
    public String editUser(@RequestParam(value = "login") String login,
                           @RequestParam(value = "userName") String userName,
                           @RequestParam(value = "mobile") String mobile,
                           @RequestParam(value = "userId") Long userId,
                           Map<String, Object> model) {
        if (mobile.length() < 10 || mobile.length() > 14) {
            model.put("error", "телефон должен быть от 10 до 14 символов");
            return "error";
        }
        User user = userServise.finById(userId);
        user.setUserLogin(login);
        user.setUserName(userName);
        user.setMobile(mobile);
        userServise.upDate(user);
        return "redirect:/users";
    }
}
