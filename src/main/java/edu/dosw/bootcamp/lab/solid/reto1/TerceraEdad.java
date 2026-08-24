package edu.dosw.bootcamp.lab.solid.reto1;


public class TerceraEdad implements Espectador {

    @Override
    public String getTipo() {
        return "Tercera edad";
    }

    @Override
    public double getDescuento() {
        return 0.25;
    }
}