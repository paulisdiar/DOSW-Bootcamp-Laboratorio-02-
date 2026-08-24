package src.main.java.edu.dosw.bootcamp.lab;

import java.util.Scanner;
import src.main.java.edu.dosw.bootcamp.lab.creacionales.Reto2.TailorShop;
import src.main.java.edu.dosw.bootcamp.lab.comportamiento.Reto4.MarketScale;
import src.main.java.edu.dosw.bootcamp.lab.comportamiento.Reto6.HospitalEmergency;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Bienvenid@!");

        while (true) {
            System.out.print("\n¿A qué reto desea ingresar? (1 al 8, o 0 para salir): ");
            String input = scanner.nextLine().trim();

            try {
                int reto;
                try {
                    reto = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    throw new Exception("Lo siento, únicos retos disponibles 1/8.");
                }

                if (reto == 0) {
                    System.out.println("¡Programa finalizado con éxito!");
                    break;
                }

                if (reto < 1 || reto > 8) {
                    throw new Exception("Lo siento, únicos retos disponibles 1/8.");
                }

                if (reto % 2 != 0) {
                    throw new Exception("Reto en construcción.");
                }

                switch (reto) {
                    case 2:
                        System.out.println("\n========================================");
                        System.out.println("  Reto 2 - El Sastre a la Medida");
                        System.out.println("========================================\n");
                        TailorShop.run(scanner);
                        break;
                    case 4:
                        System.out.println("\n========================================");
                        System.out.println("  Reto 4 - La Balanza Honesta del Mercado");
                        System.out.println("========================================\n");
                        MarketScale.run(scanner);
                        break;
                    case 6:
                        System.out.println("\n========================================");
                        System.out.println("  Reto 6 - Sala de Urgencias del Hospital");
                        System.out.println("========================================\n");
                        HospitalEmergency.run(scanner);
                        break;
                    case 8:
                        System.out.println("\n========================================");
                        System.out.println("  Reto 8 - Academia de Fútbol");
                        System.out.println("========================================\n");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}