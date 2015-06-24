package ru.my.mavenproject.model;

import java.util.*;

/**
 * Created by Nikolay on 21.06.2015.
 */
public class User extends NamedEntity {
    private String email;

    private  String password;

    private boolean enabled = true;

    private Date registered = new Date();

    private Set<Role> authorities;

    public User(){
    }

    public User(String name, String email, String password, Role role, Role... roles){
        super(name);
        this.email = email;
        this.password = password;
        this.enabled = true;
        this.authorities = EnumSet.of(role, roles);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Date getRegistered() {
        return registered;
    }

    public void setRegistered(Date registered) {
        this.registered = registered;
    }

    public void addAuthorit(Role authority){
        if(authorities == null){
            authorities = EnumSet.of(authority);
        } else {
            authorities.add(authority);
        }
    }
    public boolean isEnabled() {return enabled;}
    public Collection<Role> getAuthorities() {return authorities;}
    public String getPassword(){return password;}

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", enabled=" + enabled +
                ", registered=" + registered +
                '}';
    }
}
