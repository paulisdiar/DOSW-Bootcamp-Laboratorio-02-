package edu.dosw.bootcamp.lab.creacionales.Reto3;

public class Viento {

    public static Instrumento crear(String modelo, Gama gama) {

        double precioBase;

        switch (modelo) {
            case "Saxofón":
                precioBase = 2500000;
                break;

            case "Flauta":
                precioBase = 700000;
                break;

            case "Trompeta":
                precioBase = 1500000;
                break;

            default:
                throw new IllegalArgumentException("Modelo de viento no válido");
        }

        return new Instrumento(modelo, "Viento", gama, precioBase);
    }
}