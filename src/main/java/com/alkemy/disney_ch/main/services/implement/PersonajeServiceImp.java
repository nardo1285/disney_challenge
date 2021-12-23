
package com.alkemy.disney_ch.main.services.implement;

import com.alkemy.disney_ch.main.dto.PersonajeDTO;
import com.alkemy.disney_ch.main.entity.PersonajeEntity;
import com.alkemy.disney_ch.main.mapper.PersonajeMapper;
import com.alkemy.disney_ch.main.repository.PersonajeRepository;
import com.alkemy.disney_ch.main.services.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonajeServiceImp implements PersonajeService{
 
    @Autowired
    private PersonajeMapper personajeMapper;
    @Autowired
    private PersonajeRepository personajeRepository;
    
    
    public PersonajeDTO save(PersonajeDTO dto){
        
        PersonajeEntity personaje = personajeMapper.personajeDTO2Entity(dto);
        PersonajeEntity personajeSaved = personajeRepository.save(personaje);
        PersonajeDTO saved = personajeMapper.personajeEntity2DTO(personajeSaved);
        
        System.out.println("Guardar Personaje");
        
        return saved;
    }
    
}
