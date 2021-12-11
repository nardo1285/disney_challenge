
package com.alkemy.disney_ch.main.controller;

import com.alkemy.disney_ch.main.dto.GeneroDTO;
import com.alkemy.disney_ch.main.services.GeneroService;
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
@RequestMapping("/genero")
public class GeneroController {
    
    @Autowired
    private GeneroService genService;
    
    @GetMapping
    public ResponseEntity<List<GeneroDTO>> getAll(){
        
        List<GeneroDTO> generos = genService.getAllGeneros();
        return ResponseEntity.ok().body(generos);
        
    }
    
    
    @PostMapping
    public ResponseEntity<GeneroDTO> save(@RequestBody GeneroDTO genero){
        
        GeneroDTO generoSaved = genService.save(genero);
        
        return ResponseEntity.status(HttpStatus.CREATED).body(generoSaved);
    }
    
    
}
