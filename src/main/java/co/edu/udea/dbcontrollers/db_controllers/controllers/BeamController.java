package co.edu.udea.dbcontrollers.db_controllers.controllers;

import co.edu.udea.dbcontrollers.db_controllers.dtos.BeamDTO;
import co.edu.udea.dbcontrollers.db_controllers.services.BeamService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/beams") // ¡URL base para las vigas!
public class BeamController {

    @Autowired
    private BeamService beamService;

    @PostMapping
    public ResponseEntity<BeamDTO> createBeam(@Valid @RequestBody BeamDTO beamDTO) {
        BeamDTO savedBeam = beamService.save(beamDTO);
        return new ResponseEntity<>(savedBeam, HttpStatus.CREATED);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<BeamDTO> getBeamById(@PathVariable Long id) {
        return beamService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<BeamDTO>> getAllBeams() {
        return ResponseEntity.ok(beamService.findAll());
    }
    
    // Endpoint especial para buscar por usuario
    @GetMapping("/user/{userId}")
    public ResponseEntity<List<BeamDTO>> getBeamsByUserId(@PathVariable Long userId) {
        return ResponseEntity.ok(beamService.findByUserId(userId));
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBeam(@PathVariable Long id) {
         try {
            beamService.deleteById(id);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<BeamDTO> updatePartial(
            @PathVariable Long id,
            @RequestBody BeamDTO beamDTO) {
        BeamDTO updated = beamService.update(id, beamDTO);
        return ResponseEntity.ok(updated);
    }

    @PatchMapping("/{id}/name")
    public ResponseEntity<BeamDTO> updateProjectName(@PathVariable Long id, @RequestBody Map<String, String> body) {
        String newName = body.get("projectName");
        if (newName == null || newName.trim().isEmpty()) {
            return ResponseEntity.badRequest().build();
        }
        BeamDTO updatedBeam = beamService.updateProjectName(id, newName.trim());
        return ResponseEntity.ok(updatedBeam);
    }

    @PatchMapping("/{id}/status")
    public ResponseEntity<BeamDTO> updateProjectStatus(@PathVariable Long id, @RequestBody Map<String, Boolean> body) {
        Boolean newStatus = body.get("status");
        if (newStatus == null) {
            return ResponseEntity.badRequest().build();
        }
        BeamDTO updatedBeam = beamService.updateProjectStatus(id, newStatus);
        return ResponseEntity.ok(updatedBeam);
    }
}