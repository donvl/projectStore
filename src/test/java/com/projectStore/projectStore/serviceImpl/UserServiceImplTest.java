package com.projectStore.projectStore.serviceImpl;

import com.projectStore.projectStore.dao.UserDao;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class UserServiceImplTest {

    private static final Long USER_ID = 10L;

    @InjectMocks
    UserServiceImpl service;

    @Mock
    UserDao userDao;

    @BeforeClass
    public void run() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testFindById() {
        service.findById(USER_ID);
        Mockito.verify(userDao).getOne(USER_ID);
    }

    @Test
    public void testFindAll() throws Exception {
        service.findAll();
        Mockito.verify(userDao).findAll();
    }

    @Test
    public void testSave() {
    }

    @Test
    public void testDelete() {
    }

    @Test
    public void testDeleteById() {
    }

    @Test
    public void testUpdate() {
    }

    @Test
    public void testFindAll1() {
    }

    @Test
    public void testSaveAll() {
    }

}