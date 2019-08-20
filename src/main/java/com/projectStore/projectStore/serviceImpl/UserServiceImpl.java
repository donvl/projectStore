package com.projectStore.projectStore.serviceImpl;

import com.projectStore.projectStore.dao.UserDao;
import com.projectStore.projectStore.entity.Role;
import com.projectStore.projectStore.entity.User;
import com.projectStore.projectStore.service.RoleService;
import com.projectStore.projectStore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findById(Long id) {
        return userDao.getOne(id);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User save(User user) {
        user.setUserPass(new BCryptPasswordEncoder().encode(user.getUserPass()));
        user.setActive(false);
        return userDao.save(user);
    }

    @Override
    public void delete(User user) {
        userDao.delete(user);
    }

    @Override
    public void deleteById(Long id) {
        userDao.deleteById(id);
    }

    @Override
    public void update(User user) {
        user.setUserPass(new BCryptPasswordEncoder().encode(user.getUserPass()));
        userDao.saveAndFlush(user);
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
