package src.main.java.edu.dosw.bootcamp.lab.uml.Reto8;

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

    public void cheer(Player player) {
        System.out.println("Let's go " + player.getName() + ", " + getName() + " supports you");
    }

    public void requestAutograph(Coach coach) {
        System.out.println("Coach " + coach.getName() + " please give me an autograph");
    }

    public void postPhoto(Player player) {
        System.out.println(getName() + " just posted a photo of player " + player.getName());
    }

    public List<Player> getFavoritePlayers() { return favoritePlayers; }
    public void addFavoritePlayer(Player player) { favoritePlayers.add(player); }

    public List<String> getJerseys() { return jerseys; }
    public void addJersey(String jersey) { jerseys.add(jersey); }
}
