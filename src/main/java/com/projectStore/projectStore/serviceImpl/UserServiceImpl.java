package com.projectStore.projectStore.serviceImpl;

import com.projectStore.projectStore.dao.UserDao;
import com.projectStore.projectStore.entity.User;
import com.projectStore.projectStore.service.UserServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class UserServiceImpl implements UserServise {

    @Autowired
    UserDao userDao;


    @Override
    public User finById(Long id) {
        return userDao.getOne(id);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User save(User obj) {
        return userDao.save(obj);
    }

    @Override
    public void delete(User obj) {
        userDao.delete(obj);
    }

    @Override
    public void deleteById(Long id) {
        userDao.deleteById(id);
    }

    @Override
    public void upDate(User obj) {
        userDao.saveAndFlush(obj);
    }

    @Override
    public List<User> findAll(Specification spec) {
        return userDao.findAll(spec);
    }

    @Override
    public void saveAll(Collection collection) {
        userDao.saveAll(collection);
    }
}
