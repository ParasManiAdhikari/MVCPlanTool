package de.luebeck.plantool.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role {
    @Id
    @Column(name = "role_id", nullable = false)
    private long roleId;
    private String rolename;

    public Role() {
    }

    public Role(int id, String rolename) {
        this.roleId = id;
        this.rolename = rolename;
    }

    // ------------------------------------------------------------------------------------------------------
    //GETTER AND SETTERS
    public void setRoleId(long id) {
        this.roleId = id;
    }


    public long getRoleId() {
        return roleId;
    }

    public String getRole(int roleId) {
        return rolename;
    }

    public void setRole(String role) {
        this.rolename = role;
    }
}
