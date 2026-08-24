package edu.dosw.bootcamp.lab.estructurales.reto5;

public class Moto {

    private final String nombre;
    private final double precio;

    public Moto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getDescripcion() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}