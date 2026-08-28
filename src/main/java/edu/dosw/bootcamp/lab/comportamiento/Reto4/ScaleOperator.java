package edu.dosw.bootcamp.lab.comportamiento.Reto4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScaleOperator {

    private final Scanner scanner;

    public ScaleOperator(Scanner scanner) {
        this.scanner = scanner;
    }

    public List<Weighing> processWeighings() throws ScaleException {
        System.out.println("La Balanza Honesta del Mercado");
        System.out.print("¿Cuántos pesajes? ");
        String countStr = scanner.nextLine().trim();
        int count;
        try {
            if (countStr.matches(".*\\d+.*")) {
                count = Integer.parseInt(countStr.replaceAll("[^0-9]", ""));
            } else {
                count = Integer.parseInt(countStr);
            }
        } catch (NumberFormatException e) {
            throw new ScaleException(ScaleException.INVALID_COUNT);
        }

        if (count <= 0) throw new ScaleException(ScaleException.INVALID_COUNT);

        List<Weighing> weighings = new ArrayList<>();

        for (int i = 1; i <= count; i++) {
            System.out.println("\nPesaje " + i + ":");

            System.out.print("  Cantidad: ");
            String amountStr = scanner.nextLine().trim();
            double amount;
            try {
                amount = Double.parseDouble(amountStr);
            } catch (NumberFormatException e) {
                throw new ScaleException(ScaleException.INVALID_AMOUNT);
            }

            if (amount <= 0) {
                throw new ScaleException(ScaleException.INVALID_AMOUNT);
            }

            System.out.print("  De (g/lb/@/kg): ");
            WeightUnit source = WeightUnit.fromCode(scanner.nextLine().trim());

            System.out.print("  A (g/lb/@/kg): ");
            WeightUnit target = WeightUnit.fromCode(scanner.nextLine().trim());

            weighings.add(WeightConverter.convert(amount, source, target));
        }

        return weighings;
    }

    public void displayResults(List<Weighing> weighings) {
        System.out.println();
        for (int i = 0; i < weighings.size(); i++) {
            System.out.println("P " + (i + 1) + ": " + weighings.get(i));
        }

        double totalKg = weighings.stream()
                .mapToDouble(Weighing::getKgEquivalent)
                .sum();

        System.out.println("\n--- Resumen ---");
        System.out.println("Total equivalente en kg: " + formatDecimal(totalKg) + " kg");
        System.out.println("¡Gracias por comprar en la plaza!");
    }

    private String formatDecimal(double val) {
        double rounded = Math.round(val * 1000.0) / 1000.0;
        return String.valueOf(rounded);
    }
}
