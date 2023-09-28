package com.prueba.modelos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "tarjeta")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Tarjeta {

    @Id
    @Column(name = "idTarjeta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTarjeta;

    @Column(name = "numTarjeta")
    private String numTarjeta;

    @Column(name = "cardHolder")
    private String cardHolder;

    @Column(name = "fechaVencimiento")
    private LocalDate fechaVencimiento;

    @ManyToOne(fetch = FetchType.EAGER)
    private Marca marca;

    @OneToMany(mappedBy = "tarjeta",cascade = CascadeType.ALL)
    private List<Operacion> operaciones;

}