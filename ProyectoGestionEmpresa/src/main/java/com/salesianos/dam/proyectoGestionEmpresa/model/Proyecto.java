package com.salesianos.dam.proyectoGestionEmpresa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Proyecto {

  @Id
  @GeneratedValue
  private Long id;

  private String nombre;
  private String descripcion;

  @OneToMany(mappedBy = "tarea")
  @Builder.Default
  @ToString.Exclude
  private List<Tarea> tarea = new ArrayList<>();


}