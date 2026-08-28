package edu.dosw.bootcamp.lab.comportamiento.Reto4;

import java.util.List;
import java.util.Scanner;

public class MarketScale {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        run(new Scanner(System.in));
    }

    public static void run(Scanner scanner) {
        try {
            ScaleOperator operator = new ScaleOperator(scanner);
            List<Weighing> weighings = operator.processWeighings();
            operator.displayResults(weighings);
        } catch (ScaleException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }
}
