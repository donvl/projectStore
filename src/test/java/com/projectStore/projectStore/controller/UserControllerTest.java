package com.projectStore.projectStore.controller;

import com.projectStore.projectStore.service.UserService;
import com.projectStore.projectStore.util.UserUtil;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;


public class UserControllerTest {

    private static final String LOGIN = "login";
    private static final String USER_NAME = "userName";
    private static final String USER_PHONE = "mobile";
    private static final String PASSWORD = "password";
    private static final String MAIL = "mail";
    private static final String PHONE_NUMBER = "1231567891";

    MockMvc mockMvc;

    @InjectMocks
    UserController userController;

    @Mock
    UserService userService;

    @Mock
    UserUtil userUtil;


    @BeforeClass
    private void run() {
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
    }

    @Test
    public void testAddUser() throws Exception {
        MvcResult result = mockMvc.perform(post("/addUser")
                .param(LOGIN, LOGIN)
                .param(USER_NAME, USER_NAME)
                .param(USER_PHONE, PHONE_NUMBER)
                .param(PASSWORD, PASSWORD)
                .param(MAIL, MAIL))
                .andReturn();
        Mockito.verify(userUtil).addUser(LOGIN, USER_NAME, PHONE_NUMBER, PASSWORD, MAIL);
        Assert.assertEquals(result.getResponse().getHeader("Location"), "/admin");
    }

    @Test
    public void testAddUserWithIncorrectNumberPhone() throws Exception {
        MvcResult result = mockMvc.perform(post("/addUser")
                .param(LOGIN, LOGIN)
                .param(USER_NAME, USER_NAME)
                .param(USER_PHONE, "01234567")
                .param(PASSWORD, PASSWORD)
                .param(MAIL, MAIL))
                .andReturn();
        Assert.assertEquals(result.getResponse().getForwardedUrl(), "error");
    }


    @Test
    public void testDeleteUser() throws Exception {
    }

    @Test
    public void testEditUser() throws Exception {
    }

    @Test
    public void testRegistration() throws Exception {
    }

}