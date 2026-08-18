package src.main.java.edu.dosw.bootcamp.lab.uml.Reto8;
import java.util.ArrayList;
import java.util.List;

public class ConHistorialLesiones extends JugadorDecorador{
    private List<String> historialLesiones;

    public ConHistorialLesiones(Jugador jugador){
        super(jugador);
        this.historialLesiones = new ArrayList<>();
    }

    public void agregarLesiones(String lesion){
        this.historialLesiones.add(lesion);
    }

    public List<String> getHistorialLesiones(){return  this.historialLesiones;}
    public String getNombre(){return jugadorDecorado.getNombre();}

}
