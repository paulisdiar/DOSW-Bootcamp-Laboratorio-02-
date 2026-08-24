package edu.dosw.bootcamp.lab.estructurales.reto5;

public class Complemento extends Mejora {

    private final String nombre;
    private final double precio;

    private Complemento(Moto moto, String nombre, double precio) {
        super(moto);
        this.nombre = nombre;
        this.precio = precio;
    }

    public static Moto gpsIntegrado(Moto moto) {
        return new Complemento(moto, "GPS integrado", 1100000);
    }

    public static Moto baulTrasero(Moto moto) {
        return new Complemento(moto, "Baúl trasero", 550000);
    }

    public static Moto sistemaSonido(Moto moto) {
        return new Complemento(moto, "Sistema de sonido", 820000);
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