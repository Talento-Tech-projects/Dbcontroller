package com.beamnology.db.db.services;

import java.util.List;


import com.beamnology.db.db.dto.BeamDTO;

public class BeamService {
    List<BeamDTO> findAll();
    BeamDTO save(BeamDTO alumnoDTO);
    BeamDTO update(int id, BeamDTO alumnoDTO);
    void delete(;
}
