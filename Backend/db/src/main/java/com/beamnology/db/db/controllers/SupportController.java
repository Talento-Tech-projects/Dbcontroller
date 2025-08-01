package com.beamnology.db.db.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.beamnology.db.db.entities.Support;

@RestController
public class SupportController {
    @GetMapping("/supports")
    public Support get_support() {
        return new Support();
    }
}
