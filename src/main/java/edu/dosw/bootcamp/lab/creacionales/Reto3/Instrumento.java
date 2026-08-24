package edu.dosw.bootcamp.lab.creacionales.Reto3;

public class Instrumento {

    private final String nombre;
    private final String familia;
    private final Gama gama;
    private final double precio;
    private final int afinacion;

    public Instrumento(String nombre, String familia, Gama gama, double precioBase) {
        this.nombre = nombre;
        this.familia = familia;
        this.gama = gama;
        this.precio = precioBase * gama.getFactor();
        this.afinacion = gama.getAfinacion();
    }

    public String getNombre() {
        return nombre;
    }

    public String getFamilia() {
        return familia;
    }

    public Gama getGama() {
        return gama;
    }

    public double getPrecio() {
        return precio;
    }

    public int getAfinacion() {
        return afinacion;
    }
}