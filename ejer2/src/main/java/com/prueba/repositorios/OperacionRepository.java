package com.prueba.repositorios;

import com.prueba.modelos.Operacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OperacionRepository extends JpaRepository<Operacion, Long> {

    Operacion findOperacionByIdOperacion(long idOperacion);
}