package com.projectStore.projectStore.util;

import com.projectStore.projectStore.entity.User;
import com.projectStore.projectStore.service.UserServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserUtil {

    @Autowired
    UserServise userServise;

    public User createUser (String login, String userName, String mobile){
        User user = new User();
        user.setUserLogin(login);
        user.setUserName(userName);
        user.setMobile(mobile);
        userServise.save(user);
        return user;
    }
}
