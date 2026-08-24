package edu.dosw.bootcamp.lab.estructurales.reto5;


public abstract class Mejora extends Moto {

    protected final Moto moto;

    public Mejora(Moto moto) {
        super("", 0);
        this.moto = moto;
    }

    @Override
    public abstract String getDescripcion();

    @Override
    public abstract double getPrecio();
}