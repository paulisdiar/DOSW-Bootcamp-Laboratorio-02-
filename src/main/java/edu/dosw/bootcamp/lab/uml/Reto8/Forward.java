package src.main.java.edu.dosw.bootcamp.lab.uml.Reto8;

public class Forward extends Player {

    public Forward(String name, int age, int jerseyNumber, String dominantFoot,
                   double weight, double height, int physicalCondition, String category) {
        super(name, age, jerseyNumber, dominantFoot, weight, height, physicalCondition, category);
    }

    @Override
    public void train() {
        System.out.println(getName() + " trains finishing and ball control");
    }

    @Override
    public void kick() {
        System.out.println(getName() + " shoots at goal");
    }
}
