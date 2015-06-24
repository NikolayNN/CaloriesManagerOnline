package ru.my.mavenproject;

import ru.my.mavenproject.model.Role;

import java.util.Set;

/**
 * Created by Nikolay on 24.06.2015.
 */
// почти as a DTO object
public class LoggedUser {
    protected int id;
    protected Set<Role> roles;
    protected boolean enabled;

    public int getId() {
        return id;
    }
}
