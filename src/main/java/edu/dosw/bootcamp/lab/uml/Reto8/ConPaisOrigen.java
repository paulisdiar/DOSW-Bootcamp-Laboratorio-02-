package src.main.java.edu.dosw.bootcamp.lab.uml.Reto8;

public class ConPaisOrigen extends JugadorDecorador{
    private String paisOrigen;

    public ConPaisOrigen(Jugador jugador,  String paisOrigen) {
        super(jugador);
        this.paisOrigen = paisOrigen;
    }

    public String getPaisOrigen() {return paisOrigen;}
    public String getNombre(){return jugadorDecorado.getNombre();}
}
