package com.projectStore.projectStore.util;

import com.projectStore.projectStore.entity.Role;
import com.projectStore.projectStore.entity.User;
import com.projectStore.projectStore.service.RoleService;
import com.projectStore.projectStore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class UserUtil {

    @Autowired
    UserService userService;

    @Autowired
    RoleService roleService;

    public void addUser(String login, String userName, String mobile, String userPassword, String mail){

        User user = new User();
        Long userRoleId = 1L;
        Set<Role> roles = new HashSet<>();
        Role role = roleService.findRoleById(userRoleId);
        roles.add(role);
        user.setRoles(roles);

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
