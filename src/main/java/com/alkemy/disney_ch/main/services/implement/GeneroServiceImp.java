
package com.alkemy.disney_ch.main.services.implement;

import com.alkemy.disney_ch.main.dto.GeneroDTO;
import com.alkemy.disney_ch.main.services.GeneroService;
import org.springframework.stereotype.Service;

@Service
public class GeneroServiceImp implements GeneroService{
    
    public GeneroDTO save(GeneroDTO dto){
        
        System.out.println("Guardar Género");
        
        return dto;
    }
}
