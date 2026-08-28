package edu.dosw.bootcamp.lab.comportamiento.Reto6;

public enum SeverityLevel {
    MILD("Leve"),
    MODERATE("Moderado"),
    SEVERE("Grave"),
    CRITICAL("Crítico");

    private final String label;

    SeverityLevel(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public static SeverityLevel fromString(String input) throws EmergencyException {
        String normalized = input.trim().toLowerCase();
        for (SeverityLevel level : values()) {
            if (level.name().equalsIgnoreCase(normalized) || level.label.equalsIgnoreCase(normalized)) {
                return level;
            }
        }
        if (normalized.startsWith("l") || normalized.contains("leve") || normalized.contains("mild")) return MILD;
        if (normalized.startsWith("m") || normalized.contains("moder") || normalized.contains("moderate")) return MODERATE;
        if (normalized.startsWith("g") || normalized.contains("grav") || normalized.contains("sever")) return SEVERE;
        if (normalized.startsWith("c") || normalized.contains("crit") || normalized.contains("critical")) return CRITICAL;
        throw new EmergencyException(EmergencyException.INVALID_SEVERITY + input);
    }
}
