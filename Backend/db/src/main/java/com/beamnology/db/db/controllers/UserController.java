package com.beamnology.db.db.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.beamnology.db.db.entities.User;

@RestController
public class UserController {
    @GetMapping("/users")
    public User get_user() {
        return new User();
    }

}
