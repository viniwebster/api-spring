package com.viniwebs.services;


import com.viniwebs.entities.User;
import com.viniwebs.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(long id) {
        Optional<User> user = repository.findById(id);
        return user.get();
    }

    public User save(User user) {
        return repository.save(user);
    }
}
