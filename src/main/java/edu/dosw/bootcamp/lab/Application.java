package src.main.java.edu.dosw.bootcamp.lab;

import java.util.Scanner;

import edu.dosw.bootcamp.lab.comportamiento.reto7.RoverExplorador;
import edu.dosw.bootcamp.lab.creacionales.Reto3.FabricaInstrumentos;
import edu.dosw.bootcamp.lab.estructurales.reto5.MotoPersonalizada;
import src.main.java.edu.dosw.bootcamp.lab.creacionales.Reto2.TailorShop;
import src.main.java.edu.dosw.bootcamp.lab.comportamiento.Reto4.MarketScale;
import src.main.java.edu.dosw.bootcamp.lab.comportamiento.Reto6.HospitalEmergency;
import edu.dosw.bootcamp.lab.solid.reto1.BoleteriaAstor;

public class Application {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenid@!");

        while (true) {

            System.out.print(
                    "\n¿A qué reto desea ingresar? (1 al 8, o 0 para salir): "
            );

            String input = scanner.nextLine().trim();

            try {

                int reto;

                try {
                    reto = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    throw new Exception(
                            "Lo siento, ingrese un número entre 0 y 8."
                    );
                }

                if (reto == 0) {
                    System.out.println("¡Programa finalizado con éxito!");
                    break;
                }

                if (reto < 1 || reto > 8) {
                    throw new Exception(
                            "Lo siento, los retos disponibles son del 1 al 8."
                    );
                }

                switch (reto) {

                    case 1:
                        System.out.println(
                                "\n========================================"
                        );
                        System.out.println(
                                "  Reto 1 - Boletería del Cine Astor"
                        );
                        System.out.println(
                                "========================================\n"
                        );

                        BoleteriaAstor.ejecutar();
                        break;

                    case 2:
                        System.out.println(
                                "\n========================================"
                        );
                        System.out.println(
                                "  Reto 2 - El Sastre a la Medida"
                        );
                        System.out.println(
                                "========================================\n"
                        );

                        TailorShop.run(scanner);
                        break;

                    case 3:
                        System.out.println(
                                "\n========================================"
                        );
                        System.out.println(
                                "  Reto 3 - La Fábrica de Instrumentos"
                        );
                        System.out.println(
                                "========================================\n"
                        );

                        FabricaInstrumentos.ejecutar();
                        break;

                    case 4:
                        System.out.println(
                                "\n========================================"
                        );
                        System.out.println(
                                "  Reto 4 - La Balanza Honesta del Mercado"
                        );
                        System.out.println(
                                "========================================\n"
                        );

                        MarketScale.run(scanner);
                        break;

                    case 5:
                        System.out.println(
                                "\n========================================"
                        );
                        System.out.println(
                                "  Reto 5 - La Moto Personalizada"
                        );
                        System.out.println(
                                "========================================\n"
                        );

                        MotoPersonalizada.ejecutar();
                        break;

                    case 6:
                        System.out.println(
                                "\n========================================"
                        );
                        System.out.println(
                                "  Reto 6 - Sala de Urgencias del Hospital"
                        );
                        System.out.println(
                                "========================================\n"
                        );

                        HospitalEmergency.run(scanner);
                        break;

                    case 7:
                        System.out.println(
                                "\n========================================"
                        );
                        System.out.println(
                                "  Reto 7 - El Rover Explorador de Marte"
                        );
                        System.out.println(
                                "========================================\n"
                        );

                        RoverExplorador.ejecutar();
                        break;

                    case 8:
                        System.out.println(
                                "\n========================================"
                        );
                        System.out.println(
                                "  Reto 8 - Academia de Fútbol"
                        );
                        System.out.println(
                                "========================================\n"
                        );

                        break;
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}