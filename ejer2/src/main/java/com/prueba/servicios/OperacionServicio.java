package com.prueba.servicios;

import com.prueba.modelos.Operacion;
import com.prueba.repositorios.OperacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class OperacionServicio implements IOperacionServicio{

    @Autowired
    private OperacionRepository operacionRepository;

    public Map<String,Object> getInformacionOperacion(long idOperacion) {
        Map<String, Object> responseMap = new LinkedHashMap<>();

        Operacion operacion = operacionRepository.findOperacionByIdOperacion(idOperacion);

        String marca = operacion.getTarjeta().getMarca().getNombre();
        float tasa = operacion.getTarjeta().getMarca().getTasa() / 100.0f;
        float importeInicial = operacion.getMonto();
        float importeFinal = importeInicial + (tasa * importeInicial);

        responseMap.put("Marca",marca);
        responseMap.put("Tasa",String.format("%.2f%%", tasa * 100));
        responseMap.put("Importe inicial",importeInicial+"$");
        responseMap.put("Importe final",importeFinal+"$");

        return responseMap;
    }
}