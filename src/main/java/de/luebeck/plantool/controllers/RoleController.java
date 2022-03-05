package de.luebeck.plantool.controllers;

import de.luebeck.plantool.entities.Role;
import de.luebeck.plantool.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class RoleController {
    private final RoleRepository roleRepository;

    @Autowired
    public RoleController(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role create(int id, String roleName) {
        Role role = new Role();
        role.setRoleId(id);
        role.setRole(roleName);
        return null;
    }
    public boolean delete(long roleId) {
        roleRepository.findById(roleId);
        return false;
    }

    public Role update(long roleId, String roleName) {
        Role role = new Role();
        return null;
    }

}
