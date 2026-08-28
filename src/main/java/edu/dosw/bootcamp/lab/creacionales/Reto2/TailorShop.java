package edu.dosw.bootcamp.lab.creacionales.Reto2;

import java.util.Scanner;

public class TailorShop {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        run(new Scanner(System.in));
    }

    public static void run(Scanner scanner) {
        try {
            Tailor tailor = new Tailor(scanner);
            Suit suit = tailor.makeSuit();
            suit.display();
        } catch (SuitException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }
}
