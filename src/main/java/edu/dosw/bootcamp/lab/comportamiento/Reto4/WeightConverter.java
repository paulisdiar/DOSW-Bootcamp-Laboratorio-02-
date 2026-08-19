package src.main.java.edu.dosw.bootcamp.lab.comportamiento.Reto4;

public class WeightConverter {

    public static Weighing convert(double amount, WeightUnit source, WeightUnit target) throws ScaleException {
        if (amount <= 0) throw new ScaleException(ScaleException.INVALID_AMOUNT);

        double inKg = source.toKg(amount);
        double result = target.fromKg(inKg);

        return new Weighing(amount, source, result, target, inKg);
    }
}
