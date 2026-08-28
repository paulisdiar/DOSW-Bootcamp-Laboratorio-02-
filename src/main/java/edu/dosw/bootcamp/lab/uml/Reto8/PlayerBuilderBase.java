package edu.dosw.bootcamp.lab.uml.Reto8;

import java.util.List;
import java.util.ArrayList;

public abstract class PlayerBuilderBase implements PlayerBuilder {
    protected String name;
    protected int age;
    protected int jerseyNumber;
    protected String dominantFoot;
    protected double weight;
    protected double height;
    protected int physicalCondition;
    protected String category;

    protected String countryOfOrigin;
    protected String secondaryPosition;
    protected double marketValue;
    protected List<String> injuryHistory = new ArrayList<>();

    public PlayerBuilderBase(String name, int age, int jerseyNumber, String dominantFoot,
                             double weight, double height, int physicalCondition, String category) {
        this.name = name;
        this.age = age;
        this.jerseyNumber = jerseyNumber;
        this.dominantFoot = dominantFoot;
        this.weight = weight;
        this.height = height;
        this.physicalCondition = physicalCondition;
        this.category = category;
    }

    @Override
    public PlayerBuilder withCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
        return this;
    }

    @Override
    public PlayerBuilder withSecondaryPosition(String position) {
        this.secondaryPosition = position;
        return this;
    }

    @Override
    public PlayerBuilder withMarketValue(double value) {
        this.marketValue = value;
        return this;
    }

    @Override
    public PlayerBuilder withInjury(String injury) {
        this.injuryHistory.add(injury);
        return this;
    }

    // build() is NOT implemented here -> remains abstract
}
