package edu.dosw.bootcamp.lab.creacionales.Reto3;

public class Fabrica {

    public static Instrumento crear(String familia, String modelo, Gama gama) {

        familia = familia.trim();
        modelo = modelo.trim();

        switch (familia) {

            case "Cuerda":
                return Cuerda.crear(modelo, gama);

            case "Viento":
                return Viento.crear(modelo, gama);

            case "Percusión":
                return Percusion.crear(modelo, gama);

            default:
                throw new IllegalArgumentException("Familia no válida");
        }
    }
}