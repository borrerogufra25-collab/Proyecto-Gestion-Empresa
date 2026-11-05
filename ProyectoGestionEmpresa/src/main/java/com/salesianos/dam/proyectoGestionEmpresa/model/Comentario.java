package com.salesianos.dam.proyectoGestionEmpresa.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Comentario {

    @Id
    @GeneratedValue
    Long id;

    private String texto;

    private String autor;


    @ManyToOne
    @JoinColumn(name = "id_tarea")
    private Tarea tarea;

}
