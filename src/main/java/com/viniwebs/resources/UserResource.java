package com.viniwebs.resources;

import com.viniwebs.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "Vinicius", "vinicius@gmail.com", "99999999", "1234");
        return ResponseEntity.ok().body(user);
    }
}
