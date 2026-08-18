package src.main.java.edu.dosw.bootcamp.lab.uml.Reto8;

public abstract class JugadorDecorador {
    protected Jugador jugadorDecorado;

    public JugadorDecorador(Jugador jugador) {
        this.jugadorDecorado = jugador;
    }
    public Jugador getJugador() {
        return jugadorDecorado;
    }
}
