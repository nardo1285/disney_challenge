    
package com.alkemy.disney_ch.main.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "pelicula")
@Setter
@Getter
@SQLDelete(sql="UPDATE pelicula SET deleted = true WHERE id=?")
@Where(clause = "deleted=false")
public class PeliculaEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
    private String imagen;
    private String titulo;
    
    @Column(name = "fecha_creacion")
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private LocalDate fechaCreacion;
    
    private Integer calificacion;
    private boolean deleted = Boolean.FALSE;
    
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "genero_id", insertable = false, updatable = false) 
    private GeneroEntity genero;
    
//    @Column(name = "genero_id", nullable = false)
//    private Long generoId;
    
    @ManyToMany(mappedBy = "pelicula", cascade = CascadeType.ALL)
    private List<PersonajeEntity> personaje = new ArrayList<>();
    
    
    
    
}
