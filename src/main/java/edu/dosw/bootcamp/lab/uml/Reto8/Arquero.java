package src.main.java.edu.dosw.bootcamp.lab.uml.Reto8;

public class Arquero extends Jugador {

    public Arquero(String nombre, int edad, int dorsal, String pieHabil,
                   double peso, double altura, int estadoFisico, String categoria) {

        super(nombre, edad, dorsal, pieHabil, peso, altura, estadoFisico, categoria);
    }
    public void atajar (){
        System.out.println(getNombre() + " Ataja el balón");
    }

    @Override
    public void entrenar(){
        System.out.println(getNombre() + " entrena atajadas y reflejos");
    }

    @Override
    public void patear(){
        System.out.println(getNombre() + " despeja el balón");
    }
}
