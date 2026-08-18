package src.main.java.edu.dosw.bootcamp.lab.uml.Reto8;

public class Defensa extends Jugador{
    public Defensa(String nombre, int edad, int dorsal, String pieHabil,
                   double peso, double altura, int estadoFisico, String categoria){

        super(nombre, edad, dorsal, pieHabil, peso, altura, estadoFisico, categoria);
    }
    @Override
    public void entrenar(){
        System.out.println(getNombre() + " entrena barridas y recuperaciones");
    }

    @Override
    public void patear(){
        System.out.println(getNombre() + " despeja el balón");
    }
}
