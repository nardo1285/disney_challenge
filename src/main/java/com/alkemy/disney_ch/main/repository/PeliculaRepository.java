
package com.alkemy.disney_ch.main.repository;

import com.alkemy.disney_ch.main.entity.PeliculaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PeliculaRepository extends JpaRepository<PeliculaEntity, Long>{
    
    
}
