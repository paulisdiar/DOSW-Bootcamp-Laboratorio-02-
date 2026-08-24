package edu.dosw.bootcamp.lab.creacionales.Reto3;

public class Cuerda {

    public static Instrumento crear(String modelo, Gama gama) {

        double precioBase;

        switch (modelo) {
            case "Guitarra":
                precioBase = 800000;
                break;

            case "Violín":
                precioBase = 1600000;
                break;

            case "Bajo":
                precioBase = 1200000;
                break;

            default:
                throw new IllegalArgumentException("Modelo de cuerda no válido");
        }

        return new Instrumento(modelo, "Cuerda", gama, precioBase);
    }
}