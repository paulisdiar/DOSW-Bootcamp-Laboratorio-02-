package edu.dosw.bootcamp.lab.solid.reto1;

public class Estudiante implements Espectador {

    @Override
    public String getTipo() {
        return "Estudiante";
    }

    @Override
    public double getDescuento() {
        return 0.15;
    }
}
