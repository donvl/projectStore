package com.projectStore.projectStore.dao;

import com.projectStore.projectStore.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserDao extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {
    User findByUserName(String userName);
}
