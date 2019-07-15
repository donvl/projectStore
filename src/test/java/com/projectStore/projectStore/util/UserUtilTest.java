package com.projectStore.projectStore.util;

import com.projectStore.projectStore.entity.User;
import com.projectStore.projectStore.service.UserService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class UserUtilTest {

    @InjectMocks
    private UserUtil userUtil;

    @Mock
    UserService userService;

    @BeforeClass
    public void run() {
        MockitoAnnotations.initMocks(this);
    }

    private User createUser() {
        User user = new User();
        user.setUserLogin("login");
        user.setUserName("name");
        user.setMobile("phone");
        user.setUserPass("password");
        user.setUserMail("mail");
        return user;
    }

    @Test
    public void addUser() {
        User user = createUser();
        userUtil.addUser("login", "name", "phone", "password", "mail");
        Mockito.verify(userService).save(user);
    }

    @Test
    public void updateUser() {
        User user = createUser();
        user.setUserId(10L);
        Mockito.when(userService.findById(10L)).thenReturn(user);
        userUtil.updateUser("login", "vasia", "phone", "password", "mail", user.getUserId());
        Mockito.verify(userService).update(user);
    }

}