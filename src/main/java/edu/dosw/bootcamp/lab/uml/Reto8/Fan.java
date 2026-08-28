package edu.dosw.bootcamp.lab.uml.Reto8;

import java.util.ArrayList;
import java.util.List;

public class Fan extends Person {
    private List<Player> favoritePlayers;
    private List<String> jerseys;

    public Fan(String name, int age) {
        super(name, age);
        this.favoritePlayers = new ArrayList<>();
        this.jerseys = new ArrayList<>();
    }

    public void animar(Player jugador) {
        System.out.println("¡Vamos " + jugador.getName() + ", " + getName() + " te apoya!");
    }

    public void pedirAutografo(Coach entrenador) {
        System.out.println("Entrenador " + entrenador.getName() + ", por favor deme un autógrafo");
    }

    public void publicarFoto(Player jugador) {
        System.out.println(getName() + " acaba de publicar una foto del jugador " + jugador.getName());
    }

    // Aliases para compatibilidad
    public void cheer(Player player) { animar(player); }
    public void requestAutograph(Coach coach) { pedirAutografo(coach); }
    public void postPhoto(Player player) { publicarFoto(player); }

    public List<Player> getFavoritePlayers() { return favoritePlayers; }
    public void setFavoritePlayers(List<Player> favoritePlayers) { this.favoritePlayers = favoritePlayers; }
    public void addFavoritePlayer(Player player) { favoritePlayers.add(player); }

    public List<String> getJerseys() { return jerseys; }
    public void setJerseys(List<String> jerseys) { this.jerseys = jerseys; }
    public void addJersey(String jersey) { jerseys.add(jersey); }
}
