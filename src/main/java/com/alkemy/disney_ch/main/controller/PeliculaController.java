
package com.alkemy.disney_ch.main.controller;

import com.alkemy.disney_ch.main.dto.PeliculaDTO;
import com.alkemy.disney_ch.main.services.PeliculaService;
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
@RequestMapping("/pelicula")
public class PeliculaController {
    
    @Autowired
    private PeliculaService peliculaService;
    
    @GetMapping
    public ResponseEntity<List<PeliculaDTO>> getAll(){
    
        List<PeliculaDTO> peliculas = peliculaService.getAllPelicula();
        return ResponseEntity.ok().body(peliculas);
}
    
    @PostMapping
    private ResponseEntity<PeliculaDTO> save(@RequestBody PeliculaDTO pelicula){
        
        PeliculaDTO peliculaSaved = peliculaService.save(pelicula);
        
        return ResponseEntity.status(HttpStatus.CREATED).body(peliculaSaved);
    }
    
}
