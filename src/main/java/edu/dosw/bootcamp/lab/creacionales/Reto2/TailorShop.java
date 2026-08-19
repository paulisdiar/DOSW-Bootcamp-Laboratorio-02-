package src.main.java.edu.dosw.bootcamp.lab.creacionales.Reto2;

import java.util.Scanner;

public class TailorShop {

    public static void run() {
        try {
            Scanner scanner = new Scanner(System.in);
            Tailor tailor = new Tailor(scanner);
            Suit suit = tailor.makeSuit();
            suit.display();
        } catch (SuitException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
