package com.projectStore.projectStore.dao;

import com.projectStore.projectStore.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
    Role findByNameIgnoreCase(String name);
}
