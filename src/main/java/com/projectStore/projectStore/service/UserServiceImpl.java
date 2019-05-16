package com.projectStore.projectStore.service;

import com.projectStore.projectStore.dao.UserDao;
import com.projectStore.projectStore.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by 111 on 16.05.2019.
 */
public class UserServiceImpl implements UserServise {

    @Autowired
    UserDao userDao;

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.saveAndFlush(user);
    }

    @Override
    public void deleteUser(Long id) {
        userDao.deleteById(id);
    }


    @Override
    public User findUserByName(String username) {
        return userDao.findByUserName(username);
    }


    @Override
    public User findUserById(Long id) {
        if (id != null) {
            return userDao.getOne(id);
        }
        return null;
    }
}
