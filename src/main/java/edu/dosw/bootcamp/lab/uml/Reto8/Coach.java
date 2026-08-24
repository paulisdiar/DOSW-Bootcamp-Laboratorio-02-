package src.main.java.edu.dosw.bootcamp.lab.uml.Reto8;

import java.util.List;
import java.util.ArrayList;

public class Coach extends Person {
    private String specialty;
    private List<Player> assignedPlayers;

    public Coach(String name, int age, String specialty) {
        super(name, age);
        this.specialty = specialty;
        this.assignedPlayers = new ArrayList<>();
    }

    public void dirigir(Player jugador) {
        System.out.println("Entrenando al jugador " + jugador.getName() + "...");
    }

    public void evaluar(Player jugador) {
        System.out.println("Evaluando al jugador " + jugador.getName() + "...");
    }

    public void planearSesion(Player jugador) {
        System.out.println("Planificando sesión para el jugador " + jugador.getName() + "...");
    }

    // Aliases para compatibilidad
    public void coach(Player player) { dirigir(player); }
    public void evaluate(Player player) { evaluar(player); }
    public void planSession(Player player) { planearSesion(player); }

    public void addPlayer(Player player) {
        assignedPlayers.add(player);
    }

    public void removePlayer(Player player) {
        assignedPlayers.remove(player);
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public List<Player> getAssignedPlayers() {
        return assignedPlayers;
    }

    public void setAssignedPlayers(List<Player> assignedPlayers) {
        this.assignedPlayers = assignedPlayers;
    }
}
