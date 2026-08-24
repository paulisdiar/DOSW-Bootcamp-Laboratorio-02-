package edu.dosw.bootcamp.lab.estructurales.reto5;

public class Pintura extends Mejora {

    private final String nombre;
    private final double precio;

    private Pintura(Moto moto, String nombre, double precio) {
        super(moto);
        this.nombre = nombre;
        this.precio = precio;
    }

    public static Moto mateNegro(Moto moto) {
        return new Pintura(moto, "Mate negro", 900000);
    }

    public static Moto metalizadoTricapa(Moto moto) {
        return new Pintura(moto, "Metalizado tricapa", 1600000);
    }

    public static Moto viniloPersonalizado(Moto moto) {
        return new Pintura(moto, "Vinilo personalizado", 700000);
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