
package com.alkemy.disney_ch.main.entity;


import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table (name = "personaje")
@Getter
@Setter
public class PersonajeEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
    private String imagen;
    private String nombre;
    private Integer edad;
    private Integer peso;
    private String historia;
    
    //La asociación la voy a crear desde el lado del Personaje, y tendrá
    //el ownership de la relación con la Película.
    //Luego agrego un endpoint para hacer CRUD independientemente de la creación
    //de un personaje
    @ManyToMany(
                cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
                    
                })
    //Tabla intermedia
    @JoinTable(
                name = "personaje_pelicula",
                joinColumns = @JoinColumn(name = "personaje_id"),
                inverseJoinColumns = @JoinColumn(name = "pelicula_id"))
    private Set<PeliculaEntity> pelicula = new HashSet<>();
    
    
}
