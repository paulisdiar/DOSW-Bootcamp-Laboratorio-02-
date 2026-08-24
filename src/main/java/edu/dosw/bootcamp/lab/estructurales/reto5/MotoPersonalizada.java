package edu.dosw.bootcamp.lab.estructurales.reto5;

import java.util.Scanner;

public class MotoPersonalizada {

    public static void ejecutar() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Taller Turbo Andes");
        System.out.println("Moto base: Naked 250 ($9.800.000)");

        Moto moto = new Moto("Naked 250", 9800000);

        System.out.println("\nElige tus mejoras:");
        System.out.println("1. Escape deportivo");
        System.out.println("2. Manillar deportivo");
        System.out.println("3. Luces LED");
        System.out.println("4. Alforjas laterales");
        System.out.println("5. Mate negro");
        System.out.println("6. Metalizado tricapa");
        System.out.println("7. Vinilo personalizado");
        System.out.println("8. GPS integrado");
        System.out.println("9. Baúl trasero");
        System.out.println("10. Sistema de sonido");

        System.out.print("Mejoras elegidas (separadas por coma): ");

        String[] opciones = scanner.nextLine().split(",");

        for (String opcion : opciones) {

            switch (opcion.trim()) {

                case "1":
                    moto = Accesorio.escapeDeportivo(moto);
                    break;

                case "2":
                    moto = Accesorio.manillarDeportivo(moto);
                    break;

                case "3":
                    moto = Accesorio.lucesLed(moto);
                    break;

                case "4":
                    moto = Accesorio.alforjasLaterales(moto);
                    break;

                case "5":
                    moto = Pintura.mateNegro(moto);
                    break;

                case "6":
                    moto = Pintura.metalizadoTricapa(moto);
                    break;

                case "7":
                    moto = Pintura.viniloPersonalizado(moto);
                    break;

                case "8":
                    moto = Complemento.gpsIntegrado(moto);
                    break;

                case "9":
                    moto = Complemento.baulTrasero(moto);
                    break;

                case "10":
                    moto = Complemento.sistemaSonido(moto);
                    break;

                default:
                    System.out.println("Opción no válida: " + opcion);
            }
        }

        double precioBase = 9800000;
        double mejoras = moto.getPrecio() - precioBase;

        System.out.println("\n--- Tu Moto ---");
        System.out.println(moto.getDescripcion());

        System.out.printf("Precio base: $%,.0f%n", precioBase);
        System.out.printf("Mejoras: $%,.0f%n", mejoras);
        System.out.printf("Total: $%,.0f%n", moto.getPrecio());

        System.out.println("¡Buen viaje!");
    }
}