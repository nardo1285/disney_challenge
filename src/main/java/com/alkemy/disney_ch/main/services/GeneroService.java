
package com.alkemy.disney_ch.main.services;

import com.alkemy.disney_ch.main.dto.GeneroDTO;
import org.springframework.stereotype.Service;

@Service
public class GeneroService {
    
    public GeneroDTO save(GeneroDTO dto){
        
        System.out.println("Guardar Género");
        
        return dto;
    }
}
