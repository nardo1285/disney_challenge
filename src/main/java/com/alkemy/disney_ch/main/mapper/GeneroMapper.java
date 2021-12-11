
package com.alkemy.disney_ch.main.mapper;

import com.alkemy.disney_ch.main.dto.GeneroDTO;
import com.alkemy.disney_ch.main.entity.GeneroEntity;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class GeneroMapper {
    
    //Aquí hago una conversión de un tipo de Objeto DTO a una Entidad
    public GeneroEntity GeneroDTO2Entity(GeneroDTO dto){
        
        GeneroEntity generoEntity = new GeneroEntity();
        
        generoEntity.setImagen(dto.getImagen());
        generoEntity.setNombre(dto.getNombre());
        
        return generoEntity;
    }
    
    public GeneroDTO GeneroEntity2DTO(GeneroEntity entity){
        
        GeneroDTO dto = new GeneroDTO();
        //Acá sí debo devolver el Id al cliente
        dto.setId(entity.getId());
        dto.setImagen(entity.getImagen());
        dto.setNombre(entity.getNombre());
        
        return dto;
    }
    
    public List<GeneroDTO> GeneroEntityList2DTOList(List<GeneroEntity> entities){
        
        List<GeneroDTO> dtos = new ArrayList<>();
        
        for (GeneroEntity entity : entities) {
            dtos.add(this.GeneroEntity2DTO(entity));
        }
        return dtos;
    }
    
}
