package src.main.java.edu.dosw.bootcamp.lab.creacionales.Reto2;

import java.util.Scanner;

public class Tailor {

    private final Scanner scanner;

    public Tailor(Scanner scanner) {
        this.scanner = scanner;
    }

    public Suit makeSuit() throws SuitException {
        System.out.println("Bienvenido al Taller del Sastre");
        System.out.println("Arma tu traje:\n");

        SuitBuilder builder = new SuitBuilder();

        System.out.print("  ¿Tela? (1-Lana italiana $320,000 / 2-Paño nacional $150,000) -> ");
        String fabric = scanner.nextLine().trim();
        if (fabric.equals("1")) {
            builder.withItalianWoolFabric();
        } else if (fabric.equals("2")) {
            builder.withNationalClothFabric();
        } else {
            throw new SuitException(SuitException.FABRIC_REQUIRED);
        }

        System.out.print("  ¿Saco? (1-Cruzado $250,000 / 2-Recto $200,000) -> ");
        String jacket = scanner.nextLine().trim();
        if (jacket.equals("1")) {
            builder.withDoubleBreastJacket();
        } else if (jacket.equals("2")) {
            builder.withSingleBreastJacket();
        } else {
            throw new SuitException(SuitException.JACKET_REQUIRED);
        }

        System.out.print("  ¿Pantalón? (1-Corte slim $180,000 / 2-Corte clásico $160,000) -> ");
        String trousers = scanner.nextLine().trim();
        if (trousers.equals("1")) {
            builder.withSlimTrousers();
        } else if (trousers.equals("2")) {
            builder.withClassicTrousers();
        } else {
            throw new SuitException(SuitException.TROUSERS_REQUIRED);
        }

        System.out.print("  ¿Chaleco? (s-Sí $90,000 / n-No) -> ");
        String vest = scanner.nextLine().trim();
        if (vest.equalsIgnoreCase("s")) {
            builder.withVest();
        } else if (!vest.equalsIgnoreCase("n")) {
            throw new SuitException(SuitException.INVALID_OPTION);
        }

        System.out.print("  ¿Forro en seda? (s-Sí $70,000 / n-No) -> ");
        String lining = scanner.nextLine().trim();
        if (lining.equalsIgnoreCase("s")) {
            builder.withSilkLining();
        } else if (!lining.equalsIgnoreCase("n")) {
            throw new SuitException(SuitException.INVALID_OPTION);
        }

        System.out.print("  ¿Bordado? (s-Sí $35,000 / n-No) -> ");
        String embroidery = scanner.nextLine().trim();
        if (embroidery.equalsIgnoreCase("s")) {
            builder.withEmbroidery();
        } else if (!embroidery.equalsIgnoreCase("n")) {
            throw new SuitException(SuitException.INVALID_OPTION);
        }

        return builder.build();
    }
}
