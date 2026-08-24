package edu.dosw.bootcamp.lab.creacionales.Reto3;


public class Percusion {

    public static Instrumento crear(String modelo, Gama gama) {

        double precioBase;

        switch (modelo) {
            case "Batería":
                precioBase = 1800000;
                break;

            case "Cajón":
                precioBase = 350000;
                break;

            case "Timbal":
                precioBase = 600000;
                break;

            default:
                throw new IllegalArgumentException("Modelo de percusión no válido");
        }

        return new Instrumento(modelo, "Percusión", gama, precioBase);
    }
}