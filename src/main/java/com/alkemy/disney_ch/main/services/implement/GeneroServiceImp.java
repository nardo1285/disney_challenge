
package com.alkemy.disney_ch.main.services.implement;

import com.alkemy.disney_ch.main.dto.GeneroDTO;
import com.alkemy.disney_ch.main.entity.GeneroEntity;
import com.alkemy.disney_ch.main.mapper.GeneroMapper;
import com.alkemy.disney_ch.main.repository.GeneroRepository;
import com.alkemy.disney_ch.main.services.GeneroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneroServiceImp implements GeneroService{
    
    @Autowired
    private GeneroMapper generoMapper;
    @Autowired
    private GeneroRepository generoRepo;
    
    public GeneroDTO save(GeneroDTO dto){
        
        GeneroEntity entity = generoMapper.GeneroDTO2Entity(dto);
        GeneroEntity entitySaved = generoRepo.save(entity);
        GeneroDTO result = generoMapper.GeneroEntity2DTO(entitySaved);
        //Esto lo tenemos que convertir en DTO, ya que es lo que maneja el Controller
        System.out.println("Guardar Género");
        
        return result;
    }

    
    public List<GeneroDTO> getAllGeneros() {
        List<GeneroEntity> entities = generoRepo.findAll();
        List<GeneroDTO> result = generoMapper.GeneroEntityList2DTOList(entities);
        
        return result;
        
    }
    
    public void delete(Long id){
        this.generoRepo.deleteById(id);
    }
}
