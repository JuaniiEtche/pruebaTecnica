package ejer1.modelos;

import ejer1.excepciones.*;

public class Operacion {
    private float monto;
    private Tarjeta tarjeta;

    public Operacion(float monto, Tarjeta tarjeta) throws OperacionInvalidaExcepcion, TarjetaInvalidaExcepcion {
        if (tarjeta.esTarjetaValidaParaOperar()) {
            if (monto < 1000) {
                this.monto = monto;
                this.tarjeta = tarjeta;
            } else {
                throw new OperacionInvalidaExcepcion("Operación no válida");
            }
        } else {
            throw new OperacionInvalidaExcepcion("Tarjeta no válida");
        }
    }

    public String informacionOperacion() {
        String marca = this.getTarjeta().getMarca().getNombre();
        float tasa = this.getTarjeta().getMarca().getTasa() / 100.0f;
        float importeInicial = this.getMonto();
        float importeFinal = importeInicial + (tasa * importeInicial);

        StringBuilder info = new StringBuilder();
        info.append("Marca: ").append(marca).append("\n");
        info.append("Tasa: ").append(String.format("%.2f%%", tasa * 100)).append("\n");
        info.append("Importe inicial: ").append(importeInicial).append("\n");
        info.append("Importe final: ").append(importeFinal).append("\n");
        return info.toString();
    }

    // Getter para monto
    public float getMonto() {
        return monto;
    }

    // Setter para monto
    public void setMonto(float monto) {
        this.monto = monto;
    }

    // Getter para tarjeta
    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    // Setter para tarjeta
    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }
}
