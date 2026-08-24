package edu.dosw.bootcamp.lab.comportamiento.reto7;

public class Accion implements Comando {

    private final String operador;
    private final String descripcion;
    private final Runnable ejecucion;
    private final Runnable deshacer;

    private boolean deshecha;

    public Accion(
            String operador,
            String descripcion,
            Runnable ejecucion,
            Runnable deshacer) {

        this.operador = operador;
        this.descripcion = descripcion;
        this.ejecucion = ejecucion;
        this.deshacer = deshacer;
        this.deshecha = false;
    }

    @Override
    public void ejecutar() {
        ejecucion.run();
    }

    @Override
    public void deshacer() {
        deshacer.run();
        deshecha = true;
    }

    @Override
    public String descripcion() {
        return descripcion;
    }

    public String getOperador() {
        return operador;
    }

    public boolean isDeshecha() {
        return deshecha;
    }
}