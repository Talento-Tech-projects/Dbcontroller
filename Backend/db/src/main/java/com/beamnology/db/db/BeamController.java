package com.beamnology.db.db;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class BeamController {

    private static Beam temporaryBeam = new Beam();

    @GetMapping("/beams")
    public Beam get_beam(long id) {
        if
        return temporaryBeam;
    }

    @PostMapping("/beams")
    public Beam createBeam(@RequestBody Beam newBeam) {
        //TODO: process POST request
        temporaryBeam = newBeam;
        temporaryBeam.setId(1L);
        return temporaryBeam;
    }
    
    @PutMapping("beams/{id}")
    public String putMethodName(@PathVariable String id, @RequestBody String entity) {
        //TODO: process PUT request
        
        return entity;
    }
    
}
