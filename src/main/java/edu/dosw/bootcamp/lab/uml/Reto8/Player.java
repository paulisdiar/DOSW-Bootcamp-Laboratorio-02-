package src.main.java.edu.dosw.bootcamp.lab.uml.Reto8;

import java.util.ArrayList;
import java.util.List;

public abstract class Player extends Person {
    private int jerseyNumber;
    private String dominantFoot;
    private double weight;
    private double height;
    private int physicalCondition;
    private String category;
    private String position;

    // Atributos dinámicos (Patrón Builder)
    private String countryOfOrigin;
    private String secondaryPosition;
    private double marketValue;
    private List<String> injuryHistory;

    public Player(String name, int age, int jerseyNumber, String dominantFoot,
                  double weight, double height, int physicalCondition, String category, String position) {
        super(name, age);
        this.jerseyNumber = jerseyNumber;
        this.dominantFoot = dominantFoot;
        this.weight = weight;
        this.height = height;
        this.physicalCondition = physicalCondition;
        this.category = category;
        this.position = position;
        this.injuryHistory = new ArrayList<>();
    }

    public Player(String name, int age, int jerseyNumber, String dominantFoot,
                  double weight, double height, int physicalCondition, String category) {
        this(name, age, jerseyNumber, dominantFoot, weight, height, physicalCondition, category, "");
    }

    public abstract void patear();
    public abstract void entrenar();

    // Métodos alias para compatibilidad
    public void kick() { patear(); }
    public void train() { entrenar(); }

    // Getters y Setters
    public int getJerseyNumber() { return jerseyNumber; }
    public void setJerseyNumber(int jerseyNumber) { this.jerseyNumber = jerseyNumber; }

    public String getDominantFoot() { return dominantFoot; }
    public void setDominantFoot(String dominantFoot) { this.dominantFoot = dominantFoot; }

    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    public int getPhysicalCondition() { return physicalCondition; }
    public void setPhysicalCondition(int physicalCondition) { this.physicalCondition = physicalCondition; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public String getCountryOfOrigin() { return countryOfOrigin; }
    public void setCountryOfOrigin(String countryOfOrigin) { this.countryOfOrigin = countryOfOrigin; }

    public String getSecondaryPosition() { return secondaryPosition; }
    public void setSecondaryPosition(String secondaryPosition) { this.secondaryPosition = secondaryPosition; }

    public double getMarketValue() { return marketValue; }
    public void setMarketValue(double marketValue) { this.marketValue = marketValue; }

    public List<String> getInjuryHistory() { return injuryHistory; }
    public void setInjuryHistory(List<String> injuryHistory) { this.injuryHistory = injuryHistory; }
}
