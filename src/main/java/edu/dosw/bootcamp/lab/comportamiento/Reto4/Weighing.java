package edu.dosw.bootcamp.lab.comportamiento.Reto4;

public final class Weighing {

    private final double originalAmount;
    private final WeightUnit source;
    private final double convertedAmount;
    private final WeightUnit target;
    private final double kgEquivalent;

    Weighing(double originalAmount, WeightUnit source, double convertedAmount, WeightUnit target,
             double kgEquivalent) {
        this.originalAmount = originalAmount;
        this.source = source;
        this.convertedAmount = convertedAmount;
        this.target = target;
        this.kgEquivalent = kgEquivalent;
    }

    public double getOriginalAmount() { return originalAmount; }
    public WeightUnit getSource() { return source; }
    public double getConvertedAmount() { return convertedAmount; }
    public WeightUnit getTarget() { return target; }
    public double getKgEquivalent() { return kgEquivalent; }

    @Override
    public String toString() {
        return formatNumber(originalAmount) + " " + source.getCode() + " = " + formatNumber(convertedAmount) + " " + target.getCode();
    }

    private String formatNumber(double value) {
        if (value == (long) value) return String.valueOf((long) value);
        double rounded = Math.round(value * 1000.0) / 1000.0;
        return String.valueOf(rounded);
    }
}
