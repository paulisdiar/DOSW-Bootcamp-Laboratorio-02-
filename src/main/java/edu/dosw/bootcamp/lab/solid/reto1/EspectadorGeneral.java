package edu.dosw.bootcamp.lab.solid.reto1;

public class EspectadorGeneral implements Espectador {

    @Override
    public String getTipo() {
        return "General";
    }

    @Override
    public double getDescuento() {
        return 0.0;
    }
}
