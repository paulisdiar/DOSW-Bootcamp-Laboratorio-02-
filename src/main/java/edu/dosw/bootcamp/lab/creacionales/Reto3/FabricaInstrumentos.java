package edu.dosw.bootcamp.lab.creacionales.Reto3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FabricaInstrumentos {

    public static void ejecutar() {

        Scanner scanner = new Scanner(System.in);
        List<Instrumento> instrumentos = new ArrayList<>();

        System.out.println("Bienvenido a Armonía Andina");
        System.out.print("¿Cuántos instrumentos desea pedir? ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= cantidad; i++) {

            System.out.println("\nInstrumento " + i + ":");

            System.out.print("Familia: ");
            String familia = scanner.nextLine();

            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();

            System.out.print("Gama: ");
            String gamaTexto = scanner.nextLine();

            Gama gama = Gama.valueOf(gamaTexto.toUpperCase());

            Instrumento instrumento =
                    Fabrica.crear(familia, modelo, gama);

            instrumentos.add(instrumento);
        }

        for (int i = 0; i < instrumentos.size(); i++) {

            Instrumento instrumento = instrumentos.get(i);

            System.out.println(
                    "\nInstrumento " + (i + 1) + ": "
                            + instrumento.getNombre() + " "
                            + formatoGama(instrumento.getGama())
            );

            System.out.println(
                    "Afinación: "
                            + instrumento.getAfinacion()
                            + " Hz"
            );

            System.out.printf(
                    "Precio: $%,.0f%n",
                    instrumento.getPrecio()
            );
        }

        double total = instrumentos.stream()
                .mapToDouble(Instrumento::getPrecio)
                .sum();

        System.out.printf(
                "%nTotal a pagar: $%,.0f%n",
                total
        );

        System.out.println("¡Gracias por su pedido!");
    }

    private static String formatoGama(Gama gama) {
        String texto = gama.name().toLowerCase();
        return texto.substring(0, 1).toUpperCase() + texto.substring(1);
    }
}