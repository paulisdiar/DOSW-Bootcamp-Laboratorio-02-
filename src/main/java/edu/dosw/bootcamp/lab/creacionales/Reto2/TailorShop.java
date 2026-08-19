package src.main.java.edu.dosw.bootcamp.lab.creacionales.Reto2;

import java.util.Scanner;

public class TailorShop {

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        Tailor tailor = new Tailor(scanner);
        Suit suit = tailor.makeSuit();
        suit.display();
    }
}
