
package com.alkemy.disney_ch.main.controller;

import com.alkemy.disney_ch.main.dto.GeneroDTO;
import com.alkemy.disney_ch.main.dto.PersonajeDTO;
import com.alkemy.disney_ch.main.services.PersonajeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("personaje")
public class PersonajeController {
    
    @Autowired
    private PersonajeService persoService;
    
    @GetMapping
    public ResponseEntity<List<PersonajeDTO>> getAll(){
        
        List<PersonajeDTO> personajes = persoService.getAllPersonajes();
        return ResponseEntity.ok().body(personajes);
        
    }
    
    @PostMapping
    public ResponseEntity<PersonajeDTO> save(@RequestBody PersonajeDTO personaje){
        
        PersonajeDTO personajeSaved = persoService.save(personaje);
        return ResponseEntity.status(HttpStatus.CREATED).body(personajeSaved);
    }
}
