package src.main.java.edu.dosw.bootcamp.lab.uml.Reto8;

public class Defender extends Player {

    public Defender(String name, int age, int jerseyNumber, String dominantFoot,
                    double weight, double height, int physicalCondition, String category) {
        super(name, age, jerseyNumber, dominantFoot, weight, height, physicalCondition, category);
    }

    @Override
    public void train() {
        System.out.println(getName() + " trains tackles and recoveries");
    }

    @Override
    public void kick() {
        System.out.println(getName() + " clears the ball");
    }
}
