package edu.dosw.bootcamp.lab.uml.Reto8;

public class Defender extends Player {

    public Defender(String name, int age, int jerseyNumber, String dominantFoot,
                    double weight, double height, int physicalCondition, String category) {
        super(name, age, jerseyNumber, dominantFoot, weight, height, physicalCondition, category, "Defensa");
    }

    @Override
    public void entrenar() {
        System.out.println(getName() + " entrena entradas y recuperaciones");
    }

    @Override
    public void patear() {
        System.out.println(getName() + " despeja el balón");
    }
}
