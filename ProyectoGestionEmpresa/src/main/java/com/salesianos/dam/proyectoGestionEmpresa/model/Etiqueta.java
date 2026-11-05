package com.salesianos.dam.proyectoGestionEmpresa.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Etiqueta {

    @Id
    @GeneratedValue
    Long id;

    private String nombre;

    @ManyToMany
    @OnDelete(action = OnDeleteAction.SET_NULL)
    private List<Tarea> tarea = new ArrayList<>();
}
