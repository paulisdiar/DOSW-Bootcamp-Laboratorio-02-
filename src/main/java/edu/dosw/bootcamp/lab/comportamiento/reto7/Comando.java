package edu.dosw.bootcamp.lab.comportamiento.reto7;

public interface Comando {

    public void ejecutar();

    public void deshacer();

    String descripcion();
}