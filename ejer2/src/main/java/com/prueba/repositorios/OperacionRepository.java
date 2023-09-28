package com.prueba.repositorios;

import com.prueba.modelos.Operacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperacionRepository extends JpaRepository<Operacion, Long> {

    Operacion findOperacionByIdOperacion(long idOperacion);
}