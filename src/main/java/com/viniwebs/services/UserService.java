package com.viniwebs.services;


import com.viniwebs.entities.User;
import com.viniwebs.repositories.UserRepository;
import com.viniwebs.services.exceptions.ResourceNotFoundException;
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
        return user.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User save(User user) {
        return repository.save(user);
    }

    public User update(User user, Long id) {
        User entity = repository.getReferenceById(id);
        updateData(user, entity);
        return repository.save(entity);
    }

    public void deleteById(long id) {
        repository.deleteById(id);
    }

    private static void updateData(User user, User entity) {
        entity.setName(user.getName());
        entity.setEmail(user.getEmail());
        entity.setPhone(user.getPhone());
    }
}
