package ru.my.mavenproject.repository;

import ru.my.mavenproject.model.User;

import java.util.List;

/**
 * Created by Nikolay on 24.06.2015.
 */
// use Repository or DAO?
    //work with model User
public interface UserRepository {
    //save refresh and paste
    User save(User user);

    //false if not found
    boolean delete(int id);

    //null if not found
    User get(int id);

    //null if not found
    User getByEmail(String email);

    List<User> getAll();
}
