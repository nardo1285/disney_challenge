    
package com.alkemy.disney_ch.main.dto;

//import com.alkemy.disney_ch.main.entity.GeneroEntity;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;


@Getter
@Setter
public class PeliculaDTO {
    
    private Long id;
    private String imagen;
    private String titulo;
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private LocalDate fechaCreacion;
    private Integer calificacion;
   // private GeneroEntity genero;
   // private Long genero_id;
    
}
