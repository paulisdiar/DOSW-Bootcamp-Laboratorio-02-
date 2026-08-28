package edu.dosw.bootcamp.lab.uml.Reto8;

public class GoalkeeperBuilder extends PlayerBuilderBase {

    public GoalkeeperBuilder(String name, int age, int jerseyNumber, String dominantFoot,
                             double weight, double height, int physicalCondition, String category) {
        super(name, age, jerseyNumber, dominantFoot, weight, height, physicalCondition, category);
    }

    @Override
    public Player build() {
        Goalkeeper goalkeeper = new Goalkeeper(name, age, jerseyNumber, dominantFoot, weight, height, physicalCondition, category);
        goalkeeper.setCountryOfOrigin(countryOfOrigin);
        goalkeeper.setSecondaryPosition(secondaryPosition);
        goalkeeper.setMarketValue(marketValue);
        goalkeeper.setInjuryHistory(injuryHistory);
        return goalkeeper;
    }
}
