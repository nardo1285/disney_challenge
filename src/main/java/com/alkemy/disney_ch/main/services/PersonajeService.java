
package com.alkemy.disney_ch.main.services;

import com.alkemy.disney_ch.main.dto.PersonajeDTO;
import java.util.List;


public interface PersonajeService {
    
    PersonajeDTO save(PersonajeDTO dto);
    
    List<PersonajeDTO> getAllPersonajes();
    
    void delete(Long id);
}
