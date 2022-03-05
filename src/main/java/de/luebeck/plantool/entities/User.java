package de.luebeck.plantool.entities;

import jdk.jfr.Enabled;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @Column(name = "id", nullable = false)
    private long id;

    private String name;
    private String username;
    private String email;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    private String password;
    private boolean isLoggedIn;

    public User(){

    }
    public User(int id, String name, String username, String email, String role, String password, boolean isLoggedIn){
        this.id = id;
        this.username = username;
        this.email = email;
        this.role = new Role(id, name);
        this.password = password;
        this.isLoggedIn = isLoggedIn;
    }

    // ------------------------------------------------------------------------------------------------------
    //GETTER AND SETTERS
    public void setId(long id) {
        this.id = id;
    }


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }
}
