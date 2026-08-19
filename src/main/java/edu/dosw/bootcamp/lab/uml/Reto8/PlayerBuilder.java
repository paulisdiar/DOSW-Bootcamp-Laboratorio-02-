package src.main.java.edu.dosw.bootcamp.lab.uml.Reto8;

public interface PlayerBuilder {
    PlayerBuilder withCountryOfOrigin(String countryOfOrigin);
    PlayerBuilder withSecondaryPosition(String position);
    PlayerBuilder withMarketValue(double value);
    PlayerBuilder withInjury(String injury);
    Player build();
}
