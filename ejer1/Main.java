package ejer1;

import ejer1.modelos.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();

        // Obtener el día, mes y año actuales
        int diaActual = fechaActual.getDayOfMonth();
        int mesActual = fechaActual.getMonthValue();
        int añoActual = fechaActual.getYear() % 100;

        // Crear las marcas
        Marca marcaVISA = new Marca("VISA", (float) añoActual / mesActual);
        Marca marcaNARA = new Marca("NARA", (float) diaActual * 0.5f);
        Marca marcaAMEX = new Marca("AMEX", (float) mesActual * 0.1f);

        // Crear las tarjetas
        Tarjeta tarjetaVISA = new Tarjeta(marcaVISA, "1234123412341234", "Juan Etcheverry",
                fechaActual.plusYears(4));
        Tarjeta tarjetaAMEX = new Tarjeta(marcaAMEX, "9012901290129012", "Julio Perez",
                fechaActual.plusYears(4));
        Tarjeta tarjetaNARA = new Tarjeta(marcaNARA, "5678567856785678", "Sebastian Gonzales",
                fechaActual.minusYears(1));

        // Mostrar información de las tarjetas
        System.out.println("Información de Tarjetas:");
        System.out.println(tarjetaVISA.obtenerInformacionTarjeta());
        System.out.println(tarjetaAMEX.obtenerInformacionTarjeta());
        System.out.println(tarjetaNARA.obtenerInformacionTarjeta());

        // Verificar si una operación es válida
        try {
            Operacion operacion1 = new Operacion(900, tarjetaVISA);
            System.out.println("Operación 1 válida");
            System.out.println("-----------------------");
            System.out.println(operacion1.informacionOperacion());
        } catch (Exception e) {
            System.out.println("Error en Operación 1: " + e.getMessage());
        }

        try {
            Operacion operacion2 = new Operacion(1100, tarjetaAMEX);
            System.out.println("Operación 2 válida");
            System.out.println("-----------------------");
            System.out.println("Información de la operación");
            System.out.println(operacion2.informacionOperacion());
        } catch (Exception e) {
            System.out.println("Error en Operación 2: " + e.getMessage());
        }

        try {
            Operacion operacion3 = new Operacion(900, tarjetaNARA);
            System.out.println("Operación 3 válida");
            System.out.println("-----------------------");
            System.out.println("Información de la operación");
            System.out.println(operacion3.informacionOperacion());
        } catch (Exception e) {
            System.out.println("Error en Operación 3: " + e.getMessage());
        }

        // Verificar si una tarjeta es distinta a otra
        if (tarjetaVISA.esDistinta(tarjetaNARA)) {
            System.out.println("Tarjeta VISA es distinta de Tarjeta NARA");
        } else {
            System.out.println("Tarjeta VISA no es distinta de Tarjeta NARA");
        }
    }
}
