package com.viniwebs.services;

import com.viniwebs.entities.Order;
import com.viniwebs.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(long id) {
        Optional<Order> user = repository.findById(id);
        return user.get();
    }
}
