package com.projectStore.projectStore.service;

import com.projectStore.projectStore.entity.User;

public interface UserServise {
    void save(User user);

    void updateUser(User user);

    void deleteUser(Long id);

    User findUserByName(String username);

    User findUserById(Long id);
}
