package src.main.java.edu.dosw.bootcamp.lab.uml.Reto8;
import java.util.ArrayList;
import java.util.List;

public class Hincha extends Persona{
    private List<Jugador> jugadoresFavoritos;
    private List<String> camisetas;

    public Hincha(String nombre, int edad){
        super(nombre, edad);
        this.jugadoresFavoritos = new ArrayList<>();
        this.camisetas = new ArrayList<>();
    }

    public void animar (Jugador jugador){
        System.out.println("Vamos " + jugador.getNombre() + ", " + getNombre() + " te apoya");
    }

    public void pedirAutografo (Entrenador entrenador){
        System.out.println("Profe " +  entrenador.getNombre() + " dame un autografo por favor");
    }

    public void publicarFoto (Jugador jugador){
        System.out.println(getNombre() + " acaba de publicar una foto del jugador " + jugador.getNombre());
    }

    public List <Jugador> getJugadoresFavoritoss(){return jugadoresFavoritos;}
    public void agregarJugadorFavorito(Jugador jugador){jugadoresFavoritos.add(jugador);}

    public List <String> getCamisetas(){return camisetas;}
    public void agregarCamisetas(String camiseta){camisetas.add(camiseta);}
}
