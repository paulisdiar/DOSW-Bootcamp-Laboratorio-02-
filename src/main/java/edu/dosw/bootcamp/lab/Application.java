package edu.dosw.bootcamp.lab;

import edu.dosw.bootcamp.lab.solid.reto1.BoleteriaAstor;
import src.main.java.edu.dosw.bootcamp.lab.creacionales.Reto2.TailorShop;
import src.main.java.edu.dosw.bootcamp.lab.comportamiento.Reto4.MarketScale;
import src.main.java.edu.dosw.bootcamp.lab.comportamiento.Reto6.HospitalEmergency;

public class Application {

    public static void main(String[] args) {

        // Challenge 1
        System.out.println("========================================");
        System.out.println("  Reto 1 - BoleteriaAstor");
        System.out.println("========================================\n");
        BoleteriaAstor.ejecutar();

        // Challenge 2
        System.out.println("\n========================================");
        System.out.println("  Reto 2 - Tailor Shop");
        System.out.println("========================================\n");
        TailorShop.run();

        // Challenge 4
        System.out.println("\n========================================");
        System.out.println("  Reto 4 - Market Scale");
        System.out.println("========================================\n");
        MarketScale.run();

        // Challenge 6
        System.out.println("\n========================================");
        System.out.println("  Reto 6 - Hospital Emergency");
        System.out.println("========================================\n");
        HospitalEmergency.run();
    }
}