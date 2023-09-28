package ejer1.modelos;

import java.time.LocalDate;

public class Tarjeta {
    private Marca marca;
    private String numTarjeta;
    private String cardHolder;
    private LocalDate fechaVencimiento;

    public Tarjeta(Marca marca, String numTarjeta, String cardHolder, LocalDate fechaVencimiento) {
        this.marca = marca;
        this.numTarjeta = numTarjeta;
        this.cardHolder = cardHolder;
        this.fechaVencimiento = fechaVencimiento;
    }

    // Método para obtener toda la información
    public String obtenerInformacionTarjeta() {
        StringBuilder info = new StringBuilder();
        info.append("Marca: ").append(this.marca.getNombre()).append("\n");
        info.append("Número de Tarjeta: ").append(this.numTarjeta).append("\n");
        info.append("Titular de la Tarjeta: ").append(this.cardHolder).append("\n");
        info.append("Fecha de Vencimiento: ").append(this.fechaVencimiento).append("\n");
        return info.toString();
    }

    // Método para verificar si una tarjeta es válida para operar
    public boolean esTarjetaValidaParaOperar() {
        LocalDate hoy = LocalDate.now();
        return this.fechaVencimiento.isAfter(hoy);
    }

    // Método para verificar si una tarjeta es distinta a otra
    public boolean esDistinta(Tarjeta otraTarjeta) {
        return !this.numTarjeta.equals(otraTarjeta.getNumTarjeta()) ||
                !this.marca.getNombre().equals(otraTarjeta.getMarca().getNombre()) ||
                !this.cardHolder.equals(otraTarjeta.getCardHolder()) ||
                !this.fechaVencimiento.equals(otraTarjeta.getFechaVencimiento());
    }

    // Getter para marca
    public Marca getMarca() {
        return marca;
    }

    // Setter para marca
    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    // Getter para numTarjeta
    public String getNumTarjeta() {
        return numTarjeta;
    }

    // Setter para numTarjeta
    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    // Getter para cardHolder
    public String getCardHolder() {
        return cardHolder;
    }

    // Setter para cardHolder
    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    // Getter para fechaVencimiento
    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    // Setter para fechaVencimiento
    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
}
