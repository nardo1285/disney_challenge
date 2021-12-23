
package com.alkemy.disney_ch.main.services.implement;

import com.alkemy.disney_ch.main.dto.PersonajeDTO;
import com.alkemy.disney_ch.main.services.PersonajeService;
import org.springframework.stereotype.Service;

@Service
public class PersonajeServiceImp implements PersonajeService{
 
    
    
    public PersonajeDTO save(PersonajeDTO dto){
        
        //PersonajeEntity personaje = 
        
        System.out.println("Guardar Personaje");
        
        return dto;
    }
    
}
