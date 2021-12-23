
package com.alkemy.disney_ch.main.repository;

import com.alkemy.disney_ch.main.entity.PersonajeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonajeRepository extends JpaRepository<PersonajeEntity, Long>{

    
}
