package edu.dosw.bootcamp.lab.solid.reto1;

public abstract class ItemOrden {

    private final String nombre;
    private final double precio;
    private int cantidad;

    public ItemOrden(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return precio * cantidad;
    }
}
