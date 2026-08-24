package edu.dosw.bootcamp.lab.estructurales.reto5;

public class Accesorio extends Mejora {

    private final String nombre;
    private final double precio;

    private Accesorio(Moto moto, String nombre, double precio) {
        super(moto);
        this.nombre = nombre;
        this.precio = precio;
    }

    public static Moto escapeDeportivo(Moto moto) {
        return new Accesorio(moto, "Escape deportivo", 1400000);
    }

    public static Moto manillarDeportivo(Moto moto) {
        return new Accesorio(moto, "Manillar deportivo", 480000);
    }

    public static Moto lucesLed(Moto moto) {
        return new Accesorio(moto, "Luces LED", 350000);
    }

    public static Moto alforjasLaterales(Moto moto) {
        return new Accesorio(moto, "Alforjas laterales", 600000);
    }

    @Override
    public String getDescripcion() {
        return moto.getDescripcion() + " + " + nombre;
    }

    @Override
    public double getPrecio() {
        return moto.getPrecio() + precio;
    }
}