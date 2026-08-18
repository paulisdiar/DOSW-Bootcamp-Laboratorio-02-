package src.main.java.edu.dosw.bootcamp.lab.uml.Reto8;
import java.util.List;
import java.util.ArrayList;

public class Entrenador extends Persona {
    private String especialidad;
    private List <Jugador>jugadoresAsignados;

    public Entrenador(String nombre, Integer edad,  String especialidad) {
        super(nombre, edad);
        this.especialidad = especialidad;
        this.jugadoresAsignados = new ArrayList<>();
    }

    public void dirigir (Jugador jugador){
        System.out.println("dirigiendo al jugador " + jugador.getNombre() + "...");
    }

    public void evaluar (Jugador jugador){
        System.out.println("evaluando al jugador " + jugador.getNombre() + "...");
    }

    public void planeacion (Jugador jugador){
        System.out.println("planeando la sesion al jugador " + jugador.getNombre() + "...");
    }

    public void agregarJugador (Jugador jugador){
        jugadoresAsignados.add(jugador);
    }

    public String getEspecialidad(){
        return especialidad;
    }

    public List <Jugador> getJugadoresAsignados(){
        return jugadoresAsignados;
    }

}
