package com.beamnology.db.db.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.beamnology.db.db.entities.Beam;

@Repository
public interface SupportRepository extends CrudRepository {
    
}
