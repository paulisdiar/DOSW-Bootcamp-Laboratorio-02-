package edu.dosw.bootcamp.lab.creacionales.Reto3;

public enum Gama {

    ESTUDIANTE(1.0, 440),
    PROFESIONAL(3.0, 440),
    VINTAGE(5.0, 442);

    private final double factor;
    private final int afinacion;

    Gama(double factor, int afinacion) {
        this.factor = factor;
        this.afinacion = afinacion;
    }

    public double getFactor() {
        return factor;
    }

    public int getAfinacion() {
        return afinacion;
    }
}