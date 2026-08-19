package src.main.java.edu.dosw.bootcamp.lab.uml.Reto8;

import java.util.List;

public abstract class Player extends Person {
    private int jerseyNumber;
    private String dominantFoot;
    private double weight;
    private double height;
    private int physicalCondition;
    private String category;

    private String countryOfOrigin;
    private String secondaryPosition;
    private double marketValue;
    private List<String> injuryHistory;

    public Player(String name, int age, int jerseyNumber, String dominantFoot,
                  double weight, double height, int physicalCondition, String category) {
        super(name, age);
        this.jerseyNumber = jerseyNumber;
        this.dominantFoot = dominantFoot;
        this.weight = weight;
        this.height = height;
        this.physicalCondition = physicalCondition;
        this.category = category;
    }

    public int getJerseyNumber() { return jerseyNumber; }
    public void setJerseyNumber(int jerseyNumber) { this.jerseyNumber = jerseyNumber; }

    public String getDominantFoot() { return dominantFoot; }
    public void setDominantFoot(String dominantFoot) { this.dominantFoot = dominantFoot; }

    public abstract void train();
    public abstract void kick();

    public void setCountryOfOrigin(String p) { this.countryOfOrigin = p; }
    public void setSecondaryPosition(String p) { this.secondaryPosition = p; }
    public void setMarketValue(double v) { this.marketValue = v; }
    public void setInjuryHistory(List<String> l) { this.injuryHistory = l; }
}
