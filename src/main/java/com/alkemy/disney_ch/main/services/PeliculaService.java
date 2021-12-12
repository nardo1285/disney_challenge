
package com.alkemy.disney_ch.main.services;

import com.alkemy.disney_ch.main.dto.PeliculaDTO;
import java.util.List;

public interface PeliculaService {

    PeliculaDTO save(PeliculaDTO dto);
    
    List<PeliculaDTO> getAllPelicula();
    
}
