package edu.dosw.bootcamp.lab.uml.Reto8;

public class Goalkeeper extends Player {

    public Goalkeeper(String name, int age, int jerseyNumber, String dominantFoot,
                      double weight, double height, int physicalCondition, String category) {
        super(name, age, jerseyNumber, dominantFoot, weight, height, physicalCondition, category, "Portero");
    }

    public void atajar() {
        System.out.println(getName() + " ataja el balón");
    }

    public void save() {
        atajar();
    }

    @Override
    public void entrenar() {
        System.out.println(getName() + " entrena atajadas y reflejos");
    }

    @Override
    public void patear() {
        System.out.println(getName() + " despeja el balón");
    }
}
