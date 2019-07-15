package com.projectStore.projectStore.util;

import com.projectStore.projectStore.entity.User;
import com.projectStore.projectStore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserUtil {

    @Autowired
    UserService userService;

    public void addUser(String login, String userName, String mobile, String userPassword, String mail){

        User user = new User();
        user.setUserLogin(login);
        user.setUserName(userName);
        user.setMobile(mobile);
        user.setUserPass(userPassword);
        user.setUserMail(mail);
        userService.save(user);
    }

    public void updateUser(String login, String userName, String mobile, String userPassword, String mail, Long userId){

        User user = userService.findById(userId);
        if (login != null){
            user.setUserLogin(login);
        }
        if (userName != null){
            user.setUserName(userName);
        }
        if (mobile != null){
            user.setMobile(mobile);
        }
        if (userPassword != null){
            user.setUserPass(userPassword);
        }
        if (mail != null){
            user.setUserMail(mail);
        }
        userService.update(user);
    }
}
