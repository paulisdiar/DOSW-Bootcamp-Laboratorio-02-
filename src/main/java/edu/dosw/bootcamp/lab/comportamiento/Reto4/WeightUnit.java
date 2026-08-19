package src.main.java.edu.dosw.bootcamp.lab.comportamiento.Reto4;

public enum WeightUnit {

    G("g", 1000.0),
    LB("lb", 2.2046),
    ARROBA("@", 0.08),
    KG("kg", 1.0);

    private final String code;
    private final double factorPerKg;

    WeightUnit(String code, double factorPerKg) {
        this.code = code;
        this.factorPerKg = factorPerKg;
    }

    public double toKg(double amount) {
        return amount / factorPerKg;
    }

    public double fromKg(double amountInKg) {
        return amountInKg * factorPerKg;
    }

    public String getCode() {
        return code;
    }

    public static WeightUnit fromCode(String code) throws ScaleException {
        for (WeightUnit unit : values()) {
            if (unit.code.equalsIgnoreCase(code)) return unit;
        }
        throw new ScaleException(ScaleException.INVALID_UNIT + code);
    }
}
