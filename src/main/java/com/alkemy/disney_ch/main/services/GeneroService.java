
package com.alkemy.disney_ch.main.services;

import com.alkemy.disney_ch.main.dto.GeneroDTO;
import java.util.List;

public interface GeneroService {
  
    GeneroDTO save(GeneroDTO dto);
    
    List<GeneroDTO> getAllGeneros();
    
    void delete(Long id);
}
