package src.main.java.edu.dosw.bootcamp.lab.comportamiento.Reto4;

import java.util.List;
import java.util.Scanner;

public class MarketScale {

    public static void run() {
        try {
            Scanner scanner = new Scanner(System.in);
            ScaleOperator operator = new ScaleOperator(scanner);
            List<Weighing> weighings = operator.processWeighings();
            operator.displayResults(weighings);
        } catch (ScaleException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
