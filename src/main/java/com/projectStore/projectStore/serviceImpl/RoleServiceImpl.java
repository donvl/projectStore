package com.projectStore.projectStore.serviceImpl;

import com.projectStore.projectStore.dao.RoleDao;
import com.projectStore.projectStore.entity.Role;
import com.projectStore.projectStore.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleDao roleDao;

    @Override
    public void saveRole(Role role) {
        roleDao.save(role);
    }

    @Override
    public void deleteRole(Long id) {
        roleDao.deleteById(id);
    }

    @Override
    public void editRole(Role role) {
        roleDao.saveAndFlush(role);
    }

    @Override
    public Role findRoleByName(String name) {
        return roleDao.findByNameIgnoreCase(name);
    }

    @Override
    public Role findRoleById(Long id) {
        return roleDao.getOne(id);
    }

    @Override
    public List<Role> getListRoles() {
        return roleDao.findAll();
    }
}
