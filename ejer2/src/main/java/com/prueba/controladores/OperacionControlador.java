package com.prueba.controladores;

import com.prueba.servicios.IOperacionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class OperacionControlador{

    @Autowired
    private IOperacionServicio operacionServicio;

    @GetMapping(value="/operacion/{idOperacion}")
    public ResponseEntity<Map<String, Object>> getOperacion(@PathVariable long idOperacion){

        return ResponseEntity.status(HttpStatus.OK).body(operacionServicio.getInformacionOperacion(idOperacion));
    }
}