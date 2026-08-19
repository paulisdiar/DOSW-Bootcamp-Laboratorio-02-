package src.main.java.edu.dosw.bootcamp.lab.comportamiento.Reto4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScaleOperator {

    private final Scanner scanner;

    public ScaleOperator(Scanner scanner) {
        this.scanner = scanner;
    }

    public List<Weighing> processWeighings() throws ScaleException {
        System.out.println("Honest Market Scale");
        System.out.print("How many weighings? ");
        int count = Integer.parseInt(scanner.nextLine().trim());

        if (count <= 0) throw new ScaleException(ScaleException.INVALID_COUNT);

        List<Weighing> weighings = new ArrayList<>();

        for (int i = 1; i <= count; i++) {
            System.out.printf("%nWeighing %d:%n", i);

            System.out.print("  Amount: ");
            double amount = Double.parseDouble(scanner.nextLine().trim());

            System.out.print("  From (g/lb/@/kg): ");
            WeightUnit source = WeightUnit.fromCode(scanner.nextLine().trim());

            System.out.print("  To (g/lb/@/kg): ");
            WeightUnit target = WeightUnit.fromCode(scanner.nextLine().trim());

            weighings.add(WeightConverter.convert(amount, source, target));
        }

        return weighings;
    }

    public void displayResults(List<Weighing> weighings) {
        System.out.println();
        for (int i = 0; i < weighings.size(); i++) {
            System.out.printf("P %d: %s%n", i + 1, weighings.get(i));
        }

        double totalKg = weighings.stream()
                .mapToDouble(Weighing::getKgEquivalent)
                .sum();

        System.out.println("\n--- Summary ---");
        System.out.printf("Total kg equivalent: %.3f kg%n", totalKg);
        System.out.println("Thank you for shopping at the market!");
    }
}
