
package com.alkemy.disney_ch.main.mapper;

import com.alkemy.disney_ch.main.dto.PersonajeDTO;
import com.alkemy.disney_ch.main.entity.PersonajeEntity;
import org.springframework.stereotype.Component;

@Component
public class PersonajeMapper {
    
    
    public PersonajeEntity personajeDTO2Entity(PersonajeDTO dto){
        
        PersonajeEntity personajeEntity = new PersonajeEntity();
        
        personajeEntity.setImagen(dto.getImagen());
        personajeEntity.setNombre(dto.getNombre());
        personajeEntity.setEdad(dto.getEdad());
        personajeEntity.setPeso(dto.getPeso());
        personajeEntity.setHistoria(dto.getHistoria());
        
        return personajeEntity;
    }
    
    
    public PersonajeDTO personajeEntity2DTO (PersonajeEntity entity){
        
        PersonajeDTO personajeDto = new PersonajeDTO();
        
        personajeDto.setId(entity.getId());
        personajeDto.setImagen(entity.getImagen());
        personajeDto.setNombre(entity.getNombre());
        personajeDto.setEdad(entity.getEdad());
        personajeDto.setPeso(entity.getPeso());
        personajeDto.setHistoria(entity.getHistoria());
        
        return personajeDto;
    }
    
    
}
