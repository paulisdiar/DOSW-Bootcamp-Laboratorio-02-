package src.main.java.edu.dosw.bootcamp.lab.creacionales.Reto2;

import java.util.Scanner;

public class Tailor {

    private final Scanner scanner;

    public Tailor(Scanner scanner) {
        this.scanner = scanner;
    }

    public Suit makeSuit() throws SuitException {
        System.out.println("Welcome to the Tailor's Workshop");
        System.out.println("Build your suit:\n");

        SuitBuilder builder = new SuitBuilder();

        System.out.print("  Fabric? (1-Italian wool $320,000 / 2-National cloth $150,000) -> ");
        String fabric = scanner.nextLine().trim();
        if (fabric.equals("2")) builder.withNationalClothFabric();
        else                    builder.withItalianWoolFabric();

        System.out.print("  Jacket? (1-Double-breast $250,000 / 2-Single-breast $200,000) -> ");
        String jacket = scanner.nextLine().trim();
        if (jacket.equals("2")) builder.withSingleBreastJacket();
        else                    builder.withDoubleBreastJacket();

        System.out.print("  Trousers? (1-Slim fit $180,000 / 2-Classic fit $160,000) -> ");
        String trousers = scanner.nextLine().trim();
        if (trousers.equals("2")) builder.withClassicTrousers();
        else                      builder.withSlimTrousers();

        builder.withVest();

        System.out.print("  Silk lining? (y-Yes $70,000 / n-No) -> ");
        if (scanner.nextLine().trim().equalsIgnoreCase("y")) builder.withSilkLining();

        System.out.print("  Embroidery? (y-Yes $35,000 / n-No) -> ");
        if (scanner.nextLine().trim().equalsIgnoreCase("y")) builder.withEmbroidery();

        return builder.build();
    }
}
