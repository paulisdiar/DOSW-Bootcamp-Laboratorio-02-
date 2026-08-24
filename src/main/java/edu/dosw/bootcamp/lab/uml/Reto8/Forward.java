package src.main.java.edu.dosw.bootcamp.lab.uml.Reto8;

public class Forward extends Player {

    public Forward(String name, int age, int jerseyNumber, String dominantFoot,
                   double weight, double height, int physicalCondition, String category) {
        super(name, age, jerseyNumber, dominantFoot, weight, height, physicalCondition, category, "Delantero");
    }

    @Override
    public void entrenar() {
        System.out.println(getName() + " entrena definición y control del balón");
    }

    @Override
    public void patear() {
        System.out.println(getName() + " remata a portería");
    }
}
