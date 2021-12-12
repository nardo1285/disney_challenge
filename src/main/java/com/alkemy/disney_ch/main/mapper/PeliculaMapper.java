
package com.alkemy.disney_ch.main.mapper;

import com.alkemy.disney_ch.main.dto.PeliculaDTO;
import com.alkemy.disney_ch.main.entity.PeliculaEntity;
import org.springframework.stereotype.Component;

@Component
public class PeliculaMapper {
    
    public PeliculaEntity PeliculaDTO2Entity(PeliculaDTO dto){
        
        PeliculaEntity peliculaEntity = new PeliculaEntity();
       
        peliculaEntity.setImagen(dto.getImagen());
        peliculaEntity.setTitulo(dto.getTitulo());
        peliculaEntity.setFechaCreacion(dto.getFechaCreacion());
        peliculaEntity.setCalificacion(dto.getCalificacion());
        //peliculaEntity.setGeneroId(dto.getGenero_id());
        
        return peliculaEntity;
    }
    
    public PeliculaDTO PeliculaEntity2DTO(PeliculaEntity pelicula){
        
        PeliculaDTO peliculaDto = new PeliculaDTO();
       
        peliculaDto.setId(pelicula.getId());
        peliculaDto.setImagen(pelicula.getImagen());
        peliculaDto.setTitulo(pelicula.getTitulo());
        peliculaDto.setFechaCreacion(pelicula.getFechaCreacion());
        peliculaDto.setCalificacion(pelicula.getCalificacion());
        //peliculaDto.setGenero_id(pelicula.getGeneroId());
        
        return peliculaDto;
    }

}

