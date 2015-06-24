package ru.my.mavenproject.service;

import ru.my.mavenproject.model.User;
import ru.my.mavenproject.utils.exception.NotFoundException;

import java.util.List;

/**
 * Created by Nikolay on 24.06.2015.
 */
// for repository we use boolean var, but for service layer more useful throws exceptions
    // service is business logic implementation
public interface UserService {
    User save(User user);

    void delete(int id) throws NotFoundException;

        User get (int id) throws NotFoundException;

    User getByEmail(String email) throws NotFoundException;

    List<User> getAll();

    void update(User user) throws NotFoundException;
}
