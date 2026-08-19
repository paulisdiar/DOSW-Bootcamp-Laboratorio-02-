package src.main.java.edu.dosw.bootcamp.lab.uml.Reto8;

public class ForwardBuilder extends PlayerBuilderBase {

    public ForwardBuilder(String name, int age, int jerseyNumber, String dominantFoot,
                          double weight, double height, int physicalCondition, String category) {
        super(name, age, jerseyNumber, dominantFoot, weight, height, physicalCondition, category);
    }

    @Override
    public Player build() {
        Forward forward = new Forward(name, age, jerseyNumber, dominantFoot, weight, height, physicalCondition, category);
        forward.setCountryOfOrigin(countryOfOrigin);
        forward.setSecondaryPosition(secondaryPosition);
        forward.setMarketValue(marketValue);
        forward.setInjuryHistory(injuryHistory);
        return forward;
    }
}
