package edu.dosw.bootcamp.lab.uml.Reto8;

public class DefenderBuilder extends PlayerBuilderBase {

    public DefenderBuilder(String name, int age, int jerseyNumber, String dominantFoot,
                           double weight, double height, int physicalCondition, String category) {
        super(name, age, jerseyNumber, dominantFoot, weight, height, physicalCondition, category);
    }

    @Override
    public Player build() {
        Defender defender = new Defender(name, age, jerseyNumber, dominantFoot, weight, height, physicalCondition, category);
        defender.setCountryOfOrigin(countryOfOrigin);
        defender.setSecondaryPosition(secondaryPosition);
        defender.setMarketValue(marketValue);
        defender.setInjuryHistory(injuryHistory);
        return defender;
    }
}
