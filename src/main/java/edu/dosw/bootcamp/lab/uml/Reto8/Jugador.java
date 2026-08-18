package src.main.java.edu.dosw.bootcamp.lab.uml.Reto8;

public abstract class Jugador extends Persona{
    private int dorsal;
    private String pieHabil;
    private double peso;
    private double altura;
    private int estadoFisico;
    private String categoria;

    public Jugador (String nombre, int edad, int dorsal, String pieHabil,
                    double peso, double altura, int estadoFisico, String categoria){
        super(nombre, edad);
        this.dorsal = dorsal;
        this.pieHabil = pieHabil;
        this.peso = peso;
        this.altura = altura;
        this.estadoFisico = estadoFisico;
        this.categoria = categoria;
    }

    public int getDorsal() {return dorsal;}
    public void setDorsal(int dorsal) {this.dorsal = dorsal;}

    public String getPieHabil() {return pieHabil;}
    public void setPieHabil(String pieHabil) {this.pieHabil = pieHabil;}

    public abstract void entrenar ();
    public abstract void patear();
}
