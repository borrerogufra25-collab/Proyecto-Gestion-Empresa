package com.salesianos.dam.proyectoGestionEmpresa.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Tarea {

  @Id
  @GeneratedValue
  private Long id;

  private String titulo;
  private String estado;


  @ManyToOne
  @JoinColumn(name = "id_proyecto")
  private Proyecto proyecto;

  @OneToMany(mappedBy = "comentario", cascade = CascadeType.REMOVE)
  @Builder.Default
  @ToString.Exclude
  private List<Comentario> comentarios = new ArrayList<>();

  @ManyToMany
  @Builder.Default
  @ToString.Exclude
  @OnDelete(action = OnDeleteAction.SET_NULL)
  private List<Etiqueta> etiquetas = new ArrayList<>();


}