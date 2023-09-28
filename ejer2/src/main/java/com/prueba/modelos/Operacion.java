package com.prueba.modelos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "operacion")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Operacion {

    @Id
    @Column(name = "idOperacion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idOperacion;

    @Column(name = "monto")
    private float monto;

    @ManyToOne(fetch = FetchType.EAGER)
    private Tarjeta tarjeta;

}