package com.projectStore.projectStore.dao;

import com.projectStore.projectStore.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUserName(String userName);
}
