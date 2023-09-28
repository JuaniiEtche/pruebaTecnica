package com.prueba.modelos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "marca")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Marca {

    @Id
    @Column(name = "idMarca")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMarca;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "tasa")
    private float tasa;

    @OneToMany(mappedBy = "marca",cascade = CascadeType.ALL)
    private List<Tarjeta> tarjetas;



}