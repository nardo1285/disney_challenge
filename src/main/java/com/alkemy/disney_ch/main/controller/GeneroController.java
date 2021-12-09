
package com.alkemy.disney_ch.main.controller;

import com.alkemy.disney_ch.main.dto.GeneroDTO;
import com.alkemy.disney_ch.main.services.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/genero")
public class GeneroController {
    
    @Autowired
    private GeneroService genService;
    
    @PostMapping
    public ResponseEntity<GeneroDTO> save(@RequestBody GeneroDTO genero){
        
        GeneroDTO generoSaved = genService.save(genero);
        
        return ResponseEntity.status(HttpStatus.CREATED).body(generoSaved);
    }
    
    
}
