package ru.my.mavenproject.service;

import ru.my.mavenproject.model.User;
import ru.my.mavenproject.repository.UserRepository;
import ru.my.mavenproject.utils.exception.NotFoundException;

import java.util.List;

/**
 * Created by Nikolay on 24.06.2015.
 */
public class UserServiceImpl implements UserService {
    private UserRepository repository; // отсюда достается юзер
    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public void delete(int id) throws NotFoundException {

    }

    @Override
    public User get(int id) throws NotFoundException {
        return null;
    }

    @Override
    public User getByEmael(String email) throws NotFoundException {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public void update(User user) throws NotFoundException {

    }
}
