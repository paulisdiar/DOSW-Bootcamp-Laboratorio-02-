package src.main.java.edu.dosw.bootcamp.lab.uml.Reto8;

public class Delantero extends Jugador{
    public Delantero(String nombre, int edad, int dorsal, String pieHabil,
                     double peso, double altura, int estadoFisico, String categoria){
        super(nombre, edad, dorsal, pieHabil, peso, altura, estadoFisico, categoria);
    }
    @Override
    public void entrenar(){
        System.out.println(getNombre() + " entrena definición y control de balón");
    }

    @Override
    public void patear(){
        System.out.println(getNombre() + " patea al arco");
    }
}
