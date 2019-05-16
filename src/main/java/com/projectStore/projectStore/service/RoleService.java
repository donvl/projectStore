package com.projectStore.projectStore.service;

import com.projectStore.projectStore.entity.Role;

import java.util.List;

public interface RoleService {

    void saveRole(Role role);

    void deleteRole(Long id);

    void editRole(Role role);

    Role findRoleByName(String name);

    Role findRoleById(Long id);

    List<Role> getListRoles();

}
