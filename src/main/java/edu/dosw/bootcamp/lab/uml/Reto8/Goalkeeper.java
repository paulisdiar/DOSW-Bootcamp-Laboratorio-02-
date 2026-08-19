package src.main.java.edu.dosw.bootcamp.lab.uml.Reto8;

public class Goalkeeper extends Player {

    public Goalkeeper(String name, int age, int jerseyNumber, String dominantFoot,
                      double weight, double height, int physicalCondition, String category) {
        super(name, age, jerseyNumber, dominantFoot, weight, height, physicalCondition, category);
    }

    public void save() {
        System.out.println(getName() + " saves the ball");
    }

    @Override
    public void train() {
        System.out.println(getName() + " trains saves and reflexes");
    }

    @Override
    public void kick() {
        System.out.println(getName() + " clears the ball");
    }
}
