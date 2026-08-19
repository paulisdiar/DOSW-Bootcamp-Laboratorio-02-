package src.main.java.edu.dosw.bootcamp.lab.uml.Reto8;

import java.util.List;
import java.util.ArrayList;

public class Coach extends Person {
    private String specialty;
    private List<Player> assignedPlayers;

    public Coach(String name, Integer age, String specialty) {
        super(name, age);
        this.specialty = specialty;
        this.assignedPlayers = new ArrayList<>();
    }

    public void coach(Player player) {
        System.out.println("Coaching player " + player.getName() + "...");
    }

    public void evaluate(Player player) {
        System.out.println("Evaluating player " + player.getName() + "...");
    }

    public void planSession(Player player) {
        System.out.println("Planning session for player " + player.getName() + "...");
    }

    public void addPlayer(Player player) {
        assignedPlayers.add(player);
    }

    public String getSpecialty() {
        return specialty;
    }

    public List<Player> getAssignedPlayers() {
        return assignedPlayers;
    }
}
