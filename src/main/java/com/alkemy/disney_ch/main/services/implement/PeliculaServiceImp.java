
package com.alkemy.disney_ch.main.services.implement;

import com.alkemy.disney_ch.main.dto.PeliculaDTO;
import com.alkemy.disney_ch.main.entity.PeliculaEntity;
import com.alkemy.disney_ch.main.mapper.PeliculaMapper;
import com.alkemy.disney_ch.main.repository.PeliculaRepository;

import com.alkemy.disney_ch.main.services.PeliculaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeliculaServiceImp implements PeliculaService{
    
    @Autowired
    private PeliculaMapper peliculaMapper;
    @Autowired
    private PeliculaRepository peliculaRepository;
    
    public PeliculaDTO save(PeliculaDTO dto) {
        
        PeliculaEntity entity = peliculaMapper.PeliculaDTO2Entity(dto);
        PeliculaEntity entitySaved = peliculaRepository.save(entity);
        PeliculaDTO result = peliculaMapper.PeliculaEntity2DTO(entitySaved);
        
        System.out.println("Guardar Película");
        
        return result;
    }

    
    public List<PeliculaDTO> getAllPelicula() {
        
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
